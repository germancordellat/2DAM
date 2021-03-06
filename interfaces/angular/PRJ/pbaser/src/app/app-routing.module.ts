import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


import { HomeComponent } from './comp/home/home.component';
import { AboutComponent } from './comp/about/about.component';
import { PageNotFoundComponent } from './comp/page-not-found/page-not-found.component';
import { DeptosComponent } from './comp/deptos/deptos.component';
import { EmpleadosComponent } from './comp/empleados/empleados.component';
import { ContactoComponent } from './comp/deptos/contacto/contacto.component';

import { LoginComponent } from './cfg/login/login.component';
import { AuthGuard } from './guards/auth.guard';


const routes: Routes = [
  {path:'',redirectTo:'Login', pathMatch:'full'},
  {path:"Login",component:LoginComponent},
  {path:"Home",component:HomeComponent, canActivate:[AuthGuard]},
  {path:"Home/About",component:AboutComponent, canActivate:[AuthGuard]},
  {path:"Home/Deptos",
    component:DeptosComponent,
    children:[
      {path:"Contacto/:idDepto",component:ContactoComponent},
      {path:"Empleados/:idDepto/:nombreDepto",component:EmpleadosComponent},
      {path: "Productos", loadChildren:()=>import('./comp/deptos/productos/productos.module').then(m=>m.ProductosModule)},
    ], canActivate:[AuthGuard]  
  },
  
  {path:"**",component:PageNotFoundComponent, canActivate:[AuthGuard]}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const CompCreados = [HomeComponent,AboutComponent,PageNotFoundComponent,DeptosComponent,EmpleadosComponent,ContactoComponent,LoginComponent]
