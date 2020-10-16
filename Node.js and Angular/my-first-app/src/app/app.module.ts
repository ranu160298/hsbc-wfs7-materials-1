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

@NgModule({
  declarations: [
    AppComponent,    XyzComponent,     ProfileDisplayComponent,     UserInputComponent,
    ParentComponent,     ChildComponent,     NamesItemComponent,     LoginComponent, UserRegisterComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
