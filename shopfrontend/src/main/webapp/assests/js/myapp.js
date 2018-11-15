
$(function() {
	// Active Menu
	switch (menu) {
	
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'Shop':
		$('shop').addClass('active');
		break;
		default:
			if(menu=='Home') break;
			$('#shop').addClass('active');
			$('#a_'+menu).addClass('active');
		break;
	}
	
	//Jquery Data Table

	

	var $table= $('#productListTable');
	//Execute the below code when we have this code.
	if($table.length){
		
		
		var jsonUrl="";
		 if(window.category==" "){
			 jsonUrl=window.contextRoot + '/json/data/all/products';
		 }else{
			 jsonUrl=window.contextRoot + '/json/data/category/'+window.categoryId+'/products';
		 }
		
		$table.DataTable({
			lengthMenu:[[3,5,10,-1],['3 Records','5 Records','10 Records','All']],
			pageLength:5,
			ajax:{
				url:jsonUrl,
				dataSrc:''
			},
			columns:[
				{
					data:'name'
				},
				{
					data:'brand'
				},
				{
					data:'unitPrice',
					mRender: function(data,type,row){
						return '&#8377;'+data
					}
				},
				{
					data:'quantity'
				},
				{
					data:'id',
					mRender: function(data,type,row){
						var str=" ";
						str += '<a href="'+window.contextRoot+'/show/'+data+'/product'">View Product</a>';
						str += '<a href="'+window.contextRoot+'/cart/add/'+data+'/product'">View Product</a>';
						return str;
					}
				}
			]
		});
	}
	
})
