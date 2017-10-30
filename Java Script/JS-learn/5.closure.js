
/*
    A closure is a function having access to the parent scope,
    even after the parent function has closed.

    why we need ?

    --> to abstract any public-bahv of any module
    --> while executig func async, to access parent scoped data.

*/

function teach(sub) {
    console.log('teaching ' + sub);
    var notes = sub + "-notes";
    var i = 100;
    function learn() {
        console.log('learning with '+notes);
    }
    function func() {
        
    }
    //learn();
    console.log('teaching end');
    return learn;
}


var learnFunc = teach('.js'); // teach-context created with args and local

learnFunc();
learnFunc();