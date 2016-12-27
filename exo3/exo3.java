//cette algo compte le nombre de e
import java.util.*;
//importation de la bibliotheque java

public class exo3{
//appel du fichier compile
	public static void main(String[] args){

String word = "relativite";
char caractere = 'e';
int resultat = 0;
//initialisation du nombre de "e" a zero
int i = 0;
//initialisation de l'index donc index 0

while(i<word.length()){
//tant que index inferieur a la longueur du mot cela exectute le code ci-dessous
	if (word.charAt(i) == caractere){
//si a l'index ou je me trouve c'est bien un "e" j'incremente de 1
	 	resultat += 1;
	}
	i += 1;
//et je passe a l'index suivant

}
System.out.println("le nombre de caractereRecherche est : " + resultat);
}}
