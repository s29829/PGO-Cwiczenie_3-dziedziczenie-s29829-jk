import java.util.Calendar;

public class Goal {
    private int yearOfGoal;
    private int montOfTheGoal;
    private int dayOfTheGoal;
    private int bonusGoal;
    private String nameGoal;
    private boolean statusRealizedGoal = false;
    private boolean statusGoalPaid = false;

    private int yearActual;
    private int monthActual;
    private int dayActual;

//         Goal g=new Goal(2010, 10, 15, "Implementing FB login", 1000);

    public Goal(int yearOfGoal, int montOfTheGoal, int dayOfTheGoal, String nameGoal, int bonusGoal) {
        this.yearOfGoal = yearOfGoal;
        this.montOfTheGoal = montOfTheGoal;
        this.dayOfTheGoal = dayOfTheGoal;
        this.nameGoal = nameGoal;
        this.bonusGoal = bonusGoal;
    }

    public int getBonusGoal() {
        if (checkDateExpiredGoal()) {

//            System.out.println("Date expired " + checkDateExpiredGoal() + "Status Goal:" + statusGoalPaid + " !" + !statusRealizedGoal);
            return bonusGoal;
        }

//        System.out.println("Bonus Goal: " + bonusGoal);
//        int (bonusGoal == 0)
        return 0;
    }

    public void setDate() {
        Calendar calendar = Calendar.getInstance();
        this.yearActual = calendar.get(Calendar.YEAR);
        this.monthActual = calendar.get(Calendar.MONTH) + 1;
        this.dayActual = calendar.get(Calendar.DAY_OF_MONTH);
    }


    public boolean checkDateExpiredGoal() {
        setDate();
        if (yearActual > yearOfGoal) {
            return true;
        }

        if ((yearActual >= yearOfGoal) && (monthActual > montOfTheGoal)) {
            return true;
        }

        if ((yearActual >= yearOfGoal) && (monthActual >= montOfTheGoal) && (dayActual > dayOfTheGoal)) {
            System.out.println("Data is ok");
            return true;
        }

        return false;
    }
}
