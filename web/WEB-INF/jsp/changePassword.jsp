<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- CONTENT -->        
        <div id='login' class="container col-xs-12 col-sm-offset-2 col-sm-8 col-md-offset-3 col-md-6 col-lg-offset-4 col-lg-4">
            <br />
            <div class="panel panel-default">
                <div class="panel-heading">
                    <center><h3>Changement Mot de Passe</h3></center>
                </div>
                <div class="panel-body">
                    <form method="POST" action="changePassword" >
                    <!-- OLD Password -->
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon">
                                <i class="glyphicon glyphicon-user" style="width: auto"></i>
                            </span>
                            <input id="oldPassword" type="text" class="form-control" name="oldPassword" placeholder="Ancien mot de passe" required="" />
                        </div>
                    </div>                    
                    <!-- NEW Password -->
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon">
                                <i class="glyphicon glyphicon-lock" style="width: auto"></i>
                            </span>
                            <input id="newPassword" type="password" class="form-control" name="newPassword" placeholder="Nouveau mot de passe" required="" />
                        </div>
                    </div>
                    <!-- CONFIRM Password -->    
                    <div class="form-group">
                        <div class="input-group">
                            <span class="input-group-addon">
                                <i class="glyphicon glyphicon-lock" style="width: auto"></i>
                            </span>
                            <input id="confirmPassword" type="password" class="form-control" name="confirmPassword" placeholder="Confirmer mot de passe" required="" />
                        </div>
                    </div>
                    <!-- BUTTONS -->                    
                    <div class="form-group">
                        <button id="btnLogin" runat="server" class="btn btn-primary" style="width: 100%">
                            CHANGER <i class="glyphicon glyphicon-log-in"></i>
                        </button>
                    </div>
                    <div class="form-group">
                        <button id="btnLogin" runat="server" class="btn btn-default" style="width: 100%">
                            ANNULER
                        </button>
                    </div>
                    </form>
                </div>
            </div>
        
    </body>
</html>
