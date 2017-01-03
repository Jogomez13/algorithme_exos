import java.util.*;
class exo4 {
  public static void pascal(int hauteur, int max){
//On déclare une fonction pascal
    if (hauteur > 20) hauteur = 20;
// on limite la hauteur à 20
    int [][] pascal = new int[hauteur+1][hauteur+1];
    //on créer deux tableaux pascal


    for (int i = 1; i <= hauteur; i++) {
//En partant de l'index 1 et tant qu'on a pas atteint le nb de lignes max on incrémente
      pascal[i][0]= 1;
//On prend l'index 0 du sous tableau et on y donne la valeur 1
      System.out.print("1 ");
//on met des espaces après chaque chiffre
      boolean isMax = false;
// c'est notre témoin pour savoir quand on atteint la valeur max

      for (int j=1; j<i; j++) {
  // j = la quantité de nombre et tant que j n'est pas égale au nombre de lignes on incrémente
        pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
// on remonte d'une ligne et on recule d'une colone

        System.out.print(pascal[i][j] + " ");

        if (pascal[i][j] >= max && max > 0)
          isMax = true;
//si le nombre actuel est supérieur ou égale à notre max on passe notre à vrai
      }

      System.out.print("\n");
      if (isMax)
          break;
    }
  }

  public static void main(String[] args){
    Scanner saisi = new Scanner(System.in);
    System.out.println("Nombre de lignes max : ");
    int l = saisi.nextInt();
// l = le nombre de ligne
    System.out.println("Valeur max : ");
      int v = saisi.nextInt();
// v = la valeur max
      pascal(l,v);
    }

}
