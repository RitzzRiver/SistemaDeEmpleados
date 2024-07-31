package GUI.Modules;

import ComponentMaintainer.CM_Color;
import GUI.MainModules.Dashboard;
import javax.swing.JOptionPane;
import ComponentMaintainer.DatabaseConection;
/**
 * @author Kris
 */
public class EmployeeProfile extends javax.swing.JPanel {
    public  String sessionID;
    /**
     * Creates new form EmployeeRegister
     * @param id the id from the user
     */
    public EmployeeProfile(String id) {
        this.sessionID = id;
        initComponents();
        DatabaseConection dbc = new DatabaseConection();
        dbc.connectDatabase();
        System.out.println("select * from users where email = \"" + sessionID + "\"");

        try {
                dbc.resultSet = dbc.statement.executeQuery("select * from users where id = \"" + sessionID + "\"");

            if (dbc.resultSet.next()) {
                // name, address, birthday, phoneNumber, email, position, 
                txt_name.setText(dbc.resultSet.getString("name"));
                txt_address.setText(dbc.resultSet.getString("address"));
                txt_birthday.setText(dbc.resultSet.getString("birthday"));
                txt_phoneNumber.setText(dbc.resultSet.getString("phoneNumber"));
                txt_email.setText(dbc.resultSet.getString("email"));
                txt_position.setText(dbc.resultSet.getString("position"));
                
                } else {

                    System.out.println("ERROR AL RECIBIR DATOS");

                }
            }
        catch (Exception e) {
            System.err.println("ERROR " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmployeeRegisterContainer = new javax.swing.JPanel();
        lbl_moduleName = new javax.swing.JLabel();
        nameContainer = new javax.swing.JPanel();
        txt_name = new javax.swing.JTextField();
        addressContainer = new javax.swing.JPanel();
        txt_address = new javax.swing.JTextField();
        birthdayContainer = new javax.swing.JPanel();
        txt_birthday = new javax.swing.JTextField();
        email_Container = new javax.swing.JPanel();
        txt_email = new javax.swing.JTextField();
        position_Container = new javax.swing.JPanel();
        txt_position = new javax.swing.JTextField();
        phoneNumberContainer = new javax.swing.JPanel();
        txt_phoneNumber = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btn_save = new javax.swing.JPanel();
        txt_btn_save = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1080, 640));
        setMinimumSize(new java.awt.Dimension(1080, 640));
        setPreferredSize(new java.awt.Dimension(1080, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmployeeRegisterContainer.setBackground(CM_Color.Background());
        EmployeeRegisterContainer.setMaximumSize(new java.awt.Dimension(1080, 640));
        EmployeeRegisterContainer.setMinimumSize(new java.awt.Dimension(1080, 640));
        EmployeeRegisterContainer.setPreferredSize(new java.awt.Dimension(1080, 640));

        lbl_moduleName.setFont(new java.awt.Font("Bungee", 0, 24)); // NOI18N
        lbl_moduleName.setForeground(CM_Color.Text());
        lbl_moduleName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_moduleName.setText("Perfil de empleado");

        nameContainer.setBackground(CM_Color.Button());
        nameContainer.setPreferredSize(new java.awt.Dimension(280, 30));

        txt_name.setBackground(CM_Color.Button());
        txt_name.setFont(new java.awt.Font("Bungee", 0, 12)); // NOI18N
        txt_name.setForeground(CM_Color.CloseButtonHover());
        txt_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_name.setBorder(null);
        txt_name.setPreferredSize(new java.awt.Dimension(245, 30));
        txt_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout nameContainerLayout = new javax.swing.GroupLayout(nameContainer);
        nameContainer.setLayout(nameContainerLayout);
        nameContainerLayout.setHorizontalGroup(
            nameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        nameContainerLayout.setVerticalGroup(
            nameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nameContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        addressContainer.setBackground(CM_Color.Button());
        addressContainer.setPreferredSize(new java.awt.Dimension(280, 30));

        txt_address.setBackground(CM_Color.Button());
        txt_address.setFont(new java.awt.Font("Bungee", 0, 12)); // NOI18N
        txt_address.setForeground(CM_Color.CloseButtonHover());
        txt_address.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_address.setBorder(null);
        txt_address.setPreferredSize(new java.awt.Dimension(245, 30));
        txt_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_addressFocusLost(evt);
            }
        });

        javax.swing.GroupLayout addressContainerLayout = new javax.swing.GroupLayout(addressContainer);
        addressContainer.setLayout(addressContainerLayout);
        addressContainerLayout.setHorizontalGroup(
            addressContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addressContainerLayout.setVerticalGroup(
            addressContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addressContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        birthdayContainer.setBackground(CM_Color.Button());
        birthdayContainer.setPreferredSize(new java.awt.Dimension(280, 30));

        txt_birthday.setBackground(CM_Color.Button());
        txt_birthday.setFont(new java.awt.Font("Bungee", 0, 12)); // NOI18N
        txt_birthday.setForeground(CM_Color.CloseButtonHover());
        txt_birthday.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_birthday.setBorder(null);
        txt_birthday.setPreferredSize(new java.awt.Dimension(245, 30));
        txt_birthday.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_birthdayFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_birthdayFocusLost(evt);
            }
        });

        javax.swing.GroupLayout birthdayContainerLayout = new javax.swing.GroupLayout(birthdayContainer);
        birthdayContainer.setLayout(birthdayContainerLayout);
        birthdayContainerLayout.setHorizontalGroup(
            birthdayContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(birthdayContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_birthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        birthdayContainerLayout.setVerticalGroup(
            birthdayContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, birthdayContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        email_Container.setBackground(CM_Color.Button());
        email_Container.setPreferredSize(new java.awt.Dimension(280, 30));

        txt_email.setBackground(CM_Color.Button());
        txt_email.setFont(new java.awt.Font("Bungee", 0, 12)); // NOI18N
        txt_email.setForeground(CM_Color.CloseButtonHover());
        txt_email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_email.setBorder(null);
        txt_email.setPreferredSize(new java.awt.Dimension(245, 30));
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });

        javax.swing.GroupLayout email_ContainerLayout = new javax.swing.GroupLayout(email_Container);
        email_Container.setLayout(email_ContainerLayout);
        email_ContainerLayout.setHorizontalGroup(
            email_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(email_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        email_ContainerLayout.setVerticalGroup(
            email_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, email_ContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        position_Container.setBackground(CM_Color.Button());
        position_Container.setPreferredSize(new java.awt.Dimension(280, 30));

        txt_position.setBackground(ColorScheme.SetColor.DESERT_SAND);
        txt_position.setFont(new java.awt.Font("Bungee", 0, 12)); // NOI18N
        txt_position.setForeground(CM_Color.CloseButtonHover());
        txt_position.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_position.setBorder(null);
        txt_position.setEnabled(false);
        txt_position.setPreferredSize(new java.awt.Dimension(245, 30));
        txt_position.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_positionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_positionFocusLost(evt);
            }
        });

        javax.swing.GroupLayout position_ContainerLayout = new javax.swing.GroupLayout(position_Container);
        position_Container.setLayout(position_ContainerLayout);
        position_ContainerLayout.setHorizontalGroup(
            position_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(position_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_position, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        position_ContainerLayout.setVerticalGroup(
            position_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, position_ContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_position, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        phoneNumberContainer.setBackground(CM_Color.Button());
        phoneNumberContainer.setPreferredSize(new java.awt.Dimension(280, 30));

        txt_phoneNumber.setBackground(CM_Color.Button());
        txt_phoneNumber.setFont(new java.awt.Font("Bungee", 0, 12)); // NOI18N
        txt_phoneNumber.setForeground(CM_Color.CloseButtonHover());
        txt_phoneNumber.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_phoneNumber.setBorder(null);
        txt_phoneNumber.setPreferredSize(new java.awt.Dimension(245, 30));
        txt_phoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_phoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_phoneNumberFocusLost(evt);
            }
        });

        javax.swing.GroupLayout phoneNumberContainerLayout = new javax.swing.GroupLayout(phoneNumberContainer);
        phoneNumberContainer.setLayout(phoneNumberContainerLayout);
        phoneNumberContainerLayout.setHorizontalGroup(
            phoneNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneNumberContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        phoneNumberContainerLayout.setVerticalGroup(
            phoneNumberContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phoneNumberContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        btn_save.setBackground(CM_Color.Button());
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.setPreferredSize(new java.awt.Dimension(150, 35));

        txt_btn_save.setFont(new java.awt.Font("Bungee", 0, 12)); // NOI18N
        txt_btn_save.setForeground(CM_Color.Text());
        txt_btn_save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_btn_save.setText("Guardar");

        javax.swing.GroupLayout btn_saveLayout = new javax.swing.GroupLayout(btn_save);
        btn_save.setLayout(btn_saveLayout);
        btn_saveLayout.setHorizontalGroup(
            btn_saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btn_saveLayout.setVerticalGroup(
            btn_saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout EmployeeRegisterContainerLayout = new javax.swing.GroupLayout(EmployeeRegisterContainer);
        EmployeeRegisterContainer.setLayout(EmployeeRegisterContainerLayout);
        EmployeeRegisterContainerLayout.setHorizontalGroup(
            EmployeeRegisterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeRegisterContainerLayout.createSequentialGroup()
                .addGroup(EmployeeRegisterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position_Container, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_Container, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EmployeeRegisterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EmployeeRegisterContainerLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(lbl_moduleName))
                        .addGroup(EmployeeRegisterContainerLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(EmployeeRegisterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                                .addComponent(jSeparator2)
                                .addComponent(addressContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                                .addComponent(jSeparator3)
                                .addComponent(jSeparator5)
                                .addComponent(birthdayContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                                .addComponent(jSeparator4)))))
                .addContainerGap(468, Short.MAX_VALUE))
        );
        EmployeeRegisterContainerLayout.setVerticalGroup(
            EmployeeRegisterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeRegisterContainerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_moduleName)
                .addGap(37, 37, 37)
                .addComponent(nameContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addressContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(birthdayContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phoneNumberContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(position_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        add(EmployeeRegisterContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nameFocusGained
        TxtField.Focus.Gain(txt_name, "usuario:");
    }//GEN-LAST:event_txt_nameFocusGained

    private void txt_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nameFocusLost
        TxtField.Focus.Lost(txt_name, "Usuario:");
    }//GEN-LAST:event_txt_nameFocusLost

    private void txt_addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_addressFocusGained
        TxtField.Focus.Gain(txt_address, "dirección:");
    }//GEN-LAST:event_txt_addressFocusGained

    private void txt_addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_addressFocusLost
        TxtField.Focus.Lost(txt_address, "Dirección:");
    }//GEN-LAST:event_txt_addressFocusLost

    private void txt_birthdayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_birthdayFocusGained
        TxtField.Focus.Gain(txt_birthday, "fecha de nacimiento:");
    }//GEN-LAST:event_txt_birthdayFocusGained

    private void txt_birthdayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_birthdayFocusLost
        TxtField.Focus.Lost(txt_birthday, "Fecha de nacimiento:");
    }//GEN-LAST:event_txt_birthdayFocusLost

    private void txt_phoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_phoneNumberFocusGained
        TxtField.Focus.Gain(txt_phoneNumber, "número telefonico:");
    }//GEN-LAST:event_txt_phoneNumberFocusGained

    private void txt_phoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_phoneNumberFocusLost
        TxtField.Focus.Lost(txt_phoneNumber, "Número telefonico:");
    }//GEN-LAST:event_txt_phoneNumberFocusLost

    private void txt_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusGained
        TxtField.Focus.Gain(txt_email, "correo electronico:");
    }//GEN-LAST:event_txt_emailFocusGained

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        TxtField.Focus.Lost(txt_email, "Correo electronico:");
    }//GEN-LAST:event_txt_emailFocusLost

    private void txt_positionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_positionFocusGained
        TxtField.Focus.Gain(txt_position, "cargo:");
    }//GEN-LAST:event_txt_positionFocusGained

    private void txt_positionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_positionFocusLost
        TxtField.Focus.Lost(txt_position, "Cargo:");
    }//GEN-LAST:event_txt_positionFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EmployeeRegisterContainer;
    private javax.swing.JPanel addressContainer;
    private javax.swing.JPanel birthdayContainer;
    private javax.swing.JPanel btn_save;
    private javax.swing.JPanel email_Container;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_moduleName;
    private javax.swing.JPanel nameContainer;
    private javax.swing.JPanel phoneNumberContainer;
    private javax.swing.JPanel position_Container;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_birthday;
    private javax.swing.JLabel txt_btn_save;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phoneNumber;
    private javax.swing.JTextField txt_position;
    // End of variables declaration//GEN-END:variables
}
