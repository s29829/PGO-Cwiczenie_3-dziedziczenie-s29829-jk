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
//    private int salary;

    Year thisYear = Year.now();
    private int year = thisYear.getValue();


    public Employee(String firstName, String lastName, String address, String email, String idNumberPesel, int dateRecruitment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.idNumberPesel = idNumberPesel;
        this.dateRecruitment = dateRecruitment;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int calculateSalary() {
        int salary = 3000;
        salary = (numerOfYearsOfWork() * 1000) + salary;
        return salary;
    }

    public int numerOfYearsOfWork() {
        int numberOfYears = year - this.dateRecruitment;
        return numberOfYears;
    }
}
