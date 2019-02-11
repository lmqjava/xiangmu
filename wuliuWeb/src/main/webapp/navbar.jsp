<%--
  Created by IntelliJ IDEA.
  User: LMQ
  Date: 2019/2/11
  Time: 0:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="plugins/layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<div class="demoTable">
    搜索ID：
    <div class="layui-inline">
        <input class="layui-input" name="orderlistid" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>

<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>


<script src="plugins/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('table', function(){
        var table = layui.table;

        //方法级渲染
        table.render({
            elem: '#LAY_table_user'
            ,url: '/order/select'
            ,cols: [[
                {checkbox: true, fixed: true}
                ,{field:'orderlistid', title: 'ID', width:50, sort: true, fixed: true}
                ,{field:'orderliststatus', title: '运送状态', width:100}
                ,{field:'startstationid', title: '发货配送点', width:100}
                ,{field:'endstationid', title: '收获配送点', width:100}
                ,{field:'orderlistassureprice', title: '价格（元）',width:100}
                ,{field:'orderlistsenderpostcode', title: '邮编',width:80}
                ,{field:'orderlistsenderphone', title: '联系电话',width:120}
                ,{field:'orderlistsenderemail', title: '邮箱',width:180}
                ,{field:'orderlistremark', title: '信息', width:80}
                ,{field:'orderlistdate', title: '时间', width:120, templet :function (row){
                        return orderlistdate(row.orderlistdate);}
            }

            ]]
            ,id: 'testReload'
            ,page: true
            ,height: 500
        });

        var $ = layui.$, active = {
            reload: function(){
                var demoReload = $('#demoReload');

                //执行重载
                table.reload('testReload', {
                    page: {
                        curr: 1 //重新从第 1 页开始
                    }
                    ,where: {
                        key: {
                            id: demoReload.val()
                        }
                    }
                });
            }
        };

        $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
    function orderlistdate(v){
        var date = new Date(v);
        var y = date.getFullYear();
        var m = date.getMonth()+1;
        m = m<10?'0'+m:m;
        var d = date.getDate();
        d = d<10?("0"+d):d;
        var h = date.getHours();
        h = h<10?("0"+h):h;
        var M = date.getMinutes();
        M = M<10?("0"+M):M;
        var str = y+"-"+m+"-"+d+" "+h+":"+M;
        return str;
    }

</script>




</body>
</html>
