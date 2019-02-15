<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>layui</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" href="/plugins/layui/css/layui.css"  media="all">
	<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<table class="layui-hide" id="test" lay-filter="test"></table>

<script id="toolbarDemo" type="text/html">
	<div class="layui-btn-container">
		<button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
	</div>
</script>


<script src="/plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'
            ,url:'/Peisong/selectALL'
            ,toolbar: '#toolbarDemo'
            ,cols: [[
                {type:'radio'}
                ,{field:'pathname', width:100, title: '路线名称'}
                ,{field:'fhadd', width:150, title: '发货配送点'}
                ,{field:'shadd', width:150, title: '收货配送点'}
                ,{field:'firstprice', width:150, title: '首公斤价格'}
                ,{field:'cgjprice',  width:150,title: '次公斤价格'}
                ,{field:'stjprice', width:150, title: '首体积价格'}
                ,{field:'ctjprice', width:140, title: '次体积价格'}
                ,{field:'sslxn', width:115, title: '所属路线数'}
            ]]
            ,page: true
        });

        //头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id); //获取选中行状态
            switch(obj.event){
                case 'getCheckData':
                    var data = checkStatus.data;  //获取选中行数据
                    layer.alert(JSON.stringify(data));
                    break;
            };
        });
    });
</script>

</body>
</html>
