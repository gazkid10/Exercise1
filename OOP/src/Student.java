public class Student extends Members{
    private int graduationYear;
    private double gpa;
    private String programOfStudy;
    private String extracurricularActivity;

    public Student(String firstname, String lastname, String occupation, String sex, String birthMonth, int birthDay,
                   int birthYear, int graduationYear, double gpa, String programOfStudy, String extracurricularActivity) {
        super(firstname, lastname, occupation, sex, birthMonth, birthDay, birthYear);


        this.extracurricularActivity = extracurricularActivity;
        this.graduationYear = graduationYear;
        this.gpa = gpa;
        this.programOfStudy = programOfStudy;
    }
    @Override
    public  void printName() {
        System.out.println("Student Details:");
        super.printName();
        System.out.println("\tExpected Graduation: " + graduationYear);
        System.out.println("\tProgram of Study: " + programOfStudy);
        System.out.println("\tCurrent GPA: " + gpa);
        System.out.println("\tExtracurricular Activity: " + extracurricularActivity);

    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getProgramOfStudy() {
        return programOfStudy;
    }

    public void setProgramOfStudy(String programOfStudy) {
        this.programOfStudy = programOfStudy;
    }

    public String getExtracurricularActivity() {
        return extracurricularActivity;
    }

    public void setExtracurricularActivity(String extracurricularActivity) {
        this.extracurricularActivity = extracurricularActivity;
    }
}
