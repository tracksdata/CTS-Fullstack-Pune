


var trainer = {
    name:'Nag',
    doTeach: function () {
        console.log(this.name + " teaching .js");
        var self = this;
        function doLearn() {
            console.log(this.name+' learning .js from '+self.name);
        }
        //doLearn();
        var emp = { name: 'CTS' };
        doLearn.call(emp);   
    }
};

trainer.doTeach();

// var tempTrainer = { name: 'Ria' };
// trainer.doTeach.call(tempTrainer);
