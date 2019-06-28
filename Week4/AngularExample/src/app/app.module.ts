import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AlertsComponent } from './components/alerts/alerts.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { SuccessComponent } from './components/success/success.component';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { AppRoutingModule } from './app-routing.module';



@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    SuccessComponent,
    AlertsComponent,
    PokemonComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    NgbModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
