import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        Account account1 = new Account("01324", "Bushra", 5000);
        Account account2 = new Account("01232", "Amal", 3000);

        Employee employee1 = new Employee("010", "Bushra", 3000);
        Employee employee2 = new Employee("021", "Abdalaziz", 4000);
        Employee employee3 = new Employee("038", "Shouq", 5000);
        Employee employee4 = new Employee("045", "Khaled", 2500);

        while (running) {
            System.out.println("**************************************************");
            System.out.println("          Choose the class to test:");
            System.out.println("          1. Account");
            System.out.println("          2. Employee");
            System.out.println("          3. Exit");
            System.out.println("**************************************************");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Testing Account class...");
                System.out.println("**************************************************");

                System.out.println("Test Case 1: Credit with a positive amount");
                account1.credit(100);

                System.out.println("\nTest Case 2: Credit with zero amount");
                account1.credit(0);

                System.out.println("\nTest Case 3: Credit with negative amount");
                account1.credit(-50);

                System.out.println("\nTest Case 4: Debit with valid amount");
                account1.debit(200);

                System.out.println("\nTest Case 5: Transfer valid amount");
                account1.transferTo(account2, 150);

                System.out.println("\nFinal state of accounts:");
                System.out.println(account1);
                System.out.println(account2);

            } else if (choice == 2) {
                System.out.println("Testing Employee class...");
                System.out.println("**************************************************");

                System.out.println("Employee details:");
                System.out.println(employee1);
                System.out.println("Annual Salary of " + employee1.getName() + ": " + employee1.getAnnualSalary());

                System.out.println(employee2);
                System.out.println("Annual Salary of " + employee2.getName() + ": " + employee2.getAnnualSalary());

                System.out.println(employee3);
                System.out.println("Annual Salary of " + employee3.getName() + ": " + employee3.getAnnualSalary());

                employee4.setSalary(2500);
                System.out.println(employee4);
                System.out.println("Annual Salary of " + employee4.getName() + ": " + employee4.getAnnualSalary());

                System.out.println("\nRaising salaries:");
                double newSalary1 = employee1.raisedSalary(10);
                System.out.println("New salary of " + employee1.getName() + ": " + newSalary1);

                double newSalary2 = employee2.raisedSalary(15);
                System.out.println("New salary of " + employee2.getName() + ": " + newSalary2);

                double newSalary3 = employee3.raisedSalary(5);
                System.out.println("New salary of " + employee3.getName() + ": " + newSalary3);

                System.out.println("\nUpdated Employee details:");
                System.out.println(employee1);
                System.out.println(employee2);
                System.out.println(employee3);

            } else if (choice == 3) {
                running = false;
                System.out.println("Exiting the program...");
            } else {
                System.out.println("Invalid choice, please select again.");
            }
        }

        
    }
}
