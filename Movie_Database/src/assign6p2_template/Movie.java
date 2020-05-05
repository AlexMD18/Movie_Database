package assign6p2_template;

import java.util.ArrayList;

public class Movie {

    //define data fields: title, director, the writers (one or more), the year when the movie was released, and the cast (the list of roles, and the list of actors)
    private String movieTitle;
    private String director;
    private ArrayList<String> writers;
    private String yearReleased;
    private ArrayList<String> roles;
    private ArrayList<Actor> actors;

    //define the constructor with all the given data: title, director, the writers (one or more), the year when the move was released, and the cast (the list of roles, and the list of actors)
    public Movie(String movieTitle, String director, ArrayList<String> writers, String yearReleased, ArrayList<String> roles, ArrayList<Actor> actors) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.writers = new ArrayList<>();
        this.writers = writers;
        this.yearReleased = yearReleased;
        this.roles = new ArrayList<>();
        this.roles = roles;
        this.actors = new ArrayList<>();
        this.actors = actors;
    }

    //define all the getters
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getWriters() {
        return writers;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public ArrayList<String> getRoles() {
        return roles;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setMovieTitle(String newMovieTitle) {
        movieTitle = newMovieTitle;
    }

    public void setDirector(String newDirector) {
        director = newDirector;
    }

    public void setWriters(ArrayList<String> newWriters) {
        writers = newWriters;
    }

    public void setYearReleased(String newYearReleased) {
        yearReleased = newYearReleased;
    }

    public void setRoles(ArrayList<String> newRoles) {
        roles = newRoles;
    }

    public void setActors(ArrayList<Actor> newActors) {
        actors = newActors;
    }

    //define toString() 
    @Override
    public String toString() {
        return "Movie Title: " + movieTitle + "\nDirector: " + director + "\nWriters: " + writers + "\nYear Released: " + yearReleased + "\nActors: " + actors + "\nRoles: " + roles;
    }
}
