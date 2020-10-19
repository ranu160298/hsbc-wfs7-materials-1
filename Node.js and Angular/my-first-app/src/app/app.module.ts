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

const routes : Routes = [
  {path : "", component : LoginComponent},
  {path : "register", component : UserRegisterComponent},
  {path : "profileDisplay", component : ProfileDisplayComponent},
  {path : "login", component : LoginComponent},
  {path : "parentChild", component : ParentComponent}
];

@NgModule({
  declarations: [
    AppComponent,    XyzComponent,     ProfileDisplayComponent,     UserInputComponent,
    ParentComponent,     ChildComponent,     NamesItemComponent,     LoginComponent, UserRegisterComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule, RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
