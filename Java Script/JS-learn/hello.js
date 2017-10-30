/*var v=100;
function f1(){
    console.log("V: "+v);
    v=13;
}*/

/*
var v = 1;
function f1() {
    function f2() {
        console.log("F2: "+v); // - 1
    }

    f2(); // f2-context ==> f1-context

 //f2(); // f2-context ==> f1-context
    var v = 2;
    return f2;
}

var f2=f1();*/








 function add(n1, n2, n3) {
    return n1 + n2;
 }



var x=function(){
    return add(1000,2000);
}

console.log(x());


/* var add = function(n1, n2) {
     
     return n1 + n2;
}

console.log(add(20, 20));
*/












