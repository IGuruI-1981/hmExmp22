public class Hogwarts {
    private String firstName;
    private String lastName;
    private int magic;
    private int transgressions;

    public Hogwarts(String firstName, String lastName, int magic, int transgressions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.magic = magic;
        this.transgressions = transgressions;
    }

    public static void getAllFacultyGriffindor(FacultyGriffindor[] griffindors) {
        System.out.println("Количество волшебников на факультете Грифиндор " + griffindors.length);
        for (int i = 0; i < griffindors.length; i++) {
            if (griffindors[i] != null) {
                System.out.println(griffindors[i]);
            }
        }
    }

    public static void getAllFacultySlytherin(FacultySlytherin[] slytherins) {
        System.out.println("Количество волшебников на факультете Грифиндор " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            if (slytherins[i] != null) {
                System.out.println(slytherins[i]);
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgressions() {
        return transgressions;
    }
}
