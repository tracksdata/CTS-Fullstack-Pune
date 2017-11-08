import { Component } from '@angular/core';
import { Test } from './myapp';
@Component({
  selector: 'app-root',
  template:`
            <h1> Welcome to Angular2 App</h1>
            <h2>App Title: {{appTitle}}</h2>
            <h2>Ename: {{emp.ename}}</h2>
            <h2>Age is : {{emp.age}}</h2>
          `,
})
export class AppComponent {
  title = 'app';
 

  emp={
    ename:'James',
    age:'45',
    salary:384834
  }
}
