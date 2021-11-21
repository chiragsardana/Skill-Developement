//. Write a JavaScript function that generates all combinations of a string.

let combinations = (str) => {
	let result = [];
	for (let i = 0; i < str.length; i++) {
		for (let j = i + 1; j < str.length + 1; j++) {
			result.push(str.slice(i, j));
		}
	}
	return result;
};
console.log(combinations("Dog"));
