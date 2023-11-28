import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        String question = "which is the smaller number";
        String choiceOne = "800";
        String choiceTwo = "700";
        String choiceThree = "4663";

        System.out.println(question);
        System.out.println("1. "+choiceOne +" or 2. "+choiceTwo+" or 3. "+ choiceThree);

        Scanner input = new Scanner(System.in);
        String uInput = input.next();

        while(!uInput.equals("2")){
            System.out.println("incorrect; try again");
            uInput = input.next();
        }

        System.out.println("correct");
    }

}
