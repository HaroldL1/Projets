<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
</head>
<body>
	<h1>ENI-Enchères</h1>



	<form action ="Connexion"style="width: 400px;" method="POST">

		<div>
            <label for="identifiant">Identifiant</label> 	
			<input type="text" id="identifiant" name="identifiant"
				placeholder="Pseudo" value=""> 
			<br>	
			<label for="mdp">Mot de passe</label> 	
			<input type="password"
				id="mdp" name="mdp" placeholder="Mot de passe"
				value="">

		</div>

		<div>

			<label for="rememberme">Se souvenir de moi</label> 
			<input type="checkbox" id="rememberme" name="rememberme" value="1">
		</div>
		
		<div>
			<a href = "mdpOublie"> Mot de passe oublié </a>
		</div>


		<div>
			<button type="submit" id="submited" name="submited">Connecter</button>
		</div>
		
	</form>


        <form action ="Connexion"style="width: 400px;" method="POST">
		<div>
			<button type="submit" id="submited" name="submited">Créer un compte</button>
		</div>
		</form>





	
</html>



