//Write a JavaScript function to compute the value of bn where n is the exponent and b is the bases. Accept b and n from the user and display the result.

const calculateExponential = (b, n) => {
	return Math.pow(b, n);
};
console.log(calculateExponential(2, 4));
