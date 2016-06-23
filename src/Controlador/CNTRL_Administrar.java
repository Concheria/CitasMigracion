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
    String cedula, nombre, edad, fecha;
    
    public CNTRL_Administrar(FRM_Administrar frame)
    {
        this.frame = frame;
        metodos = new MTDS_Administrar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        convertirInfo();
        
        if(e.getActionCommand().equals("Agregar"))
        {
            System.out.println("Agregar");
            agregar();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            System.out.println("Modificar");
            modificar();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            System.out.println("Eliminar");
            eliminar();
        }
        
        metodos.printLista();
        
        frame.resetFields();
        frame.disableAgregar();
        frame.disableModificarEliminar();
        
        metodos.sendInicio();
        sendInicio();
    }
    
    public void agregar()
    {
        if(metodos.getInicio() != null)
        {
            metodos.agregar(cedula, nombre, edad, fecha, frame.isPrioridad());
        }
        else
        {
            metodos.crear(cedula, nombre, edad, fecha, frame.isPrioridad());
        }
    }
    
    public void modificar()
    {
        metodos.modificar(cedula, nombre, edad, fecha, frame.isPrioridad());
    }
    
    public void eliminar()
    {
        metodos.Eliminar(cedula);
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
            frame.resetPartialFields();
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
        metodos.setInicio(inicio);
    }
    
    public void sendInicio()
    {
        frame.setInicio(inicio);
        frame.sendInicio();
    }
    
    public void convertirInfo()
    {
        String info[] = new String[4];
        
        info = frame.getInfo();
        
        cedula = info[0];
        nombre = info[1];
        edad = info[2];
        fecha = info[3];
    }
}
