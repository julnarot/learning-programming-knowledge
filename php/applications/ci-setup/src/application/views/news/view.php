<?php
/**
 * Created by PhpStorm.
 * User: Raul Jonatan ( @Julnarot )
 * Date: 9/5/21
 * Time: 2:48 AM
 */
echo '<h2>'.$news_item['title'].'</h2>';
echo $news_item['text'];


?>
<br>
<button class="btn btn-success"  onclick="location.href='<?php echo base_url();?>index.php/news'"> Home</button>
