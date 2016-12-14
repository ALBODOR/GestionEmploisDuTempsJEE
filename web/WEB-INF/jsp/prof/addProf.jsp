
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nouveau Professeur</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container" >
        <form class="form-horizontal" action='' method="POST">
            <fieldset>
              <div id="legend">
                <legend class="">Nouveau Professeur</legend>
              </div>
              <div class="control-group">
                <!-- CIN -->
                <label class="control-label"  for="cin">CIN <span style="color: red;">*</span></label>
                <div class="controls">
                    <input type="text" id="cin" name="cin" placeholder="Carte d'Idenitité Nationale" class="input-xlarge" required="true">
                  <p class="help-block">Ne peut contenir que des lettres et chiffres, sans espaces.</p>
                </div>
              </div>
                
                <div class="control-group">
                <!-- Nom -->
                <label class="control-label"  for="nom">Nom <span style="color: red;">*</span></label>
                <div class="controls">
                    <input type="text" id="nom" name="nom" placeholder="" class="input-xlarge" required="true">
                  <p class="help-block">Ne peut contenir que des lettres et espaces.</p>
                </div>
              </div>

                <div class="control-group">
                    
                <!-- Prenom -->
                <label class="control-label"  for="prenom">Prénom <span style="color: red;">*</span></label>
                <div class="controls">
                    <input type="text" id="prenom" name="prenom" placeholder="" class="input-xlarge" required="true">
                  <p class="help-block">Ne peut contenir que des lettres et espaces.</p>
                </div>
              </div>

              <div class="control-group">
                <!-- E-mail -->
                <label class="control-label" for="email">E-mail</label>
                <div class="controls">
                  <input type="email" id="email" name="email" placeholder="" class="input-xlarge" >
                  <p class="help-block">Veuillez fournir votre émail.</p>
                </div>
              </div>

              <div class="control-group">
                <!-- Telephone -->
                <label class="control-label" for="telephone">Téléphone</label>
                <div class="controls">
                  <input type="text" id="telephone" name="telephone" placeholder="06XXXXXXXX" class="input-xlarge">
                  <p class="help-block">Veuillez fournir votre numéro de téléphone portable.</p>
                </div>
              </div>
                
                <div class="control-group">
                <!-- Radio Buttons -->
                <label class="control-label" for="telephone">Département</label>
                <div class="controls">
                <label class="radio-inline">
                    <input type="radio" name="departement" value="INFO">Informatique
                </label>
                <label class="radio-inline">
                    <input type="radio" name="departement" value="RESEAUX">Réseaux
                </label>
                <label class="radio-inline">
                    <input type="radio" name="departement" value="ElECTRIQUE">Electrique
                </label>
                <label class="radio-inline">
                    <input type="radio" name="departement" value="GPEE">Génie Procédés
                </label>
                </div>
                </div>
                
              <div class="control-group">
                <!-- Button -->
                <div class="controls">
                  <button class="btn btn-success">Register</button>
                </div>
              </div>
            </fieldset>
          </form>
        </div>
    </body>
</html>
