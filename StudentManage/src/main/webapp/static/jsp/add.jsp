<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-3.4.1.min.js"></script>
<body>
    <table align="center" border="1px">
        <tr>
            <td colspan="2" align="center">学员信息添加</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" class="name"/></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" class="gender"/></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" class="age"/></td>
        </tr>
        <tr>
            <td>电话</td>
            <td><input type="text" class="telephone"/></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="text" class="email"/></td>
        </tr>
        <tr>
            <td>班级</td>
            <td>
                <select class="classid">
                    <option value="0">请选择</option>

                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="button" value="保存" onclick="con()"/>
                <input type="button" value="返回" onclick="back()">
            </td>
        </tr>
    </table>
</body>
</html>
<script type="text/javascript">
    $(function () {
        $.post("/byname",function (result) {
            $.each(result.classes,function (i,v) {
                $(".classid").append("<option value='"+v.id+"'>"+v.name+"</option>");
            })
        },"json")
    })
    function con() {
        var json={
            name:$(".name").val(),
            age:$(".age").val(),
            gender:$(".gender").val(),
            telephone:$(".telephone").val(),
            email:$(".email").val(),
            classid:$(".classid").val()
        }
        $.post("/add",json,function (result) {
            if(result.status=="ok"){
                location.href="/static/jsp/index.jsp";
            }else{
                alert("添加错误");
            }
        },"json")
    }
    function back() {
        location.href="javascript:history.back()";
    }

</script>
