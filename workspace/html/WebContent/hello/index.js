//JavaScript代码练习
var a = 1; //var表示任意类型
var b = 5;

//alert("弹出窗口吗?"); //页面弹出窗口
//function -->创建方法  
function add(){
	alert(a + b);
}

console.log("test:" + (a + b)); // 浏览器控制台显示
console.log("可以同时存在");

//-----------在js中, 方法没返回值
function getSum(num1, num2){
	console.log(num1 * num2)
}

//调用上述方法
getSum(22, 323);

//
function getSum2(a, b){
	return a + b;
}
var ret = getSum2(65, 1);
console.log(ret);
//-表单自定义事件/按钮->执行该方法-->该方法执行submit() -->把当前表单提交出去
function submitForm(){
	document.getElementById("f1").submit();
}



