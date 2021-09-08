<?php

/**
 * Created by PhpStorm.
 * User: Raul Jonatan ( @Julnarot )
 * Date: 9/5/21
 * Time: 2:44 AM
 */
class News extends CI_Controller
{

	public function __construct()
	{
		parent::__construct();
		$this->load->model('news_model');
		$this->load->helper('url_helper');
	}

	public function index()
	{
		$this->output->enable_profiler(TRUE);
		$this->benchmark->mark('first');
		$data['news'] = $this->news_model->get_news();

		$data['title'] = 'NewsModel archive';

		$this->load->view('templates/header', $data);
		$this->load->view('news/index', $data);
		$this->load->view('templates/footer');
		$this->benchmark->mark('second');
		echo $this->benchmark->elapsed_time('first', 'second');
	}

	public function view($slug = NULL)
	{
		$data['news_item'] = $this->news_model->get_news($slug);

		if (empty($data['news_item'])) {
			show_404();
		}

		$data['title'] = $data['news_item']['title'];

		$this->load->view('templates/header', $data);
		$this->load->view('news/view', $data);
		$this->load->view('templates/footer');
	}

	public function create()
	{
		$this->load->helper('form');
		$this->load->library('form_validation');

		$data['title'] = 'Create a news item';

		$this->form_validation->set_rules('title', 'Title', 'required');
		$this->form_validation->set_rules('text', 'Text', 'required');

		if ($this->form_validation->run() === FALSE) {
			$this->load->view('templates/header', $data);
			$this->load->view('news/create');
			$this->load->view('templates/footer');

		} else {
			$this->news_model->set_news();
			$this->load->view('news/success');
		}
	}

	public function importar()
	{
		$apiKey = "baca4a7e8b8240468f4f37e358906f02";
		$urlNewsSearch = 'https://newsapi.org/v2/everything?q=te&sortBy=publishedAt&apiKey='.$apiKey;
		$urlNewsUS = 'https://newsapi.org/v2/top-headlines?country=us&apiKey='.$apiKey;
		$ch = curl_init();
		curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
		curl_setopt($ch, CURLOPT_URL, $urlNewsSearch);
		$result = curl_exec($ch);
		curl_close($ch);
		$data = json_decode($result, true);
		foreach ($data['articles'] as $item) {
			$slug = url_title(json_encode($item['title']), 'dash', TRUE);
			$this->db->insert('news', array(
				'title' => $item['title'],
				'slug' => $slug,
				'text' => $item['description'],
				'category' => isset($item['category']) ? $item['category'] : '',
				'urlToImage' => isset($item['urlToImage']) ? $item['urlToImage'] : '',
			));
		}
		$this->load->view('news/success');
	}
}
