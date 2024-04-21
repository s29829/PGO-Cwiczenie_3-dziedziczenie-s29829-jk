public class Employee {
    public String name;
    public String fname;
    public String lname;
    public String city;
    public String email;
    public String pesel;

    public int dateofbirth;
    public int age;
    public double salary;

    public Employee(String name, String fname, String city, String email, String pesel, int dateofbirth) {
        this.name = name;
        this.fname = fname;
        this.city = city;
        this.email = email;
        this.pesel = pesel;
        this.dateofbirth = dateofbirth;
    }

    //         Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
    //
    public int calculateSalary() {
        int salary = 0;
        return salary;
    }
}
