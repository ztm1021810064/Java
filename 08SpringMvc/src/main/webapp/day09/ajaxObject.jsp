<%@ page language="java" pageEncoding="utf-8" isELIgnored="false" %>
<html>
<head>
    <title>Ajax</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.11.1.js"></script>
    <script type="text/javascript">
        $(function () {
             $("[type=button]").click(function () {
                 $.ajax({
                     url:"${pageContext.request.contextPath}/five",
                     type:"POST",
                     success:function (data) {
                         $.each(data,function (i,dom) {
                             //map:i就是  k

                             // dom 就是value

                             //value
                             //一个dom就是一个UserINfo对象
                             alert(i);
                         })
                     }
                 })
               /*  $.ajax({
                     url:"four",
                     type:"POST",
                     success:function (data) {
                         $.each(data,function (i,dom) {
                             //一个dom就是一个UserINfo对象
                             alert(dom.username);
                         })
                     }
                 })*/
             });
        });
    </script>
</head>

<body>
<input type="button" value="9年前，我在广州，没有工作，晚上只能写Ajax，慰藉自己失望的心灵"/>
</body>
</html>
