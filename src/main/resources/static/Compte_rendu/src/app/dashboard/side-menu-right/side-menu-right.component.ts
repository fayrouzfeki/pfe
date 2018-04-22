import { Component, OnInit } from '@angular/core';
import { CompteRendue } from '../../interfaces/compte-rendue';

import { Router } from '@angular/router';
import { RightService } from '../../providers/right.service';
import { JsonpModule } from '@angular/http';
@Component({
  selector: 'app-side-menu-right',
  templateUrl: './side-menu-right.component.html',
  styleUrls: ['./side-menu-right.component.css']
})
export class SideMenuRightComponent implements OnInit {
  len8: number;
  len2: number;
  len1: number;
  len3: number;
  len4: number;
  len5: number;
  len6: number;
  len7: number;

  private compte_rendus:CompteRendue[];

  constructor(private _compte_renduservice:RightService,private _router:Router) { }
    ngOnInit() {
      this._compte_renduservice.getcompte_rendus().subscribe( data => {
        this.len8=data.length;
   
        });
        this._compte_renduservice. getcompte_renduParCode_centre1(24).subscribe( data => {
          this.len1=data.length;
                          
        });
        this._compte_renduservice. getcompte_renduParCode_centre(23).subscribe( data => {
          this.len2=data.length;
                        
        });
        this._compte_renduservice. getcompte_renduParCode_centre(22).subscribe( data => {
          this.len3=data.length;
                        
        });
        this._compte_renduservice. getcompte_renduParCode_centre(21).subscribe( data => {
          this.len4=data.length;
                         
        });
        this._compte_renduservice. getcompte_renduParCode_centre(20).subscribe( data => {
          this.len5=data.length;
                            
        });
        this._compte_renduservice. getcompte_renduParCode_centre(25).subscribe( data => {
          this.len6=data.length;
                            
        });
        this._compte_renduservice. getcompte_renduParCode_centre(26).subscribe( data => {
          this.len7=data.length;
                            
        });
       
        }
       getcompte_renduParCode_centre(code: Number): void {
        this._compte_renduservice. getcompte_renduParCode_centre(code).subscribe( data => {
            this.compte_rendus=data;
            localStorage.setItem("aaaaa",JSON.stringify(data));
            window.location.reload();
                        console.log(Error);
                        
          });
        };
         getcompte_renduParCode_centre1(code: Number): void {
          this._compte_renduservice. getcompte_renduParCode_centre(24).subscribe( data => {
              this.compte_rendus=data;
              localStorage.setItem("aaaaa",JSON.stringify(data));
              window.location.reload();

                          console.log(Error);
                          
            });
          };
 
           getcompte_renduParCode_centre2(code:Number): void {
            this._compte_renduservice. getcompte_renduParCode_centre(23).subscribe( data => {
                this.compte_rendus=data;
                localStorage.setItem("aaaaa",JSON.stringify(data));
                window.location.reload();
                            console.log(Error);
                            
              });
            };
            
            getcompte_renduParCode_centre3(code:Number): void {
              this._compte_renduservice. getcompte_renduParCode_centre(22).subscribe( data => {
                  this.compte_rendus=data;
                  localStorage.setItem("aaaaa",JSON.stringify(data));
                  window.location.reload();
                              console.log(Error);
                              
                });
              };
               getcompte_renduParCode_centre4(code:Number): void {
                this._compte_renduservice. getcompte_renduParCode_centre(21).subscribe( data => {
                    this.compte_rendus=data;
                    localStorage.setItem("aaaaa",JSON.stringify(data));
                    window.location.reload();
                                console.log(Error);
                                
                  });
                };
             
                 getcompte_renduParCode_centre5(code:Number): void {
                  this._compte_renduservice. getcompte_renduParCode_centre(20).subscribe( data => {
                      this.compte_rendus=data;
                      localStorage.setItem("aaaaa",JSON.stringify(data));
                      window.location.reload();
                                  console.log(Error);
                                  
                    });
                  };
                   getcompte_renduParCode_centre6(code:Number): void {
                    this._compte_renduservice. getcompte_renduParCode_centre(25).subscribe( data => {
                        this.compte_rendus=data;
                        localStorage.setItem("aaaaa",JSON.stringify(data));
                        window.location.reload();
                                    console.log(Error);
                                    
                      });
                    };
                     getcompte_renduParCode_centre7(code:Number): void {
                      this._compte_renduservice. getcompte_renduParCode_centre(26).subscribe( data => {
                          this.compte_rendus=data;
                          localStorage.setItem("aaaaa",JSON.stringify(data));
                          window.location.reload();
                                      console.log(Error);
                                      
                        });
                      };

        getcompte_rendus(): void {
          this._compte_renduservice.getcompte_rendus().subscribe( data => {
              this.compte_rendus=data;
              localStorage.setItem("aaaaa",JSON.stringify(data));
              window.location.reload();
                          console.log(Error);
            });
          };
  }
  