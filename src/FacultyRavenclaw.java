public class FacultyRavenclaw extends Hogwarts{
    private int smartness;
    private int wisdom;
    private int wit;
    private int creativity; //  Когтевран

    public FacultyRavenclaw(String firstName, String lastName, int magic, int transgressions, int smartness, int wisdom, int wit, int creativity) {
        super(firstName,lastName,magic,transgressions);
        this.smartness = smartness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
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
}
