<%--
  Created by IntelliJ IDEA.
  User: LMQ
  Date: 2019/2/9
  Time: 4:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="firstPieChart" style="width:100%; height:300px;"></div>
<script src="echarts/echarts.js" charset="utf-8"></script>
<script src="echarts/jquery-1.3.2.min.js" charset="utf-8"></script>
<script type="text/javascript">

    function loadOneColumn() {
        var myChart = echarts.init(document.getElementById('firstPieChart'));
        // 显示标题，图例和空的坐标轴
        myChart.setOption({
            color: ['#ff7d27', '#47b73d', '#fcc36e', '#57a2fd', "#228b22"],//饼图颜色
            title: {
                text: '车辆吨位信息一览',
                subtext: '纯属虚构',
                x:'center'
            },
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                orient: 'vertical',
                x: 'left',
                data: []
            },
            toolbox: {
                show: true,
                feature: {
                    mark: { show: true },
                    dataView: { show: true, readOnly: false },
                    magicType: {
                        show: true,
                        type: ['pie', 'funnel'],
                        option: {
                            funnel: {
                                x: '25%',
                                width: '50%',
                                funnelAlign: 'left',
                                max: 1548
                            }
                        }
                    },
                    restore: { show: true },
                    saveAsImage: { show: true }
                }
            },
            series: [{
                name: '发布排行',
                type: 'pie',
                radius: '55%',
                center: ['50%', '60%'],
                data: []
            }]
        });
        myChart.showLoading();    //数据加载完之前先显示一段简单的loading动画
        var names = [];    //类别数组（用于存放饼图的类别）
        var brower = [];
        $.ajax({
            type: 'get',
            url: '/car/selectall',//请求数据的地址
            dataType: "json",        //返回数据形式为json
            success: function (result) {

                //请求成功时执行该函数内容，result即为服务器返回的json对象
                $.each(result, function (index, item) {
                    names.push(item.carnum);    //挨个取出类别并填入类别数组 
                    brower.push({
                        name: item.carnum,
                        value: item.cartun
                    });
                });
                myChart.hideLoading();    //隐藏加载动画
                myChart.setOption({        //加载数据图表                
                    legend: {
                        data: names
                    },
                    series: [{
                        data: brower
                    }]
                });
            },
            error: function (errorMsg) {
                //请求失败时执行该函数
                alert("图表请求数据失败!");
                myChart.hideLoading();
            }
        });
    };
    loadOneColumn();
</script>
<div id="main" style="width:100%; height: 400px;"></div>

<script type="text/javascript">

    var myChart = echarts.init(document.getElementById('main'));
    // 显示标题，图例和空的坐标轴
    myChart.setOption({


        title : {
            text : '车辆吨位柱状图'
        },
        tooltip : {},
        legend : {
            data : [ '吨位k' ]
        },
        xAxis : {
            data : []
        },
        yAxis : {},
        series : [ {
            name : '厂家',
            type : 'line',
            data : []
        } ]
    });

    myChart.showLoading(); //数据加载完之前先显示一段简单的loading动画


    $.ajax({
        type : "get",
        async : true, //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
        url : "/car/selectall", //请求发送到TestServlet处
        data : {},
        dataType : "json", //返回数据形式为json
        success : function(result) {
            var names = []; //类别数组（实际用来盛放X轴坐标值）
            var nums = [];
            //请求成功时执行该函数内容，result即为服务器返回的json对象
            if (result) {

                for (var i = 0; i < result.length; i++) {

                    names.push(result[i].carnum); //挨个取出类别并填入类别数组
                }

                for (var i = 0; i < result.length; i++) {
                    nums.push(result[i].cartun); //挨个取出销量并填入销量数组
                }
                myChart.hideLoading(); //隐藏加载动画
                myChart.setOption({
                    //加载数据图表

                    xAxis : {
                        data : names
                    },
                    series : [ {
                        // 根据名字对应到相应的系列
                        name : '吨位k',
                        data : nums
                    } ]
                });

            }

        },
        error : function(errorMsg) {
            //请求失败时执行该函数
            alert("图表请求数据失败!");
            myChart.hideLoading();

        }
    })


</script>
</body>
</html>
