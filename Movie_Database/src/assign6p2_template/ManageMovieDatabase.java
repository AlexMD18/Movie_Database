//Assign 6, Manage MovieDatabase
/*
Program Description: Create movie database using linked lists and array lists.
 */
package assign6p2_template;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class ManageMovieDatabase {

    //define the linked lists for the actor collection and movie collection
    static LinkedList<Actor> actors = new LinkedList<>();
    static LinkedList<Movie> movies = new LinkedList<>();
    static ArrayList<String> roles = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ManageMovieDatabase database = new ManageMovieDatabase();

        int menuChoice;

        movieDatabase();

        //do-while loop that displays a menu to the user until they give the quit command
        do {
            //display the menu
            System.out.println("Menu:");
            System.out.println("1: Display Titles");
            System.out.println("2: Display Actors");
            System.out.println("3: Search for Movies by an actor");
            System.out.println("4: Add an Actor");
            System.out.println("5: Add a Movie");
            System.out.println("6: Actor Credit Count");
            System.out.println("0: Quit");
            System.out.print("Type Choice Here: ");
            menuChoice = scanner.nextInt();

            //Switch statement to select what the user would like to do 
            switch (menuChoice) {
                case 1:
                    database.showTitles();
                    break;
                case 2:
                    database.showActors();
                    break;
                case 3:
                    database.displayByActor();
                    break;
                case 4:
                    database.addActor();
                    break;
                case 5:
                    database.addMovie();
                    break;
                case 6:
                    database.actorCredits();
                    break;
                case 0:
                    System.out.println("*Program Ended*");
                    exit(0);
                    break;
                default:
                    System.out.println("Incorrect Input");
                    break;
            }

        } while (menuChoice > 0);
    }

    public static void movieDatabase() {
        actors.add(new Actor("Ryan", "Reynolds", "10/23/1976", "Vancouver", "British Columbia", "Canada"));
        actors.add(new Actor("Dwayne", "Johnson", "05/02/1972", "Hayward", "Californa", "United States"));
        actors.add(new Actor("Kate", "McKinnon", "01/06/1984", "Sea Cliff", "New York", "United States"));
        actors.add(new Actor("Robert", "Downey Jr.", "04/04/1965", "Manhattan", "New York", "United States"));
        actors.add(new Actor("Liam", "Neeson", "06/07/1952", "BallyMena", "Nothern Irelan", "United Kingdom"));

        ArrayList<String> starWarsEp1Writers = new ArrayList<String>();
        starWarsEp1Writers.add("George Lucas");
        ArrayList<Actor> starWarsEp1Actors = new ArrayList<Actor>();
        starWarsEp1Actors.add(new Actor("Liam", "Neeson", "06/07/1952", "BallyMena", "Nothern Irelan", "United Kingdom"));
        starWarsEp1Actors.add(new Actor("Ewan", "McGregor", "03/31/1971", "Perthshire", "Scotland", "United Kingdom"));
        starWarsEp1Actors.add(new Actor("Natalie ", "Portman", "06/09/1981", "Jerusalem", "Jerusalem", "Israel"));
        starWarsEp1Actors.add(new Actor("Jake", "Lloyd", "03/05/1989", "Fort Collins", "Colorado", "United States"));
        starWarsEp1Actors.add(new Actor("Ian", "McDiarmid", "08/11/1944", "Tayside", "Scotland", "United Kingdom"));
        ArrayList<String> starWarsEp1Roles = new ArrayList<String>();
        starWarsEp1Roles.add("Qui-Gon Jinn");
        starWarsEp1Roles.add("Obi-Wan Kenobi");
        starWarsEp1Roles.add("Padme");
        starWarsEp1Roles.add("Anakin Skywalker");
        starWarsEp1Roles.add("Senator Palpatine");
        movies.add(new Movie("Star Wars: Episode I - The Phantom Menace", "George Lucas", starWarsEp1Writers, "1999", starWarsEp1Roles, starWarsEp1Actors));

        ArrayList<String> BTTFWriters = new ArrayList<String>();
        BTTFWriters.add("Robert Zemeckis");
        BTTFWriters.add("Bob Gale");
        ArrayList<Actor> BTTFActors = new ArrayList<Actor>();
        BTTFActors.add(new Actor("Michael J.", "Fox", "06/09/1961", "Edmonton", "Alberta", "Canada"));
        BTTFActors.add(new Actor("Christopher", "Lloyd", "10/22/1938", "Stamford", "Connecticut", "United States"));
        BTTFActors.add(new Actor("Lea", "Thompson", "10/31/1961", "Rochester", "Minnesota", "United States"));
        BTTFActors.add(new Actor("Crispin", "Glover", "04/20/1964", "New York City", "New York", "United States"));
        BTTFActors.add(new Actor("Thomas", "Wilson", "04/15/1959", "Philadelphia", "Pennsylvania", "United States"));
        ArrayList<String> BTTFRoles = new ArrayList<String>();
        BTTFRoles.add("Marty McFly");
        BTTFRoles.add("Dr. Emmett Brown");
        BTTFRoles.add("Lorraine Baines");
        BTTFRoles.add("George McFly");
        BTTFRoles.add("Biff Tannen");
        movies.add(new Movie("Back to the Future", "Robert Zemeckis", BTTFWriters, "1985", BTTFRoles, BTTFActors));

        ArrayList<String> HarryPotterWriters = new ArrayList<String>();
        HarryPotterWriters.add("J.K. Rowling");
        HarryPotterWriters.add("Steve Kloves");
        ArrayList<Actor> HarryPotterActors = new ArrayList<Actor>();
        HarryPotterActors.add(new Actor("Richard", "Harris", "10/01/1930", "Limerick", "Ireland", "United Kingdom"));
        HarryPotterActors.add(new Actor("Robbie", "Coltrane", "03/30/1950", "Rutherglen", "Scotland", "United Kingdom"));
        HarryPotterActors.add(new Actor("Daniel", "Radcliffe", "07/23/1989", "London", "England", "United Kingdom"));
        HarryPotterActors.add(new Actor("Rupert", "Grint", "08/24/1988", "Hertfordshire", "England", "United Kingdom"));
        HarryPotterActors.add(new Actor("Emma", "Watson", "04/15/1990", "Paris", "Paris", "France"));
        ArrayList<String> HarryPotterRoles = new ArrayList<String>();
        HarryPotterRoles.add("Albus Dumbledore");
        HarryPotterRoles.add("Professor McGonagall");
        HarryPotterRoles.add("Harry Potter");
        HarryPotterRoles.add("Ron Weasley");
        HarryPotterRoles.add("Harminone Granger");
        movies.add(new Movie("Harry Potter and the Sorcerer's Stone", "Chris Columbus", HarryPotterWriters, "2001", HarryPotterRoles, HarryPotterActors));

        ArrayList<String> MissPWriters = new ArrayList<String>();
        MissPWriters.add("Ransom Riggs");
        MissPWriters.add("Jane Goldman");
        ArrayList<Actor> MissPActors = new ArrayList<Actor>();
        MissPActors.add(new Actor("Eva", "Green", "07/06/1980", "Paris", "Paris", "France"));
        MissPActors.add(new Actor("Asa", "ButterField", "04/01/1997", "London", "England", "United Kingdom"));
        MissPActors.add(new Actor("Samuel L.", "Jackson", "12/21/1948", "Washington", "District of Columbia", "United States"));
        MissPActors.add(new Actor("Judy", "Dench", "12/09/1934", "North Yorkshire", "England", "United Kingdom"));
        MissPActors.add(new Actor("Ella", "Purnell", "09/17/1996", "London", "Englan", "United Kingdom"));
        ArrayList<String> MissPRoles = new ArrayList<String>();
        MissPRoles.add("Miss Peregrine");
        MissPRoles.add("Jake");
        MissPRoles.add("Barron");
        MissPRoles.add("Miss Avocet");
        MissPRoles.add("Emma");
        movies.add(new Movie("Miss Peregrine's Home for Peculiar Children", "Tim Burton", MissPWriters, "2016", MissPRoles, MissPActors));
    }

    //other methods for code modularization
    public void showTitles() {
        System.out.println("1: Display Title");
        for (int i = 0; i < movies.size(); i++) {
            Movie films = movies.get(i);
            System.out.println("Movie: " + films + "\n");
        }
    }

    public void showActors() {
        System.out.println("2: Display Actors");
        for (int i = 0; i < actors.size(); i++) {
            Actor movieActor = actors.get(i);
            System.out.println("Actor: " + movieActor + "\n");
        }
    }

    public void displayByActor() {
        System.out.println("3: Display Movie by Actor");
        System.out.print("Enter First Name of Actor: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name of Actor: ");
        String lastName = scanner.nextLine();
        for (Movie m : movies) {
            for (Actor a : m.getActors()) {
                if (a.getFName().equalsIgnoreCase(firstName) || a.getLName().equalsIgnoreCase(lastName)) {
                    System.out.println(m);
                }
            }
        }
    }

    public void addActor() {
        System.out.println("4: Add an Actor");
        System.out.print("Enter Actor's First Name: ");
        String actFName = scanner.nextLine();

        System.out.print("Enter Actor's Last Name: ");
        String actLName = scanner.nextLine();

        System.out.print("Enter Actor's DOB using format MM/DD/YYYY: ");
        String actDOB = scanner.nextLine();

        System.out.print("Enter Actor's Birth City: ");
        String actBirthCity = scanner.nextLine();

        System.out.print("Enter Actor's Birth State: ");
        String actBirthState = scanner.nextLine();

        System.out.print("Enter Actor's Birth Country: ");
        String actBirthCountry = scanner.nextLine();

        actors.add(new Actor(actFName, actLName, actDOB, actBirthCity, actBirthState, actBirthCountry));
    }

    public void addMovie() {
        ArrayList<String> writerList = new ArrayList<String>();
        ArrayList<Actor> actorList = new ArrayList<Actor>();
        ArrayList<String> roleList = new ArrayList<String>();

        System.out.println("5: Add a Movie");
        System.out.print("\nEnter the Movie's Title: ");
        String filmTitle = scanner.nextLine();

        System.out.print("Enter the Movie's Director: ");
        String filmDirector = scanner.nextLine();

        System.out.print("Enter the Movie's Writer(s)(Seperate with Comma): ");
        String filmWriters = scanner.nextLine();
        String[] listFilmWriters = filmWriters.split(",");
        for (int i = 0; i < listFilmWriters.length; i++) {
            writerList.add(listFilmWriters[i]);
        }

        System.out.print("Enter the Movie's Release Year: ");
        String filmYear = scanner.nextLine();

        System.out.print("Enter the Movie's Roles(Seperate with Comma): ");
        String filmRoles = scanner.nextLine();
        String[] listFilmRoles = filmRoles.split(",");
        for (int j = 0; j < listFilmRoles.length; j++) {
            roleList.add(listFilmRoles[j]);
        }

        int numRoles = filmRoles.split(",").length;
        for (int k = 0; k < numRoles; k++) {
            System.out.println("");
            addActor();
        }

        movies.add(new Movie(filmTitle, filmDirector, writerList, filmYear, roleList, actorList));
    }

    public void actorCredits() {
        System.out.println("6: Actor Productivity: ");
        System.out.println("Acting Productivity Chart");
        System.out.println("-------------------------");
        for (Actor actProd : actors) {
            System.out.print(actProd.getFName() + " " + actProd.getLName());
            for (Movie mov : movies) {
                if (mov.getActors().contains(actProd.getFName() + actProd.getLName())) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
