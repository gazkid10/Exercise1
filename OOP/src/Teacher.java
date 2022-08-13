public class Teacher extends Members{

    private String subjectTeach;

    public Teacher(String firstname, String lastname, String occupation, String gender,
                   String birthMonth, int birthDay, int birthYear, String subjectTeach) {
        super(firstname, lastname, occupation, gender, birthMonth, birthDay, birthYear);

        this.subjectTeach = subjectTeach;
    }
    public Teacher() {
        super();
    }
    public  void printName() {
        System.out.println("Teacher Details:");
        super.printName();
        System.out.println("\tTeach: " + subjectTeach);
    }
    void subjectTeach() {
    }
    public String getSubjectTeach() {
        return subjectTeach;
    }

    public void setSubjectTeach(String subjectTeach) {
        this.subjectTeach = subjectTeach;
    }


}
