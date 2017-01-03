quitter = False
oui = "o"
non = "n"
reponse = ""
#ci dessus on declare nos variable
flag = False
#on cree un temoin

while quitter == False:
	#tant que quitter est egal a faux
	print("Bienvenue chez le perroquet du capitaine")
	perroquet = raw_input("entrez une phrase ou un mot: ")
	print(str(perroquet))
	flag = True

	while flag == True:
		#tant que quitter = vrai
		reponse = raw_input("Voulez vous quitter o/n ?")

		if oui == reponse.lower():
			#si la reponse est oui
			quitter = True
			flag = False
		elif non == reponse.lower():
			#si la reponse est non
			print("non")
			flag = False
		else:
			#si la reponse est autre chose
			print("Hicham n'a pas compris ce que toi vouloir me dire")
