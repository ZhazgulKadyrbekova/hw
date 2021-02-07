<?php

$weekdays = array("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
array_push($weekdays, "Saturday", "Sunday");

$n = rand(1, sizeof($weekdays));

switch ($n) {
    case 1: echo "Monday"; break;
    case 2: echo "Tuesday"; break;
    case 3: echo "Wednesday"; break;
    case 4: echo "Thursday"; break;
    case 5: echo "Friday"; break;
    case 6: echo "Saturday"; break;
    case 7: echo "Sunday"; break;
}

if ($n >=1 && $n <= 5) {
    echo "\n Weekday";
} else {
    echo "\n Weekend";
}


?>


