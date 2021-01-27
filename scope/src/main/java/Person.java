public class Person {
    static String name = "UNKNOWN";
    String instanceName = "UNKNOWN";
    String age  = "25";

    public Person() {

    }

    public Person(String age) {
        name = "BORIS";
        this.age = age;
    }

    public Person(String name, String age) {
        this.instanceName = Person.name = name;
        this.age = age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String toString() {
        return instanceName + " is " + age + " years old (" +
                getAgeGroupClassification() + ", " + getDecade(Integer.parseInt(this.age)) + ")";
    }

    public String getAgeGroupClassification() {
        String ageClassification = "GenY";
        int age = Integer.parseInt(this.age);

        if (age >= 95) {
            ageClassification = "The Greatest Generation";
        } else if (age >= 75) {
            ageClassification = "The Silent Generation";
        } else if (age >= 55) {
            ageClassification = "Baby Boomer";
        } else if (age >= 40) {
            ageClassification = "GenX";
        } else if (age >= 20) {
            ageClassification = "Millenial";
            String ageType = "";
            if (age >= 21) {
                ageType = "Voting ";
                ageClassification = ageType + ageClassification;
            }
        }

        return ageClassification;
    }

    public String getDecade(int age) {
        String decadeString = "";
        int decadeNumber = age / 10;
        int j = 0;
        for (int i = j = 0; i < (decadeNumber + 1); i++, j++) {
            String decade = "Decade " + (age / 10);
            if (i == (decadeNumber)) {
                decadeString = decade;
            }
        }
        int modyear = age % 10;
        decadeString += ", Year " + modyear;
        return decadeString;
    }
}
