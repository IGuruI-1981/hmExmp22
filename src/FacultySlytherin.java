public class FacultySlytherin extends Hogwarts {
    private int guile;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power; // Слизерен

    public FacultySlytherin(String firstName, String lastName, int magic, int transgressions, int guile, int determination, int ambition, int resourcefulness, int power) {
        super(firstName,lastName,magic,transgressions);
        this.guile = guile;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public static void compareStudentsSlytherin(FacultySlytherin Student1,FacultySlytherin Student2) {
        int powerStudent1 = Student1.getMagic() + Student1.getTransgressions() + Student1.guile + Student1.determination
                + Student1.ambition + Student1.resourcefulness + Student1.power;
        int powerStudent2 = Student2.getMagic() + Student2.getTransgressions() + Student2.guile + Student2.determination
                + Student2.ambition + Student2.resourcefulness + Student2.power;
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
        return "Факультет Слизерен( Ученик: "+ getLastName() + " " + getFirstName() + "; Магия - " + getMagic() +
                " ; Трансгрессия - " + getTransgressions() +" ; Хитрость - " + guile + " ; Решительность - " + determination +
                " ; Амбициозность -" + ambition + " ; Находчивость -" + resourcefulness + " ; Жажда власти -" + power+")";
    }

    public int getGuile() {
        return guile;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setGuile(int guile) {
        if (guile < 0 || guile > 100) {
            throw new RuntimeException("Неверное значение nobility");
        }
        this.guile = guile;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            throw new RuntimeException("Неверное значение determination");
        }
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Неверное значение ambition");
        }
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new RuntimeException("Неверное значение resourcefulness");
        }
        this.resourcefulness = resourcefulness;
    }

    public void setPower(int power) {
        if (power < 0 || power > 100) {
            throw new RuntimeException("Неверное значение power");
        }
        this.power = power;
    }
}
