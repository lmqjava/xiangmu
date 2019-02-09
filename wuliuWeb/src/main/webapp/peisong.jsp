<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" href="/plugins/layui/css/layui.css"  media="all">
</head>
<body>
<table class="layui-hide" id="test" lay-filter="test"></table>

<script id="toolbarDemo" type="text/html">
	<div class="layui-btn-container">
		<a  href="addpeisong.jsp" class="layui-btn layui-btn-sm" >添加数据</a>
	</div>
</script>

<script id="barDemo" type="text/html">
	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
	<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script src="/plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>

    layui.use(['jquery','table'], function(){
        var table = layui.table,
            $=layui.jquery;
        table.render({
            elem: '#test'
            ,url:'/Peisongdian/selectAll'
            ,id: 'listReload'
            ,toolbar: '#toolbarDemo'
            ,title: '配送点信息表'
            ,cols: [[
                {type: 'checkbox', fixed: 'left'}
                ,{field:'psdid', title:'ID', width:80, fixed: 'left', unresize: true, sort: true}
                ,{field:'peisongidianname', title:'配送点名', width:120}
                ,{field:'shengfen', title:'所属省份', width:120, sort: true}
                ,{field:'psphone', title:'配送点电话', width:100}
                ,{field:'psemail', title:'配送点邮箱', sort: true}
                ,{field:'psxinxi', title:'配送点信息', sort: true}
                ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
            ]]
            ,page: true
        });

        $('.demoTable .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });


        //监听工具条
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            if (obj.event === 'edit') {
                layer.msg();
                layer.open({
                    area: '500px',
                    maxHeight: '800px'
                    , content: '<form class="layui-form" action="/updateUser"  lay-filter="example">' +
                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">ID：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="psdid" lay-verify="title" autocomplete="off" class="layui-input">' +
                        '</div>' +


                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">配送点名称：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="peisongidianname" lay-verify="title"  class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">所属省份：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="shengfen" lay-verify="title"  class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">配送点电话：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="psphone" lay-verify="title"  class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">配送点邮箱：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="psemail" lay-verify="title"  class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">详细信息：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="psxinxi" lay-verify="title"  class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<div class="layui-input-block">' +
                        '<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>' +
                        '</div>' +
                        '</div>' +
                        '</form>'

                });
                layui.use(['form'], function () {
                    var form = layui.form;

                    //监听提交
                    form.on('submit(demo1)', function (data) {
                        /* layer.alert(JSON.stringify(data.field), {
							title: '最终的提交信息'
						}); */
                        $.ajax({
                            url: "/updateUser",
                            data: data.field,
                            success: function (data) {
                                location.reload();
                            }
                        });
                        return false;
                    });

                    //表单初始赋值
                    form.val('example', {
                        "psdid":data.psdid
                        ,"peisongidianname": data.peisongidianname
                        ,"shengfen": data.shengfen
                        ,"psphone": data.psphone
                        ,"psemail": data.psemail
                        ,"psxinxi": data.psxinxi

                    })
                });
            } else if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    obj.del();
                    layer.close(index);
                    $.ajax({
                        url: "/Peisongdian/deletePeisongdian?psdid="+data.psdid,
                        method: 'post',
                        success: function (data) {
                        }
                    })
                });
            } /*else if (obj.event === 'detail') {
              layer.alert('编辑行：<br>' + data)
          }*/
        });


    });
</script>

</body>
</html>