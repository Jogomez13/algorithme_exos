<?php
final class exo5 {
    private static function palindrome($str)
    {
        $str = str_replace(array(" ", "!", ".", "?", "  "), "", $str);
        $str = strtolower($str);
        
        $strlen = strlen($str) -1;
        
        for ($i = 0; $i <= $strlen -$i; $i++)
            if ($str[$i] != $str[$strlen-$i]) return false;
        
        return true;
    }
    
    public static function main(){
        echo "Veuillez entrer une phrase : \n";
        $str = readline();
        
        echo "Choissez une action\n" .
             "\t1 : Vérification palindrome\n" .
             "\t2 : Comptage du nombre de caractères alphabet dans la chaine\n" .
             "\t3 : remplacement d’une valeur par une autre\n" .
             "\t4 : découpage des mots\n";
        $action = readline();
        
        switch ($action) {
            case 1 :
                echo self::palindrome($str) ? "Est un palindrome" :  "N'est pas un palindrome";
                echo "\n";
                break;
            case 2 :
                $str2 = preg_replace("/[^A-Za-z]/","",$str);
                echo "Le nombre de lettres pesentes dans \"" . $str . "\" est de " . strlen($str2) . "\n";
                break;
            case 3 :
                echo "Veuillez entrer la valeur à rechercher : ";
                $s = readline();
                echo "Veuillez entrer la valeur de remplacement : ";
                $r = readline();
                echo "Resultat : " . str_replace($s, $r, $str) . "\n";
                break;
            case 4 :
                echo "Veuillez entrer la taille de découpe ou le caractère au quel découper\n" .
                     "\t Exemple : Entrez 5 pour decouper la chaine en morceaux de 5 caractères\n" .
                     "\t           Entrez ',' pour decouper le mot à chaque virgule\n";
                $d = readline()[0];
                if (is_numeric($d)) {
                    print_r(str_split($str, $d));
                }
                else {
                    print_r(explode($d, $str));
                }
                break;
            default :
                echo "Aucune action choisie ou action invalide. Abandon\n";
        }
    }  
}
exo5::main();
