import { Component, OnInit } from '@angular/core';
import { Intervenant } from './intervenant';

import { Router } from '@angular/router';
import { IntervenantService } from '../../../providers/intervenant.service';



@Component({
  selector: 'app-intervenant',

})
export class IntervenantComponent implements OnInit {
 
  private intervenants:Intervenant[];
  constructor(private _intervenantservice:IntervenantService, private _router:Router) { }

  ngOnInit() {
    this._intervenantservice.getintervenants().subscribe( data => {
        this.intervenants = data;
        console.log("error")
      });
  };
 
}
