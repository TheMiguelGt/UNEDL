/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2par;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author CAT
 */
public class cadena extends javax.swing.JFrame {

    /**
     * Creates new form cadena
     */
    public cadena() {
        initComponents();
        this.setMinimumSize(new Dimension(500,350));
        this.setMaximumSize(new Dimension(500,350));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTcadena = new javax.swing.JTextField();
        jBverificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel1.setText("Cadena:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 80, 30);

        jTcadena.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jTcadena.setText("{()()}{()}");
        jPanel1.add(jTcadena);
        jTcadena.setBounds(150, 69, 290, 30);

        jBverificar.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jBverificar.setText("Verificar");
        jBverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBverificarActionPerformed(evt);
            }
        });
        jPanel1.add(jBverificar);
        jBverificar.setBounds(180, 150, 220, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/examen2par/cat-1027486_1280.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-190, 0, 780, 300);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBverificarActionPerformed
         if(balanceo()){
             JOptionPane.showMessageDialog(null, "Esta balanceada","Balanceo",JOptionPane.INFORMATION_MESSAGE);
         }else{
             JOptionPane.showMessageDialog(null, "No esta balanceada","Balanceo",JOptionPane.INFORMATION_MESSAGE);
         }
    }//GEN-LAST:event_jBverificarActionPerformed
    public class Pila {
        class Nodo {
            char simbolo;
            Nodo sig;
        }
        private Nodo raiz;
        Pila() {
            raiz = null;
        }
        public void insertar(char x) {
            Nodo nuevo;
            nuevo = new Nodo();
            nuevo.simbolo = x;
            if (raiz == null) {
                nuevo.sig = null;
                raiz = nuevo;
            } else {
                nuevo.sig = raiz;
                raiz = nuevo;
            }
        }
        public char extraer() {
            if (raiz != null) {
                char informacion = raiz.simbolo;
                raiz = raiz.sig;
                return informacion;
            } else {
                return Character.MAX_VALUE;
            }
        }
        public boolean vacia() {
            if (raiz == null) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    public boolean balanceo() {
        Pila pila1;  
    	pila1 = new Pila ();    
    	String cadena=jTcadena.getText();
    	for (int f = 0 ; f < cadena.length() ; f++)
    	{
    	    if (cadena.charAt(f) == '(' || cadena.charAt(f) == '[' || cadena.charAt(f) == '{') {
    	    	pila1.insertar(cadena.charAt(f));
    	    } else {
    	    	if (cadena.charAt(f)==')') {
    	    	    if (pila1.extraer()!='(') {
    	    	        return false;
    	    	    }
    	     	} else {
    	    	    if (cadena.charAt(f)==']') {
    	    	        if (pila1.extraer()!='[') {
    	    	            return false;
    	    	        }
    	    	    } else {
    	    	        if (cadena.charAt(f)=='}') {
    	    	            if (pila1.extraer()!='{') {
    	    	                return false;
    	    	            }
    	    	        }
    	    	    }
    	        }
   	    }   
        }
    	if (pila1.vacia()) {
    	    return true;
    	} else {
   	    return false;
    	}
    }	

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
            java.util.logging.Logger.getLogger(cadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cadena cad= new cadena();
                cad.setLocationRelativeTo(null);
                cad.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBverificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTcadena;
    // End of variables declaration//GEN-END:variables
}
