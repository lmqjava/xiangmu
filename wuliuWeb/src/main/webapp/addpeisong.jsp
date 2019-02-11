<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2019/2/9
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form class="layui-form layui-form-pane" action="">

	<div class="layui-form-item">
		<label class="layui-form-label">配送点名称</label>
		<div class="layui-input-inline">
			<input name="peisongidianname" class="layui-input" type="text" placeholder="请输入" autocomplete="off" lay-verify="required">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">所属省份</label>
		<div class="layui-input-inline">
			<input name="shengfen" class="layui-input" type="text" placeholder="请输入" autocomplete="off" lay-verify="required">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">配送点电话</label>
		<div class="layui-input-inline">
			<input name="psphone" class="layui-input" type="text" placeholder="请输入" autocomplete="off" lay-verify="required" id="phone">
		</div>
	</div>
	<div class="layui-form-item">
		<label class="layui-form-label">配送点邮箱</label>
		<div class="layui-input-inline">
			<input name="psemail" class="layui-input" type="text" placeholder="请输入" autocomplete="off" lay-verify="required" id="email">
		</div>
	</div>
	<div class="layui-form-item layui-form-text">
		<label class="layui-form-label">配送点详细信息</label>
		<div class="layui-input-block">
			<input name="psxinxi" class="layui-input" type="text" placeholder="请输入" autocomplete="off" lay-verify="required">
		</div>
	</div>
	<div class="layui-form-item">
		<button class="layui-btn" lay-filter="demo1" lay-submit="">跳转式提交</button>
	</div>
</form>

<script src="/plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date2'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');




        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });




    });
    email.onchange = function() {
        var email = this.value;
        var reg = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
        if (reg.test(email)) {
            alert("邮箱格式正确");
        } else {
            alert("邮箱格式不正确");
        }
    }
    phone.onchange = function() {
        var phone = this.value;
        var reg = /^1(3|4|5|7|8)\d{9}$/;
        if (reg.test(phone)) {
            alert("电话格式正确");
        } else {
            alert("电话格式不正确");
        }
    }
</script>
</body>
</html>
