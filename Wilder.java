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

    public String  whoAmI() {
        if (this.isPresent == true) {
            return "My name is " + this.firstName + " and I am present" ;
        } else  {
            return "My name is " + this.firstName + " and I am not present" ;
        }
    }
}
