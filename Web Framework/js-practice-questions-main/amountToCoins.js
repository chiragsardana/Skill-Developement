// Write a JavaScript function to convert an amount to coins.

const amountTocoins = (amount, coins) => {
	let result = [];
	let coin = 0;
	let count = 0;
	let sum = 0;
	for (let i = 0; i < coins.length; i++) {
		coin = coins[i];
		count = Math.floor(amount / coin);
		sum += count * coin;
		result.push(count);
		amount = amount - count * coin;
	}
	if (sum < amount) {
		result.push(1);
	}
	return result;
};
console.log(amountTocoins(46, [10, 5, 2, 1]));
