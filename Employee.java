import javax.swing.*;
import java.util.*;
public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage progrsm");
        int present = 1;
        int Emp_rate = 20;
        int Emp_hour = 0;
        int Emp_wage = 0;
        int part_time = 2;
        double employe_check = Math.floor(Math.random() * 10) % 3;
        if (employe_check == present) {
            System.out.println("Employe is present" );
            Emp_hour = 8;
        }
        else if(part_time == employe_check){
            System.out.println("Employee is Part time");
            Emp_hour = 4;
        }
        else {
            System.out.println("Employee is absent" );
            Emp_hour = 0;
        }
        Emp_wage = Emp_hour * Emp_rate;
        System.out.println("Emp_Wage : "+ Emp_wage);
    }
}
