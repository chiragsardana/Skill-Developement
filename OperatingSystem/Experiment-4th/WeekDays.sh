#!/bin/bash

echo "Select a week day (1-7): "
read i

case $i in
     1) echo "Monday";;
     2) echo "Tuesday";;
     3) echo "Wednesday";;
     4) echo "Thursday";;
     5) echo "Friday";;
     6) echo "Saturday";;
     7) echo "Sunday";;
     exit) exit;;
esac
