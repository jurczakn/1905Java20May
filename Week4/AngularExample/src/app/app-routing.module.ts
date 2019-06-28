import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PokemonComponent } from './components/pokemon/pokemon.component';
import { AlertsComponent } from './components/alerts/alerts.component';
import { SuccessComponent } from './components/success/success.component';

export const routes: Routes = [
    { path: 'pokemon', component: PokemonComponent},
    { path: 'alerts', component: AlertsComponent},
    { path: 'success', component: SuccessComponent},
    { path: '', redirectTo: '/pokemon', pathMatch: 'full'}
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}