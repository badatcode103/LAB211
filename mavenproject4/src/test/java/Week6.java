
import Week6.ContactManagement;
import Week6.WorkerManagement;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class Week6 {

    static WorkerManagement worker = new WorkerManagement();
    static ContactManagement contact = new ContactManagement();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        
        int option;
        while (true) {
            option = Menu.menuWeek6();
            sc.nextLine();
            switch (option) {
                case 1 -> {
                    workerRun();
                    break;
                }
                case 2 -> {
                    contactRun();
                    break;
                }
                case 3 -> {
                    System.exit(0);
                }
            }
        }
    }

    static void workerRun() {
        int option;
        while (true) {
            option = Menu.menuWorkerWeek6();
            sc.nextLine();
            switch (option) {
                case 1 -> {
                    worker.addWorker(sc);
                    break;
                }
                case 2 -> {
                    worker.adjustSalary(sc);
                    break;
                }
                case 3 -> {
                    worker.displayInfo();
                    break;
                }
                case 4 -> {
                    return;
                }
            }
        }
    }
    
    static void contactRun(){
        int option;
        while (true) {
            option = Menu.menuContactWeek6();
            switch (option) {
                case 1 -> {
                    contact.addContact(sc);
                    break;
                }
                case 2 -> {
                    contact.displayContact();
                    break;
                }
                case 3 -> {
                    contact.deleteContact(sc);
                    break;
                }
                case 4 -> {
                    return;
                }
            }
        }
    }

}
