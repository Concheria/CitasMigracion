/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CNTRL_Administrar;
import Controlador.CNTRL_Main;
import Nodo.Nodo;

/**
 *
 * @author DanielSQ
 */
public class FRM_Administrar extends javax.swing.JFrame {
    private final CNTRL_Main controladorMain;
    private final CNTRL_Administrar controlador;
    
    private Nodo inicio;
    /**
     * Creates new form FRM_Administrar
     * @param controladorMain
     */
    public FRM_Administrar(CNTRL_Main controladorMain) {
        this.controladorMain = controladorMain;
        initComponents();
        controlador = new CNTRL_Administrar(this);
        disableTodos();
    }

    public void addControlador()
    {
        btn_Agregar.addActionListener(controlador);
        btn_Eliminar.addActionListener(controlador);
        btn_Modificar.addActionListener(controlador);
    }
    
    public boolean isPrioridad()
    {
        return chb_Prioridad.isSelected();
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
        sendInicio();
    }
    
    public void sendInicio()
    {
        controladorMain.setInicio(inicio);
    }
    
    public void fieldsEditableFalse()
    {
        tf_Nombre.setEditable(false);
        tf_Edad.setEditable(false);
        tf_Fecha.setEditable(false);
        tf_Fecha.setEditable(false);
    }
    
    public void resetFields()
    {
        tf_Nombre.setText("");
        tf_Edad.setText("");
        tf_Fecha.setText("");
        tf_Fecha.setText("");
    }
    
    public void disableModificarEliminar()
    {
        btn_Modificar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
    }    
    
    public void enableModificarEliminar()
    {
        btn_Modificar.setEnabled(true);
        btn_Eliminar.setEnabled(true);
    }
    
    public void disableAgregar()
    {
        btn_Agregar.setEnabled(false);
    }
        
    public void enableAgregar()
    {
        btn_Agregar.setEnabled(true);
    }
    
    public void disableTodos()
    {
        btn_Modificar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
        btn_Agregar.setEnabled(false);
    }
    
    public void setInfo(String[] info)
    {
        tf_Cedula.setText(info[0]);
        tf_Nombre.setText(info[1]);
        tf_Edad.setText(info[2]);
        tf_Fecha.setText(info[3]);
        if(info[4].equals("true"))
        {
            chb_Prioridad.setSelected(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chb_Prioridad = new javax.swing.JCheckBox();
        tf_Nombre = new javax.swing.JTextField();
        tf_Edad = new javax.swing.JTextField();
        tf_Cedula = new javax.swing.JTextField();
        tf_Fecha = new javax.swing.JTextField();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Administrar Citas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cédula");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Edad");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fecha");

        chb_Prioridad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chb_Prioridad.setText("Prioridad 7600");
        chb_Prioridad.setToolTipText("");

        tf_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_CedulaKeyTyped(evt);
            }
        });

        btn_Agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Agregar.setText("Agregar");

        btn_Modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Modificar.setText("Modificar");

        btn_Eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_Cedula))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_Nombre)
                                    .addComponent(tf_Edad)
                                    .addComponent(tf_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(chb_Prioridad)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chb_Prioridad)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_CedulaKeyTyped
        controlador.buscar(tf_Cedula.getText());
    }//GEN-LAST:event_tf_CedulaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JCheckBox chb_Prioridad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tf_Cedula;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_Fecha;
    private javax.swing.JTextField tf_Nombre;
    // End of variables declaration//GEN-END:variables
}
