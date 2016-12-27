//Ceci importe la class Scanner du package java.util nous n'avons pas juger utile d'importer toutes la bibliotheque java
import java.util.Scanner;

public class exo6{
//appel du fichier compile
	public static void main(String[] args){
		boolean flag = false;
		while(flag == false){
		Scanner sc = new Scanner(System.in);
//on creer un nouvel objet de type Scanner
		System.out.println("Veuillez saisir un mot :");
//Sortie standard qui permet d'afficher la phrase ci-dessus
		String str = sc.nextLine();
//la méthode nextLine() récupère le contenu de toute la ligne saisie et replace la « tête de lecture » au début d'une autre ligne
		System.out.println("Vous avez saisi : " + str);

//Sortie standard qui permet d'afficher la phrase ci-dessus
			Scanner clavier = new Scanner(System.in);
			System.out.print("\n Voulez vous quittez (o ou n)? ");
            		char reponse = clavier.next().charAt(0);
            		if (reponse == 'o' || reponse == 'O') {
                		System.exit(0);
				}
		
		}
		
	}
}

