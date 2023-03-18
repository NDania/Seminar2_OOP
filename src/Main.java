public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Place placeOfBday = new Place("Los-Altos");
        user.report();
        user.save();
        placeOfBday.save();

    }
}