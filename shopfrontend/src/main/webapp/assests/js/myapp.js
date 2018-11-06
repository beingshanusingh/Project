$(function() {
	// Active Menu
	switch (menu) {
	
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'Shop':
		$('shop').addClass('active');
		break;
		default:
			$('#shop').addClass('active');
			$('#a_'+menu).addClass('active');
		break;
		
	}

})
