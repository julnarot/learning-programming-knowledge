<?php
/**
 * Created by PhpStorm.
 * User: Raul Jonatan ( @Julnarot )
 * Date: 9/5/21
 * Time: 2:47 AM
 */
?>

<div class="absolute flex items-center justify-center h-12 w-12 rounded-md bg-indigo-500 text-white el-element"  onclick="location.href='<?php echo base_url();?>index.php/news/create'">
	<svg class="h-6 w-6" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke="currentColor" aria-hidden="true">
		<path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M21 12a9 9 0 01-9 9m9-9a9 9 0 00-9-9m9 9H3m9 9a9 9 0 01-9-9m9 9c1.657 0 3-4.03 3-9s-1.343-9-3-9m0 18c-1.657 0-3-4.03-3-9s1.343-9 3-9m-9 9a9 9 0 019-9" />
	</svg>
</div>


<?php foreach ($news as $news_item): ?>
<div class="grid grid-cols-1 sm:grid-cols-2 sm:px-8 sm:py-12 sm:gap-x-8 md:py-16">
	<div class="relative z-10 col-start-1 row-start-1 px-4 pt-40 pb-3 bg-gradient-to-t from-black sm:bg-none">
		<p class="text-sm font-medium text-white sm:mb-1 sm:text-gray-500">Entire house</p>
		<h2 class="text-xl font-semibold text-white sm:text-2xl sm:leading-7 sm:text-black md:text-3xl">
			<?php echo $news_item['title']; ?></p>
		</h2>
	</div>
	<div class="col-start-1 row-start-2 px-4 sm:pb-16">
		<div class="flex items-center text-sm font-medium my-5 sm:mt-2 sm:mb-4">
			<svg width="20" height="20" fill="currentColor" class="text-violet-600">
				<path d="M9.05 3.691c.3-.921 1.603-.921 1.902 0l1.07 3.292a1 1 0 00.95.69h3.462c.969 0 1.372 1.24.588 1.81l-2.8 2.034a1 1 0 00-.364 1.118l1.07 3.292c.3.921-.755 1.688-1.539 1.118l-2.8-2.034a1 1 0 00-1.176 0l-2.8 2.034c-.783.57-1.838-.197-1.539-1.118l1.07-3.292a1 1 0 00-.363-1.118l-2.8-2.034c-.784-.57-.381-1.81.587-1.81H7.03a1 1 0 00.95-.69L9.05 3.69z" />
			</svg>
			<div class="ml-1">
				<span class="text-black">4.94</span>
				<span class="sm:hidden md:inline">(128)</span>
			</div>
			<div class="text-base font-normal mx-2">·</div>
			<div>Collingwood, Ontario</div>
		</div>
		<hr class="w-16 border-gray-300 hidden sm:block">
	</div>
	<div class="col-start-1 row-start-3 space-y-3 px-4">
		<p class="flex items-center text-black text-sm font-medium">
			<img src="/kevin-francis.jpg" alt="" class="w-6 h-6 rounded-full mr-2 bg-gray-100">
			Hosted by Kevin Francis
		</p>
		<a href="<?php echo site_url('news/'.$news_item['slug']); ?>">
		<button type="button" class="bg-violet-100 text-violet-700 text-base font-semibold px-6 py-2 rounded-lg">Show detail</button>
		</a>

	</div>
	<div class="col-start-1 row-start-1 flex sm:col-start-2 sm:row-span-3">
		<div class="w-full grid grid-cols-3 grid-rows-2 gap-2">
			<div class="relative col-span-3 row-span-2 md:col-span-2">
				<img src="/beach-house.jpg" alt="" class="absolute inset-0 w-full h-full object-cover bg-gray-100 sm:rounded-lg" Beach House in Collingwood/>
			</div>
			<div class="relative hidden md:block">
				<img src="/beach-house-interior.jpg" alt="" class="absolute inset-0 w-full h-full object-cover rounded-lg bg-gray-100" />
			</div>
			<div class="relative hidden md:block">
				<img src="/beach-house-view.jpg" alt="" class="absolute inset-0 w-full h-full object-cover rounded-lg bg-gray-100" />
			</div>
		</div>
	</div>
</div>

<?php endforeach; ?>
