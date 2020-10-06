<?php
####################### example for FOR loop ################

$n = 6;
$factorial = 1;

for ($i = $n; $i > 1; $i--) {
  $factorial = $factorial * $i;
}
echo "The factorial of $n is: $factorial \n";

####################### example for WHILE loop ################


$x = $n;
$factorial = 1;

while ($n > 1) {
  $factorial = $factorial * $n;
  $n--;
}
echo "The factorial of $x is: $factorial \n";

?>
