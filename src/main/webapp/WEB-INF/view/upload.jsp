<%--
  Created by IntelliJ IDEA.
  User: Roger
  Date: 2016/7/21
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/include/taglib.jsp"%>
<html>
<head>
    <title>Title</title>
    <link href="${ctx}/static/css/fileupload.css" rel="stylesheet">
    <script src="${ctx}/static/js/fileupload.js" type="text/javascript"></script>

    <script>
        $(function () {
            // 上传文件样式设置
            $('input[type=file]').bootstrapFileInput();
            $('.file-inputs').bootstrapFileInput();
        });

        function upload() {
            if ($("#uploadFile").val()!=""){
                $("#uploadForm").ajaxSubmit({
                    async: false,
                    success:function(data){
                        $("#clearFile").click();
                        alert(data.msg);
                    }
                });
            }
        }
    </script>
</head>
<body>
    <div class="panel panel-info">
        <div class="panel-heading text-center">
            <h3>校验</h3>
        </div>
        <div class="panel-body">
            <div class="row">
                <span class="col-lg-3">文件上传：</span>
                <form id="uploadForm" action="${ctx}/system/fileUpload" method="post" enctype="multipart/form-data">
                    <div class="col-lg-6 fileupload fileupload-new" data-provides="fileupload">
                                        <span class="btn btn-primary btn-file">
                                            <span class="fileupload-new">选择文件</span>
                                            <span class="fileupload-exists">重选文件</span>
                                            <input type="file" name="multipartFile"/>
                                        </span>
                        <span class="fileupload-preview"></span>
                        <a href="#" class="close fileupload-exists" data-dismiss="fileupload" style="float: none" id="clearFile">×</a>
                    </div>
                    <button class="col-lg-2 btn btn-primary" type="button" onclick="upload();">上传</button>
                </form>
            </div>
        </div>
</div>
</body>
</html>
