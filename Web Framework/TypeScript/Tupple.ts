function Test(names:(string | number)[]):void{
    for(var i=0;i<names.length;i++)
    {
        console.log(names[i]);
    }
   
}
var tuple1=[10, "Ravi", 20, "Naveen"];
Test(tuple1);
var names2=new Array("ele1","ele2");
Test(names2);