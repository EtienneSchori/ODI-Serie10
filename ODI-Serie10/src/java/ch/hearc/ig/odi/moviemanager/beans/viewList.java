/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author etienne.schori
 */
@ManagedBean
@SessionScoped
public class viewList implements Serializable{
    
    @Inject
    Services service;
    /**
     * Creates a new instance of viewList
     */
    public viewList() {
    }
    
}
