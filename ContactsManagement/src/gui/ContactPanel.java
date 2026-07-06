
package gui;


public class ContactPanel extends javax.swing.JPanel {


    public ContactPanel() {
        initComponents();

    }

    public void setPanelData(String name/*, String number*/){
        this.LabelContactName.setText(name);
        /*this.LabelContactNumber.setText(number);*/
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContactContainer = new javax.swing.JPanel();
        LabelContactName = new javax.swing.JLabel();
        LabelContactNumber = new javax.swing.JLabel();
        ButtonEditContact = new javax.swing.JButton();
        ButtonDeleteContact = new javax.swing.JButton();

        ContactContainer.setBackground(new java.awt.Color(255, 227, 85));
        ContactContainer.setPreferredSize(new java.awt.Dimension(244, 86));

        LabelContactName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelContactName.setForeground(new java.awt.Color(0, 0, 102));
        LabelContactName.setText("Cristo");

        LabelContactNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelContactNumber.setForeground(new java.awt.Color(0, 0, 102));
        LabelContactNumber.setText("301 295865489");

        ButtonEditContact.setText("Editar");
        ButtonEditContact.setMinimumSize(new java.awt.Dimension(77, 27));

        ButtonDeleteContact.setText("Eliminar");
        ButtonDeleteContact.addActionListener(this::ButtonDeleteContactActionPerformed);

        javax.swing.GroupLayout ContactContainerLayout = new javax.swing.GroupLayout(ContactContainer);
        ContactContainer.setLayout(ContactContainerLayout);
        ContactContainerLayout.setHorizontalGroup(
            ContactContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactContainerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ContactContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContactContainerLayout.createSequentialGroup()
                        .addComponent(LabelContactNumber)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContactContainerLayout.createSequentialGroup()
                        .addComponent(LabelContactName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(ButtonEditContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonDeleteContact)
                        .addGap(16, 16, 16))))
        );
        ContactContainerLayout.setVerticalGroup(
            ContactContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ContactContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelContactName)
                    .addComponent(ButtonEditContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDeleteContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelContactNumber)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContactContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ContactContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDeleteContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDeleteContactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDeleteContact;
    private javax.swing.JButton ButtonEditContact;
    private javax.swing.JPanel ContactContainer;
    private javax.swing.JLabel LabelContactName;
    private javax.swing.JLabel LabelContactNumber;
    // End of variables declaration//GEN-END:variables
}
