import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {UsuariosHomeComponent} from "./usuarios/usuarios-home/usuarios-home.component";

const routes: Routes = [
  {path:'/usuarios', component: UsuariosHomeComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
