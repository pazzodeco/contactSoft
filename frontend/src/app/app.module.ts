import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { ContactsComponent } from './contacts/contacts.component';
import {ContactServiceService} from "./services/contact-service.service";
import {HttpModule} from "@angular/http";


@NgModule({
  declarations: [
    AppComponent,
    ContactsComponent
  ],
  imports: [
    BrowserModule,HttpModule
  ],
  providers: [ContactServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
