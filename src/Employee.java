import java.time.Year;

public class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String idNumberPesel;
    private String phone;
    private int dateBirth;
    private int dateRecruitment;
    private double salary;

    Year thisYear = Year.now();
    private int year = thisYear.getValue();

//         Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);


    public Employee(String firstName, String lastName, String address, String email, String idNumberPesel, int dateRecruitment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.idNumberPesel = idNumberPesel;
        this.dateRecruitment = dateRecruitment;
    }

    //
    public int calculateSalary() {
        int salary = 3000;
        this.salary = (numerOfYearsOfWork() * 1000) + salary;
        System.out.println(this.salary + " // " + salary);
        return salary;
    }

    public int numerOfYearsOfWork() {
        int numberOfYears = year - this.dateRecruitment;
        System.out.println(year + " / / " + this.dateRecruitment);
        return numberOfYears;
    }
}
