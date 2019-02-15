<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta charset="utf-8">
	<title>layui</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport"
		  content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" href="plugins/layui/css/layui.css"  media="all">
	<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<table class="layui-hide" id="test" lay-filter="test"></table>

<script type="text/html" id="toolbarDemo">
	<div class="layui-btn-group demoTable">
		<button class="layui-btn" data-type="getCheckData">获取选中行数据</button>
		<button class="layui-btn" data-type="getCheckLength">获取选中数目</button>
		<button class="layui-btn" data-type="isAll">验证是否全选</button>

	</div>
</script>

<script type="text/html" id="barDemo">

	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
	<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<script src="plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    function TJ() {
        //页面层
        layer
            .open({
                type : 1,
                skin : 'layui-layer-rim', //加上边框
                area : [ '500px', '400px' ], //宽高
                content : '<form class="layui-form" action="/client/insertOne" method="post">'
                    + '<div class="layui-form-item">'
                    + '<label class="layui-form-label">配送点编号：</label>'
                    + '<div class="layui-input-block">'
                    + '<input type="text" name="psdid" lay-verify="title" autocomplete="off" placeholder="请输入品牌" class="layui-input">'
                    + '</div>'
                    +

                    '</div>'
                    + '<div class="layui-form-item">'
                    + '<label class="layui-form-label">配送点名称：</label>'
                    + '<div class="layui-input-block">'
                    + '<input type="text" name="peisongidianname" placeholder="低配OR高配" autocomplete="off" class="layui-input">'
                    + '</div>'
                    + '</div>'
                    +

                    '<div class="layui-form-item">'
                    + '<label class="layui-form-label">所属省份：</label>'
                    + '<div class="layui-input-block">'
                    + '<input type="text" name="shengfen"  placeholder="1.5T" autocomplete="off" class="layui-input">'
                    + '</div>'
                    + '</div>'
                    +

                    '<div class="layui-form-item">'
                    + '<label class="layui-form-label">配送点电话：</label>'
                    + '<div class="layui-input-block">'
                    + '<input type="text" name="psphone"  placeholder="黑" autocomplete="off" class="layui-input">'
                    + '</div>'
                    + '</div>'
                    +

                    '<div class="layui-form-item">'
                    + '<label class="layui-form-label">配送点邮箱：</label>'
                    + '<div class="layui-input-block">'
                    + '<input type="text" name="psemail"  placeholder="SUV" autocomplete="off" class="layui-input">'
                    + '</div>'
                    + '</div>'
                    +

                    '<div class="layui-form-item">'
                    + '<label class="layui-form-label">详细地址：</label>'
                    + '<div class="layui-input-block">'
                    + '<input type="text" name="psxinxi"  placeholder="10000" autocomplete="off" class="layui-input">'
                    + '</div>'
                    + '</div>'
                    +

                    '<div class="layui-form-item">'
                    + '<div class="layui-input-block">'
                    + '<button class="layui-btn" lay-submit="" lay-filter="demo1">确认添加</button>'
                    + '</div>' + '</div>' + '</form>'
            });
    }

    layui
        .use(
            'table',
            function() {
                var table = layui.table;

                table.render({
                    elem : '#test',
                    url : '/Peisongdian/selectAll',
                    toolbar : '#toolbarDemo',
                    title : '用户数据表',

                    cols : [ [ {
                        type : 'checkbox',
                        fixed : 'left'
                    }, {
                        field : 'psdid',
                        title : '配送点编号',
                        width : 120,
                        fixed : 'left',
                        unresize : true,
                        sort : true
                    }, {
                        field : 'peisongidianname',
                        title : '配送点名称',
                        width : 150,
                        edit : 'text'
                    }, {
                        field : 'shengfen',
                        title : '所属省份',
                        width : 140,
                        edit : 'text'
                    }, {
                        field : 'psphone',
                        title : '联系电话',
                        width : 150,
                        edit : 'text'
                    }, {
                        field : 'psemail',
                        title : '邮箱',
                        width : 200
                    }, {
                        field : 'psxinxi',
                        title : '详细信息',
                        width : 207

                    }, {
                        fixed : 'right',
                        title : '操作',
                        toolbar : '#barDemo',
                        width : 120
                    } ] ],
                    page:true
                });

                //头部工具栏
                var $ = layui.$, active = {
                    getCheckData : function() { //获取选中数据
                        var checkStatus = table.checkStatus('test'), data = checkStatus.data;
                        layer.alert(JSON.stringify(data));
                    },
                    getCheckLength : function() { //获取选中数目
                        var checkStatus = table.checkStatus('test'), data = checkStatus.data;
                        layer.msg('选中了：' + data.length + ' 个');
                    },
                    isAll : function() { //验证是否全选
                        var checkStatus = table.checkStatus('test');
                        layer.msg(checkStatus.isAll ? '全选' : '未全选')
                    }
                };

                $('.demoTable .layui-btn').on('click', function() {
                    var type = $(this).data('type');
                    active[type] ? active[type].call(this) : '';
                });

                //监听工具条
                table
                    .on(
                        'tool(test)',
                        function(obj) {
                            var data = obj.data;
                            if (obj.event === 'edit') {
                                layer.msg();
                                layer
                                    .open({
                                        area : '500px',
                                        maxHeight : '600px',
                                        content : '<form class="layui-form" action="/Peisongdian/updatePeisongdian" method="post" lay-filter="example">'
                                            + '<div class="layui-form-item">'
                                            + '<label class="layui-form-label">编号：</label>'
                                            + '<div class="layui-input-block">'
                                            + '<input type="text"  name="psdid"  lay-verify="title" autocomplete="off" class="layui-input" disabled="true">'
                                            + '</div>'
                                            + '</div>'
                                            +

                                            '<div class="layui-form-item">'
                                            + '<label class="layui-form-label">名称：</label>'
                                            + '<div class="layui-input-block">'
                                            + '<input type="text" name="peisongidianname" lay-verify="title" autocomplete="off" placeholder="请输入" class="layui-input">'
                                            + '</div>'
                                            +

                                            '</div>'
                                            + '<div class="layui-form-item">'
                                            + '<label class="layui-form-label">所属省份：</label>'
                                            + '<div class="layui-input-block">'
                                            + '<input type="text" name="shengfen" placeholder="请输入" autocomplete="off" class="layui-input">'
                                            + '</div>'
                                            + '</div>'
                                            +

                                            '<div class="layui-form-item">'
                                            + '<label class="layui-form-label">联系电话：</label>'
                                            + '<div class="layui-input-block">'
                                            + '<input type="text" name="psphone"  placeholder="请输入" autocomplete="off" class="layui-input" id="phone">'+'<span style="color: red" id="phones" ></span>'
                                            + '</div>'
                                            + '</div>'
                                            +

                                            '<div class="layui-form-item">'
                                            + '<label class="layui-form-label">邮箱：</label>'
                                            + '<div class="layui-input-block">'
                                            + '<input type="text" name="psemail"  placeholder="请输入" autocomplete="off" class="layui-input" id="email">'+'<span style="color: red" id="emails" ></span>'
                                            + '</div>'
                                            + '</div>'
                                            +

                                            '<div class="layui-form-item">'
                                            + '<label class="layui-form-label">详细信息：</label>'
                                            + '<div class="layui-input-block">'
                                            + '<input type="text" name="psxinxi" placeholder="请输入" autocomplete="off" class="layui-input">'
                                            + '</div>'
                                            + '</div>'
                                            +



                                            '<div class="layui-form-item">'
                                            + '<div class="layui-input-block">'

                                            + '<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>'
                                            + '</div>'
                                            + '</div>'
                                            + '</form>'



                                    });
                                email.onchange = function() {
                                    var email = this.value;
                                    var reg = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
                                    if (!reg.test(email)) {
                                        $("#emails").text("邮箱格式不正确");

                                    // } else {
                                    //     $("#emails").text("邮箱格式不正确");
                                     }
                                }
                                phone.onchange = function() {
                                    var phone = this.value;
                                    var reg = /^1(3|4|5|7|8)\d{9}$/;
                                    if (!reg.test(phone)) {
                                        $("#phones").text("电话格式不正确");
                                    // } else {
                                    //     $("#phones").text("电话格式不正确");
                                    }
                                }
                                layui
                                    .use(
                                        [ 'form' ],
                                        function() {
                                            var form = layui.form;

                                            //监听提交
                                            form
                                                .on(
                                                    'submit(demo1)',
                                                    function(
                                                        data) {
                                                        layer
                                                            .alert(
                                                                JSON
                                                                    .stringify(data.field),
                                                                {
                                                                    title : '确认修改信息'

                                                                });
                                                        $
                                                            .ajax({
                                                                url : "/Peisongdian/updatePeisongdian",
                                                                method : "post",
                                                                data : data.field,
                                                                success : function(
                                                                    data) {

                                                                }
                                                            });
                                                        return false;
                                                    });

                                            //表单初始赋值

                                            form
                                                .val(
                                                    'example',
                                                    {
                                                        "psdid" : data.psdid,
                                                        "peisongidianname" : data.peisongidianname,
                                                        "shengfen" : data.shengfen,
                                                        "psphone" : data.psphone,
                                                        "psemail" : data.psemail,
                                                        "psxinxi" : data.psxinxi

                                                    })
                                        });
                            } else if (obj.event === 'del') {
                                layer
                                    .confirm(
                                        '真的删除行么',
                                        function(
                                            index) {
                                            obj
                                                .del();
                                            layer
                                                .close(index);
                                            $
                                                .ajax({
                                                    url : "/Peisongdian/deletePeisongdian?psdid="
                                                        + data.psdid,
                                                    method : 'post',
                                                    success : function(
                                                        data) {
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
