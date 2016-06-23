/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodo;

/**
 *
 * @author DanielSQ
 */
public class Nodo {
    private String cedula;
    private String nombre;
    private String edad;
    private String fecha;
    private boolean prioridad;
    private Nodo next;
    
    public Nodo()
    {
        
    }

    public Nodo(String cedula, String nombre, String edad, String fecha, boolean prioridad, Nodo next) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.next = next;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the next
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the prioridad
     */
    public boolean isPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }
    
    public String[] getInfo()
    {
        String[] info = new String[5];
        
        info[0] = getCedula();
        info[1] = getNombre();
        info[2] = getEdad();
        info[3] = getFecha();
        info[4] = ""+isPrioridad();
        
        return info;
    }
}
