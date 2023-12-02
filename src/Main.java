public class Main {

    public static void main(String[] args) {
        Student studentA = new Student("Paweł", "Malinowski", 2018, 3.5, "physics");
        Student studentB = new Student("Michał", "Grzybiarz", 2022, 4.0, "math");

        double studentAYearOfGraduate = studentA.graduateYearInc();
        System.out.println(studentAYearOfGraduate);



    }

}
