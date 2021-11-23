import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements
  OnChanges
  , OnInit
  , DoCheck
  , AfterContentInit
  , AfterContentChecked
  , AfterViewInit
  , AfterViewChecked
  , OnDestroy {

  logs = [];

  logIt(...message: any[]) {
    this.logs = this.logs.concat(...message);
  }

  constructor() {
    this.logIt("0. Constructor called!");
  }
  
  ngOnChanges(changes: SimpleChanges): void {
    this.logIt("1. OnChanges called", changes);
  }

  ngOnInit(): void {
    this.logIt("2. OnInit called!");
  }

  ngDoCheck(): void {
    this.logIt("3. DoCheck called!");
  }
  
  ngAfterContentInit(): void {
    this.logIt("4. AfterContentInit called!");
  }

  ngAfterContentChecked(): void {
    this.logIt("5. AfterContentChecked called!");
  }

  ngAfterViewInit(): void {
    this.logIt("6. AfterViewInit called!");
  }

  ngAfterViewChecked(): void {
    this.logIt("7. AfterViewChecked called!");
  }

  ngOnDestroy(): void {
    this.logIt("8. OnDestroy called!");
  }
}
