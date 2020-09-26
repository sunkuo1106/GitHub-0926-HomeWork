<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<table class="table" align="center" border="1px">
    <tr>
        <td style="font-size: 32px;color: red;" colspan="7" align="center">学员信息列表</td>
    </tr>
    <tr>
        <td colspan="7" align="right"><a href="/toadd">添加学员</a></td>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>电话</td>
        <td>email</td>
        <td>班级</td>
    </tr>
</table>
<script type="text/javascript">
    $(function () {
        $.post("/index",function (result) {
            console.log(result);
            $.each(result.students,function (i,v) {
                $(".table").append("<tr><td>"+v.id+"</td><td>"+v.name+"</td><td>"+v.gender+"</td><td>"+v.age+"</td><td>"+v.telephone+"</td><td>"+v.email+"</td><td>"+v.classname+"</td></tr>");
            })
        },"json")
    })
</script>
</body>
</html>
