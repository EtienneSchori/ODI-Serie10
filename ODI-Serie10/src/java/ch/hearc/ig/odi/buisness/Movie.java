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
public class Movie {
    private long id;
    private String name;
    private String productor;
    
    private List<Person> persons;

    public Movie() {
    }

    public Movie(long id, String name, String productor, List<Person> persons) {
        this.id = id;
        this.name = name;
        this.productor = productor;
        this.persons = persons;
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

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", name=" + name + ", productor=" + productor + ", persons=" + persons + '}';
    }
}
