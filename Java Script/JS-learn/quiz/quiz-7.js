
var myFuncs = [];
for (var i = 0; i < 2; i++){
    myFuncs.push(function () { return i});
}

console.log(myFuncs[0]());  // 0
console.log(myFuncs[1]());  // 1

//