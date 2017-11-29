package App;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;

/**
 *
 * @author juanrmz
 */
public class Dashboard extends javax.swing.JFrame {
    
    AddClient addClient;
    AddSupplier addSupplier;
    AddOrder addOrder;
    ShowClients showClients;
    ShowOrders showOrders;
    

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        initComponents2();
        addClient = new AddClient();
        addOrder = new AddOrder();
        addSupplier = new AddSupplier();
        showClients = new ShowClients();
        showOrders = new ShowOrders();
        ViewPanel.setVisible(true);
        ViewPanel.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents2() {

        BTN_addOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_addOrderActionPerformed(evt);
            }
        });
        
        BTN_addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_addCustomerActionPerformed(evt);
            }
        });
        
        BTN_getClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_getClientsActionPerformed(evt);
            }
        });
        
        BTN_getOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_getOrdersActionPerformed(evt);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subMenu = new javax.swing.JPanel();
        BTN_addCustomer = new javax.swing.JButton();
        BTN_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BTN_addSupplier = new javax.swing.JButton();
        BTN_addOrder = new javax.swing.JButton();
        BTN_getClients = new javax.swing.JButton();
        BTN_getOrders = new javax.swing.JButton();
        BTN_getClients1 = new javax.swing.JButton();
        ViewPanel = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        subMenu.setBackground(new java.awt.Color(51, 153, 255));

        BTN_addCustomer.setText("<html>Agregar Cliente</html>");
        BTN_addCustomer.setToolTipText("");
        BTN_addCustomer.setActionCommand("<html>Agregar <br>Pedido</html>");
        BTN_addCustomer.setMargin(new java.awt.Insets(0, -25, 0, 2));

        BTN_logout.setText("Cerrar Sesión");
        BTN_logout.setContentAreaFilled(false);
        BTN_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_logoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("FruitApp");

        BTN_addSupplier.setText("<html>Agregar <br>Proveedor</html>");
        BTN_addSupplier.setToolTipText("");
        BTN_addSupplier.setMargin(new java.awt.Insets(0, -50, 0, 2));
        BTN_addSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_addSupplierActionPerformed(evt);
            }
        });

        BTN_addOrder.setText("<html>Agregar Pedido</html>");
        BTN_addOrder.setToolTipText("");
        BTN_addOrder.setActionCommand("<html>Agregar <br>Pedido</html>");
        BTN_addOrder.setMargin(new java.awt.Insets(0, -25, 0, 2));
        BTN_addOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_addOrderActionPerformed(evt);
            }
        });

        BTN_getClients.setText("<html>Ver Clientes</html>");
        BTN_getClients.setToolTipText("");
        BTN_getClients.setActionCommand("<html>Agregar <br>Pedido</html>");
        BTN_getClients.setMargin(new java.awt.Insets(0, -50, 0, 2));

        BTN_getOrders.setText("<html>Ver Pedidos</html>");
        BTN_getOrders.setToolTipText("");
        BTN_getOrders.setActionCommand("<html>Agregar <br>Pedido</html>");
        BTN_getOrders.setMargin(new java.awt.Insets(0, -50, 0, 2));
        BTN_getOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_getOrdersActionPerformed(evt);
            }
        });

        BTN_getClients1.setText("<html>Ver Proveedores</html>");
        BTN_getClients1.setToolTipText("");
        BTN_getClients1.setActionCommand("<html>Agregar <br>Pedido</html>");
        BTN_getClients1.setMargin(new java.awt.Insets(0, -50, 0, 2));
        BTN_getClients1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_getClients1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subMenuLayout = new javax.swing.GroupLayout(subMenu);
        subMenu.setLayout(subMenuLayout);
        subMenuLayout.setHorizontalGroup(
            subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subMenuLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BTN_addSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_addOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_getClients, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_getOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_getClients1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BTN_logout, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap())
        );
        subMenuLayout.setVerticalGroup(
            subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(BTN_addSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_addOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_getOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_getClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_getClients1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(BTN_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewPanel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void BTN_addSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_addSupplierActionPerformed
        ViewPanel.getViewport().setView(addSupplier);        
    }//GEN-LAST:event_BTN_addSupplierActionPerformed

    private void BTN_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_logoutActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_BTN_logoutActionPerformed

    private void BTN_getClients1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_getClients1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_getClients1ActionPerformed

    private void BTN_addOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_addOrderActionPerformed
        // TODO add your handling code here:
        ViewPanel.getViewport().setView(addOrder);
    }//GEN-LAST:event_BTN_addOrderActionPerformed

    private void BTN_getOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_getOrdersActionPerformed
        // TODO add your handling code here:
        //showOrders.showAllOrders();
        ViewPanel.getViewport().setView(showOrders);
    }//GEN-LAST:event_BTN_getOrdersActionPerformed

    
    
    private void BTN_addCustomerActionPerformed(java.awt.event.ActionEvent evt) {
        ViewPanel.getViewport().setView(addClient);        
    }
    
    private void BTN_getClientsActionPerformed(java.awt.event.ActionEvent evt) {
        showClients.showAllClients();
        ViewPanel.getViewport().setView(showClients);        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_addCustomer;
    private javax.swing.JButton BTN_addOrder;
    private javax.swing.JButton BTN_addSupplier;
    private javax.swing.JButton BTN_getClients;
    private javax.swing.JButton BTN_getClients1;
    private javax.swing.JButton BTN_getOrders;
    private javax.swing.JButton BTN_logout;
    private javax.swing.JScrollPane ViewPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel subMenu;
    // End of variables declaration//GEN-END:variables
}
