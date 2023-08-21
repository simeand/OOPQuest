public class Wilder {
    private String firstName;
    private boolean isPresent;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public boolean getIsPresent() {
        return this.isPresent;
    }

    public void setIsPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public void  whoAmI() {
        if (isPresent) {
            System.out.println("My name is " + this.firstName + " and I am present");
        } else  {
            System.out.println("My name is " + this.firstName + " and I am not present");
        }
    }
}
