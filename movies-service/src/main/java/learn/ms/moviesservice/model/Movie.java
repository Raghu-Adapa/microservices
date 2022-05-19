package learn.ms.moviesservice.model;

public class Movie {
    private int id;
    private String movieName;
    private String desc;
    private float rating;
    private int year;

    public Movie() {
    }

    public Movie(int id, String movieName, String desc, float rating, int year) {
        this.id = id;
        this.movieName = movieName;
        this.desc = desc;
        this.rating = rating;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", desc='" + desc + '\'' +
                ", rating='" + rating + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
