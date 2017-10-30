


function sessionStart() {
    
    function Trainer(name) {
        this.name = name;
        this.doTeach = function () {
            console.log(this.name + " teaching .js");
            var self = this;
            function doLearn() {
                console.log(this.name+" learning .js from "+self.name);
            }
            return doLearn;
        }
    }

    function Employee(name) {
        this.name = name;
    }

    var nagTnr = new Trainer('Nag');  // constructor-invocation

    var emp1 = new Employee('Emp1');
    var emp2 = new Employee('Emp2');

    var learn = nagTnr.doTeach();  // method invocation
    
    learn.call(emp1);  // call/apply/bind invocation
    learn.call(emp2);

}


sessionStart();  // function-invocation