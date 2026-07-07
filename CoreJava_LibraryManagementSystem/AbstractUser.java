public abstract class AbstractUser {

    protected String name;

    public AbstractUser(String name) {
        this.name = name;
    }

    public abstract void displayUser();

}