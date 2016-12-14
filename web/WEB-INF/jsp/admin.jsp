<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>CPanel</title>
    </head>
    <body>
        <div class="navbar navbar-inverse nav">
            <div class="navbar-inner">
                <div class="container">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="/">Gestion des Emplois du Temps</a>

                        <div class="nav-collapse collapse">
                      <div class="pull-right">
                        <ul class="nav pull-right">
                            <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Welcome, <%=session.getAttribute("username")%><b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="/account/settings"><i class="icon-cog"></i> Settings</a></li>
                                    <li class="divider"></li>
                                    <li><a href="/auth/logout"><i class="icon-off"></i> Logout</a></li>
                                </ul>
                            </li>
                        </ul>
                      </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
