<%--
  Created by IntelliJ IDEA.
  User: Dabing
  Date: 2017/10/3
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=gbk" %>

<html>
<head>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js">
    </script>
    <script type="text/javascript">
        $(function () {
            $('input[name=tDay]').blur(function () {
                $.get("AjaxServlet",{tDay: $('input[name=tDay]').val()},function (data) {
                    $("#formid").submit();
                    if ('true'== data){
                        $('input[name=tDay]').css('border','1px solid green')
                    }else {
                        $('input[name=tDay]').css('border','1px solid red')
                    }
                    $('#hcontent').html(data);
                });
            });
        });
    </script>
    <title>µÇÂ½³É¹¦</title>
</head>
<body>
<h1>×ð¾´µÄ${user.username},»¶Ó­Äú</h1
</body>
</html>
