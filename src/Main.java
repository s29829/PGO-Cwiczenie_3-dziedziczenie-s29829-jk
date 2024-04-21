import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// https://github.com/s29829/PGO-Cwiczenie_3-dziedziczenie-s29829-jk.git
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("PGO-Cwiczenie_3-dziedziczenie-s29829-jk");
        System.out.println("______________________________________________________");


        // Import from PDF document
        ArrayList<Employee> employees = new ArrayList<>();
// Creating and adding developers
        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        Technology t=new Technology("Java", 800);
        dev.addTechnology(t);
        employees.add(dev);
// Creating and adding testers
        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        tester.addTestType("UI/UX");
        employees.add(tester);
// Creating and adding a manager
        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal g=new Goal(2010, 10, 15, "Implementing FB login", 1000);
        manager.addGoals(g);
        employees.add(manager);
// Calculating total amount to be paid
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");

    }
}