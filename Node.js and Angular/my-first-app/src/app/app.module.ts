import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { XyzComponent } from './xyz/xyz.component';
import { ProfileDisplayComponent } from './profile-display/profile-display.component';
import { UserInputComponent } from './user-input/user-input.component';
import { FormsModule } from '@angular/forms';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { NamesItemComponent } from './names-item/names-item.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule} from '@angular/common/http';
import { UserRegisterComponent } from './user-register/user-register.component'
import { Routes, RouterModule} from '@angular/router';
import { MainComponent } from './main/main.component';
import { SuccessComponent } from './success/success.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UpdateComponent } from './update/update.component';
import { DeleteComponent } from './delete/delete.component';

const routes : Routes = [
  {path : "", component : LoginComponent},
  {path : "register", component : UserRegisterComponent},
  {path : "login", component : LoginComponent},
  {path : "success/:username", component : SuccessComponent, children: [
    {path : "", component : DashboardComponent},
    {path : "dashboard", component : DashboardComponent},
    {path : "update", component : UpdateComponent},
    {path : "delete", component : DeleteComponent}
  ]}
];

@NgModule({
  declarations: [
    AppComponent,    XyzComponent,     ProfileDisplayComponent,     UserInputComponent,
    ParentComponent,     ChildComponent,     NamesItemComponent,     LoginComponent, UserRegisterComponent, MainComponent, SuccessComponent, DashboardComponent, UpdateComponent, DeleteComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule, RouterModule.forRoot(routes)
  ],
  providers: [
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
