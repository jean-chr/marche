import { Injectable } from '@angular/core';
import { Marche } from '../model/marche';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { catchError, retry, throwError } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders( {'Content-Type': 'application/json'} )
};


@Injectable({
  providedIn: 'root'
})
export class MarcheService {
  apiURL: string = 'http://localhost:8080/api/marche';

  constructor(private http : HttpClient) {}

  Listmarches():Observable<Marche[]>{
    return this.http.get<Marche[]>(this.apiURL,httpOptions)
    .pipe(retry(2))
  }

  Addmarche(m:Marche):Observable<Marche>{
    return this.http.post<Marche>(this.apiURL+'/', JSON.stringify(m), httpOptions)
    .pipe(
      retry(2),
    )
  }

  Deletemarches(id:number ){
    const url = this.apiURL+"/"+id;
    return this.http.delete<Marche>(url,httpOptions)
    .pipe(
      retry(1),

    )
  }


  Updatemarches(m:Marche):Observable<Marche> {
    return this.http.put<Marche>(this.apiURL+"/"+m.id,JSON.stringify(m), httpOptions) .pipe(
      retry(1),
    )
  }

  Onemarche(id: number): Observable<Marche> {
    const url = this.apiURL+"/"+id;
    return this.http.get<Marche>(url) .pipe(
      retry(2),
    )
  }


  handleError(error: HttpErrorResponse){
    let errormessage = ''
    if (error.error  instanceof ErrorEvent) {
      errormessage = error.error.message
    } else {
      errormessage = "  error status "+error.status +" message :"+ error.message
    }
    alert(errormessage);

  }

}
