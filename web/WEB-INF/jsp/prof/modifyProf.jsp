<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modifier un professeur</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>        
        <!-- HEADER -->
        <jsp:include page="../static/header.jspx" />        
        
        <!-- CONTENT -->        
        <div id='login' class="container col-xs-12 col-sm-offset-2 col-sm-8 col-md-offset-3 col-md-6 col-lg-offset-4 col-lg-4">
            <br />
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3>Modification du professeur</h3>
                </div>
                <div class="panel-body">
                    <form method="POST" action="modify" >
                        <!-- CIN -->
                        <div class="form-group">
                            <div class="input-group" style="width: 350px;">
                                <span class="input-group-addon" style="width:125px;">CIN</span>
                                <input type="text" class="form-control" name="cin" required="" readonly="readonly" value="${prof.getCin()}" />
                            </div>
                        </div>
                        <!-- Nom -->
                        <div class="form-group">
                            <div class="input-group" style="width: 350px;">
                                <span class="input-group-addon" style="width:125px;">Nom</span>
                                <input type="text" class="form-control" name="nom" required="" placeholder="${prof.getNom()}" value="${prof.getNom()}" />
                            </div>
                        </div>
                        <!-- Prenom -->
                        <div class="form-group">
                            <div class="input-group" style="width: 350px;">
                                <span class="input-group-addon" style="width:125px;">Prénom</span>
                                <input type="text" class="form-control" name="prenom" required="" placeholder="${prof.getPrenom()}" value="${prof.getPrenom()}" />
                            </div>
                        </div>
                        <!-- Email -->
                        <div class="form-group">
                            <div class="input-group" style="width: 350px;">
                                <span class="input-group-addon" style="width:125px;">Email</span>
                                <input type="text" class="form-control" name="email" placeholder="${prof.getEmail()}" value="${prof.getEmail()}" />
                            </div>
                        </div>
                        <!-- Téléphone -->
                        <div class="form-group">
                            <div class="input-group" style="width: 350px;">
                                <span class="input-group-addon" style="width:125px;">Téléphone</span>
                                <input type="text" class="form-control" name="telephone" placeholder="${prof.getTelephone()}" value="${prof.getTelephone()}" />
                            </div>
                        </div>
                        <!-- Département -->
                        <div class="form-group">
                            <div class="input-group" style="width: 350px;">
                                <span class="input-group-addon" style="width:125px;">Département</span>
                                <select class="form-control" name="departement">
                                    <option value="INFO">Informatique</option>
                                    <option value="RESEAUX">Réseaux</option>
                                    <option value="ELECTRIQUE">Electrique</option>
                                    <option value="GPEE">GPEE</option>
                                </select>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary" style="width: 100%">
                                MODIFIER
                            </button>
                        </div>
                        
                        <div class="form-group">
                            <button type="reset" class="btn btn-default" style="width: 100%">
                            ANNULER
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- FOOTER -->
        <jsp:include page="../static/footer.jspx" />
    </body>
</html>
