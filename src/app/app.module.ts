import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MarchesComponent } from './marches/marches.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { FormsModule } from '@angular/forms';

import { MatTableModule } from '@angular/material/table';
import { MatDialogModule } from '@angular/material/dialog';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { DialogBoxComponent } from './dialog-box/dialog-box.component';
import {NgToastModule} from 'ng-angular-popup';

@NgModule({
  declarations: [
    AppComponent,
    MarchesComponent,
    DialogBoxComponent
  ],
  imports: [
    NgToastModule,
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    MatTableModule,
    MatDialogModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatInputModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
