/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Nodo.Nodo;
import Vista.FRM_Administrar;
import Vista.FRM_Atender;
import Vista.FRM_Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DanielSQ
 */
public class CNTRL_Main implements ActionListener{
    private final FRM_Main frame;
    private final FRM_Administrar administrar;
    private final FRM_Atender atender;
    
    private Nodo inicio;
    
    public CNTRL_Main(FRM_Main frame)
    {
        this.frame = frame;
        administrar = new FRM_Administrar(this);
        atender = new FRM_Atender(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Administrar"))
        {
            System.out.println("Administrar");
            administrar.setVisible(true);
        }        
        if(e.getActionCommand().equals("Fila"))
        {
            System.out.println("Fila");
            atender.setVisible(true);
        }        
        if(e.getActionCommand().equals("Reportes"))
        {
            System.out.println("Reportes");
        }
    }

    
    public Nodo getInicio()
    {
        return inicio;
    }
    
    public void setInicio(Nodo inicio)
    {
        this.inicio = inicio;
    }
    
    public void sendInicio()
    {
        administrar.setInicio(inicio);
        
        atender.setInicio(inicio);
        atender.sendInicio();
    }
}
