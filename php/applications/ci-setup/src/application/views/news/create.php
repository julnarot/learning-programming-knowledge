<?php
/**
 * Created by PhpStorm.
 * User: Raul Jonatan ( @Julnarot )
 * Date: 9/5/21
 * Time: 10:50 PM
 */
?>
<h2><?php echo $title; ?></h2>
<?php echo validation_errors(); ?>
<?php echo form_open('news/create'); ?>
<div class="form-row">
	<div class="col-md-6 mb-3">
		<label for="title">Title</label>
		<input type="text" class="form-control" id="title" name="title" placeholder="Insert title">
	</div>
</div>
<div class="form-row">
	<div class="col-md-12 mb-3">
		<label for="text">Text</label>
		<textarea type="text" class="form-control" id="text" name="text" placeholder="Insert text"></textarea>
	</div>
</div>
<br>
<div class="form-row">
	<div class="col-md-12 mt-3">

		<input type="submit" name="submit" value="Create news item" class="btn btn-primary"/>
	</div>
</div>

</form>


