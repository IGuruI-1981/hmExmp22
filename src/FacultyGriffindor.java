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

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Факультет Гриффиндор( Ученик: "+ getFirstName() + " " + getLastName() + "; Магия - " + getMagic() +
                " ; Трансгрессия - " + getTransgressions() +" ; Благородство - " + nobility + " ; Честь - " + honor +
                " ; Храбрость -" + bravery + ")";
    }
}
