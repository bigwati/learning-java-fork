import java.util.Scanner;

public class Main {

    public static double salary(double workedHours,double hourSalary){
        return workedHours*hourSalary;
    }
    public static double vacationDays(double workedHours){
        return Math.ceil(workedHours/8);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats is your hour salary?");
        double hourSalary = input.nextDouble();
        System.out.println("How many hours did you work?");
        double workedHours = input.nextDouble();

        System.out.println("Your salary is: "+salary(workedHours,hourSalary));
        System.out.println("You have " + vacationDays(workedHours) + " vacation days");
    }

}
