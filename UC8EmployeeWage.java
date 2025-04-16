public class EmployeeWage {

    public static int computeWage(String company, int wagePerHour, int maxDays, int maxHours) {
        int totalEmpHours = 0, totalWorkingDays = 0;

        while (totalEmpHours <= maxHours && totalWorkingDays < maxDays) {
            totalWorkingDays++;
            int empHours = (int) Math.floor(Math.random() * 10) % 3 == 1 ? 8 : 4;
            totalEmpHours += empHours;
        }

        int totalWage = totalEmpHours * wagePerHour;
        System.out.println("Total Wage for " + company + ": " + totalWage);
        return totalWage;
    }

    public static void main(String[] args) {
        computeWage("TCS", 20, 20, 100);
        computeWage("Infosys", 25, 22, 120);
    }
}
