import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { Rdv } from '../interfaces/rdv';


@Injectable()
export class RendezVousService {

  errorHandler(arg0: any): any {
    throw new Error('Method not implemented.');
  }
  // private baseUrl : string = 'http://localhost:8080/api/Centre.rdv';
  // private headers = new Headers({ 'Content-Type': 'application/json' });
  // private options = new RequestOptions({ headers: this.headers });
  // private rdv = new Rdv();
  // constructor(private _http: Http) { }
  // //http://localhost:8080/api/rdv/
  // getrdvs() {

  //   return this._http.get(this.baseUrl + '/rdvs', this.options).map((response: Response) => response.json())
  //     .catch(this.errorHandler);
  // }
}
