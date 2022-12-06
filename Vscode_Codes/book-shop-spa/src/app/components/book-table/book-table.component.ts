import { Component, OnInit } from '@angular/core';
import { BookDTO } from 'src/app/dtos/book.dto';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent implements OnInit{

  books : BookDTO[] = [];

  constructor( private service: BookService ) { } //Injeção de dependencia

  ngOnInit(): void{ //Inicialização
    this.service.findAllBooks()
      .subscribe({ //Faz o processamento da informação - 2 situações
        next: (data) => this.books = data //Retorna a informação - Array de books
        ,
        error: (e) => console.error( e ) //Dá erro
      });

  }
}
