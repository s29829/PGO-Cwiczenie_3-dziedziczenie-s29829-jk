public class Employee {
    public String fname;
    public String lname;
    public String city;
    public String email;
    public String pesel;

    public int dateofbirth;
    public double salary;

    //         Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);


    public Employee(String fname, String lname, String city, String email, String pesel, int dateofbirth) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.email = email;
        this.pesel = pesel;
        this.dateofbirth = dateofbirth;
    }

    //
    public int calculateSalary() {
        int salary = 666;
//        this salary = salary + salary;
        return salary;
    }
}
