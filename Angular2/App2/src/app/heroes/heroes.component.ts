import { Hero } from './../hero';
import { HEROES } from '../mock-heroes';
import { Component, OnInit, ViewEncapsulation } from '@angular/core';
@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class HeroesComponent implements OnInit {
 heroes = HEROES;
selectedHero: Hero;

onSelect(hero: Hero): void {
  this.selectedHero = hero;
}

  constructor() { }

  ngOnInit() {
  }

}
