<?php
//Ce code sert a repeter un mot ou une phrase que l'utilisateur a entrer.
//JesuScript
//beweb

$quitter = false;
$oui = "o"."\n";
$non = "n"."\n";
$reponse = "";
#ci dessus on declare nos variable
$flag = false;
#on cree un temoin

while ($quitter == false) {
  #tant que quitter est egal a faux
	echo("Bienvenue chez le perroquet du capitaine: "."\r"."\n");
	echo("Entrer une phrase ou un mot: "."\r"."\n");
	$reponse = fgets(STDOUT);
	echo "$reponse";
	$flag = true;

	while ($flag == true){
		echo("Voulez vous quitter o/n ? "."\r"."\n");
		$reponse = fgets(STDOUT);
		if ($reponse == $oui) {
      #tant que quitter = vrai
			$quitter = true;
			$flag = false;
		}elseif ($non == $reponse){
      #si la reponse est non
			$flag = false;
		}else{
      #si la reponse est autre chose
			echo("Je ne comprend pas ce que tu veux dire"."\r"."\n");
		}
	}
}
?>
