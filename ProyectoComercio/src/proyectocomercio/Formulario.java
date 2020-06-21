package proyectocomercio;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

    consultasClientes consulta;

    public Formulario() {
        initComponents();
        consulta = new consultasClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGroupTipoDeConsulta = new javax.swing.ButtonGroup();
        LblFormularioContacto = new javax.swing.JLabel();
        LblCliente = new javax.swing.JLabel();
        TxtNumCliente = new javax.swing.JTextField();
        LblPresentacion = new javax.swing.JLabel();
        LblSucursal = new javax.swing.JLabel();
        CmbSucursales = new javax.swing.JComboBox<>();
        RadioReclamo = new javax.swing.JRadioButton();
        RadioConsulta = new javax.swing.JRadioButton();
        RadioSugerencia = new javax.swing.JRadioButton();
        LblTextoIngresado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        BtnEnviar = new javax.swing.JButton();
        BtnReportes = new javax.swing.JButton();
        Lblreportes = new javax.swing.JLabel();
        BtnDatosCargados = new javax.swing.JButton();
        LblcantConsSug = new javax.swing.JLabel();
        TxtCantCS = new javax.swing.JTextField();
        LblReclamosSucursal0 = new javax.swing.JLabel();
        BtnSucursal0 = new javax.swing.JButton();
        TxtReclamosSucursal0 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListDatos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblFormularioContacto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LblFormularioContacto.setText("FORMULARIO DE CONTACTO");

        LblCliente.setText("NUMERO DE CLIENTE");

        LblPresentacion.setText("TIPO DE PRESENTACION");

        LblSucursal.setText("SUCURSAL AFECTADA");

        CmbSucursales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin especificar", "Sucursal nro. 1", "Sucursal nro. 2", "Sucursal nro. 3", "Sucursal nro. 4", "Sucursal nro. 5", "Sucursal nro. 6", "Sucursal nro. 7", "Sucursal nro. 8", "Sucursal nro. 9", "Sucursal nro. 10" }));

        BtnGroupTipoDeConsulta.add(RadioReclamo);
        RadioReclamo.setText("RECLAMO");

        BtnGroupTipoDeConsulta.add(RadioConsulta);
        RadioConsulta.setText("CONSULTA");

        BtnGroupTipoDeConsulta.add(RadioSugerencia);
        RadioSugerencia.setText("SUGERENCIA");

        LblTextoIngresado.setText("INGRESE SU CONSULTA");

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        jScrollPane1.setViewportView(TxtArea);

        BtnEnviar.setText("ENVIAR");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        BtnReportes.setText("GENERAR");
        BtnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReportesActionPerformed(evt);
            }
        });

        Lblreportes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lblreportes.setText("REPORTES");

        BtnDatosCargados.setText("DATOS CARGADOS");
        BtnDatosCargados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDatosCargadosActionPerformed(evt);
            }
        });

        LblcantConsSug.setText("Cantidad de consultas o sugerencias registradas");

        LblReclamosSucursal0.setText("Cantidad de reclamos de la sucursal 0 (sin especificar)");

        BtnSucursal0.setText("GENERAR");
        BtnSucursal0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSucursal0ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(ListDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BtnDatosCargados)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnReportes)
                                    .addGap(30, 30, 30)
                                    .addComponent(TxtCantCS, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LblcantConsSug))
                            .addGap(342, 342, 342))
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblPresentacion)
                        .addGap(18, 18, 18)
                        .addComponent(RadioReclamo)
                        .addGap(18, 18, 18)
                        .addComponent(RadioConsulta)
                        .addGap(10, 10, 10)
                        .addComponent(RadioSugerencia))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblCliente)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(LblSucursal)
                        .addGap(18, 18, 18)
                        .addComponent(CmbSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblFormularioContacto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblReclamosSucursal0)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnSucursal0)
                                .addGap(18, 18, 18)
                                .addComponent(TxtReclamosSucursal0, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LblTextoIngresado)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnEnviar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Lblreportes)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LblFormularioContacto)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCliente)
                    .addComponent(TxtNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSucursal)
                    .addComponent(CmbSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPresentacion)
                    .addComponent(RadioReclamo)
                    .addComponent(RadioConsulta)
                    .addComponent(RadioSugerencia))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblTextoIngresado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEnviar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(Lblreportes)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblcantConsSug)
                    .addComponent(LblReclamosSucursal0))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnReportes)
                    .addComponent(TxtCantCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSucursal0)
                    .addComponent(TxtReclamosSucursal0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(BtnDatosCargados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed

        int numCliente = Integer.parseInt(TxtNumCliente.getText());
        int tipo = 0;
        if (RadioReclamo.isSelected())
            tipo = 1;
        else if (RadioConsulta.isSelected())
            tipo = 2;
        else
            tipo = 3;
        int sucursal=CmbSucursales.getSelectedIndex();
        String textoConsulta=TxtArea.getText();
        
        Clientes c= new Clientes(numCliente,tipo,sucursal,textoConsulta);        
        consulta.agregarConsulta(c);   
        
        this.limpiarCampos();
        
        
    }//GEN-LAST:event_BtnEnviarActionPerformed

    private void BtnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReportesActionPerformed
        TxtCantCS.setText(String.valueOf(consulta.cantConsultasSugerencias()));
    }//GEN-LAST:event_BtnReportesActionPerformed

    private void BtnSucursal0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSucursal0ActionPerformed
        TxtReclamosSucursal0.setText(String.valueOf(consulta.reclamosSinSucursal()));
    }//GEN-LAST:event_BtnSucursal0ActionPerformed

    private void BtnDatosCargadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDatosCargadosActionPerformed
        ListDatos.setListData(consulta.getConsultas().toArray());
    }//GEN-LAST:event_BtnDatosCargadosActionPerformed

    public void limpiarCampos()
    {
        TxtNumCliente.setText("");
        RadioReclamo.setSelected(true);
        CmbSucursales.setSelectedIndex(0);
        TxtArea.setText("");
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDatosCargados;
    private javax.swing.JButton BtnEnviar;
    private javax.swing.ButtonGroup BtnGroupTipoDeConsulta;
    private javax.swing.JButton BtnReportes;
    private javax.swing.JButton BtnSucursal0;
    private javax.swing.JComboBox<String> CmbSucursales;
    private javax.swing.JLabel LblCliente;
    private javax.swing.JLabel LblFormularioContacto;
    private javax.swing.JLabel LblPresentacion;
    private javax.swing.JLabel LblReclamosSucursal0;
    private javax.swing.JLabel LblSucursal;
    private javax.swing.JLabel LblTextoIngresado;
    private javax.swing.JLabel LblcantConsSug;
    private javax.swing.JLabel Lblreportes;
    private javax.swing.JList ListDatos;
    private javax.swing.JRadioButton RadioConsulta;
    private javax.swing.JRadioButton RadioReclamo;
    private javax.swing.JRadioButton RadioSugerencia;
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JTextField TxtCantCS;
    private javax.swing.JTextField TxtNumCliente;
    private javax.swing.JTextField TxtReclamosSucursal0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}