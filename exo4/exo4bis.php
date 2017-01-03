<?php

echo "choisir le nombre de ligne";
$n=readline();
while (!is_numeric($n)){
  echo "choisir le nombre de ligne";
  $n=readline();
}
$n = intval($n);

echo "choisir le caractere ";
$x=readline()[0];

for ($i=0; $i<$n ; $i++) {
  for ($s=0; $s<$n-$i;$s++) echo " ";

  echo $x . " ";
  for ($j=1; $j<=$i ; $j++) {
  //  $x*=($i-$j+1)/$j
    echo $x." ";
  }

  echo "\n";
}
