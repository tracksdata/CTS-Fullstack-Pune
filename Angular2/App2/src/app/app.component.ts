import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  name='';
  values='Pune City';
  
  isChanged=true;
 
 
  myFun(){
    alert('Its Working');
  }
  
  abc(s1:string){
    //console.log('Name is '+s1);
    this.name='';
    this.name+=s1;
}

}

interface Abc{

}
class Test{
  
}
