/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exorecur;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marvin
 */
public class Repertoire {
    public String nom = "";
    public List<Repertoire> rep = new ArrayList();

    public Repertoire(String n) {
        this.nom = n;
    }
    
    
}
