// Write a JavaScript function to compute the factors of a positive integer.

const factors = (num) => {
	let factors = [];
	for (let i = 1; i <= num; i++) {
		if (num % i === 0) {
			factors.push(i);
		}
	}
	return factors;
};
console.log(factors(12));
