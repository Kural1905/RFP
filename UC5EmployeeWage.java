public class EmployeeWage {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int WORKING_DAYS = 20;
        int FULL_DAY_HOUR = 8;

        int monthlyWage = WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAYS;
        System.out.println("Monthly Wage: " + monthlyWage);
    }
}
