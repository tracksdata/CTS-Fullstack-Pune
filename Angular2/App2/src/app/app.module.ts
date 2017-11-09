import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { EmpComponent } from './emp/emp.component';
import { BankComponent } from './bank/bank.component';


@NgModule({
  declarations: [
    AppComponent,
    EmpComponent,
    BankComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
