import { Injectable } from '@angular/core';
import{Http, Response, Headers, RequestOptions} from '@angular/http';
import{Observable}   from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { Intervenant } from '../dashboard/content/intervenant-list/intervenant';



@Injectable()
export class IntervenantService {

  private baseUrl:string='http://localhost:8080/api/intervenants';
  private headers = new Headers({'Content-Type':'application/json'});
  private options = new RequestOptions({headers:this.headers});
  private intervenant = new Intervenant();
  constructor(private _http:Http) { }
  getintervenants(){
    return this._http.get(this.baseUrl+'/intervenant1',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  deleteintervenant(id:Number){

    return this._http.delete(this.baseUrl+'/intervenant/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getintervenant(id:Number){

    return this._http.get(this.baseUrl+'/intervenant/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getintervenantParCode(){
    return this._http.get(this.baseUrl+'/intervenants',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
 
  createintervenant(intervenant:Intervenant){

    return this._http.post(this.baseUrl+'/intervenant',JSON.stringify(intervenant),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
   
   updateintervenant(intervenant:Intervenant){

    return this._http.put(this.baseUrl+'/intervenant',JSON.stringify(intervenant),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  
  errorHandler(error:Response){

     return Observable.throw(error||"SERVER ERROR");
  }

   setter(intervenant:Intervenant){
     this.intervenant=intervenant;
   }

  getter(){
    return this.intervenant;
  }
}
