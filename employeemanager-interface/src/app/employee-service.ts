import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  private baseUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  public getEmployees(): Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.baseUrl}/employees`);
  }

  public getEmployeeById(id: number): Observable<Employee>{
    return this.http.get<Employee>(`${this.baseUrl}/employees/${id}`);
  }

  public addEmployee(employee: Employee): Observable<Employee>{
    return this.http.post<Employee>(`${this.baseUrl}/employees`, employee);
  }

  public updateEmployee(employee: Employee): Observable<Employee>{
    return this.http.put<Employee>(`${this.baseUrl}/employees`, employee);
  }

  public deleteEmployee(id: number): Observable<void>{
    return this.http.delete<void>(`${this.baseUrl}/employees/${id}`);
  }
}
