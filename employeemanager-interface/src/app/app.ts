import { Component, OnInit, signal } from '@angular/core';
import { Employee } from './employee';
import { EmployeeService } from './employee-service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  
}
