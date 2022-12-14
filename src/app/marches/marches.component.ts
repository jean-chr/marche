import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { DialogBoxComponent } from '../dialog-box/dialog-box.component';
import { Marche } from '../model/marche';
import { MarcheService } from '../service/marche.service';
import { NgToastService } from 'ng-angular-popup';

@Component({
  selector: 'app-marches',
  templateUrl: './marches.component.html',
  styleUrls: ['./marches.component.css'],
})
export class MarchesComponent implements OnInit {
  marches!: Marche[];

  constructor(public dialog: MatDialog, public marcheservice: MarcheService, private toast:NgToastService ) {}

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  chargeMarche() {
    this.marcheservice.Listmarches().subscribe((result) => {
      this.marches = result;
    });
  }
  addMarche(newMarche: Marche) {
    this.marcheservice.Addmarche(newMarche).subscribe((result) => {
      this.chargeMarche();
      console.log(result);
      this.toast.success({detail:'Ajoute',summary:'Merci,ajout avec succes '+result.nom, sticky:true,position:'bl'})
    });
  }

  updateMarche(m: Marche) {
    this.marcheservice.Updatemarches(m).subscribe((result) => {
      this.chargeMarche()
      console.log(result)
      this.toast.success({detail:'Update',summary:'Mise a jour terminée id:'+result.id, sticky:true,position:'tr'})
    });
  }

  deleteMarche(m: Marche) {
    this.marcheservice.Deletemarches(m.id).subscribe((result) => {
      this.chargeMarche()
      console.log(result)
      this.toast.success({detail:'suppression',summary:'suppression de '+result.nom ,sticky:true,position:'br'})
    });
  }

  /**
   * @author BODJONA
   */
  OpenDialog(
    action: any,
    enteranimation: any,
    exitanimation: any,
    marche: any
  ) {
    const dialogRef = this.dialog.open(DialogBoxComponent, {
      enterAnimationDuration: enteranimation,
      exitAnimationDuration: exitanimation,
      width: '50%',
      data: {
        marche: marche,
        action: action,
      },
    });

    dialogRef.afterClosed().subscribe((result) => {
      console.log('dialog:' + result.event);
      if (result.event == 'Ajouter') {
        this.addMarche(result.marche);
      }
      if (result.event == 'Editer') {
        this.updateMarche(result.marche);
      }
      if (result.event == 'Supprimer') {
        this.deleteMarche(result.marche);
      }
    });
  }
}
