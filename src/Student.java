public class Student {

    String name;
    String lastName;
    int yearOfGraduate;
    double gpa;
    String declaredMajor;

    public Student(String name, String lastName,
                   int yearOfGraduate, double gpa,
                   String declaredMajor) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfGraduate = yearOfGraduate;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public int graduateYearInc() {
        this.yearOfGraduate=this.yearOfGraduate+1;
        return this.yearOfGraduate;
    }
}
