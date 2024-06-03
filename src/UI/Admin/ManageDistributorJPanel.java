package UI.Admin;

import Airline.AirlineCompany;
import Business.AirlineBusiness;
import Distributor.ADAssignment;
import Distributor.Distributor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author martta
 */
public class ManageDistributorJPanel extends javax.swing.JPanel {
    JPanel mainWorkArea;
    AirlineBusiness ab;
    /**
     * Creates new form ManageDistributorJPanel
     */
    public ManageDistributorJPanel(AirlineBusiness ab,JPanel mainWorkArea) {
        initComponents();
        this.ab = ab;
        this.mainWorkArea = mainWorkArea;
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDistributor.getModel();
        model.setRowCount(0); 

        for (ADAssignment adAssignment : ab.getADassignmentDirectory().getAssignments()) {
            Distributor distributor = adAssignment.getDistributor();
            AirlineCompany airline = adAssignment.getAirlineCompany();

            Object[] row = new Object[4];
            row[0] = distributor.getId();
            row[1] = distributor.getName();
            row[2] = airline.getName(); // get company name from ADAssignment
            double discountRate = distributor.getDiscountRate();
            String formattedDiscount = String.format("%.2f%% off", discountRate * 100);
            row[3] = formattedDiscount;
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDistributor = new javax.swing.JTable();
        btnAddNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblCompany = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        lblDiscount = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 249, 255));

        tblDistributor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Comapny", "Discount Rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDistributor);

        btnAddNew.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblID.setText("ID:");

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblName.setText("Name:");

        lblCompany.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblCompany.setText("Company:");

        lblDiscount.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblDiscount.setText("Discount Rate");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Manage Distributors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2)
                                .addGap(208, 208, 208))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(321, 321, 321))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblCompany)
                        .addGap(18, 18, 18)
                        .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(58, 58, 58)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDiscount)
                                .addGap(18, 18, 18)
                                .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(btnAddNew)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompany)
                    .addComponent(txtCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiscount)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNew))
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        // TODO add your handling code here:                                      
        String id = txtID.getText().trim();
        String name = txtName.getText().trim();
        String companyName = txtCompany.getText().trim();
        double discountRate;

        try {
            discountRate = Double.parseDouble(txtDiscount.getText().trim());
            if (discountRate < 0 || discountRate > 1) {
                JOptionPane.showMessageDialog(this, "Discount rate must be between 0 and 1.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for discount rate.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (id.isEmpty() || name.isEmpty() || companyName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Find the airline company by name
        AirlineCompany airline = ab.getAirlineDirectory().findAirlineByName(companyName);
        if (airline == null) {
            JOptionPane.showMessageDialog(this, "No airline company found with the name: " + companyName, "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if distributor already exists
        Distributor existing = ab.getDistributorDirectory().findDistributorById(id);
        if (existing != null) {
            JOptionPane.showMessageDialog(this, "A distributor with this ID already exists.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Distributor newDistributor = new Distributor(id, name, discountRate);
        ab.getDistributorDirectory().addDistributor(newDistributor);

        // Create and add the ADAssignment
        ADAssignment assignment = new ADAssignment(airline, newDistributor);
        ab.getADassignmentDirectory().addAssignment(assignment);

        populateTable(); // Refresh table

    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDistributor.getSelectedRow();
        if (selectedRow >= 0) {
            String id = (String) tblDistributor.getValueAt(selectedRow, 0);
            Distributor distributor = ab.getDistributorDirectory().findDistributorById(id);
            if (distributor != null) {
                // Remove the distributor from the distributor directory
                ab.getDistributorDirectory().removeDistributor(distributor);

                // Now remove all ADAssignments associated with this distributor
                List<ADAssignment> assignmentsToRemove = new ArrayList<>();
                for (ADAssignment assignment : ab.getADassignmentDirectory().getAssignments()) {
                    if (assignment.getDistributor().equals(distributor)) {
                        assignmentsToRemove.add(assignment);
                    }
                }
                ab.getADassignmentDirectory().getAssignments().removeAll(assignmentsToRemove);

                JOptionPane.showMessageDialog(null, "Distributor and associated assignments deleted successfully!");
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "Error: Distributor not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Distributor from the table.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblDistributor;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
