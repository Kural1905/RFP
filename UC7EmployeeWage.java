public class EmployeeWage {
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static int computeWage() {
        int totalEmpHours = 0, totalWorkingDays = 0;

        while (totalEmpHours <= MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
            int empHours = (int) Math.floor(Math.random() * 10) % 3 == 1 ? 8 : 4;
            totalEmpHours += empHours;
        }

        return totalEmpHours * WAGE_PER_HOUR;
    }

    public static void main(String[] args) {
        System.out.println("Total Wage: " + computeWage());
    }
}
