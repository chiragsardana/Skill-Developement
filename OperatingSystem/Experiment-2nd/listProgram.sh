!/bin/bash

echo "Menu:"
echo "1. List of files "
echo "2. Process Status "
echo "3. Date "
echo "4. users in program "
echo "5. Quit"

while :
do
echo "Enter your choice: "
read ch

case $ch in
	1) ls;;
	2) pgrep chrome;;
	3) date;;
	4) users;;
	5) exit;;
	*) echo "Invalid Choice"
esac
done
