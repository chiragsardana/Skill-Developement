//Write a JavaScript function that returns a passed string with letters in alphabetical order.
//Note: Assume punctuation, numbers and symbols are not included in the passed string.

const sortAlphabetically = (str) => {
	return str.split("").sort().join("");
};
console.log(sortAlphabetically("webmaster"));
