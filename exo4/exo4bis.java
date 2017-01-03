<?php
// Même principe que l'exo4 mais sans utiliser de tableaux
final class exo4bis {
    private static function pascal($hauteur = 5, $max = 0) {
        // On limite la hauteur à 20 lignes
        if ($hauteur > 20) $hauteur = 20;
        
        $isMax = false; // Témoin valeur max
        
        // Boucle pour chaque ligne
        for ($i = 0; $i < $hauteur; $i++) {
            // Boucle pour generer les espaces afin de centrer le triangle
            // un peu merdique dans le terminal, je l'avoue =D
            for ($s = 0; $s < $hauteur-$i; $s++) echo " ";
            
            // Boucle pour chaque nombre de la ligne
            $n = 1; // Le nombre en debut de ligne est 1
            for ($j = 0; $j <= $i; $j++)
            {
                echo $n . " "; // on affiche le nombre suivit d'un espace
                
                // On calcule le nombre suivant
                $n *= ($i -$j) / ($j + 1);
                
                // Si on atteint la valeur max, on passe notre témoin à true
                if ($n >= $max and $max > 0) $isMax = true;
            }
            
            // Saut de ligne une fois qu'on a écrit tous les nombres pour la ligne courante
            echo "\n"; 
            
            // Si le témoin est vrai, on arrete
            if ($isMax) break;
		}
    }
    
    public static function main(){
		echo "Nombre de lignes max : ";
		$l = readline();
        // Tant que la valeur n'est pas numérique, on repose la question
		while (!is_numeric($l)) {
			echo "Veuillez entrer une valeur numérique\n";
			echo "Nombre de lignes max : ";
			$l = readline();
		}
		
		echo "Valeur max : ";
		$n = readline();
		while (!is_numeric($n)) {
			echo "Veuillez entrer une valeur numérique\n";
			echo "Valeur max : ";
			$n = readline();
		}
		
        /* On appelle notre fonction pascal avec les variables utilisateur
         * en prenant soin de forcer une valeur de type entier */ 
		self::pascal(intval($l), intval($n));
	}
}
exo4bis::main();
