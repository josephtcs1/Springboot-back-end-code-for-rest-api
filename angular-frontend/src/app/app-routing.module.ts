import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { WeddingsComponent } from './weddings/weddings.component';
import { WallpapersComponent } from './wallpapers/wallpapers.component'
import { HomeComponent } from './home/home.component';
import { ContactUsComponent } from './contact-us/contact-us.component'




const routes: Routes = [
  // {path: 'employees', component: EmployeeListComponent},
  // {path: 'create-employee', component: CreateEmployeeComponent},
  {path: 'about-us', component: AboutusComponent},
  {path: 'weddings', component: WeddingsComponent},
  {path: 'wallpapers', component: WallpapersComponent},
  {path: 'home', component: HomeComponent},
  {path: 'comntact-us', component: ContactUsComponent},
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],                                                                                                                                                                                                                                                                                                          
  exports: [RouterModule]
})
export class AppRoutingModule { }
