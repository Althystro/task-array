import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

int[]temps = {50,20,39,10,46};

        temps[2] = 12;
        System.out.println(temps[2]+"\n_____________"); // This prints the first element



        for (int temp : temps) {
            System.out.println(temp);
        }
//task 1 Done


        List<String> movies = new ArrayList<>();
        movies.add("Intersteller");
        movies.add("Tenet");
        movies.add("Oppenhimer");
        movies.add("The Dark Knight");
        movies.add("Harry Potter");

        movies.remove(2);
        System.out.println(movies);

        for (String movie : movies) {
            System.out.println(movie);
        }


//task 2 done





    }
}