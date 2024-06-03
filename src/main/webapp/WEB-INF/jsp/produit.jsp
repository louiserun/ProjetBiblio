<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des produits</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
        }

        h2 {
            margin-top: 40px;
            font-size: 24px;
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            background-color: #fff;
            border-radius: 8px;
            overflow: hidden;
        }

        th, td {
            padding: 12px;
            border-bottom: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr.category-row {
            background-color: #4CAF50;
            color: white;
        }

        tr:hover {
            background-color: #e0e0e0;
        }

        form {
            margin-top: 20px;
        }

        button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        button:hover {
            background-color: #45a049;
        }

        .add-button {
            margin-top: 20px;
            display: inline-block;
        }
    </style>
</head>
<body>
    <h1>Bienvenue à la bibliothèque</h1>

<h2 style="color: #4CAF50;">Livres</h2>
<table>
    <thead>
        <tr>
            <th colspan="2">Titre</th>
	        <th>ISBN</th>
	        <th>Auteur</th>
	        <th>Édition</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="livre" items="${livre}">
            <tr>
                <td colspan="2">${livre.titre}</td>
                <td>${livre.ISBN}</td>
                <td>${livre.auteur}</td>
                <td>${livre.edition}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<form action="/addLivre" method="get" class="add-button">
    <button type="submit">Ajouter un livre</button>
</form>

<h2 style="color: #007bff;">DVDs</h2>
<table>
    <thead style="color: #007bff">
        <tr>
            <th colspan="2">Titre</th>
            <th> ISBN </th>
            <th>Réalisateur</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="dvd" items="${dvd}">
            <tr>
                <td colspan="2">${dvd.titre}</td>
                <td>${dvd.ISBN}</td>
                <td>${dvd.realisateur}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<form action="/addDvd" method="get" class="add-button">
    <button type="submit">Ajouter un DVD</button>
</form>

</body>
</html>