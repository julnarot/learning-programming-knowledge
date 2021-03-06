<!DOCTYPE html>
<html lang="en">
    <head>
        <title>My Music</title>
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/knobKnob.css" />
<!--        <link href='http://fonts.googleapis.com/css?family=Aldrich' rel='stylesheet' type='text/css' />-->
		<script type="text/javascript" src="js/modernizr.custom.69142.js"></script> 
    </head>
    <body>
        <div class="container">
			<header>			
                                <div class="support-note"><!-- let's check browser support with modernizr -->
					<span class="no-cssanimations">Animaciones CSS no son compatibles con tu navegador</span>
					<span class="no-csstransforms">Transformaciones CSS no son compatibles con tu navegador</span>
					<span class="no-csstransforms3d">CSS 3D transforms are not supported in your browser</span>
					<span class="no-csstransitions">CSS transformaciones 3D no son compatibles con tu navegador</span>
					<span class="note-ie">Lo sentimos, solo los navegadores modernos.=)</span>
				</div>
				
			</header>

			<div id="vc-container" class="vc-container">
				<div class="vc-tape-wrapper">
					<div class="vc-tape">
						<div class="vc-tape-back">
							<div class="vc-tape-wheel vc-tape-wheel-left"><div></div></div>
							<div class="vc-tape-wheel vc-tape-wheel-right"><div></div></div>
						</div>
						<div class="vc-tape-front vc-tape-side-a">
							<span>A</span>
						</div>
						<div class="vc-tape-front vc-tape-side-b">
							<span>B</span>
						</div>
					</div>
				</div>
				<div class="vc-loader"></div>
			</div><!-- //vc-container -->
<!--		
			<div class="attribution">
				<p>Songs by <a href="http://freemusicarchive.org/music/Blue_Ducks/">Blue Ducks</a> and <a href="http://freemusicarchive.org/music/Blank__Kytt/">Blank & Kytt</a>:</p>

				<div xmlns:cc="http://creativecommons.org/ns#" xmlns:dct="http://purl.org/dc/terms/" about="http://freemusicarchive.org/music/Blue_Ducks/Six/"><span property="dct:title">Six</span> (<a rel="cc:attributionURL" property="cc:attributionName" href="http://freemusicarchive.org/music/Blue_Ducks/">Blue Ducks</a>) / <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/3.0/">CC BY-NC-SA 3.0</a></div>

				<div xmlns:cc="http://creativecommons.org/ns#" xmlns:dct="http://purl.org/dc/terms/" about="http://freemusicarchive.org/music/Blank__Kytt/Heavy_Crazy_Serious/"><span property="dct:title">Heavy, Crazy, Serious</span> (<a rel="cc:attributionURL" property="cc:attributionName" href="http://blankkytt.bandcamp.com/">Blank & Kytt</a>) / <a rel="license" href="http://creativecommons.org/licenses/by/3.0/">CC BY 3.0</a></div>
				
				<p>Cassette tape PSD by <a href="http://manicho.deviantart.com/art/Cassette-PSD-File-86548493">Mauricio Estrella</a></p>
			</div>//attribution-->

		</div><!-- //container -->
		
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
		<!-- KnobKnob by Martin Angelov : https://github.com/martinaglv/KnobKnob -->
		<script src="js/transform.js"></script>
		<script src="js/knobKnob.jquery.js"></script>

		<script type="text/javascript" src="js/jquery.cassette.js"></script>
		<script type="text/javascript">	
			$(function() {
				
				$( '#vc-container' ).cassette();
						
				});
		</script>
    </body>
</html>