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
    
    public boolean buscar(String cedula)
    {
        boolean encontrado = false;
        
        Nodo temp = inicio;
        
        if(temp != null)
        {
            while(temp.getNext() != null)
            {
                if(temp.getCedula().equals(cedula))
                {
                    encontrado = true;
                }
            }
        }
        
        return encontrado;
    }
    
    public String[] getInfoNodo(String cedula)
    {
        String[] info = new String[5];
        
        Nodo temp = inicio;
        
        if(temp != null)
        {
            while(temp.getNext() != null)
            {
                if(temp.getCedula().equals(cedula))
                {
                    info = temp.getInfo();
                    temp = null;
                }
            }
        }
        
        return info;
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
