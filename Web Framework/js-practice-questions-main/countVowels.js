//Write a JavaScript function that accepts a string as a parameter and counts the number of vowels within the string.


const countVowels = (str) => {
	let count = 0;
	for (let i = 0; i < str.length; i++) {
		if (
			str[i] === "a" ||
			str[i] === "e" ||
			str[i] === "i" ||
			str[i] === "o" ||
			str[i] === "u"
		) {
			count++;
		}
	}
	return count;
};
console.log(countVowels("The quick brown fox"));   