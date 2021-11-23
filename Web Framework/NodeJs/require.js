const fs = require("fs");
const filePath = "/Users/chiragsardana/Desktop/5th Sem/Web Framework/Lab/NodeJs/Basics/basic1.js";
console.log("i m here before read file call");
function done(err, buffer){
    if(err){
        console.log("Error during Read", err);
    }else{
        console.log(buffer.toString());
    }
}
fs.readFile(filePath, done);
console.log("i m here after read file call");