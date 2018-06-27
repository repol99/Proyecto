import { Component } from '@angular/core';
import { Http, Response} from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
    title = 'Productos';
    ID = '';
    description = '';
    price = '';

     constructor(private http: Http) {}

     searchIndicator() {
       this.http.get('http://localhost:8080/app/product/' + this.ID)
       .subscribe(
           (res: Response) => {
             const datos = res.json();
             console.log(datos);
             this.description = datos['description'];
             this.price = datos['price'];
          
           }, err => {
             console.log('UPS!');
             console.log(err);
           }, () => {
             console.log('¡Servicio Finalizado!');
            
           }
       );
     }


}
