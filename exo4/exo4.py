def pascal(hauteur = 5, max = 0):
#On declare une fonction pascal et on lui affecte une hauteur de 5 et une valeur de 0 par defaut
    if (hauteur > 20) : hauteur = 20
    pascal= [[0 for i in range(hauteur)] for j in range(hauteur)]

    for i in range(1,hauteur):
        pascal[i][0] = 1
        print 1,
        isMax = False


        for j in range (1,hauteur):
            pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]
            if pascal[i][j] > 0 :
                print pascal[i][j],
            if pascal[i][j] >= max and max > 0 :
                isMax = True

        print
        if isMax:
            break

l = raw_input("Nombre de lignes max : ")

v = raw_input("Valeur max : ")

pascal(l,v)
