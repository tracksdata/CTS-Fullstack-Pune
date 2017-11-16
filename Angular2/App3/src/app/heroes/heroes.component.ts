import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { Hero } from '../hero';
import { HEROES } from '../mock-heros';
@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class HeroesComponent implements OnInit {

heroes=HEROES;
public showData=false;
course='Select One';
name='Praveen';
public subCourses=['-- Select Sub-Course --'];


selectedHero: Hero;
onSelect1(s2:string){
  this.course=s2;
  console.log('---- selected course is '+this.course);
if(this.course==='MSC'){
  console.log('--- MSC');
  this.subCourses=new Array();
  this.subCourses.push('Master in Electronics');
  this.subCourses.push('Master in Mathematics');
  this.subCourses.push('Master in Computer Science');
  this.subCourses.push('Master in Accounts');
}
if(this.course=="BSC"){
  this.subCourses=new Array();
  console.log('--- BSC');
  this.subCourses.push('Batcher of Computers');
  this.subCourses.push('Batcher of Elect');
  this.subCourses.push('Batcher of Accounts');
  this.subCourses.push('Batcher of CA');
}

}

onSelect(hero: Hero):void {
  this.selectedHero = hero;

}

  constructor() { }

  ngOnInit() {
  }

}
