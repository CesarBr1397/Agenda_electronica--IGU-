package agenda_electronica.igu;

public class Principal extends javax.swing.JFrame {
	String dnis [ ] = new String [10];
	String nombres [ ] = new String [10];
	String apellidos [ ] = new String [10];
	String direcciones [ ] = new String [10];
	String telefonos [ ] = new String [10];
	String fechanac [ ] = new String [10];
	public Principal() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_DNI = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_dic = new javax.swing.JTextField();
        txt_tel = new javax.swing.JLabel();
        txt_tels = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JLabel();
        txt_fechas = new javax.swing.JTextField();
        btn_adelante = new javax.swing.JButton();
        bton_atras = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_indice = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Agenda electrónica");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Apellido:");

        txt_DNI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DNIActionPerformed(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_apellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Dirección:");

        txt_dic.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_tel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_tel.setText("Teléfono:");

        txt_tels.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txt_fecha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_fecha.setText("Fecha Nac:");

        txt_fechas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_adelante.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_adelante.setText(">>");
        btn_adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adelanteActionPerformed(evt);
            }
        });

        bton_atras.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bton_atras.setText("<<");
        bton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_atrasActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Índice:");

        txt_indice.setEditable(false);
        txt_indice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_indice.setText("0");
        txt_indice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_indiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(txt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_dic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tel)
                            .addComponent(txt_fecha))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_fechas)
                            .addComponent(txt_tels))))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(btn_adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_indice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_dic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tel)
                            .addComponent(txt_tels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fecha)
                            .addComponent(txt_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_indice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DNIActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void btn_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adelanteActionPerformed
	String indice = txt_indice.getText();
	int indi = Integer.parseInt(indice);
	if (indi < 9){
	indi = indi+1;
	indice = String.valueOf(indi);
	txt_indice.setText(indice);
	
	txt_DNI.setText(dnis[indi]);
	txt_nombre.setText(nombres[indi]);
	txt_apellido.setText(apellidos[indi]);
	txt_dic.setText(direcciones[indi]);
	txt_tels.setText(telefonos[indi]);
	txt_fechas.setText(fechanac[indi]);
	}
    }//GEN-LAST:event_btn_adelanteActionPerformed

    private void bton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bton_atrasActionPerformed
	String indice = txt_indice.getText();
	int indi = Integer.parseInt(indice);
	if (indi > 0){
	indi = indi-1;
	indice = String.valueOf(indi);
	txt_indice.setText(indice);
	
	txt_DNI.setText(dnis[indi]);
	txt_nombre.setText(nombres[indi]);
	txt_apellido.setText(apellidos[indi]);
	txt_dic.setText(direcciones[indi]);
	txt_tels.setText(telefonos[indi]);
	txt_fechas.setText(fechanac[indi]);
	}         
    }//GEN-LAST:event_bton_atrasActionPerformed

    private void txt_indiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_indiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_indiceActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
	String indice = txt_indice.getText();
	int indi = Integer.parseInt(indice);
	
	dnis[indi] = txt_DNI.getText();
	nombres[indi] = txt_nombre.getText();
	apellidos[indi] = txt_apellido.getText();
	direcciones[indi] = txt_dic.getText();
	telefonos[indi] = txt_tels.getText();
	fechanac[indi] = txt_fechas.getText();
    }//GEN-LAST:event_btn_guardarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adelante;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton bton_atras;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt_DNI;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_dic;
    private javax.swing.JLabel txt_fecha;
    private javax.swing.JTextField txt_fechas;
    private javax.swing.JTextField txt_indice;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JLabel txt_tel;
    private javax.swing.JTextField txt_tels;
    // End of variables declaration//GEN-END:variables
}
