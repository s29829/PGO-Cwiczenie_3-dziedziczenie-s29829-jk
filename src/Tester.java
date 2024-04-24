public class Tester extends Employee{
    String testerType;

    public Tester(String firstName, String lastName, String city, String email, String idNumberPesel, int dateBirth) {
        super(firstName, lastName, city, email, idNumberPesel, dateBirth);
    }


    public void addTestType(String testerType) {
        this.testerType = testerType;
    }
}
