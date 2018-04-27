import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-repot-form',
  templateUrl: './repot-form.component.html',
  styleUrls: ['./repot-form.component.css']
})
export class RepotFormComponent implements OnInit {

  constructor() { }

  ngOnInit() {

  }
    //export to .docx
    downloadInnerHtml(filename, elId) {
      var elHtml = document.getElementById(elId).innerHTML;
      var link = document.createElement('a');
      link.setAttribute('download', filename);   
      link.setAttribute('href', 'data:' + 'text/doc' + ';charset=utf-8,' + encodeURIComponent(elHtml));
      link.click(); 
      var fileName =  'tags.doc'; // You can use the .txt extension if you want
     this.downloadInnerHtml(fileName, 'main');
     }
     
      //   //export to .docx  
}
