
package com.ceep.dominio;
/*Arquitectura cliente servidor, serializable, lleva :
- Constructor vacío
- Atributos `rivados
-Debe implementar SERIALIZABLE (implements Serializable) 
- Incluir los métodos:
    toString
    hashcode
    equals
*/
import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable{
    
    private String nombre;
    private String apellido;

    public Persona() { //DEBE ESTAR SIEMNPRE PARA LOS FRAMEWORKS, abstra de los atributos
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.apellido);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
