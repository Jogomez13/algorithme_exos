#On initialise le tableau et les autres variables
tableau = [3,20,15,28,6,52,9]
switch = ""
sorted = False
print("base : " + str(tableau))
while sorted == False :
	moved = False
	i = 0

	while i < len(tableau) -1:
#tant que l'index courant est inferieur a la longueur du tableau
# si la valeur suivant est plus grande, on switch
		if tableau[i+1] > tableau[i]:
			switch = tableau[i] 
			tableau[i] = tableau[i + 1] 
			tableau[i + 1] = switch
			moved = True
			print(tableau)
		i += 1
	print("boucle : " + str(tableau))
	if moved == False:
		sorted = True
print(tableau)
