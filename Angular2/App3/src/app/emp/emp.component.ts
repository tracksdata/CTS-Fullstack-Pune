import { EMPLOYEES } from './../mock-employees';
import { Employee } from './../emp';
import { Component, OnInit, ViewEncapsulation } from '@angular/core';


@Component({
  selector: 'app-emp',
  templateUrl: './emp.component.html',
  styleUrls: ['./emp.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class EmpComponent implements OnInit {

  emps=EMPLOYEES;
  selected:Employee;
  onSelect(emp:Employee){
    this.selected=emp;
    
  }

  emp1=new Employee();
  
  constructor(){
   this.emp1.empId=1024;

  }
 
  ngOnInit() {
   
  }

}
