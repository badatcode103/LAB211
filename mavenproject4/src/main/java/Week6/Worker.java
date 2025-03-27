/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author ASUS
 */
public class Worker {
    
    private String id, name, age,salary, workLocation;
    private SalaryInfo salaryInfo;
    
    public Worker(String id, String name, String age,String salary, String workLocation, SalaryInfo salaryInfo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.salaryInfo = salaryInfo;
    }
    
    public Worker(String id, String name, String age,String salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.salaryInfo = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public SalaryInfo getSalaryInfo() {
        return salaryInfo;
    }

    public void setSalaryInfo(SalaryInfo salaryInfo) {
        this.salaryInfo = salaryInfo;
    }
    
    

    @Override
    public String toString() {
          return String.format("%-5s %-10s %-5s %-7s %-6s %-10s", 
                     id, name, age, salary, 
                     salaryInfo != null ? salaryInfo.getStatus() : "N/A", 
                     salaryInfo != null ? salaryInfo.getDate() : "N/A");
    }
    
    public String toString1() {
          return String.format("%-5s %-10s %-5s %-7s %-6s %-10s", 
                     id, name, age, salaryInfo.getSalary(), 
                     salaryInfo != null ? salaryInfo.getStatus() : "N/A", 
                     salaryInfo != null ? salaryInfo.getDate() : "N/A");
    }
    
    
    
}
