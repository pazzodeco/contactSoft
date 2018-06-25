import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import "rxjs/add/operator/map"
@Injectable()
export class ContactServiceService {

  url="http://localhost:8080/api/contacts/";
  contacts:any;
  constructor(private http:Http) { }


  findContact(q,p,s){
    return this.http
        .get(this.url+"index",{params:{
          key:q,page:p,size:s
        }})
        .map(response=>response.json());
  }

}
