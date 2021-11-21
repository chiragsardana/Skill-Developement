function Test(...names:string[]):void{
    for(var i=0;i<names.length;i++)
    {
      console.log(names[i]);
    }
   
}
Test("X");
Test("Y","Z");