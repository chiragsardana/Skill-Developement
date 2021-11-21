//Write a JavaScript function to extract unique characters from a string.

const uniqueCharacters = (str) => {
	let unique = "";
	for (let i = 0; i < str.length; i++) {
		if (unique.indexOf(str[i]) === -1) {
			unique += str[i];
		}
	}
	return unique;
};
console.log(uniqueCharacters("abacddbec"));
