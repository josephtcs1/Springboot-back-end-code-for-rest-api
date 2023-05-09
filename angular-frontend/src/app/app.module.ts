import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule} from '@angular/forms';
import { AboutusComponent } from './aboutus/aboutus.component';
import { WeddingsComponent } from './weddings/weddings.component';
import { WallpapersComponent } from './wallpapers/wallpapers.component';
import { HomeComponent } from './home/home.component';
import { ContactUsComponent } from './contact-us/contact-us.component'


@NgModule({
  declarations: [
    AppComponent,    
    AboutusComponent,
    WeddingsComponent,
    WallpapersComponent,
    HomeComponent,
    ContactUsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
