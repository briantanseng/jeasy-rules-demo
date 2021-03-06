package jeasy.rules;

public class Person {

    public static final int ADULT_AGE = 18;

    private String name;
    private int age;
    private boolean isAdult;

    public String getAlcoholEligibility() {
        return alcoholEligibility;
    }

    public void setAlcoholEligibility(String alcoholEligibility) {
        this.alcoholEligibility = alcoholEligibility;
    }

    private String alcoholEligibility;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }
}
