/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

import Week1.Validate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class WorkerManagement {

    ArrayList<Worker> workerList = new ArrayList<>();
    ArrayList<Worker> salaryAdjustmentList = new ArrayList<>();

    public void addWorker(Scanner sc) {
        System.out.println("----- Add Worker -----");
        System.out.print("Enter code: ");
        String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        String age = sc.nextLine();
        System.out.print("Enter work location: ");
        String location = sc.nextLine();
        System.out.print("Enter salary: ");
        String salary = sc.nextLine();
        Worker worker = new Worker(id, name, age, salary, location);
        Validate.validateWorker(worker, sc);
        workerList.add(worker);
        System.out.println("Add a worker successfully.");
    }

    public void adjustSalary(Scanner sc) {
        System.out.println("----- UP/DOWN salary -----");
        System.out.print("Enter worker code: ");
        String id = sc.nextLine();
        boolean found = false;
        for (Worker worker : workerList) {
            if (id.equals(worker.getId())) {
                found = true;
                System.out.print("Enter new salary: ");
                String newSalary = sc.nextLine();
                SalaryInfo salaryInfo = new SalaryInfo("", newSalary, LocalDate.now());
                Validate.validateAdjustment(worker, salaryInfo, sc);
                worker.setSalary(newSalary);
                worker.setSalaryInfo(salaryInfo);
                Worker worker1 = new Worker(worker.getId(), worker.getName(), worker.getAge(), worker.getSalary(),worker.getWorkLocation(),worker.getSalaryInfo());
                salaryAdjustmentList.add(worker1);
                System.out.println("Adjust salary successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Worker ID not found.");
        }
    }

    public void displayInfo() {
        if (salaryAdjustmentList.isEmpty()) {
            for (Worker worker : workerList) {
                System.out.println(worker.toString());
            }
            return;
        }
        for (Worker worker : workerList) {
            String id = worker.getId();
            for (Worker worKer : salaryAdjustmentList) {
                if (worKer.getId().equals(id)) {
                    System.out.println(worKer.toString1());
                }
            }
        }
    }

}
