function Test(names:string[]):void{
    for(var i=0;i<names.length;i++)
    {
        console.log(names[i]);
    }
   
}
var names1:string[]=["Ram", "Ravi", "Ishaan"];
Test(names1);
var names2=new Array("ele1","ele2");
Test(names2);