/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Admin;

import Business.AirlineBusiness;
import Flight.Flight;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author martta
 */
public class ViewFlightScheduleJPanel extends javax.swing.JPanel {
    JPanel mainWorkArea;
    AirlineBusiness ab;
    /**
     * Creates new form ViewFlightScheduleJPanel
     */
    public ViewFlightScheduleJPanel(AirlineBusiness ab,JPanel mainWorkArea) {
        initComponents();
        this.ab = ab;
        this.mainWorkArea = mainWorkArea;
        populateTable();
    }
    
    public void populateTable() {
        List<Flight> flightList = ab.getFlightDirectory().getFlights(); 

        DefaultTableModel model = (DefaultTableModel) tblFlightSchedule.getModel();
        model.setRowCount(0);

        for (Flight flight : flightList) {
            Object[] row = new Object[6]; 
            row[0] = flight.getFlightNumber();
            row[1] = flight.getAirlineCompany().getName();
            row[2] = flight.getDepartureStation().getCityName(); 
            row[3] = flight.getArrivalStation().getCityName(); 
            row[4] = flight.getDepartureTime().toString();
            row[5] = flight.getArrivalTime().toString(); 

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
        tblFlightSchedule = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 249, 255));

        tblFlightSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Flight No.", "Airline Co.", "Departure Airport", "Destination", "Departure Time", "Arrival Time"
            }
        ));
        jScrollPane1.setViewportView(tblFlightSchedule);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("View Flight Schedules");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFlightSchedule;
    // End of variables declaration//GEN-END:variables
}
