//Write a JavaScript function that reverse a number.


const reverseNumber = (number) => {
	let result = 0;
	while (number > 0) {
		result = result * 10 + (number % 10);
		number = Math.floor(number / 10);
	}
	return result;
};

console.log(reverseNumber(12345));
