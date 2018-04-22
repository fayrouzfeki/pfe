import { Component, OnInit } from '@angular/core';


import { Router } from '@angular/router';
import { Intervenant } from './intervenant';

import { IntervenantService } from '../../../providers/intervenant.service';

@Component({
  selector: 'intervenant-table-list',
  templateUrl: './intervenant-list.component.html',
})

export class IntervenantListComponent implements OnInit {

  private intervenants:Intervenant[];

  constructor(private _intervenantservice:IntervenantService, private _router:Router) { }

  ngOnInit() {
    this._intervenantservice.getintervenants().subscribe( data => {
        this.intervenants = data;
        console.log(Error)
 
      });
     
  };
    

       
              

}
