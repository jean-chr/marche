//dialog-box.component.ts
import { Component, Inject, Optional } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Marche } from '../model/marche';


@Component({
  selector: 'app-dialog-box',
  templateUrl: './dialog-box.component.html',
  styleUrls: ['./dialog-box.component.css']
})
export class DialogBoxComponent {

  action:string;
  marche:any;

  constructor(
    public dialogRef: MatDialogRef<DialogBoxComponent>,
    @Optional()
    @Inject(MAT_DIALOG_DATA)
    public data: {marche:Marche, action:string}) {
    console.log(data);
    this.marche = data.marche;
    this.action = this.data.action;
  }

  doAction(){
    this.dialogRef.close({event:this.action,marche:this.marche});
  }

  closeDialog(){
    this.dialogRef.close({event:'Annuler'});
  }

  onNoClick():void{
    this.dialogRef.close({event:'Annuler'});
  }

}
