public class EmployeeWage {
    public static void main(String[] args) {
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int empHours = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case IS_PART_TIME:
                empHours = 4;
                break;
            case IS_FULL_TIME:
                empHours = 8;
                break;
            default:
                empHours = 0;
        }

        int wage = empHours * WAGE_PER_HOUR;
        System.out.println("Employee Wage: " + wage);
    }
}
