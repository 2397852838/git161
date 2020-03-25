<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>aaa表</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>操作</td>
    </tr>

    <#if list??>
        <#list list as a>
            <#if a_index%2==0>
                <tr style="background-color: blue">
            <#else>
                <tr style="background-color: red">
            </#if>
            <td>${a.id}</td>
            <td>${a.name}</td>
            <td><a>修改</a></td>
            </tr>
        </#list>
    </#if>

</table>
</body>
</html>