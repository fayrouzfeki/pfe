import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { CompteRendue } from '../interfaces/compte-rendue';
import {default as compte_rendu_json } from '../../assets/api/CompteRendue.json';

@Injectable()
export class CompteRendueService {
  // private baseUrl = './api';

  // private baseUrl:string='http://localhost:8080/api/';

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

  getcompte_renduParPeriode(d2:String,d3:String){
    return this._http.get(this.baseUrl+'/findByPeriode/'+d2+'/'+d3,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParCode_centre(code:Number){
    return this._http.get(this.baseUrl+'/findByCode_Centre/'+code,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParCode_centre1(code:Number){
    return this._http.get(this.baseUrl+'/findByCode_Centre/'+code,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParCodeAdmission(code_admission:String,d2:String,d3:String,interv:String){

    return this._http.get(this.baseUrl+'/findByCodeAdmission/'+code_admission+'?'+'d1='+d2 +'&'+'d2='+d3+'&'+'interv='+interv,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);   
  }
  // &interv=mm
  getcompte_renduParCodeAdmission1(code_admission:String,dure:Number,interv:String){
    return this._http.get(this.baseUrl+'/findByCodeAdmission1/'+code_admission+'?'+'dure='+dure+'&'+'interv='+interv,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);   
  }
  // /findByCodeAdmissioninterv/OP1700016?interv=radiologue

  getcompte_renduParCodeAdmissioninterv(code_admission:String,nom:String){
    return this._http.get(this.baseUrl+'/findByCodeAdmissioninterv/'+code_admission+'?'+'interv='+nom,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);   
  }
  // /OP1700016057?d1=2017-03-01&d2=2018-02-02&interv=radiologue

  // getcompte_renduParCodeAdmissioninterv1(code_admission:String,dure:Number){
  //   return this._http.get(this.baseUrl+'/findByCodeAdmission1/'+code_admission+'?'+'dure='+dure,this.options).map((response:Response)=>response.json())
  //     .catch(this.errorHandler);   
  // }
  //findByExample
  // findByExample?code_admission=6039
  // /findByExample/?55
  getcompte_renduParCodeExemple(code:String){
    return this._http.get(this.baseUrl+'/findByExample'+'?'+'code='+code,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);

  }
  getcompte_renduParCodePatient(code_patient:String){
    return this._http.get(this.baseUrl+'/findByCode_patient/'+code_patient,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);

  }
   getcompte_renduParDure(dure:Number){
    return this._http.get(this.baseUrl+'/findByDure/'+dure,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParNomintervenant(nom:String){
    return this._http.get(this.baseUrl+'/findByinterv/'+nom,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  getcompte_renduParDatenaissance(date:String){
    return this._http.get(this.baseUrl+'/findByDateNaissance/'+date,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  getcompte_renduParTerminer(terminer:Number){
    return this._http.get(this.baseUrl+'/findByEtat_Terminer/'+terminer,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParValider(valider:Number){
    return this._http.get(this.baseUrl+'/findByEtat_Valider/'+valider,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParImprimer(imprimer:Number){
    return this._http.get(this.baseUrl+'/findByEtat_Imprimer/'+imprimer,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  getcompte_renduParEcrit(){
    return this._http.get(this.baseUrl+'/findByEtat_Ecrit/1/0',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  getcompte_renduParPlanifier(planifier:Number){
    return this._http.get(this.baseUrl+'/findByEtat_Planifier/'+planifier,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  getcompte_renduParRealiser(realiser:Number){
    return this._http.get(this.baseUrl+'/findByEtat_Realiser/'+realiser,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParPret(pret:Number){
    return this._http.get(this.baseUrl+'/findByEtat_Pret/'+pret,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParNomPatient(nom:String){
    return this._http.get(this.baseUrl+'/findByNomPatient/'+nom,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getEtatParArrive_Patient(){
    return this._http.get(this.baseUrl+'/findByEtat_arrive_patient',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getEtatPar_Etat_Patient_En_cour(){
    return this._http.get(this.baseUrl+'/findByEtat_Patient_Encour',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getEtatPar_Etat_Patient_Terminer(){
    return this._http.get(this.baseUrl+'/findByEtat_Patient_terminer',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getEtatPar_Etat_Patient_Attent(){
    return this._http.get(this.baseUrl+'/findByEtat_Patient_Enattent',this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParAge(datenaissance:String){
    return this._http.get(this.baseUrl+'/findByDateNaissance/'+datenaissance,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduparAttent(arrivee:String){
    return this._http.get(this.baseUrl+'/findBydureattente/'+arrivee,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  getcompte_renduParTS(d1:String,d2:String,code:String){
    return this._http.get(this.baseUrl+'/compte100/'+d1+d2+code,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  createcompte_rendu(compte_rendu:CompteRendue){

    return this._http.post(this.baseUrl+'/compte_rendu',JSON.stringify(compte_rendu),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
   
   updatecompte_rendu(compte_rendu:CompteRendue){

    return this._http.put(this.baseUrl+'/compte_rendu',JSON.stringify(compte_rendu),  this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }
  
  errorHandler(error:Response){

     return Observable.throw(error||"SERVER ERROR");
  }

   setter(compte_rendu:CompteRendue){
     this.compte_rendu=compte_rendu;
   }

  getter(){
    return this.compte_rendu;
  }
}
