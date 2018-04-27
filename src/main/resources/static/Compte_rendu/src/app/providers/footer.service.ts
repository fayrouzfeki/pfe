import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { CompteRendue } from '../interfaces/compte-rendue';




export class FooterService {
    private headers = new Headers({'Content-Type': 'application/json'});
    private options = new RequestOptions({headers: this.headers});
    private compte_rendus:CompteRendue[];
    constructor(private _http: Http) { }
    private baseUrl:string='http://localhost:8080/Compte_Rendu';
    getcompte_rendus(){

        return this._http.get(this.baseUrl+'/compte_rendus',this.options).map((response:Response)=>response.json())
          .catch(this.errorHandler);
      }

      errorHandler(error:Response){

        return Observable.throw(error||"SERVER ERROR");
     }
  }


