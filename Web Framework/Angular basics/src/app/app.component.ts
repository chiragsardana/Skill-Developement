import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'todoList';
  name = 'Chirag Sardana';
  arr =['Iphone', 'by','SBK'];
  imageUrl = "https://interactive-examples.mdn.mozilla.net/media/cc0-images/grapefruit-slice-332-332.jpg";
  onSave(){
    alert("Clicked on Button!Why")
  }
}
