import { Component, OnInit } from '@angular/core';
import {ContactServiceService} from "../services/contact-service.service";

@Component({
  selector: 'app-contacts',
  templateUrl: './contacts.component.html',
  styleUrls: ['./contacts.component.css']
})
export class ContactsComponent implements OnInit {

  constructor(private cService:ContactServiceService) { }

  ngOnInit() {

  }

}
