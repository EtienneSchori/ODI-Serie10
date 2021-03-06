/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.moviemanager.business;

import java.util.List;
import java.util.Map;

/**
 * Classe business contenant toutes les informations sur les personnes
 * @author etienne.schori
 */
public class Person {
    private long id;
    private String firstname;
    private String lastname;
    
    private Map<Long, Movie> movies;

    public Person() {
    }

    public Person(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Map<Long, Movie> getMovies() {
        return movies;
    }

    public void setMovies(Map<Long, Movie> movies) {
        this.movies = movies;
    }

    /**
     * Cette méthode va permettre d'ajouter un film à la map movies en fonction du film en paramètre
     * De plus, il faut ajouter la personne a la liste des films. Car c'est une relation n..m
     * 
     * @param movie 
     */
    public void addMovie(Movie movie){
        this.movies.put(movie.getId(), movie);
        movie.addPerson(this);
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", movies=" + movies + '}';
    }
    
    
}
