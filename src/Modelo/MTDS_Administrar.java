/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.CNTRL_Administrar;
import Nodo.Nodo;

/**
 *
 * @author DanielSQ
 */
public class MTDS_Administrar {
    private final CNTRL_Administrar controlador;
    private Nodo inicio;
    
    public MTDS_Administrar(CNTRL_Administrar controlador)
    {
        this.controlador = controlador;    
    }
    
    public void crear(String cedula, String nombre, String edad, String fecha, boolean prioridad)
    {
        inicio = new Nodo(cedula, nombre, edad, fecha, prioridad, null);
    }
    
    public void agregar(String cedula, String nombre, String edad, String fecha, boolean prioridad)
    {
        if(!prioridad)
        {
            Nodo temp = getUltimo();
            temp.setNext(new Nodo(cedula, nombre, edad, fecha, prioridad, null));
        }
        else
        {
            agregarPrioridad(cedula, nombre, edad, fecha, prioridad);
        }
    }
    
    public void agregarPrioridad(String cedula, String nombre, String edad, String fecha, boolean prioridad)
    {
        Nodo temp = inicio;
        Nodo temp2;
        
        boolean buscando = true;
        
        if(temp != null)
        {
            while(buscando)
            {
                System.out.println("Buscand: "+buscando);
                if(temp.isPrioridad())
                {
                    if(!temp.getNext().isPrioridad())
                    {
                        temp2 = temp.getNext();
                        temp.setNext(new Nodo(cedula, nombre, edad, fecha, prioridad, null));
                        temp.getNext().setNext(temp2);
                        buscando = false;
                        System.out.println("Nodo añadido");
                    }
                    else
                    {
                        if(temp.getNext() == null)
                        {
                            buscando = false;    
                            System.out.println("Finalizar busqueda");                       
                        }
                        else
                        {
                            temp = temp.getNext();
                            System.out.println("Siguiente nodo");
                        }
                    }
                }
                else
                {
                    inicio = new Nodo(cedula, nombre, edad, fecha, prioridad, null);
                    inicio.setNext(temp);
                    buscando = false;
                }
            }
        }
    }
    
    public Nodo getUltimo()
    {
        Nodo temp = inicio;
        
        while(temp.getNext() != null)
        {
            temp = temp.getNext();
        }
        
        return temp;
    }
      
    public String consultar(String cedula)
    {
        int contador = 1;
        Nodo temporal = inicio;
        
        while(!temporal.getCedula().equals(cedula))
        {
            contador++;
            temporal = temporal.getNext();
        }
        
        String contadorStr = ""+contador;
        
        return contadorStr;
    }
    
    public void Eliminar(String cedula)
    {
        Nodo temporal = inicio;
        
        int posicion = Integer.parseInt(consultar(cedula));
        
        if(posicion == 1)
        {
            inicio = temporal.getNext();
        }
        else
        {
            for(int i=0;i<posicion-2;i++)
            {
                temporal = temporal.getNext();
            }
            
            Nodo temporal2 = temporal.getNext();
            Nodo temporal3 = temporal2.getNext();
            temporal.setNext(temporal3);
        }
    }
    
    public int getTamano()
    {
        int contador = 1;
        Nodo temporal = inicio;
        
        while(temporal.getNext() != null)
        {
            contador++;
            temporal = temporal.getNext();
        }
        
        return contador;
    }
    
    public void modificar(String cedula, String nombre, String edad, String fecha, boolean prioridad)
    {
        Nodo temporal = inicio;
        
        while(!temporal.getCedula().equals(cedula))
        {
            temporal = temporal.getNext();
        }
        
        temporal.setNombre(nombre);
        temporal.setEdad(edad);
        temporal.setFecha(fecha);
        temporal.setPrioridad(prioridad);
    }
    
    public boolean buscar(String cedula)
    {
        System.out.println("Buscando: "+cedula);
        
        boolean encontrado = false;
        boolean buscando = true;
        
        Nodo temp = inicio;
        
        if(temp != null)
        {
            while(buscando)
            {
                if(temp.getCedula().equals(cedula))
                {
                    encontrado = true;
                    buscando = false;
                }
                else
                {
                    if(temp.getNext() == null)
                    {
                        buscando = false;
                    }
                    else
                    {
                        temp = temp.getNext();
                    }
                }
            }
        }
        
        return encontrado;
    }
    
    public String[] getInfoNodo(String cedula)
    {
        String[] info = new String[5];
        
        Nodo temp = inicio;
        
        boolean buscando = true;
        
        if(temp != null)
        {
            while(buscando)
            {
                if(temp.getCedula().equals(cedula))
                {
                    info = temp.getInfo();
                    buscando = false;
                }
                else
                {
                    if(temp.getNext() == null)
                    {
                        buscando = false;
                    }
                    else
                    {
                        temp = temp.getNext();
                    }
                }
            }
        }
        
        return info;
    }
    
    public void printLista()
    {
        String lista = "Fila\n";
        
        Nodo temp = inicio;
        
        if(temp != null)
        {
            while(temp.getNext() != null)
            {
                lista+= "Cédula: "+temp.getCedula()+""
                        +"\n    Nombre: "+temp.getNombre()+""
                        +"\n    Edad: "+temp.getEdad()+""
                        +"\n    Fecha: "+temp.getFecha()+""
                        +"\n    Prioridad: "+temp.isPrioridad()+"\n";
                temp = temp.getNext();
            }
            
            lista+= "Cédula: "+temp.getCedula()+""
                    +"\n    Nombre: "+temp.getNombre()+""
                    +"\n    Edad: "+temp.getEdad()+""
                    +"\n    Fecha: "+temp.getFecha()+""
                    +"\n    Prioridad: "+temp.isPrioridad()+"\n";
        }
        
        System.out.println(lista);
    }

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    public void sendInicio()
    {
        controlador.setInicio(inicio);
    }
}
