#cette algo compte le nombre de t
$word = "incontestablement"
$carac = "t"
$resultat = 0
#initialisation du nombre de "t" a zero
$i = 0
#initialisation de l'index donc index 0

while $i < $word.length
#tant que index inferieur a la longueur du mot cela exectute le code ci-dessous
	if $word[$i] == $carac
#si a l'index ou je me trouve c'est bien un "t" j'incremente de 1
		$resultat += 1
	end
#fin de ma condition
$i += 1
#et je passe a l'index suivant
end
#fin de ma condition

print ("le nombre de caractereRecherche est : #{$resultat}\r\n")

# \r =retour chariot et \n = passage a la ligne


