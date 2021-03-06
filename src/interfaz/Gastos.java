/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Ganancia;
import clases.GananciaJ;
import clases.Helper;
import clases.Producto;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE
 */
public class Gastos extends javax.swing.JDialog {

    /**
     * Creates new form Gastos
     */
    public Gastos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ruta = "src/datos/ganancias.txt";
         try {
            ganancias = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
         Helper.volcado(salida, ganancias);
         cmdAceptar.setEnabled(false);
        
    }
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Ganancia> ganancias;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gastos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtGastos = new javax.swing.JTextField();
        cmdAceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        cmdSaliir = new javax.swing.JButton();
        cmdCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gastos");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Gastos totales en la jornada");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtGastos.setEditable(false);
        txtGastos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGastosKeyTyped(evt);
            }
        });
        jPanel1.add(txtGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 30));

        cmdAceptar.setBackground(new java.awt.Color(204, 255, 255));
        cmdAceptar.setText("Aceptar");
        cmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 93, 100, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 190));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 350, 220));

        cmdSaliir.setBackground(new java.awt.Color(255, 51, 51));
        cmdSaliir.setText("Salir");
        cmdSaliir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaliirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSaliir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 130, 40));

        cmdCerrar.setBackground(new java.awt.Color(255, 51, 51));
        cmdCerrar.setText("Cerrar programa");
        cmdCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 140, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gastos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Hubo gastos en la jornada");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 34, -1, -1));

        Gastos.add(si);
        si.setText("Si");
        si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siMouseClicked(evt);
            }
        });
        jPanel3.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        Gastos.add(no);
        no.setText("No");
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
        });
        jPanel3.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gastos.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 600, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(609, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptarActionPerformed
        GananciaJ gj;
        Ganancia g = null;
        int aux = 0, comp;
        int ga;
        int t;
        ganancias = Helper.traerDatos(ruta);
        for (int i = 0; i < ganancias.size(); i++) {
            g = ganancias.get(i);
            comp = g.getCompra();
            aux = aux + comp;

        }
        if (txtGastos.getText().trim().isEmpty()){
            Helper.mensaje(this, "Digite los gastos gastos, por favor", 3);
        }else{
      
        ga = Integer.parseInt(txtGastos.getText());
        gj = new GananciaJ (aux,ga);
       t =  gj.total();
        if (t>=0){
            txtResultado.setText("Las ganancias son favorables, TOTAL: "+t+ " Pesos");
        }else{
              txtResultado.setText("Las ganancias son desfavorables, TOTAL: "+t+ " Pesos");
        }
        for (int i = 0; i < ganancias.size(); i++) {
           ganancias.remove(i);
            
        }
        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Gastos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Gastos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtGastos.setText("");
        
        }
       
        
    }//GEN-LAST:event_cmdAceptarActionPerformed

    private void cmdSaliirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaliirActionPerformed
      this.dispose();
    }//GEN-LAST:event_cmdSaliirActionPerformed

    private void cmdCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCerrarActionPerformed
    System.exit(0);
    }//GEN-LAST:event_cmdCerrarActionPerformed

    private void siMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMouseClicked
       Helper.mensaje(this, "Digite los gastos", 1);
       txtGastos.setEditable(true);
       txtGastos.requestFocusInWindow();
       txtGastos.setText("");
    }//GEN-LAST:event_siMouseClicked

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
      cmdAceptar.setEnabled(true);
      txtGastos.setEditable(false);
      txtGastos.setText("0");
    }//GEN-LAST:event_noMouseClicked

    private void txtGastosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGastosKeyTyped
       cmdAceptar.setEnabled(true);
       char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtGastosKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gastos dialog = new Gastos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gastos;
    private javax.swing.JButton cmdAceptar;
    private javax.swing.JButton cmdCerrar;
    private javax.swing.JButton cmdSaliir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton si;
    private javax.swing.JTextField txtGastos;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
