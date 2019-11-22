import java.io.Serializable;

public class Passenger implements Serializable {
    public int age;
    private String firstName;        //do I make these private or public?
    private String lastName;

    Passenger(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
