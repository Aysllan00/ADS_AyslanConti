import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { BookDTO } from '../dtos/book.dto';


@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private client: HttpClient) { }

  public findAllBooks(): Observable<BookDTO[]>  { //Observabel so instancia e manda, não faz o processamento pra mostrar (Como discar uma n° de celular e não apertar para ligar)
    return this.client.get<BookDTO[]>('http://localhost:8081/book');
    }


}
