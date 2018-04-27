import { Component, OnInit } from '@angular/core';
//import{FooterService} from '../../providers/footer.service'

import { CompteRendue } from '../../interfaces/compte-rendue';
import{CompteRendueService}from'../../providers/compte-rendue.service'
@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {
 
  constructor(private _compte_renduservice:CompteRendueService,
    //private _footerservice:FooterService, 
   ) { }

  ngOnInit() { 

    this._compte_renduservice.getcompte_rendus().subscribe( data => {
      localStorage.setItem("aaaaa",JSON.stringify(data));
      
 
      });
    
      
    }}