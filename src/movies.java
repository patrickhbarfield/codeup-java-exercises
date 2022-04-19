public class movies {
}

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

//put in other file moviesApp
public static void main(String[] args) {

    int choice = Input.getInt(0,5);
}

    public static void main(String[] args) {
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 ")
    }