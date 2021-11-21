//Write a JavaScript function that accepts a string as a parameter and converts the first letter of each word of the string in upper case.


const firstLetterUppercase = (str) => {
	let arr = str.split(" ");
	let result = "";
	for (let i = 0; i < arr.length; i++) {
		result += arr[i].charAt(0).toUpperCase() + arr[i].slice(1) + " ";
	}
	return result;
};
console.log(firstLetterUppercase("the quick brown fox"));
