//Write a JavaScript function that accepts a number as a parameter and check the number is prime or not.

const checkPrime = (num) => {
	if (num < 2) {
		return false;
	}
	for (let i = 2; i < num; i++) {
		if (num % i === 0) {
			return false;
		}
	}
	return true;
};
console.log(checkPrime(5));
