<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    form {
        width: 300px;
        margin: 20px auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    label {
        font-weight: bold;
    }
    
    h2{
    	margin-top: 0;
    }

    input[type="text"] {
        width: 100%;
        padding: 8px;
        margin-top: 5px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 3px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        width: 100%;
        background-color: #007bff;
        color: #fff;
        padding: 10px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
	<form method="post" action="/addBiblio">
	    <h2>Saisie de bibliothèque</h2>
	    <label for="nom">Nom:</label><br>
	    <input type="text" id="nom" name="nom"><br>
	    
	    <label for="ville">Ville:</label><br>
	    <input type="text" id="ville" name="ville"><br><br>
	    
	   	<label for="adresse">Adresse:</label><br>
	    <input type="text" id="adresse" name="adresse"><br><br>
	    
	    <input type="submit" value="Envoyer">
	</form>
</body>
</html>