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

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
