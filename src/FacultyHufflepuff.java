public class FacultyHufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty; //  Пуффендуй

    public FacultyHufflepuff(String firstName, String lastName, int magic, int transgressions, int diligence, int loyalty, int honesty) {
        super(firstName,lastName,magic,transgressions);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void compareStudentsHufflepuff(FacultyHufflepuff Student1,FacultyHufflepuff Student2) {
        int powerStudent1 = Student1.getMagic() + Student1.getTransgressions() + Student1.diligence + Student1.loyalty
                + Student1.honesty ;
        int powerStudent2 = Student2.getMagic() + Student2.getTransgressions() + Student2.diligence + Student2.loyalty
                + Student2.honesty ;
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
        return "Факультет Пуффендуй( Ученик: "+ getLastName() + " " + getFirstName() + "; Магия - " + getMagic() +
                " ; Трансгрессия - " + getTransgressions() +" ; Трудолюбивость - " + diligence + " ; Верность - " + loyalty +
                " ; Честность -" + honesty + ")";
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        if (diligence < 0 || diligence > 100) {
            throw new RuntimeException("Неверное значение diligence");
        }
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Неверное значение loyalty");
        }
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Неверное значение honesty");
        }
        this.honesty = honesty;
    }
}
