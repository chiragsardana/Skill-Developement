// Write a JavaScript function which says whether a number is perfect.

const perfectNumber = (num) => {
	let sum = 0;
	for (let i = 1; i < num; i++) {
		if (num % i === 0) {
			sum += i;
		}
	}
	return sum === num;
};
console.log(perfectNumber(6));
