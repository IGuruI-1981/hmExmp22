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

    @Override
    public String toString() {
        return "FacultySlytherin{" +
                "guile=" + guile +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                '}';
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
}
