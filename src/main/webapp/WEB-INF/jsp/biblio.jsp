<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.demo.model.Bibliotheque" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <head>
    <meta charset="UTF-8">
    <title>Bibliothèques</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 80%;
            margin: auto;
            overflow: hidden;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        
        form label {
            margin-right: 10px;
        }
        form input[type="text"] {
            padding: 5px;
            margin-right: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        form button {
		    padding: 10px 20px;
		    background-color: #007bff;
		    color: white;
		    border: none;
		    border-radius: 4px;
		    cursor: pointer;
		}
		
		.details-button {
		    outline: none;
		}
        form button:hover {
            background-color: #0056b3;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        table thead {
            background-color: #007bff;
            color: white;
        }
        table th, table td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        table tbody tr:hover {
            background-color: #ddd;
            cursor: pointer;
        }
        table tbody tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        form {
            margin-top: 20px;
        }

        .add-button {
            margin-top: 20px;
            display: inline-block;
        }
    </style>
</head>
<body>
    <div class="container">
    <h1>Liste des bibliothèques</h1>
    
        <form method="post" action="/getBiblio">
            <label for="nom">Nom de la bibliothèque:</label>
            <input type="text" id="nom" name="nom">
            <button type="submit">Rechercher</button>
        </form>
        
        
        <table>
            <thead>
                <tr>
                    <th colspan="2">Nom</th>
                    <th>Ville</th>
                    <th>Adresse</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="biblio" items="${biblio}">
                    <tr>
                        <td colspan="2">${biblio.nom}</td>
                        <td>${biblio.ville}</td>
                        <td>${biblio.adresse}</td>
                        <td> 
                            <form action="/produit" method="get" class="add-button">
                                <input type="hidden" name="nom" value="${biblio.nom}">
                                <input type="hidden" name="ville" value="${biblio.ville}">
                                <input type="hidden" name="adresse" value="${biblio.adresse}">
                                <button type="submit">Détails</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <form action="/addBiblio" method="get" class="add-button">
            <button type="submit">Ajouter une bibliothèque</button>
        </form>
    </div>
</body>
</html>
