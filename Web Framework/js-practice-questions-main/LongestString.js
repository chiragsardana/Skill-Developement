//Write a JavaScript function that accepts a string as a parameter and find the longest word within the string.

const longestString = (str) => {
	let arr = str.split(" ");
	let longest = "";
	for (let i = 0; i < arr.length; i++) {
		if (longest.length < arr[i].length) {
			longest = arr[i];
		}
	}
	return longest;
};
console.log(longestString("Web Development Tutorial"));
