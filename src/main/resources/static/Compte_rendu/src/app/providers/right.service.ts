import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { CompteRendue } from '../interfaces/compte-rendue';
import {default as compte_rendu_json } from '../../assets/api/CompteRendue.json';

@Injectable()
export class RightService {

  getcompte_renduParDesignation1(arg0: any): any {
    throw new Error("Method not implemented.");
  }
  private headers = new Headers({'Content-Type': 'application/json'});
  private options = new RequestOptions({headers: this.headers});
  private compte_rendu: CompteRendue;
  constructor(private _http: Http) { }
  private baseUrl:string='http://localhost:8080/Compte_Rendu';

  getcompte_rendus(){
    return this._http.get(this.baseUrl+'/compte_rendus',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  deletecompte_rendu(id:Number){

    return this._http.delete(this.baseUrl+'/compte_rendu/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  getcompte_rendu(id:Number){

    return this._http.get(this.baseUrl+'/compte_rendu/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

 
  getcompte_renduParCode_centre(code:Number){
    return this._http.get(this.baseUrl+'/findByCode_Centre/'+code,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }  
  errorHandler(error:Response){

     return Observable.throw(error||"SERVER ERROR");
  }

  getcompte_renduParCode_centre1(code:Number){
    return this._http.get(this.baseUrl+'/findByCode_Centre/'+code,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }  
 

   setter(compte_rendu:CompteRendue){
     this.compte_rendu=compte_rendu;
   }

  getter(){
    return this.compte_rendu;
  }
}
