public class Members {
    private String firstname;
    private String lastname;
    private String occupation;
    private String gender;
    private String birthMonth;
    private int birthDay;
    private int birthYear;

    public Members(String firstname, String lastname, String occupation, String gender,
                  String birthMonth, int birthDay, int birthYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.occupation = occupation;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }
    public Members() {

    }
    public void printName() {
        System.out.println("\tName: "+firstname + " " + lastname);
    }
    public void dateofbirth() {
        System.out.println("\tDate of Birth: " + birthMonth + " " + birthDay + ", " + birthYear);
    }
    public void Occupation() {
        System.out.println("\tOccupation: " + occupation);
    }
    public void gender() {
        System.out.println("\tGender: " + gender);
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
