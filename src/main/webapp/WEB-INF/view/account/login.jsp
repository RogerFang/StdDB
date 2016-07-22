<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 2016/5/24
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/include/taglib.jsp" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <div>
        <form:form method="post" commandName="user" action="${ctx}/login" class="form-horizontal">
            <div class="form-group">
                <label for="username" class="col-sm-2 control-label">姓名:</label>
                <div class="col-sm-3">
                    <form:input path="username" class="form-control" value="${user.username}"/>
                    <form:errors path="username" cssClass="error"/>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">密码:</label>
                <div class="col-sm-3">
                    <form:password path="password" class="form-control"/>
                    <form:errors path="password" cssClass="error"/>
                </div>
            </div>


            <div class="form-group">
                <label for="password" class="col-sm-2 control-label" style="margin-right: 15px"></label>
                <div style="color: #d9534f;">
                    ${errMsg}
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-3">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </div>
        </form:form>
    </div>
</body>
</html>
