import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UsuariosRoutingModule } from './usuarios-routing.module';
import { UsuariosHomeComponent } from './usuarios-home/usuarios-home.component';


@NgModule({
    declarations: [
        UsuariosHomeComponent
    ],
    exports: [
        UsuariosHomeComponent
    ],
    imports: [
        CommonModule,
        UsuariosRoutingModule
    ]
})
export class UsuariosModule { }
