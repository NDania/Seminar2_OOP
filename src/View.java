public class View {

    private Place placeOfBday;
    public View(Place placeOfBday) {

        this.placeOfBday = placeOfBday;
    }
    public void save() {

        System.out.println("Save place of birthday: " + this.placeOfBday.getPlaces());

    }
}