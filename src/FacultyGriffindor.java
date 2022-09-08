public class FacultyGriffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery; //  Гриффиндор

    public FacultyGriffindor(String firstName, String lastName, int magic, int transgressions, int nobility, int honor, int bravery) {
        super(firstName,lastName,magic,transgressions);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void compareStudentsGriffindor(FacultyGriffindor Student1,FacultyGriffindor Student2) {
        int powerStudent1 = Student1.getMagic() + Student1.getTransgressions() + Student1.bravery + Student1.honor + Student1.nobility;
        int powerStudent2 = Student2.getMagic() + Student2.getTransgressions() + Student2.bravery + Student2.honor + Student2.nobility;
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
        return "Факультет Гриффиндор( Ученик: " + getLastName() + " " + getFirstName() + "; Магия - " + getMagic() +
                " ; Трансгрессия - " + getTransgressions() +" ; Благородство - " + nobility + " ; Честь - " + honor +
                " ; Храбрость -" + bravery + ")";
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            throw new RuntimeException("Неверное значение nobility");
        }
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            throw new RuntimeException("Неверное значение honor");
        }
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            throw new RuntimeException("Неверное значение bravery");
        }
        this.bravery = bravery;
    }
}
