

/*

 Execution-Context
 --------------------

  memory/stack-frame which contains local and arg variables
  to exceute given instructions.

  2 phases

  phase-1 : creation

  ==> all variables declared any where in context
      will get hoisted to top-of-context with default value ( undefined )

  phase-2 : execute

  ==> all instructions will get in sequence

  -----------------------------------------------------------------

  imp-notes:

  ==>every .js-runtime has one global-context and global-obj by default

  global-obj  ==> .js-activation object

    ->browser-envi ==> window
    ->node.js-envi ==> process

  ==> global-context always executed by global-obj

  ==> all global variables will become properties of global-obj at context creation-phase

  ==> .js runtime will throw ReferenceEerror when using variable which is not in context

  best-practice:

  ==> declare variables on top to avoid hoisting confuse

 
//----------------------------------------------------------------------

    every function invocation also creates new-context which is child of where(context) function is declared

//----------------------------------------------------------------------

*/

//----------------------------------------------------------------------

// var v = 12;
// console.log(v);

//----------------------------------------------------------------------

// var v = 12;

// function f1() {
//     console.log(v);
//     var v = 13;
// }

// f1(); // f1-context  ==> global-context

//----------------------------------------------------------------------


var v = 1;
function f1() {
    function f2() {
        console.log(v);
    }
    //f2(); // f2-context ==> f1-context
    var v = 2;
    return f2;
}

var f2=f1(); // f1-context  ==> global-context

f2(); // // f2-context ==> f1-context

//----------------------------------------------------------------------