#On initialise le tableau et les autres variables
tableau = [1,25,66,41,58,95,2,4]
echange = 0;
trie = false;

while trie == false

  i =0;
  trie = true;

    while i < tableau.length-1
#tant que l'index courant est inferieur a la longueur du tableau
# si la valeur suivant est plus grande, on switch
      if tableau[i] < tableau[i+1]
        echange = tableau[i];
        tableau[i] = tableau[i+1];
        tableau[i+1] = echange;
        trie = false;
 	print ("#{tableau} \n");
      end
      i = i+1;

    end
  end
  print (tableau);
