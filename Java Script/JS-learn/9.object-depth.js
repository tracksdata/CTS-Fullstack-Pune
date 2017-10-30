"use strict"

/*

 by default .js object's properties
  are extensible,configurable and enumurable

*/

// var person = {
//     name: 'Nag',
//     age:32
// };
// Object.defineProperty(person, 'name', { configurable: false, writable: false, enumerable: false });
// Object.defineProperty(person, 'address', {value:'universe',configurable:false,writable:false,enumerable:false});


// // delete person.name;
// // person.name = "bla bla";

// // console.log(person.name)


// for (var prop in person) {
//     console.log(prop);
// }

//------------------------------------------------------

// var person = {
//     name: 'Nag',
//     age:32
// };


// Object.preventExtensions(person);
// Object.seal(person);
// Object.freeze(person);

// person.address = "unverse";
// delete person.name;
// delete person.age;

// person.name = "bla bla";


//------------------------------------------------------


var person = {
    _name: 'Nag',
    _age: 32,
    set name(newName) {
        console.log('set name');
        if (newName) {
            this._name = newName;
        }
    },
    get name() {
        console.log('get name');
        return this._name;
    }
};

person.name = "";  // set
console.log(person.name); // get
