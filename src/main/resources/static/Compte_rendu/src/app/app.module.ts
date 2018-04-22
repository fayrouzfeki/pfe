import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app.routing';
// import { ComponentsModule } from './components/components.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { NavComponent } from './dashboard/nav/nav.component';
import { SideBarComponent } from './dashboard/side-bar/side-bar.component';
import { ContentComponent } from './dashboard/content/content.component';
import { FooterComponent } from './dashboard/footer/footer.component';
import { RapportMedicalComponent } from './dashboard/content/rapport-medical/rapport-medical.component';
import { DemandesNonProgrammeComponent } from './dashboard/content/demandes-non-programme/demandes-non-programme.component';
import { SideMenuRightComponent } from './dashboard/side-menu-right/side-menu-right.component';
import { SideMenuLeftComponent } from './dashboard/side-menu-left/side-menu-left.component';
import { CompteRenduListComponent } from './dashboard/content/compte-rendu-list/compte-rendu-list.component';
import { CompteRendueService } from './providers/compte-rendue.service';
import { RightService } from './providers/right.service';
import { IntervenantService } from './providers/intervenant.service';
import { IntervenantListComponent } from './dashboard/content/intervenant-list/intervenant-list.component';
import { AuthComponent } from './auth/auth.component';
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { TooltipModule } from 'ngx-bootstrap/tooltip';
import { ModalModule } from 'ngx-bootstrap/modal';
import { DicteRecordComponent } from './dashboard/content/compte-rendu-list/dicte-record/dicte-record.component';
import { RepotFormComponent } from './dashboard/content/compte-rendu-list/repot-form/repot-form.component';
const routes = [
  { path: 'compte-rendu', component: CompteRenduListComponent},
  { path: 'demande-non-prog', component: DemandesNonProgrammeComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    NavComponent,
    SideBarComponent,
    ContentComponent,
    FooterComponent,
    RapportMedicalComponent,
    DemandesNonProgrammeComponent,
    SideMenuRightComponent,
    SideMenuLeftComponent,
    CompteRenduListComponent,
    IntervenantListComponent,
    AuthComponent,
    DicteRecordComponent,
    RepotFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule,
    AppRoutingModule,
    BsDropdownModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot(),
    RouterModule.forRoot(routes),
    AppRoutingModule,
  ],
 
  providers: [
  CompteRendueService,
  RightService,
  IntervenantService
],
  bootstrap: [AppComponent]
})
export class AppModule { }
