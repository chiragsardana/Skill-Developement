//Write a JavaScript function that checks whether a passed string is palindrome or not?
const palindrome = (str) => {
	let reversed = str.split("").reverse().join("");
	return reversed === str;
};
console.log(palindrome("madam"));
