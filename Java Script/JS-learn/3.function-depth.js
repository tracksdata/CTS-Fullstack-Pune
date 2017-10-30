

/*

    how to create function-obj in.js-lang?

    2-ways

    way-1 : function declaration / Named function

    => func-obj will get created at context-creation phase.
    => always get hoisted with func-obj 

    way-2 : function expression / Anonymous function

    => func-obj will get created at context-execution phase
    => will not get hoisted with func-obj , we shud invoke after expression 
    => to create func-obj based on input params or conditions

*/

//-------------------------------------------------------

// way-1 : function declaration

// console.log(add(12,13));

// function add(n1, n2) {
//     return n1 + n2;
// }

// console.log(add(12,13));

//-------------------------------------------------------

// way - 2 : function expression

// console.log(add(12, 13));

// var add = function(n1, n2) {
//     return n1 + n2;
// }

// console.log(add(12, 13));


//-------------------------------------------------------

// 1. Functions as values

// function sayHello() {
//     console.log('Hello..');
// }

// sayHello();

// var sayHi = sayHello;
// sayHi();

//-------------------------------------------------------

// 2. Function as args

function greet(arg) {
    if (arg) {
        if (typeof arg === 'function') {
            arg();
            return;
        }
    }
    console.log('Hello...');
}

// greet();
// greet(function () { console.log('Ola....') });

// // e.g

// var arr = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10];
// // arr.sort();
// arr.sort(function (a, b) { return b - a; });
// console.log(arr);


//-------------------------------------------------------

// Function as a return

function teach() {
    console.log('teaching...');
    function learn() {
        console.log('learn...');
    }
    return learn;
}

// var learnFunc = teach();
// learnFunc();
// learnFunc();

//-------------------------------------------------------


function giveBack(a,b,c) {
    console.dir(arguments);
    return arguments[0];
}

// console.log(giveBack(12,13,14,15,16));

function sum() {
    var i = 0,
        len = arguments.length,
        result = 0;
    while (i < len) {
        result += arguments[i];
        i++;
    }
    return result;
}

//-------------------------------------------------------

function abc() {
    console.log('No args');
}
// var abc = new Function('...');

function abc(a) {
    console.log('One arg');
}
// var abc = new Function('...');

// abc();

//-------------------------------------------------------

// No block scope till ES-5

// function f() {
    
//     {
//         var i = 100;    
//     }

//     console.log(i);

// }

// f();


//-------------------------------------------------------


// function f() {
//     k = 100;
// }
// f();

// console.log(k);














