//Define an interface to standardize and reuse your object
class Product {
    pid: number;
    name: string;
    price: number;
    description: string;
    constructor(pid:number,name: string, price:number ,description: string) {  
       this.pid=pid;
        this.name=name;
        this.price=price;
        this.description=description;  
} 


}
//creating object 
let pen1 = new Product(1000,"Pen1",1.43,"Userful for writing") ;  
let pen = new Product(1001,"Pen",2.43,"Userful for writing") ;  
let pencil: Product = {
    pid:1002,
    name: "Pencil",
    price: 1.43,
    description: "to draw"
  }
  let erasor: Product = {
    pid:1003,
    name: "erasor",
    price: 5.43,
    description: "to erase"
  }

  //cretaing array of object
let products: Product[] = [];
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
const index = products.indexOf(pencil, 0);
if (index > -1) {
    products.splice(index, 1);
}
console.log(products);