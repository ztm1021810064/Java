<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<html>
<head>
    <title>Ajax</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.11.1.js"></script>
    <script type="text/javascript">
        var name='happy';
        alert(name);





       /* window.onload=function () {
            alert(2);
        };*/
        $(function () {
            //window.onload

            //维度一：书写次数探讨  $function :多次    window.onload

            //维度二：先后顺序    $function :更早一些    window.onload 晚一些

            /*alert(1);*/
           $("input").on("click",function () {
             $.ajax({
                   url:"${pageContext.request.contextPath}/one",
                   type:"POST",
                   data:{},
                   success:function (data) { //data:String json串   data:Object json对象

                       //用户名
                       $.each(eval("("+data+")"),function (i,dom) {
                           alert(dom.username);
                       });
                   }
               });
           });
        });

    </script>
</head>

<body>
<%--<img src="image/1.jpg">--%>
<input type="button" value="想发送Ajax？,点我不要赔的喔！！！呵呵哒~~~~~~"/>
</body>
</html>
