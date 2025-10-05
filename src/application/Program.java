package application;

import entities.JuridicPerson;
import entities.Person;
import entities.PhysicsPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Person> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (1 + i) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char individualOrCompany = sc.next().toLowerCase().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double income = sc.nextDouble();

            sc.nextLine();

            if (individualOrCompany == 'i'){
                System.out.print("Health expenditures: ");
                Double healthSpending = sc.nextDouble();

                list.add(new PhysicsPerson(name, income, healthSpending));
            } else {
                System.out.print("Number of employees: ");
                int employeeNumber = sc.nextInt();

                list.add(new JuridicPerson(name, income, employeeNumber));
            }
        }

        double total = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Person x : list){
            double tax = x.tax();
            System.out.printf(x.getName() + ": $ %.2f%n", tax);
            total += tax;
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", total);



        sc.close();

    }
}