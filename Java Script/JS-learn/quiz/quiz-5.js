


var tnr = {
    name:'Ria'
};
var teachService = {
    doTeach: function () {
        console.log(this.name+" teaching .js");
    }
};
var btn = document.querySelector('.btn-primary');
// soln:
// btn.addEventListener('click', function () { 
//     teachService.doTeach.call(tnr);
// });
// or
btn.addEventListener('click',teachService.doTeach.bind(tnr));