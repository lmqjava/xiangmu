<%--
  Created by IntelliJ IDEA.
  User: LMQ
  Date: 2019/2/9
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
<div><h1><font color="#d2691e">添加车辆信息</font></h1></div>





<form class="layui-form layui-form-pane" action="">

    <div class="layui-form-item">
        <label class="layui-form-label">车牌号</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">运营证号</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">车型</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">车辆吨位</label>
        <div class="layui-input-inline">
            <select name="interest" lay-filter="aihao">
                <option value=""></option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>

            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">是否箱式</label>
        <div class="layui-input-inline">
            <select name="interest" lay-filter="aihao">
                <option value=""></option>
                <option value="0">是</option>
                <option value="1">否</option>

            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">车辆容积</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
        </div><font color="#a52a2a">立方米</font>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">购车时间</label>
            <div class="layui-input-block">
                <input type="text" name="date" id="date1" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">生产时间</label>
            <div class="layui-input-block">
                <input type="text" name="date" id="date2" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">车辆状态</label>
        <div class="layui-input-inline">
            <input type="text" name="carzt" lay-verify="required" value="空闲" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">品牌</label>
        <div class="layui-input-inline">
            <select name="interest" lay-filter="aihao">
                <option value=""></option>
                <option value="0">广汽</option>
                <option value="1">一汽</option>

            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">购车员工</label>
        <div class="layui-input-block">
            <select name="interest" lay-filter="aihao">
                <option value=""></option>
                <option value="0">罗敏强</option>
                <option value="1">张三</option>

            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">首选路线</label>
        <div class="layui-input-block">
            <select name="interest" lay-filter="aihao">
                <option value=""></option>
                <option value="0">陆运</option>
                <option value="1">省道</option>
                <option value="1">国道</option>
            </select>
        </div>
    </div>



    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">车辆描述</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <button class="layui-btn" lay-submit="" lay-filter="demo2">确认添加</button>
    </div>
</form>

<script src="plugins/layui/layui.js" charset="utf-8"></script>
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
</script>

</body>
</html>