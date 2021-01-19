<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page d'Acceuil</title>
</head>
<body>
<h1>Liste d'enchères</h1>
<form action="enchereENI" method="POST"></form>


<label for="site-search">Rechercher:</label>

<input type="recherche" id="site-search" name="q"

aria-label="Search through site content">



<button>Rechercher</button>

<!-- il nous fait ici :  -->
<!-- - un lien vers le login -->
<!-- - une fonction de recherche d'articles -->
<!-- - une barre de catégories -->
<!-- - une fonction de recherche : bouton de type submit  -->
<!-- - un affichage des enchères en cours par la jstl et les expression langage CAD : enchere affichage par numero util, numero produit, date enchère, montant enchère -->

</body>
</html>