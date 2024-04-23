public class Employee {
    public String firstName;
    public String lastName;
    public String city;
    public String email;
    public String idNumberPesel;

    public int dateBirth;
    public double salary;

    //         Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);


    public Employee(String firstName, String lastName, String city, String email, String idNumberPesel, int dateBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.email = email;
        this.idNumberPesel = idNumberPesel;
        this.dateBirth = dateBirth;
    }

    //
    public int calculateSalary() {
        int salary = 666;
//        this salary = salary + salary;
        return salary;
    }
}
