<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page d'Acceuil</title>
<h1>Liste d'enchères</h1>
</head>
<h2>ENI-ENCHERES.FR</h2>

<div>
<a href="Connexion"> S'inscrire - Se connecter </a>
</div>

<div>
<body> 

${ encheres } 


</div>
<br>
<div>
	<label for="filtre">Filtre</label> <input type="Search"
		id="filtre" name="filtre" aria-label="RechercherNomAtricle" placeholder="Le nom de l'article contient" size = "30" >
		
		<br>
</div>
<br>
<div>
	<label for="categorie">Catégorie:</label>
</div>

<div>
	<select name="" id="objet-selection">
		<option value="">Toutes</option>
		<option value="informatique">Informatique</option>
		<option value="ammeublement">Ammeublement</option>
		<option value="vetements">Vêtements</option>
		<option value="SportLoisir">Sport et loisirs</option>
	</select>
</div>
<br>
<div>
<button>Rechercher</button>
</div>

</body>

</html>