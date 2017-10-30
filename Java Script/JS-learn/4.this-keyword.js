

/*

 this ==> owner of current execution-context

*/

/*

 to object's property in functions we need reference ( better use reference thru 'this')
 

*/

// whey we need 'this' keyword?

// var person = {
//     pName: 'Nag',
//     sayName: function () {
//         //console.log('im ' + pName)
//         //console.log('im ' + person.pName);
//         console.log('im ' + this.pName);
//     }
// };

// // person.sayName();

// var p = person;
// person = { pName: 'Ria' };
// p.sayName();

//-------------------------------------------------------------

// var p1 = { name: 'Nag', sayName: function () { console.log('im ' + this.name) } };
// var p2 = { name: 'Ria', sayName: function () { console.log('im ' + this.name) } };

function sayNameForAll() {
    console.log(this);
    console.log('im ' + this.name);
}

var p1 = { name: 'Nag', sayName: sayNameForAll };
var p2 = { name: 'Ria', sayName: sayNameForAll };

// sayNameForAll(); // im "" // function-invocation ( context owned by global-obj )
// p1.sayName(); // im Nag   // method-invocation   ( context owned by invoker-obj)
// p2.sayName(); // im Ria

//-------------------------------------------------------------

// 1000+ person objects

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
var p2 = new Person('Ria', 2);
//...

// imp-note : always constructors return 'this'

//-----------------------------------------------------------------


// third-party
var greetLib = {
    sayName: function (message,from) {
        console.log(message+' im '+this.name+ ":"+from);
    }
};

// our-code
var p1 = { name: 'Nag' };
var e1 = { name: 'Emp1' };

// greetLib.sayName();

// dyanamic func binding

// way-1
// greetLib.sayName.call(p1,"Hello","BLR")
// greetLib.sayName.call(e1, "Dude", "CHN")

// way-2
// greetLib.sayName.apply(p1,["Hello","BLR"])
// greetLib.sayName.apply(e1,["Dude","CHN"])

//way-3
// var newF = greetLib.sayName.bind(p1);
// // click-event
// newF("Hi", "universe");

// var newF2 = greetLib.sayName.bind(e1, "Dude", "CHN");
// newF2();

//----------------------------------------------------------------------------


/*

    in .js , we can invoke func in 4 ways

    1. function invocation  ( this ==> global-obj)
    2. method-invocation    ( this ==> invoker-obj)
    3. constructor-invocation ( this ==> new-obj)
    4. call/apply/bind invication ( this ==> arg-obj)


*/






