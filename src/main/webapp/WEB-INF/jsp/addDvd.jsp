<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Ajouter un DVD</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }
        h2 {
            margin-bottom: 20px;
            font-size: 24px;
            color: #333333;
            text-align: center;
        }
        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
            color: #555555;
        }
        input[type="text"] {
            width: 100%;
            padding: 12px;
            margin-bottom: 20px;
            border: 1px solid #dddddd;
            border-radius: 5px;
            box-sizing: border-box;
            font-size: 14px;
            color: #333333;
        }
        button {
            width: 100%;
            padding: 12px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Ajouter un DVD</h2>
        <form action="/addDvd" method="post">
            <label for="titre">Titre:</label>
            <input type="text" id="titre" name="titre" required>
            <br>
            <label for="isbn">ISBN:</label>
            <input type="text" id="isbn" name="isbn" required>
            <br>
            <label for="realisateur">Réalisateur:</label>
            <input type="text" id="realisateur" name="realisateur">
            <br>
            <button type="submit" action="/produit" method="get">Ajouter</button>
        </form>
    </div>
</body>
</html>