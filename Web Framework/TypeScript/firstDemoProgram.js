var a = "Chirag Sardana";
var b = 100;
console.log(b);
var arr = ["Chirag", "Sardana"];
console.log(arr[0] + " " + arr[1]);
var num = [0, 7, 1];
console.log(num[0] + " " + num[1] + " " + num[2]);
var studentId = 71;
var studentName = "Chirag Sardana";
// Tuple type variable 
var details = [71, "Chirag Sardana"];
console.log(details[0] + " and " + details[1]);
var Color;
(function (Color) {
    Color[Color["red"] = 0] = "red";
    Color[Color["green"] = 1] = "green";
    Color[Color["blue"] = 2] = "blue";
})(Color || (Color = {}));
;
var c;
c = Color.green;
console.log(c);
function fun(var1) {
    console.log(var1);
}
fun(6);
