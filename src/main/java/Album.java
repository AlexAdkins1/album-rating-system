import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;

@SuppressWarnings("unused")
public class Album {

    private final String name;
    private final Date released;
    private final ArrayList<Song> songList = new ArrayList<>();
    private double rating;
    private final int length;
    private final Dictionary<String, String> contributers = new Hashtable<>();

    public Album(String name, Date released, int length) {
        this.name = name;
        this.released = released;
        this.length = length;
    }


    // Getters
    public Dictionary<String, String> getContributers() {return contributers;}
    public int getLength() {return length;}
    public String getName() {return name;}
    public double getRating() {return rating;}
    public Date getReleased() {return released;}
    public ArrayList<Song> getSongList() {return songList;}

    /**
     * sets new rating
     * 
     * @param rating the new rating
     */
    public void setRating(double rating) {this.rating = rating;}


    /**
     * two albums will be equal if they have the same name and release date
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof Album && 
            this.name.equals(((Album)o).getName()) &&
            this.released.equals(((Album)o).getReleased());
    }
}
