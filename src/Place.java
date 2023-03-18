public class Place {
    private String places;

    public Place(String places){

        this.places = places;
        }

    public String getPlaces() {

        return this.places;
        }


    public void save() {
        View places = new View(this);
        places.save();
    }
}
