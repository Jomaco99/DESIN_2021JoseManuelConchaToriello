/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionprueba;

import java.util.Objects;

/**
 *
 * @author DAM Sub 1
 */
public class Coche {
    private String matricula;
    private String modelo;

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", modelo=" + modelo + '}';
    }
    
    
}