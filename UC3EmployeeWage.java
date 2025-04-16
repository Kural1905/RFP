public class EmployeeWage {
    public static void main(String[] args) {
        int IS_PART_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int empHours = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_PART_TIME) {
            empHours = 8;
            System.out.println("Employee is Part Time");
        } else {
            empHours = 0;
            System.out.println("Employee is Absent");
        }

        int wage = empHours * WAGE_PER_HOUR;
        System.out.println("Wage: " + wage);
    }
}
