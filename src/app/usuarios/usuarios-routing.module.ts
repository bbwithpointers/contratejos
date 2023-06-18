import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {UsuariosHomeComponent} from "./usuarios-home/usuarios-home.component";

const routes: Routes = [
  {path:'',
  component:UsuariosHomeComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UsuariosRoutingModule { }
