<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/11
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>waybill</title>
    <title>layui在线调试</title>
    <link rel="stylesheet" href="plugins/layui/css/layui.css" media="all">
    <style>
        body{margin: 10px;}
        .demo-carousel{height: 200px; line-height: 200px; text-align: center;}
    </style>
</head>
<body>

<table class="layui-hide" id="demo" lay-filter="test"></table>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>



<script src="plugins/layui/layui.js"></script>
<script>
    layui.config({
        version: '1545041465443' //为了更新 js 缓存，可忽略
    });

    layui.use([ 'table'], function(){
        var table = layui.table //表格





        //执行一个 table 实例
        table.render({
            elem: '#demo'
            ,height: 420
            ,url: '/order/select' //数据接口
            ,title: '用户表'
            ,page: true //开启分页
            ,toolbar: 'default' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
            ,totalRow: true //开启合计行
            ,cols: [[ //表头
                {checkbox: true, fixed: true}
                ,{field:'orderlistid', title: 'ID', width:50, sort: true, fixed: true}
                ,{field:'orderliststatus', title: '运送状态', width:100}
                ,{field:'startstationid', title: '发货配送点', width:100}
                ,{field:'endstationid', title: '收获配送点', width:100}
                ,{field:'orderlistweight', title: '重量（kg）',width:100}
                ,{field:'orderlistvolume', title: '个数',width:100}
                ,{field:'orderlistdeliverprice', title: '货物运输价格（元）',width:100}
                ,{field:'orderlistdispatchprice', title: '货物配送价格（元）',width:100}
                ,{field:'orderlistassureprice', title: '货物保价金额（元）',width:100}
                ,{field:'orderlistassurevalue', title: '货物保价资费（元）',width:100}
                ,{field:'orderlistassureprice', title: '货物价格总计（元）',width:100}
                ,{field:'orderlistreceivername', title: '收件人姓名',width:100}
                ,{field:'orderlistreceiverphone', title: '收件人固定电话',width:100}
                ,{field:'orderlistreceivermobil', title: '收件人手机',width:80}
                ,{field:'orderlistreceiveraddress', title: '收件人地址',width:120}
                ,{field:'orderlistreceiverpostc', title: '收货人邮编',width:120}
                ,{field:'orderlistsendername', title: '寄件人姓名',width:120}
                ,{field:'orderlistsenderphone', title: '寄件人电话',width:120}
                ,{field:'orderlistsenderfax', title: '寄件人传真',width:120}
                ,{field:'orderlistsenderpostcode', title: '寄件人邮编',width:120}
                ,{field:'orderlistsenderemail', title: '寄件人邮编',width:180}
                ,{field:'orderrequestdate', title: '要求发货日期', width:80}
                ,{field:'orderlistremark', title: '订单描述', width:80}
                ,{field:'orderlistidentifycode', title: '订单验证码', width:80}
                ,{field:'orderlistdate', title: '订单日期', width:120}
                // {checkbox: true, fixed: true}
                // ,{field:'orderlistid', title: 'ID', width:50, sort: true, fixed: true}
                // ,{field:'orderliststatus', title: '运送状态', width:100}
                // ,{field:'startstationid', title: '发货配送点', width:100}
                // ,{field:'endstationid', title: '收获配送点', width:100}
                // ,{field:'orderlistassureprice', title: '价格（元）',width:100}
                // ,{field:'orderlistsenderpostcode', title: '邮编',width:80}
                // ,{field:'orderlistsenderphone', title: '联系电话',width:120}
                // ,{field:'orderlistsenderemail', title: '邮箱',width:180}
                // ,{field:'orderlistremark', title: '信息', width:80}
            ]]
        });

        //监听头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id)
                ,data = checkStatus.data; //获取选中的数据
            switch(obj.event){
                case 'add':
                    layer.msg('添加');
                    break;
                case 'update':
                    if(data.length === 0){
                        layer.msg('请选择一行');
                    } else if(data.length > 1){
                        layer.msg('只能同时编辑一个');
                    } else {
                        layer.alert('编辑 [id]：'+ checkStatus.data[0].id);
                    }
                    break;
                case 'delete':
                    if(data.length === 0){
                        layer.msg('请选择一行');
                    } else {
                        layer.msg('删除');
                    }
                    break;
            };
        });

        //监听行工具事件
        table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'detail'){
                layer.msg('查看操作');
            } else if(layEvent === 'del'){
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);
                    //向服务端发送删除指令
                });
            } else if(layEvent === 'edit'){
                layer.msg('编辑操作');
            }
        });


    });
</script>
</body>
</html>