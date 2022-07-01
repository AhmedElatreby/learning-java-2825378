<<<<<<< HEAD
public class Main {

    public static void main(String[] args) {
        
=======
package src;

public class Main {

    public static double employSalary(double numberOfHours,
                                      double hourlyRate,
                                      double vacationDays){
        if (numberOfHours < 0) {
            System.out.println("number of hours cannot be under 1");
            return 0;
        }

        if (hourlyRate < 0) {
            System.out.println("hourly rate cannot be under 1");
            return 0;
        }
        double weeklyPayCheck = numberOfHours * hourlyRate;
        double unpaidTime = hourlyRate * vacationDays * 8;
        return (weeklyPayCheck * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        double totalIncomePerYear = employSalary(40,15,8);
        System.out.println("Total salary per year " + totalIncomePerYear);
>>>>>>> origin/06_03b
    }

}
