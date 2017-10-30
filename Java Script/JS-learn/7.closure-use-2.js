


function Person(name,age) {
    this.name = name;
    this.age = age;

    var self = this;
    function incAge() {
        self.age++;
        console.log(self.name+"-->"+self.age);
    }    
    setInterval(incAge,5000);    

}

var p = new Person('Ria', 0);