import javax.swing.*;
import java.util.*;
public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage progrsm");
        int present = 1;
        double employe_check = Math.floor(Math.random() * 10) % 2;
        if (employe_check == present) {
            System.out.println("Employe is present" );
        } else {
            System.out.println("Employee is absent" );
        }
    }
}
