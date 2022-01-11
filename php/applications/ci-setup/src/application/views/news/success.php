<?php
/**
 * Created by PhpStorm.
 * User: Raul Jonatan ( @Julnarot )
 * Date: 9/5/21
 * Time: 11:13 PM
 */
?>
<?php
header('Refresh:5; url= '. base_url().'index.php/news');
echo "You will be redirected in 5 seconds...";
?>
<br>
<button class="btn btn-success"  onclick="location.href='<?php echo base_url();?>index.php/news'"> Home</button>
