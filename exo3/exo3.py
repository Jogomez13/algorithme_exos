#cette algo compte le nombre de n

word = "anticonstitutionnement"
char = "n"
result = 0
#initialisation du nombre de "n" a zero
i = 0
#initialisation de l'index donc index 0

while i < len(word):
#tant que index inferieur a la longueur du mot cela exectute le code ci-dessous
	if word[i] == char:
#si a l'index ou je me trouve c'est bien un "n" j'incremente de 1
		result +=1
	i +=1
#et je passe a l'index suivant


print ("le nombre de caractereRecherche est : " + str(result))
