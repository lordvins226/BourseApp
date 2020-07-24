<%-- 
    Document   : index
    Created on : 24 juil. 2020, 02:19:46
    Author     : kevin
--%>
<%@page import="java.util.List"%>
<%@page import="views.CotationService"%>
<%@page import="webservice.Cotation"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    </head>
    <body>

        <div class="container mt-4">
            <div class="card">
                <div class="card-header mx-auto">
                    <h2>Liste des Cotations des Sociétés</h2>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>NumeroCotation</th>
                                <th>CodeSociete</th>
                                <th>DateCotation</th>
                                <th>ValeurCotation</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                CotationService cotation = new CotationService();
                                List<Cotation> cota = cotation.liste();
                                for (Cotation c : cota) {
                            %>
                            <tr>
                                <td><%= c.getNumCotation()%></td>
                                <td><%= c.getCodeSociete()%></td>
                                <td><%= c.getDateCotation()%></td>
                                <td><%= c.getValAction()%></td>
                            </tr>
                            <%}
                            %>

                        </tbody>
                    </table>

                </div>
            </div>
        </div>
    </body>
</html>
