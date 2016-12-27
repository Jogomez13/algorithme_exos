<?php
//cette algo compte le nombre de a
$word = "jonathan";
$carac = "a";
$resultat = 0;
//initialisation du nombre de "a" a zero
$i = 0;
//initialisation de l'index donc index 0

while($i < strlen($word)){
//tant que index inferieur a la longueur du mot cela exectute le code ci-dessous
	if($word[$i] == $carac){
//si a l'index ou je me trouve c'est bien un "a" j'incremente de 1
		$resultat++;
	}
$i++;
//et je passe a l'index suivant
}

echo "le nombre de caractereRecherche est : " .$resultat."\r"."\n";

// "\r" =retour chariot et "\n" = passage a la ligne il faut bien utiliser les doubles qotes
?>
