<?php
/**
 * Created by PhpStorm.
 * User: Raul Jonatan ( @Julnarot )
 * Date: 9/5/21
 * Time: 10:50 PM
 */
?>
<h2><?php echo $title; ?></h2>
<?php //echo validation_errors(); ?>
<?php echo form_open('news/create'); ?>
<div class="form-row">
	<div class="col-md-6 mb-3">
		<label for="title">Title</label>
		<input type="text" class="form-control is-invalid" id="title" name="title" placeholder="Insert title"  aria-describedby="invalid-text-feedback">
		<div id="invalid-text-feedback" class="invalid-feedback">
			<?php echo form_error('title'); ?>
		</div>
	</div>
</div>
<div class="form-row">
	<div class="col-md-12 mb-3">
		<label for="text">Text</label>
		<textarea type="text" class="form-control is-invalid" id="text" name="text" placeholder="Insert text"></textarea>
		<div id="text" class="invalid-feedback">
			<?php echo form_error('text'); ?>
		</div>
	</div>
</div>
<br>
<div class="form-row">
	<div class="col-md-12 d-flex justify-content-between">
		<button class="btn btn-secondary" type="button" onclick="location.href='<?php echo base_url();?>index.php/news'"> Volver</button>
		<input type="submit" name="submit" value="Create news item" class="btn btn-primary"/>
	</div>
</div>

</form>


