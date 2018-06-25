import { Component } from '@angular/core';
import {ContactServiceService} from "./services/contact-service.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  contacts:any
  constructor(private cService:ContactServiceService) { }

  ngOnInit() {
    this.cService.findContact("",0,5)
        .subscribe(data=>{
          this.contacts=data.content
        },error2 => {
          console.log("Error server")
        });

  }
}
