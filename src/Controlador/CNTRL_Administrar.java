/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MTDS_Administrar;
import Nodo.Nodo;
import Vista.FRM_Administrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DanielSQ
 */
public class CNTRL_Administrar implements ActionListener{
    private Nodo inicio;
    private final FRM_Administrar frame;
    private final MTDS_Administrar metodos;
    
    public CNTRL_Administrar(FRM_Administrar frame)
    {
        this.frame = frame;
        metodos = new MTDS_Administrar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Agregar"))
        {
            
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            
        }
    }
    
    public void agregar()
    {
        
    }
    
    public void modificar()
    {
        
    }
    
    public void eliminar()
    {
        
    }

    public void buscar(String cedula)
    {
        if(metodos.buscar(cedula))
        {
            frame.disableAgregar();
            frame.enableModificarEliminar();
            frame.setInfo(metodos.getInfoNodo(cedula));
        }
        else
        {
            frame.enableAgregar();
            frame.disableModificarEliminar();
        }
        
        if(cedula.equals(""))
        {
            frame.disableAgregar();
            frame.disableModificarEliminar();
        }
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
        frame.setInicio(inicio);
    }
}
