/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salarycalculation;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class SalaryCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Scanner digite = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
        
        System.out.print("Enter department's names: ");
        String departmentName = digite.nextLine();
        System.out.println("Entre worker data: ");
        System.out.print("Name: ");
        String workerName = digite.nextLine();
        System.out.print("Level: ");
        String workerLevel = digite.nextLine();
        System.out.print("Base salary: ");
        double workerBaseSalary = digite.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));
       
        System.out.print("How many contracts to this worker? ");
        int workerContracts = digite.nextInt();
        
        for(int i = 0; i<workerContracts;i++){
            System.out.println("Enter Contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(digite.next());
            System.out.print("Value per hour: ");
            double valuerPerHour = digite.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = digite.nextInt();
            HourContract contract = new HourContract(contractDate, valuerPerHour, hours);
            worker.addContract(contract);
        }
        System.out.println("");
        System.out.print("Entre month and year to calculate income (MM/YYYY): ");
        String monthAndYear = digite.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartment().getName());
        System.out.println("Icome for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)) );
        
        
        
        digite.close();
    }
    
}
