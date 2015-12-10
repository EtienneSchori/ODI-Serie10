/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.buisness;

import java.util.List;

/**
 *
 * @author etienne.schori
 */
public class Person {
    private long id;
    private String firstname;
    private String lastname;
    
    private List<Movie> movies;

    public Person() {
    }

    public Person(long id, String firstname, String lastname, List<Movie> movies) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.movies = movies;
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

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", movies=" + movies + '}';
    }
    
    
}
