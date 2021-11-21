// Write a JavaScript function to  get the number of occurrences of each letter in specified string.

const countOccurrences = (str) => {
	let result = {};
	for (let i = 0; i < str.length; i++) {
		if (result[str[i]]) {
			result[str[i]]++;
		} else {
			result[str[i]] = 1;
		}
	}
	return result;
};
console.log(countOccurrences("abdddccccccccccc"));
