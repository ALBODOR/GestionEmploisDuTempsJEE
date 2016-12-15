<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Page d'authentification</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class = "container">
            <div class = "page-header">
                <h1>
                    Application de Gestion des Emplois du Temps<br>
                   <small>Projet Libre de la 5ème Année Génie Informatique (ENSA Khouribga) </small>
                </h1>
            </div>
        </div>
        
        <div id='login' class="container col-xs-12 col-sm-offset-2 col-sm-8 col-md-offset-3 col-md-6 col-lg-offset-4 col-lg-4">
            <br />
            <div class="panel panel-default">
                <div class="panel-heading">
                    <center><h3>Authentification</h3></center>
                </div>
                <div class="panel-body">
                    <form method="POST" action="login" >
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon">
                                <i class="glyphicon glyphicon-user" style="width: auto"></i>
                            </span>
                            <input id="username" type="text" class="form-control" name="username" placeholder="Votre login" required="" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon">
                                <i class="glyphicon glyphicon-lock" style="width: auto"></i>
                            </span>
                            <input id="password" type="password" class="form-control" name="password" placeholder="Vote mot de passe" required="" />
                        </div>
                    </div>
                        
                    <div class="form-group">
                        <button id="btnLogin" runat="server" class="btn btn-primary" style="width: 100%">
                            SE CONNECTER <i class="glyphicon glyphicon-log-in"></i>
                        </button>
                    </div>
                    <center>mot de passe oublié? <a href="/GestionEmploisDuTempsJEE/recoverPassword">Cliquez ici</a></center>
                    </form>
                </div>
            </div>
        </div>
        
        <!-- FOOTER -->
        <jsp:include page="static/footer.jspx" />
    </body>
</html>

