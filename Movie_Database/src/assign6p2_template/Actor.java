package assign6p2_template;

public class Actor {

    //define data fields: first name, last name, birth date, birth city, birth state, birth country
    private String fName;
    private String lName;
    private String birthDate;
    private String birthCity;
    private String birthState;
    private String birthCountry;

    //define the constructor with all the given data:
    public Actor(String fName, String lName, String birthDate, String birthCity, String birthState, String birthCountry) {
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.birthState = birthState;
        this.birthCountry = birthCountry;
    }

    //define all the getters
    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public String getBirthState() {
        return birthState;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setFName(String newFName) {
        fName = newFName;
    }

    public void setLName(String newLName) {
        lName = newLName;
    }

    public void setBirthDate(String newBirthDate) {
        birthDate = newBirthDate;
    }

    public void setBirthCity(String newBirthCity) {
        birthCity = newBirthCity;
    }

    public void setBirthState(String newBirthState) {
        birthState = newBirthState;
    }

    public void setBirthCountry(String newBirthCountry) {
        birthCountry = newBirthCountry;
    }

    //define toString()
    @Override
    public String toString() {
        return "\n Actor's Name: " + fName + " " + lName + "\n Date of Birth: " + birthDate + "\n Birth City: " + birthCity + "\n Birth State: " + birthState + "\n Birth Country: " + birthCountry + "\n";
    }
}
