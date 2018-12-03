/**
 * 
 */

function sendAjax() {
	$.ajax({
		url:"person/err",
		type:"POST",
		async:false,
		success:function(data){
			if(data.state==0){
				alert("success!");
			}
			else{
				alert("发生异常："+data.msg);
			}
		},
		error:function(data){
			alert("请求失败");
		}
	});
}
