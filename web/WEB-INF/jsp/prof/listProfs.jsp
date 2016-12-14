<%@page import="java.util.List"%>
<%@page import="com.ensakh.projetlibre.metier.Professeur"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    List<Professeur> professeurs = 
                        (List<Professeur>) request.getAttribute("professeurs");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des Professeurs</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <h1>Liste des Professeurs</h1>
            <table class="table table-striped custab">
                <thead>
                    <a href="add" class="btn btn-primary btn-xs pull-right"><b>+</b> Nouveau Professeur</a>
                    <tr>
                        <th>CIN</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>Email</th>
                        <th>Téléphone</th>
                        <th>Département</th>
                        <th class="text-center">Action</th>
                    </tr>
                </thead>
                <c:forEach items="${professeurs}" var="prof" >
                <tr>
                    <td>${prof.getCin()}</td>
                    <td>${prof.getNom()}</td>
                    <td>${prof.getPrenom()}</td>
                    <td>${prof.getEmail()}</td>
                    <td>${prof.getTelephone()}</td>
                    <td>${prof.getDepartement().toString()}</td>
                    <td class="text-center">
                        <a class='btn btn-info btn-xs' href="#">
                            <span class="glyphicon glyphicon-edit"></span> Modifier
                        </a>
                        <a href="del?id=${prof.getCin()}" class="btn btn-danger btn-xs">
                            <span class="glyphicon glyphicon-remove">
                            </span> Supprimer
                        </a>
                    </td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
