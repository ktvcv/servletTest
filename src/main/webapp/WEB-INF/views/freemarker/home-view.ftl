<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Work тема из Freemarker view resolver</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Пользователь</th>
        <th>Удалить</th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
    <tr>
        <td>${user?index+1}
        <td>
        <td>${user.name}
        <td>
        <td>
            <a href="/fm/delete/${user.id}">delete</a></td>
        </#list>
    </tr>
    </tbody>
</table>
</body>
</html>