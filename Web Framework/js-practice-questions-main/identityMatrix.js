//Write a JavaScript function which returns the n rows by n columns identity matrix.
//The input comes as array of one string element, holding the number n.


const identityMatrix = (n) => {
	let matrix = [];
	for (let i = 0; i < n; i++) {
		matrix.push([]);
		for (let j = 0; j < n; j++) {
			if (i === j) {
				matrix[i].push(1);
			} else {
				matrix[i].push(0);
			}
		}
	}
	return matrix;
};
console.log(identityMatrix(2));
