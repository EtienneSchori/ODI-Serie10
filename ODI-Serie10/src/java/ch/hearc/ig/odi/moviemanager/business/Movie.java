/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.moviemanager.business;

import java.util.List;
import java.util.Map;

/**
 *
 * @author etienne.schori
 */
public class Movie {
    private long id;
    private String name;
    private String productor;
    private Map<Long, Person> persons;


    public Movie() {
    }

    public Movie(long id, String name, String productor) {
        this.id = id;
        this.name = name;
        this.productor = productor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public Map<Long, Person> getPersons() {
        return persons;
    }

    public void setPersons(Map<Long, Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", name=" + name + ", productor=" + productor + ", persons=" + persons + '}';
    }
}
