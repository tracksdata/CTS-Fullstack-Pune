

// function f() {
//     return this;
// }

// var v = f();
// console.dir(v);

//----------------------------------------------

// var v = 100;
// function f() {
//     console.log(v);  // read context's data
//     console.log(this.v); // read context's owner data
// }
// f();


//-----------------------------------------------

var emp = {
    work: function () {
        console.log(name) // read context's data
        console.log(this.name) // read context's owner data
    }
};

emp.work();

//-----------------------------------------------
