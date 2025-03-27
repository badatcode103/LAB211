/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class SalaryInfo {
    private String status, salary;
    private LocalDate date;

    public SalaryInfo(String status, String salary, LocalDate date) {
        this.status = status;
        this.salary = salary;
        this.date = date;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public String getSalary() {
        return salary;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    
    
}
