public class Classroom extends Wilder{
    public static void main(String[] args) {
        Wilder student1 = new Wilder();
        student1.setFirstName("Mark");
        student1.setIsPresent(true);

        Wilder student2 = new Wilder();
        student2.setFirstName("Musk");
        student2.setIsPresent(false);

        student1.whoAmI();
        student2.whoAmI();
    }
}


// OUTPUT
//   My name is Mark and I am present
//   My name is Musk and I am not present
