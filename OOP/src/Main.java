public class Main {
    public static void main(String[] args) {
        Teacher dania = new Teacher("Dania", "Phillips","Professor", "female", "December", 24, 1991,"Physics");
        dania.printName();
        dania.Occupation();
        dania.subjectTeach();

        Student andre = new Student("Andre", "Hamilton", "student","Male", "February", 22, 2002, 2024, 3.5, "Electrical Engineering","football");
        andre.printName();
        andre.dateofbirth();
        andre.gender();
    }

}
