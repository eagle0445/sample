function doSomeThing(obj){
		var jobj = $(obj);
		var url = jobj.attr('href');
//		alert(url)
		//调用后台操作
		$.get(url, function(data){
// 			alert(data)
			if(isNull(data.result)){
				data = eval('(' + data + ')');
			}
			
			if(data.result == true){
				alert("成功!");
			}else{
				//失败
				alert(data.errorMessage);
			}
			
		});

	return false;
}

function isNull(obj){
	return (typeof(obj) === "undefined" || typeof(obj) === "null" || obj === null || obj === "");
}