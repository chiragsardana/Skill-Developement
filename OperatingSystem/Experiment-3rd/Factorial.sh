!/bin/sh

echo "Enter a number"

read num

fact=1

while [ $num -gt 1 ] #gt stands for greator than
do
  fact=$((fact * num))  #fact = fact * num
  num=$((num - 1))      #num = num - 1
done

echo "The Factorial of a number $num: $fact 
"
