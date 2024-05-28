import java.util.ArrayList;

public class Developer extends Employee {

    ArrayList<Technology> technology = new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, String idNumberPesel, int dateRecruitment) {
        super(firstName, lastName, address, email, idNumberPesel, dateRecruitment);
//
//        calculateSalary()
    }


    public void addTechnology(Technology t) {
        technology.add(t);
    }

    public int calculateSalary() {
        int salary = super.calculateSalary() + calculateTechnologies() ;
        System.out.println("Salary developer "+getFirstName()+ " "+getLastName()+ ": " + salary);
        return super.calculateSalary() + calculateTechnologies();

    }

    private int calculateTechnologies() {
        int totalTechnologies = 0;
        for (Technology technology : technology) {
            totalTechnologies += technology.salaryTech;
        }
        return totalTechnologies;
    }
}
