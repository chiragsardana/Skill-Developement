//Define an interface to standardize and reuse your object
var Product = /** @class */ (function () {
    function Product(pid, name, price, description) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    return Product;
}());
//creating object 
var pen1 = new Product(1000, "Pen1", 1.43, "Userful for writing");
var pen = new Product(1001, "Pen", 2.43, "Userful for writing");
var pencil = {
    pid: 1002,
    name: "Pencil",
    price: 1.43,
    description: "to draw"
};
var erasor = {
    pid: 1003,
    name: "erasor",
    price: 5.43,
    description: "to erase"
};
//cretaing array of object
var products = [];
//adding element to obj
products.push(pen1);
products.push(pen);
products.push(pencil);
products.push(erasor);
console.log(products);
//only remove last item from the arry of obj
// products.pop();
// console.log(products);
console.log("products list after remove function");
//removing speicfic object from array of obj
var index = products.indexOf(pencil, 0);
if (index > -1) {
    products.splice(index, 1);
}
console.log(products);
//aastha-19csu003
