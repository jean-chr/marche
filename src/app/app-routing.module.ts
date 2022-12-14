import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MarchesComponent } from './marches/marches.component';
const routes: Routes = [
  {path: "marches", component : MarchesComponent},
 {path: "", redirectTo: "marches", pathMatch: "full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
