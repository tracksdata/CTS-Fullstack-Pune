
/*

    data-types

    1. simple-types / primitives  ==> values

        a. string
        b. number
        c. boolean
        d. udefined
        e. null
        

    2. complex-types / references ==> objects
    


*/

//========================================================

// 1. simple types

//=========================================================

// a.string

var name = "Nag";
var selection = 'a';

//---------------------------------------------------------

// b. number

var count = 12;
var cost = 12.12;

//---------------------------------------------------------

// c. boolean

var found = true;

/*
 
 falsy values in .js-lang

 ==> false,0,"",undefined,null,NaN

 ref : https://dorey.github.io/JavaScript-Equality-Table/

*/

//---------------------------------------------------------


// d. udefined  ==> default value by runtime

var v;

//---------------------------------------------------------

// e. null

var person = null;

//---------------------------------------------------------



//========================================================

// 2. Reference Types  ==> objects ( collection of key:value pair of any entity)

//=========================================================

/*
 
  how to create object in .js-lang?

  syntax

    ==> var ref=new ConstructorFunction();

*/

// var person = new Object(); // create obj-wrapper
// person.name = "Nag";
// person.age = 32;
// person.doWork = function () { 
//     console.log('working...');
// };

// var arr = new Array();
// arr.push('item-1');
// arr.push('item-2');

//---------------------------------------------------------
// literal-style objects
//---------------------------------------------------------

// a.Object

var config = new Object();
config.url = "http://";
config.method = "GET";
config.type = "JSON";

// or  ( literal-style )

var config = {
    url: 'http://',
    method: 'GET',
    type:"JSON"
};

//---------------------------------------------------------

// b. Array

var arr = new Array();
arr.push('item-1');
arr[1] = "item2";

// or ( literal-style )

var arr = ["item-1", "item-2"];


//---------------------------------------------------------

// c. RegExp

var ssn = new RegExp("\\d{3}-\\d{2}-\\d{4}");

// or 

var ssn = /\d{3}-\d{2}-\d{4}/;

//---------------------------------------------------------

// d. Function

// imp-note : every func in .js lang is an object

var add = new Function("n1", "n2", "var result=n1+n2;return result;");

// or ( literal-style)

function add(n1, n2) {
    var result=n1+n2;return result;
}


add.prop1 = 123;
add.prop2 = 321;
add.m = function () { }

//---------------------------------------------------------

// How to access .js-obj's properties ?

/*

    2 ways

    ==> '.' for valid identifier(s)
    ==> '[]' for invalid identifier(s)

*/


var person = {
    name: 'Nag',
    'full-name':""
};

person.name = "Nag N";
// person['name'] = "Nag N"; // not recommened , becoz name is valid identifier

person['full-name']="Nagabhushanam N"

// console.log(person.name);
// console.log(person['name']);
// console.log(person['full-name']);



//---------------------------------------------------------


// by default js-objs are extensible and configurable

var person = { name: 'Nag' };
person.age = 32;

delete person.age;

// console.log(person.age)



//---------------------------------------------------------





































