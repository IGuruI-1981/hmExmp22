public class FacultyRavenclaw extends Hogwarts{
    private int smartness;
    private int wisdom;
    private int wit;
    private int creativity;
     //  Когтевран

    public FacultyRavenclaw(String firstName, String lastName, int magic, int transgressions, int smartness, int wisdom, int wit, int creativity) {
        super(firstName,lastName,magic,transgressions);
        this.smartness = smartness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;

    }

    public static void compareStudentsRavenclaw(FacultyRavenclaw Student1,FacultyRavenclaw Student2) {
        int powerStudent1 = Student1.getMagic() + Student1.getTransgressions() + Student1.smartness + Student1.wisdom
                + Student1.wit + Student1.creativity;
        int powerStudent2 = Student2.getMagic() + Student2.getTransgressions() + Student2.smartness + Student2.wisdom
                + Student2.wit + Student2.creativity;
        if (powerStudent1 > powerStudent2) {
            System.out.println("Сила "+Student1.getLastName() + " " + Student1.getFirstName() + " =" + powerStudent1);
            System.out.println("Сила "+Student2.getLastName() + " " + Student2.getFirstName() + " =" + powerStudent2);
            System.out.println(Student1.getLastName() + " " + Student1.getFirstName() + " сильнее чем " +
                    Student2.getLastName() + " " + Student2.getFirstName());
        } else if (powerStudent2 > powerStudent1) {
            System.out.println("Сила "+Student1.getLastName() + " " + Student1.getFirstName() + " =" + powerStudent1);
            System.out.println("Сила "+Student2.getLastName() + " " + Student2.getFirstName() + " =" + powerStudent2);
            System.out.println(Student2.getLastName() + " " + Student2.getFirstName() + " сильнее чем " +
                    Student1.getLastName() + " " + Student1.getFirstName());
        } else {
            System.out.println("Сила "+Student1.getLastName() + " " + Student1.getFirstName() + " =" + powerStudent1);
            System.out.println("Сила "+Student2.getLastName() + " " + Student2.getFirstName() + " =" + powerStudent2);
            System.out.println("Силы " + Student1.getLastName() + " " + Student1.getFirstName() + "и " +
                    Student2.getLastName() + " " + Student2.getFirstName() + " равны.");
        }
    }


    @Override
    public String toString() {
        return "Факультет Когтевран( Ученик: "+ getLastName() + " " + getFirstName() + "; Магия - " + getMagic() +
                " ; Трансгрессия - " + getTransgressions() +" ; Ум - " + smartness + " ; Мудрость - " + wisdom +
                " ; Остроумие -" + wit + " ; Творчество -" + creativity +")";
    }

    public int getSmartness() {
        return smartness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setSmartness(int smartness) {
        if (smartness < 0 || smartness > 100) {
            throw new RuntimeException("Неверное значение smartness");
        }
        this.smartness = smartness;
    }

    public void setWisdom(int wisdom) {
        if (wisdom < 0 || wisdom > 100) {
            throw new RuntimeException("Неверное значение wisdom");
        }
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        if (wit < 0 || wit > 100) {
            throw new RuntimeException("Неверное значение wit");
        }
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            throw new RuntimeException("Неверное значение creativity");
        }
        this.creativity = creativity;
    }
}
