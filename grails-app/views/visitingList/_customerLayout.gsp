<%--
  Created by IntelliJ IDEA.
  User: alexanderclarke
  Date: 2014-11-30
  Time: 1:13 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title></title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
    </head>

    <body>
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <a class="navbar-brand" href="#">OPR</a>
                <g:link controller="visitingList" action="index" class="btn-default">
                    <button type="button" class="btn btn-default navbar-btn">Browse Properties</button>
                </g:link>
                <g:link controller="visitingList" action="show" class="btn-default">
                    <button type="button" class="btn btn-default navbar-btn">View Visiting List</button>
                </g:link>
                <g:link controller="logout" action="index" class="btn-default">
                    <button type="button" class="btn btn-default navbar-btn">Log Out</button>
                </g:link>
            </div>
        </nav>
    </body>
</html>