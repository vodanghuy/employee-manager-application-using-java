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
export class App implements OnInit{
  public employees: Employee[] = [];

  constructor(public employeeService: EmployeeService) {}

  ngOnInit(): void{
    this.getEmployees();
  }

  public getEmployees() {
    this.employeeService.getEmployees().subscribe(
      (response: Employee[]) => {
        this.employees = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }
}
