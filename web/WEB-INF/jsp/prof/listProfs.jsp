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
        <!-- HEADER -->
        <jsp:include page="../static/header.jspx" />        
        
        <!-- CONTENT -->
        <div class="container">
            <h3>Liste des Professeurs</h3>
            <table class="table table-striped custab">
                <thead>
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
                        <form method="GET" action="modify" style="display: inline;">
                            <input type="hidden" name="cin" value="${prof.getCin()}" />
                            <button type="submit" class="btn btn-success btn-xs">
                                <span class="glyphicon glyphicon-edit"></span>
                            </button>
                        </form>
                        <form method="POST" action="del" style="display: inline;">
                            <input type="hidden" name="cin" value="${prof.getCin()}" />
                            <button type="submit"class="btn btn-danger btn-xs">
                                <span class="glyphicon glyphicon-remove"></span>
                            </button>
                        </form>
                    </td>
                </tr>
                </c:forEach>
            </table>
            <a href="add" class="btn btn-primary btn-xs pull-left"><b>+</b> Nouveau Professeur</a>
        </div>
        
        <!-- FOOTER -->
        <jsp:include page="../static/footer.jspx" />
    </body>
</html>
