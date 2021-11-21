var a: String = "Chirag Sardana";
var b:number = 100;
console.log(b);


var arr:string[] = ["Chirag", "Sardana"]

console.log(arr[0]+" "+arr[1]);

var num:number[] = [0,7,1];
console.log(num[0]+" "+num[1]+" "+num[2]);

var studentId: number = 71;
var studentName: string = "Chirag Sardana"; 

// Tuple type variable 
var details: [number, string] = [71, "Chirag Sardana"];

console.log(details[0]+" and "+details[1]);

enum Color{
    red, green,blue
};
let c:Color;
c = Color.green;
console.log(c);



function fun(var1: number){
    console.log(var1);
}
fun(6);