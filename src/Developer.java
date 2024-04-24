import java.util.ArrayList;

public class Developer extends Employee {

    ArrayList<Technology> technology = new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, String idNumberPesel, int dateRecruitment) {
        super(firstName, lastName, address, email, idNumberPesel, dateRecruitment);
        this.technology = technology;
    }


    public void addTechnology(Technology t) {
        technology.add(t);
    }

    public int calculateSalary() {
        int salary = super.calculateSalary();
        System.out.println("Dev calc" + salary + " // " + calculateTechnologies());
        return salary;

    }

    private int calculateTechnologies() {
        int totalTechnologies = 0;
        for (Technology technology : technology) {
            totalTechnologies += technology.salaryTech;
            System.out.println("Technology: " + technology.nameTech + " // " + technology.salaryTech);
        }
        return totalTechnologies;
    }
}
