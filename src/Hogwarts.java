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

    public static void compareStudentsHogwards(Hogwarts Student1,Hogwarts Student2) {
            int powerStudent1 = Student1.magic + Student1.transgressions;
            int powerStudent2 = Student2.magic + Student2.transgressions;
        if (powerStudent1 > powerStudent2) {
            System.out.println("Сила "+Student1.lastName + " " + Student1.firstName + " =" + powerStudent1);
            System.out.println("Сила "+Student2.lastName + " " + Student2.firstName + " =" + powerStudent2);
            System.out.println(Student1.lastName + " " + Student1.firstName + " сильнее чем " +
                    Student2.lastName + " " + Student2.firstName);
        } else if (powerStudent2 > powerStudent1) {
            System.out.println("Сила "+Student1.lastName + " " + Student1.firstName + " =" + powerStudent1);
            System.out.println("Сила "+Student2.lastName + " " + Student2.firstName + " =" + powerStudent2);
            System.out.println(Student2.lastName + " " + Student2.firstName + " сильнее чем " +
                    Student1.lastName + " " + Student1.firstName);
        } else {
            System.out.println("Сила "+Student1.lastName + " " + Student1.firstName + " =" + powerStudent1);
            System.out.println("Сила "+Student2.lastName + " " + Student2.firstName + " =" + powerStudent2);
            System.out.println("Силы " + Student1.lastName + " " + Student1.firstName + "и " +
                    Student2.lastName + " " + Student2.firstName + " равны.");
        }
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
        System.out.println("Количество волшебников на факультете Слизерен " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            if (slytherins[i] != null) {
                System.out.println(slytherins[i]);
            }
        }
    }

    public static void getAllFacultyHufflepuff(FacultyHufflepuff[] hufflepuffs) {
        System.out.println("Количество волшебников на факультете Пуффендуй " + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            if (hufflepuffs[i] != null) {
                System.out.println(hufflepuffs[i]);
            }
        }
    }

    public static void getAllFacultyRavenclaw(FacultyRavenclaw[] ravenclaws) {
        System.out.println("Количество волшебников на факультете Когтевран " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            if (ravenclaws[i] != null) {
                System.out.println(ravenclaws[i]);
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

    public void setMagic(int magic) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Неверное значение magic");
        }
        this.magic = magic;
    }

    public void setTransgressions(int transgressions) {
        if (transgressions < 0 || transgressions >100) {
            throw new RuntimeException("Неверное значение transgressions");
        }
        this.transgressions = transgressions;
    }
}
