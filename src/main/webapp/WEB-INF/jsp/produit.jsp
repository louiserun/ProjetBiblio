<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
head>
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

<h2>Livres</h2>
<table border="1">
    <tr>
        <th>Titre</th>
        <th>ISBN</th>
        <th>Auteur</th>
        <th>Édition</th>
    </tr>
    <!-- Boucle sur la liste des livres pour les afficher -->
    <tbody>
        <th:block th:each="livre : ${livre}">
            <tr>
                <td>${livre.titre}</td>
                <td>${livre.isbn}</td>
                <td>${livre.auteur}</td>
                <td>${livre.edition}</td>
            </tr>
        </th:block>
    </tbody>
</table>

<form action="/ajouterLivre" method="post" class="add-button">
    <button type="submit">Ajouter un livre</button>
</form>

<h2>DVD</h2>
<table border="1">
    <tr>
        <th>Titre</th>
        <th>ISBN</th>
        <th>Réalisateur</th>
    </tr>
    <!-- Boucle sur la liste des DVD pour les afficher -->
    <tbody>
        <th:block th:each="dvd : ${dvd}">
            <tr>
                <td>${dvd.titre}</td>
                <td>${dvd.isbn}</td>
                <td>${dvd.realisateur}</td>
            </tr>
        </th:block>
    </tbody>
</table>

<form action="/ajouterDvd" method="post" class="add-button">
    <button type="submit">Ajouter un DVD</button>
</form>

</body>
</html>