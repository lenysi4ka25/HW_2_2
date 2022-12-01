import java.time.Year;
import java.util.OptionalInt;

public class Human {

    String name;
    private String city;
    int age;
    private int birthYear;
    String post;

    Human(String name, String city, int age, String post) {

        if (age > 0) {
            this.birthYear = Year.now().getValue() - age;
        }else {
            this.birthYear = 0;
        }
        if (name == null) {
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if (city == null) {
            this.city = "Информация не указана";
        }else {
            this.city = city;
        }
        if (post == null) {
            this.post = "Информация не указана";
        }else {
            this.post = post;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                " Я из города: " + getCity() +
                ". Я родился в " + (getBirthYear() - age) +
                " году. Я работаю на должности " + post + ". Будем знакомы!";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty() && !city.isBlank()) {
            this.city = city;
     } else {
        this.city = "Информация не указана";
    }
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear < 0) {
            this.birthYear = Year.now().getValue() - age;
        } else {
            this.birthYear = birthYear;
        }
    }
}


