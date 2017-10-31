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






/*

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

/*
 function sayHello() {
     console.log('Hello..');
 }

 //sayHello();
var sayHi = sayHello;*/
/*
var arr = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10];
//arr.sort();
arr.sort(function (a, b) { return a - b; });
console.log(arr);*/

/*function teach() {
    console.log('teaching...');
  
    function learn() {
        console.log('learn...');
    }

    function task(){
         console.log('do task...');
    }

    return learn;
}
 var learnFunc = teach();
 learnFunc();
 learnFunc();
 learnFunc();*/

/*
function giveBack(a,b,c) {
  //  console.dir(arguments);
    return arguments[0];
}

//console.log(giveBack(100,200,300));

var res=sum(10,20,30,40);
console.log("Sum is "+res);

function sum() {
    var i = 0,
        len = arguments.length,
        result = 0;
    while (i < len) {
        result += arguments[i];
        i++;
    }
    return result;
}*/


/*var b=100;
function test(a){
    console.log('-- test '+a+" and "+b);
}
test(10);*/

// No block scope till ES-5
/*
 function f() {
    
     {
         var i = 100;    
     }

     console.log(" I value is "+i);

 }

f();
*/
//var name="Richards"; // global 
/*function f1(x){ // f1 also global, x is local to f1
  
        var name='Praveen';

     function f2(){
         var name='James';
         console.log("Name is "+this.name);
     }
     return f2;
}

var funF2=f1();
funF2();*/


// whey we need 'this' keyword?
/*
 var emp={
     ename:'Praveen',
     age:29,
     sayName:function(){
         console.log('-- name '+emp.ename);
         console.log('-- name--> this '+this.ename);
         //console.log('-- ename: '+name);
         return "I am Great"
    }
     
 }

var p1=emp;
//p1={ename='James'}
emp.ename="James"; 
p1.sayName();
emp.sayName();*/


//var pName='James';
 /*name='Bucky Wall';
var person={
pName:'Praveen',
age:76,
sayName:function(){
    //var pName='Ram';
  //var name='James';
  console.log('Name: '+name);  
}
};

*/

// var p1 = { name: 'Nag', sayName: function () { console.log('im ' + this.name) } };
// var p2 = { name: 'Ria', sayName: function () { console.log('im ' + this.name) } };
/*
function sayNameForAll() {
    console.log(this);
    console.log('im ' + this.name);
}
var p1 = { name: 'Nag', sayName: sayNameForAll };
var p2 = { name: 'Ria', sayName: sayNameForAll };
*/
// 1000+ person objects

/*
function Person(name, age) {
    this.name = name;
    this.age = age;

    this.sayName = function () {
        console.log('im ' + this.name);
    }
    this.sayAge = function () {
        console.log('im ' + this.age + " old");
    }  
    
}

var p1 = new Person('Nag', 32); // constructor-invoccation  ( context owned by new-obj)
var p2 = new Person('Ria', 2);*/




// third-party
var greetLib = {
    sayName: function (message,from,age) {
        console.log(message+' im '+this.name+ ": I am from "+from);
    }
};

// our-code
var p1 = { name: 'Nag' };
var e1 = { name: 'Emp1' };

//greetLib.sayName();    
var arr=new Array("Good Morning!","Bangalore");
// way-1
 //greetLib.sayName.call(p1,"Hello","BLR")
 //greetLib.sayName.call(e1, "Dude", "CHN")

// way-2
 //greetLib.sayName.apply(p1,arr);
 //greetLib.sayName.apply(e1,["Dude","CHN"])


//way-3
/*var newF = greetLib.sayName.bind(p1);
// click-event
newF("Hi", "universe");

 var newF2 = greetLib.sayName.bind(e1, "Dude", "CHN");
 newF2();*/

/*function f() {
     return this;
}

var v = f();
*/

/* var v = 100;
 function f() {
     console.log(v);  // read context's data
     console.log(this.v); // read context's owner data
 }
 f();
*/
/*
var ename='James';
var emp = {
    work: function () {
        console.log(ename) // read context's data
        console.log('HEH: '+emp) // read context's owner data
    }
   
};

emp.work();*/



emps=[
{"id":1,"first_name":"Shurwood","email":"sfoulcher0@shop-pro.jp","gender":"Male"},
{"id":2,"first_name":"Gauthier","email":"gsetterington1@123-reg.co.uk","gender":"Male"},
{"id":3,"first_name":"Georgeanna","email":"gballingal2@macromedia.com","gender":"Female"},
{"id":4,"first_name":"Murray","email":"mwassung3@vimeo.com","gender":"Male"},
{"id":5,"first_name":"Daisey","email":"dodriscole4@sbwire.com","gender":"Female"},
{"id":6,"first_name":"Celia","email":"ckinnach5@blogtalkradio.com","gender":"Female"},
{"id":7,"first_name":"Sharyl","email":"strott6@economist.com","gender":"Female"},
{"id":8,"first_name":"Dylan","email":"dobradden7@xing.com","gender":"Male"},
{"id":9,"first_name":"Marigold","email":"mgreenland8@unc.edu","gender":"Female"},
{"id":10,"first_name":"Bearnard","email":"bsowley9@scientificamerican.com","gender":"Male"},
{"id":11,"first_name":"Kasey","email":"kshatliffa@cnbc.com","gender":"Female"},
{"id":12,"first_name":"Gibby","email":"gmattussevichb@ovh.net","gender":"Male"},
{"id":13,"first_name":"Merla","email":"malexandrescuc@bloomberg.com","gender":"Female"},
{"id":14,"first_name":"Shannah","email":"sferrard@nyu.edu","gender":"Female"},
{"id":15,"first_name":"Stavros","email":"sattrile@163.com","gender":"Male"},
{"id":16,"first_name":"Crista","email":"cpeplawf@xrea.com","gender":"Female"},
{"id":17,"first_name":"Karissa","email":"kraspg@umich.edu","gender":"Female"},
{"id":18,"first_name":"Kristi","email":"kmacailineh@rambler.ru","gender":"Female"},
{"id":19,"first_name":"Melodee","email":"mannwyli@google.it","gender":"Female"},
{"id":20,"first_name":"Hayley","email":"hvasechkinj@youtube.com","gender":"Female"},
{"id":21,"first_name":"Anders","email":"ahalfordk@hexun.com","gender":"Male"},
{"id":22,"first_name":"Krishnah","email":"kaldrickl@addthis.com","gender":"Male"},
{"id":23,"first_name":"Merola","email":"membertonm@ft.com","gender":"Female"},
{"id":24,"first_name":"Phillida","email":"pmattonn@ebay.com","gender":"Female"},
{"id":25,"first_name":"Tara","email":"tparrisso@pagesperso-orange.fr","gender":"Female"},
{"id":26,"first_name":"Say","email":"smusicop@usatoday.com","gender":"Male"},
{"id":27,"first_name":"Saraann","email":"sdaltreyq@acquirethisname.com","gender":"Female"},
{"id":28,"first_name":"Dorian","email":"dprayr@earthlink.net","gender":"Male"},
{"id":29,"first_name":"Austin","email":"ahanselmanns@dell.com","gender":"Female"},
{"id":30,"first_name":"Lauritz","email":"lspaingowert@github.com","gender":"Male"}
]

//var emp=new Array();

/*for(var i in emps){

    console.log(emps[i].id);
     console.log(emps[i].first_name);

}
*/
/*var obj=JSON.stringify(emps);
console.log(obj);*/







 


























