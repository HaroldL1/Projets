<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
<h1>ENI-Enchères</h1>
</head>
<body>

<h2> Mon profil </h2>
	<div>
            <label for="identifiant">Pseudo</label> 	
			<input type="text" id="identifiant" name="Pseudo"
				placeholder="Pseudo" value=""> 
		    <br>	
			<label for="nom">Nom </label> 	
			<input type="text" id="nom" name="nom"
				placeholder="Nom" value="">
			<br>	
			<label for="prenom">Prénom </label> 	
			<input type="text" id="prenom" name="prenom"
				placeholder="Prénom" value=""> 	
			<br>	
			<label for="identifiant">E-mail</label> 	
			<input type="email" id="email" name="email"
				placeholder="exemple@domaine.com" value="" size="30"> 	 	
			<br>	
			<label for="telephone">Téléphone </label> 	
			<input type="tel" id="telephone" name="telephone"
				placeholder="Téléphone" value=""> 	
			<br>	
			<label for="rue">Rue</label> 	
			<input type="text" id="rue" name="rue"
				placeholder="Rue" value=""> 	
			<br>	
			<label for="cp">Code Postal</label> 	
			<input type="text" id="cp" name="cp"
				placeholder="Code postal" value=""> 	
			<br>	
			<label for="identifiant">Ville </label> 	
			<input type="text" id="identifiant" name="prénom"
				placeholder="Ville" value=""> 	
			
			<label for="mdp">Mot de passe </label> 	
			<input type="password"
				id="mdp" name="mdp" placeholder="Mot de passe">
		
		</div>

         <div>
			<button type="submit" id="Creer" name="Creer">Créer un compte</button>
		</div>

        <div>
			<button type="submit" id="Annuler" name="Annuler">Annuler</button>
		</div>

</body>
</html>