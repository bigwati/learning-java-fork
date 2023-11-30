import java.util.Scanner;

public class Main {
    public static void teaTime() {
        System.out.println("Waiting for tea time...");
        System.out.println("Type and enter to start tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's tea time");
    }
    public static void main(String[] args) {
        System.out.println("welcome to new job");
        teaTime();
        System.out.println("write code");
        System.out.println("review code");
        teaTime();
        System.out.println("promotion");
    }

}
