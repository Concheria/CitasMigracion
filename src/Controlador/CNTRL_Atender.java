/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Nodo.Nodo;
import Vista.FRM_Atender;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DanielSQ
 */
public class CNTRL_Atender implements ActionListener{
    private Nodo inicio;
    FRM_Atender frame;
    
    public CNTRL_Atender(FRM_Atender frame)
    {
        this.frame = frame;
        printFila();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Avanzar"))   
        {
            avanzar();
            printFila();
        }
    }
    
    public void avanzar()
    {
        inicio = inicio.getNext();
    }

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }
    
    public void printFila()
    {
        if(inicio != null)
        {
            frame.setTextArea(crearFila());
        }
    }
    
    public String crearFila()
    {
        String fila = "Fila\n";
        
        Nodo temp = inicio;
        
        while(temp.getNext() != null)
        {
            fila+= "Cédula: "+temp.getCedula()+""
                    +"\n    Nombre: "+temp.getNombre()+""
                    +"\n    Edad: "+temp.getEdad()+""
                    +"\n    Fecha: "+temp.getFecha()+""
                    +"\n    Prioridad: "+temp.isPrioridad()+"\n";
            
            temp = temp.getNext();
        }
        
        fila+= "Cédula: "+temp.getCedula()+""
                +"\n    Nombre: "+temp.getNombre()+""
                +"\n    Edad: "+temp.getEdad()+""
                +"\n    Fecha: "+temp.getFecha()+""
                +"\n    Prioridad: "+temp.isPrioridad()+"\n";
        
        System.out.println(fila);
        
        return fila;
    }
    
    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
}
