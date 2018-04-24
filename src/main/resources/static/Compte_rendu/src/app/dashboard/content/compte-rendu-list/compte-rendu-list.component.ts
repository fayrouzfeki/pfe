import { Component, OnInit, Input, Output, EventEmitter} from '@angular/core';
import { Router } from '@angular/router';
import { CompteRendueService } from '../../../providers/compte-rendue.service';
import { CompteRendue } from '../../../interfaces/compte-rendue';
import { Intervenant } from '../intervenant-list/intervenant';
import { IntervenantService } from '../../../providers/intervenant.service';

@Component({
  moduleId:module.id,
  selector: 'app-compte-rendu-list',
  templateUrl: './compte-rendu-list.component.html',
  styleUrls: ['./compte-rendu-list.component.css']

 
})

export class CompteRenduListComponent implements OnInit {
 @Input() reviews:number;
 @Output()
 change: EventEmitter<number> = new EventEmitter<number>();
  intervenants: Intervenant;
  private compte_rendus:CompteRendue[];


constructor(private _compte_renduservice:CompteRendueService,
  private _intervenantservice:IntervenantService, 
  private _router:Router) {
   }
year:Number;
month:Number;
day:Number;
hour:Number;
time:Number;
minute:Number;
second:Number;
timeStop:Number;
curretTime:Date;
filtreProjet = "";
showRecord = false;
showForm = false;
showTab = true;
private hideElement: boolean = true;


  ngOnInit() {
    this._compte_renduservice.getcompte_rendus().subscribe( data => {
      localStorage.setItem("aaaaa",JSON.stringify(data));
      
 
      });
    
this.compte_rendus=JSON.parse(localStorage.getItem('aaaaa'));
      this._intervenantservice.getintervenants().subscribe( data => {
        this.intervenants = data;
 
 
      });
      
var curretTime = new Date()
    this.year=curretTime.getFullYear();
    this.month=curretTime.getMonth();
    this.day=curretTime.getDay();
    this.hour=curretTime.getHours();
    this.time=curretTime.getTime();
    this.minute=curretTime.getMinutes();
    this.second=curretTime.getSeconds(); 
  };
  
  onShowRecord(pane) {
    this.showTab = false;
        if(pane === "record") this.showRecord = true;
        if(pane === "pdf") this.showForm = true;
  }
  toggleElement(){
    if(this.hideElement){
        this.hideElement = false;}
    else{
        this.hideElement = true;}
}
dateDiff(dateold, datenew)
  {
    var ynew = datenew.getFullYear();
    var mnew = datenew.getMonth();
    var dnew = datenew.getDate();
    var yold = dateold.getFullYear();
    var mold = dateold.getMonth();
    var dold = dateold.getDate();
    var diff = datenew - dateold;
    if(mold > mnew) diff--;
    else
    {
      if(mold == mnew)
      {
        if(dold > dnew) diff--;
      }
    }
    return diff;
  }
  
  deletecompte_rendu(compte_rendu: CompteRendue): void {
    this._compte_renduservice.deletecompte_rendu(compte_rendu.num_compte_rendu).subscribe( data => {
        this.compte_rendus.splice(this.compte_rendus.indexOf(compte_rendu),1);
      },(error)=>{
        console.log(error);
      });
    }
   
      
      getcompte_renduParCode_centre(code: Number): void {
        this._compte_renduservice. getcompte_renduParCode_centre(code).subscribe( data => {
            this.compte_rendus=data;
            console.log(Error);
          });
        };
      getcompte_renduParPeriode(d2:String,d3:String): void {
        this._compte_renduservice.getcompte_renduParPeriode(d2,d3).subscribe( data => {
            this.compte_rendus=data;
            console.log(Error);
          });
        };
        getcompte_renduParDure(dure:Number): void {
          this._compte_renduservice.getcompte_renduParDure(dure).subscribe( data => {
              this.compte_rendus=data;
              
              console.log(Error);
            });
          };
          getcompte_renduParDatenaissance(date:String): void {
            this._compte_renduservice.getcompte_renduParDatenaissance(date).subscribe( data => {
                this.compte_rendus=data;
                console.log(Error);
              });
            };

            getcompte_renduParTerminer(terminer:Number): void {
              this._compte_renduservice.getcompte_renduParTerminer(terminer).subscribe( data => {
                  this.compte_rendus=data;
                  
                  console.log(Error);
                });              
              };

              getcompte_renduParValider(valider:Number): void {
                this._compte_renduservice.getcompte_renduParValider(valider).subscribe( data => {
                    this.compte_rendus=data;
                    
                    console.log(Error);
                  });              
                };
                getcompte_renduParImprimer(imprimer:Number): void {
                  this._compte_renduservice.getcompte_renduParImprimer(imprimer).subscribe( data => {
                      this.compte_rendus=data;
                      
                      console.log(Error);
                    });              
                  }; 


               getcompte_renduParPlanifier(planifier:Number): void {
                    this._compte_renduservice.getcompte_renduParPlanifier(planifier).subscribe( data => {
                        this.compte_rendus=data;
                        console.log(Error);
                      });
                    };
                    

            getcompte_renduParRealiser(realiser:Number): void {
              this._compte_renduservice.getcompte_renduParRealiser(realiser).subscribe( data => {
                  this.compte_rendus=data;
                  console.log(Error);
                });
              };
              getcompte_renduParPret(pret: Number): void {
                this._compte_renduservice.getcompte_renduParPret(pret).subscribe( data => {
                    this.compte_rendus=data;
                    console.log(Error);
                  });
                };
                getcompte_renduParEcrit(): void {
                  this._compte_renduservice.getcompte_renduParEcrit().subscribe( data => {
                      this.compte_rendus=data;
                      console.log(Error);
                    });
                  };
                getcompte_renduParCodeAdmission(code_admission: String,d2:String,d3:String,interv:String): void {
                  this._compte_renduservice.getcompte_renduParCodeAdmission(code_admission,d2,d3,interv).subscribe( data => {
                      this.compte_rendus=data;
                      console.log(Error);
                    });
                  };
                  getcompte_renduParCodeAdmission1(code_admission:String,dure:Number,interv:String): void {
                    this._compte_renduservice.getcompte_renduParCodeAdmission1(code_admission,dure,interv).subscribe( data => {
                        this.compte_rendus=data;
            
                      });
                    };

                    getcompte_renduParCodeAdmissioninterv(code_admission: String,nom:String): void {
                      this._compte_renduservice.getcompte_renduParCodeAdmissioninterv(code_admission,nom).subscribe( data => {
                      
                        });
                      };
                  getcompte_renduParCodePatient(code_patient: String): void {
                    this._compte_renduservice.getcompte_renduParCodePatient(code_patient).subscribe( data => {
                        this.compte_rendus=data;

                        console.log(Error);
                      });
                    };
                  getcompte_renduParNomPatient(nom: String): void {
                    this._compte_renduservice.getcompte_renduParNomPatient(nom).subscribe( data => {
                        this.compte_rendus=data;
                        console.log(Error);
                      });
                    };
                getEtatParArrive_Patient(): void {
                      this._compte_renduservice.getEtatParArrive_Patient().subscribe( data => {
                          this.compte_rendus=data;
                          console.log(Error);
                        });
                      };

                      getEtatPar_Etat_Patient_En_cour(): void {
                        this._compte_renduservice.getEtatPar_Etat_Patient_En_cour().subscribe( data => {
                            this.compte_rendus=data;
                            console.log(Error);
                          });
                        };

                        getEtatPar_Etat_Patient_Terminer(): void {
                          this._compte_renduservice.getEtatPar_Etat_Patient_Terminer().subscribe( data => {
                              this.compte_rendus=data;
                              console.log(Error);
                            });
                          };

                          getEtatPar_Etat_Patient_Attent(): void {
                            this._compte_renduservice.getEtatPar_Etat_Patient_Attent().subscribe( data => {
                                this.compte_rendus=data;
                                console.log(Error);
                              });
                            };
                            getcompte_renduParAttent(arrivee: String): void {
                              this._compte_renduservice.  getcompte_renduparAttent("2018-06-03").subscribe( data => {
                                  this.compte_rendus=data;
                                  console.log(Error);
                                });
                              };
                              getcompte_renduParNomintervenant(nom: String): void {
                                this._compte_renduservice.getcompte_renduParNomintervenant(nom).subscribe( data => {
                                    this.compte_rendus=data;
                                    console.log(Error);
                                  });
                                };

                                getcompte_renduParTS(d1: String,d2:String,code:String): void {
                                  this._compte_renduservice.getcompte_renduParTS(d1,d2,code).subscribe( data => {
                                      this.compte_rendus=data;
                                      console.log(Error);
                                    });
                                  };
                                  getcompte_renduParCodeExemple(code: String): void {
                                    this._compte_renduservice.getcompte_renduParCodeExemple(code).subscribe( data => {
                                        this.compte_rendus=data;
                                        console.log(Error);
                                      });
                                    };

                                

                                                  
}
