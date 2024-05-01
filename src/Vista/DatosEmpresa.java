/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Eventos;
import Modelo.TextPrompt;
import Modelo.config;
import Modelo.configuraciones;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javaswingdev.Notification;

/**
 *
 * @author Jonathan Gil
 */
public class DatosEmpresa extends javax.swing.JDialog {

     Eventos event = new Eventos();
     config configura = new config();
     configuraciones configuracionesDao = new configuraciones();
     
    public DatosEmpresa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
            addComponentListener(new ComponentAdapter() {
                @Override
                public void componentMoved(ComponentEvent e) {
                    Point currentLocation = getLocation();
                       if (currentLocation.y < 50) 
                         setLocationRelativeTo(null);
                    
                }
            });
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Seticon();
        this.setTitle("Punto de venta - Datos de la empresa");
        listarConfig();

           

    }
    
     public void listarConfig() {
        configura = configuracionesDao.buscarDatos();
        txtRFC.setText(configura.getRfc());
        txtRazonSocial.setText(configura.getRazonSocial());
        txtTelefono.setText(String.valueOf(configura.getTelefono()));
        txtNombre.setText(configura.getNomnbre());
        txtDireccion.setText(configura.getDireccion());
        txtHorario.setText(configura.getHorario());
        txtEncargado.setText(configura.getEncargado());
        txtLetra1.setText(""+configura.getLetraGrande());
        txtLetra2.setText(""+configura.getLetraChica());
        txtMensaje.setText(configura.getMensaje());
    }
     
     public void eventoEnter(){
               if(!"".equals(txtNombre.getText()) && !"".equals(txtDireccion.getText()) && !"".equals(txtRFC.getText()) && !"".equals(txtRazonSocial.getText()) && !"".equals(txtTelefono.getText())){
               configura.setDireccion(txtDireccion.getText());
            configura.setNomnbre(txtNombre.getText());
            configura.setRazonSocial(txtRazonSocial.getText());
            configura.setRfc(txtRFC.getText());
            configura.setTelefono(txtTelefono.getText());
            configura.setEncargado(txtEncargado.getText());
            configura.setHorario(txtHorario.getText());
            configura.setLetraGrande(Integer.parseInt(txtLetra1.getText()));
            configura.setLetraChica(Integer.parseInt(txtLetra2.getText()));
            configura.setMensaje(txtMensaje.getText());
            configuracionesDao.actualizarDatos(configura);   
            dispose();
            Notification panel = new Notification(new javax.swing.JFrame(), Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "Información  registrada exitosamente");
                                 panel.showNotification();
               }
     }
     
     public void eventoF1(){
          txtNombre.setText("");
        txtDireccion.setText("");
        txtRFC.setText("");
        txtTelefono.setText("");
        txtRazonSocial.setText("");
        txtLetra2.setText("");
        txtLetra1.setText("");
        txtEncargado.setText("");
        txtHorario.setText("");
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
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        panelAceptar = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JLabel();
        panelLimpiar = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JLabel();
        panelEliminar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEncargado = new javax.swing.JTextField();
        txtLetra2 = new javax.swing.JTextField();
        txtLetra1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(0, 0, 204));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 255));
        jLabel23.setText("¿Está seguro de ejecutar esta acción? ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 240, -1));

        jLabel25.setBackground(new java.awt.Color(0, 0, 204));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 255));
        jLabel25.setText("Datos de la empresa");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 130, -1));

        panelAceptar.setBackground(new java.awt.Color(255, 255, 255));
        panelAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAceptarMouseEntered(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(153, 204, 255));
        btnAceptar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar nota 2.png"))); // NOI18N
        btnAceptar.setToolTipText("ENTER - Guardar datos");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAceptarMouseExited(evt);
            }
        });
        btnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAceptarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelAceptarLayout = new javax.swing.GroupLayout(panelAceptar);
        panelAceptar.setLayout(panelAceptarLayout);
        panelAceptarLayout.setHorizontalGroup(
            panelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        panelAceptarLayout.setVerticalGroup(
            panelAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(panelAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 50, 50));

        panelLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        panelLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelLimpiarMouseEntered(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar nota 22.png"))); // NOI18N
        btnLimpiar.setToolTipText("F1 - Limpiar todos los campos");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLimpiarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelLimpiarLayout = new javax.swing.GroupLayout(panelLimpiar);
        panelLimpiar.setLayout(panelLimpiarLayout);
        panelLimpiarLayout.setHorizontalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        panelLimpiarLayout.setVerticalGroup(
            panelLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(panelLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 50, 50));

        panelEliminar.setBackground(new java.awt.Color(255, 255, 255));
        panelEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelEliminarMouseEntered(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen5.png"))); // NOI18N
        btnEliminar.setToolTipText("ESCAPE - Cancelar accion y salir");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEliminarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(panelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 50, 50));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtDireccion.setToolTipText("Dirección");
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 70, 250, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNombre.setToolTipText("Nombre de la empresa");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 40, 250, -1));

        txtRFC.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtRFC.setToolTipText("RFC");
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRFCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });
        jPanel1.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 100, 250, -1));

        txtRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtRazonSocial.setToolTipText("Régimen fiscal");
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyTyped(evt);
            }
        });
        jPanel1.add(txtRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 130, 250, -1));

        txtHorario.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtHorario.setToolTipText("Horario");
        txtHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHorarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHorarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 190, 250, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTelefono.setToolTipText("Teléfono");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 160, 250, -1));

        txtEncargado.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtEncargado.setToolTipText("Encargado");
        txtEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEncargadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEncargadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 220, 250, -1));

        txtLetra2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtLetra2.setToolTipText("Letra para ticket 2");
        txtLetra2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLetra2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLetra2KeyTyped(evt);
            }
        });
        jPanel1.add(txtLetra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 280, 250, -1));

        txtLetra1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtLetra1.setToolTipText("Letra para ticket 1");
        txtLetra1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLetra1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLetra1KeyTyped(evt);
            }
        });
        jPanel1.add(txtLetra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 250, 250, -1));

        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtMensaje.setRows(5);
        txtMensaje.setText("\n\n");
        jScrollPane1.setViewportView(txtMensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 290, 90));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 43, 75, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Dirección");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 73, 75, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("RFC");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 105, 75, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Razón Social");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 133, 75, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Letra 1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 253, 75, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Encargado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 223, 75, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Horario");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 193, 75, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Teléfono");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 163, 75, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Mensaje final del ticket");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 150, 10));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Letra 2");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 283, 75, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
         int codigo=evt.getKeyCode();
       switch(codigo){
           case KeyEvent.VK_ESCAPE:
                 dispose();
               break;
           case KeyEvent.VK_ENTER:
                 eventoEnter();
               break;
               
           case KeyEvent.VK_F1:
               eventoF1();
               break;
       }
    }//GEN-LAST:event_formKeyPressed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        eventoEnter();
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseEntered
        panelAceptar.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_btnAceptarMouseEntered

    private void btnAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseExited
        panelAceptar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnAceptarMouseExited

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAceptarKeyPressed
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;

            case KeyEvent.VK_ESCAPE:
            dispose();
            break;

        }
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void panelAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAceptarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelAceptarMouseClicked

    private void panelAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAceptarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelAceptarMouseEntered

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        eventoF1();

    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered

        panelLimpiar.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        panelLimpiar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnLimpiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimpiarKeyPressed
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;

            case KeyEvent.VK_ESCAPE:
            dispose();
            break;

        }
    }//GEN-LAST:event_btnLimpiarKeyPressed

    private void panelLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLimpiarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelLimpiarMouseClicked

    private void panelLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLimpiarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelLimpiarMouseEntered

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        dispose();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        panelEliminar.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        panelEliminar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEliminarKeyPressed
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;

            case KeyEvent.VK_ESCAPE:
            dispose();
            break;

        }
    }//GEN-LAST:event_btnEliminarKeyPressed

    private void panelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEliminarMouseClicked

    private void panelEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEliminarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_panelEliminarMouseEntered

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ESCAPE:
            dispose();
            break;
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped

    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ESCAPE:
            dispose();
            break;
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
      event.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtRFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyReleased
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ESCAPE:
            dispose();
            break;
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;
        }
    }//GEN-LAST:event_txtRFCKeyReleased

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtRazonSocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyReleased
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ESCAPE:
            dispose();
            break;
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;
        }
    }//GEN-LAST:event_txtRazonSocialKeyReleased

    private void txtRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyTyped
       
    }//GEN-LAST:event_txtRazonSocialKeyTyped

    private void txtHorarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorarioKeyReleased
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ESCAPE:
            dispose();
            break;
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;
        }
    }//GEN-LAST:event_txtHorarioKeyReleased

    private void txtHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorarioKeyTyped

    }//GEN-LAST:event_txtHorarioKeyTyped

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ESCAPE:
            dispose();
            break;
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtEncargadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEncargadoKeyReleased
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ESCAPE:
            dispose();
            break;
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;
        }
    }//GEN-LAST:event_txtEncargadoKeyReleased

    private void txtEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEncargadoKeyTyped
      
    }//GEN-LAST:event_txtEncargadoKeyTyped

    private void txtLetra2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetra2KeyReleased
        int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ESCAPE:
            dispose();
            break;
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;
        }
    }//GEN-LAST:event_txtLetra2KeyReleased

    private void txtLetra2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetra2KeyTyped
      event.numberKeyPress(evt);      
    }//GEN-LAST:event_txtLetra2KeyTyped

    private void txtLetra1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetra1KeyReleased
      int codigo=evt.getKeyCode();
        switch(codigo){
            case KeyEvent.VK_ESCAPE:
            dispose();
            break;
            case KeyEvent.VK_ENTER:
            eventoEnter();
            break;

            case KeyEvent.VK_F1:
            eventoF1();
            break;
        }
    }//GEN-LAST:event_txtLetra1KeyReleased

    private void txtLetra1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLetra1KeyTyped
       event.numberKeyPress(evt);
    }//GEN-LAST:event_txtLetra1KeyTyped

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
            java.util.logging.Logger.getLogger(DatosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DatosEmpresa dialog = new DatosEmpresa(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel btnAceptar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAceptar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelLimpiar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtLetra1;
    private javax.swing.JTextField txtLetra2;
    private javax.swing.JTextArea txtMensaje;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

     private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Program Files (x86)\\AppPinturasOssel\\Iconos\\Osel.jpg"));
   }

}