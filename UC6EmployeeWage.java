public class EmployeeWage {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int MAX_WORKING_DAYS = 20;
        int MAX_WORKING_HOURS = 100;
        int totalEmpHours = 0, totalWorkingDays = 0;

        while (totalEmpHours <= MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
            int empHours = (int) Math.floor(Math.random() * 10) % 3 == 1 ? 8 : 4;
            totalEmpHours += empHours;
        }

        int totalWage = totalEmpHours * WAGE_PER_HOUR;
        System.out.println("Total Employee Wage: " + totalWage);
    }
}
