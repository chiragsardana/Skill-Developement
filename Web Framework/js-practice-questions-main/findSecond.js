// . Write a JavaScript function which will take an array of numbers stored and find the second lowest and second greatest numbers, respectively.


const findSecond = (arr) => {
	let sortedArr = arr.sort((a, b) => a - b);
	let secondLowest = sortedArr[1];
	let secondGreatest = sortedArr[sortedArr.length - 2];
	return `Second lowest: ${secondLowest}, Second greatest: ${secondGreatest}`;
};
console.log(findSecond([1, 2, 3, 4, 5]));
