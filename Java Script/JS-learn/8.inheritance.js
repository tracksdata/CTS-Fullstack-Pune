


function Person(name, age) {
    this.name = name;
    this.age = age;

    // this.sayName = function () {
    //     console.log('im ' + this.name);
    // }
    // this.sayAge = function () {
    //     console.log('im ' + this.age + " old");
    // }

}

Person.prototype.sayName = function () {
    console.log('im ' + this.name);
}
Person.prototype.sayAge = function () {
    console.log('im ' + this.age + " old");
}

//-----------------------------------------------

// var p1 = new Person('Nag', 32);
// var p2 = new Person('Ria', 2);

//-----------------------------------------------
// var p11 = Object.create(p1);
//-----------------------------------------------

// do IT :  Extend Employee with Person

function Employee(name, age, salary) {
    this.salary = salary;
}
Employee.prototype.saySalary = function () {
    console.log('i get '+this.salary);
}

var emp = new Employee('Nag', 32, 1000.0);
// emp.sayName();
// emp.sayAge();
emp.saySalary();

//----------------------------------------------
