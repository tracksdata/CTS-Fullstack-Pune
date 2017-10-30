
//---------------------------------------------

//1.

function foo(b) {
    var a = 10;
    return a + b + 11;
}

function bar(x) {
    var y = 3;
    return foo(x * y);
}

console.log(bar(7));

//2.

function foo() {

}
function bar() {
    foo();
}
function baz() {
    bar();
}
baz();

//3.


function foo() {
    throw new Error('oops');
}
function bar() {
    foo();
}
function baz() {
    bar();
}
baz();

//4.

function foo() {
    foo();
}
foo();

//5

function big() {
    var i = 0;
    while (i < 10) {
        console.log('big....');
        i++;
    }
}

function small() {
    console.log('small');
}

big();
small();

//---------------------------------------------


/*

    <button class="odd">button-1</button>
    <button class="even">button-2</button>

*/


console.log('start...........');

$.on('.odd', 'click', function handler1() {
    console.log('handling click-event on .odd eleemnts');
});

$.on('.even', 'click', function handler2() {
    console.log('handling click-event on .even eleemnts');
});

console.log('continue with other work....');
var i = 0;
while (i < 10) {
    console.log('....');
    i++;
}

//7,

console.log('Hello');

setTimeout(function () { 
    console.log('im back');
},1000);

var i = 0;
while (i < 100) {
    console.log('....');
    i++;
}





//8


$.on('button', 'click', function onClick() {
    setTimeout(function timer() {
        console.log('You clicked the button!');    
    }, 2000);
});

console.log("Hi!");

setTimeout(function timeout() {
    console.log("Click the button!");
}, 5000);

console.log("Welcome to loupe.");