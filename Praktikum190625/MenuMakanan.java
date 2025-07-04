/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum190625;

/**
 *
 * @author ririn
 */
public class MenuMakanan extends javax.swing.JFrame {

    /**
     * Creates new form MenuMakanan
     */
    private MenuUtama utama;
    public MenuMakanan() {
        initComponents();
    }
    
    public MenuMakanan (MenuUtama utama){
        this.utama = utama;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbMieAyam = new javax.swing.JComboBox<>();
        chkNasiPadang = new javax.swing.JCheckBox();
        txtTotalRotiSweety = new javax.swing.JTextField();
        chkRotiSweety = new javax.swing.JCheckBox();
        txtTotalKwetiau = new javax.swing.JTextField();
        chkMieAyam = new javax.swing.JCheckBox();
        txtTotalNasiPadang = new javax.swing.JTextField();
        txtRotiSweety = new javax.swing.JTextField();
        txtTotalMieAyam = new javax.swing.JTextField();
        txtKwetiau = new javax.swing.JTextField();
        txtNasiPadang = new javax.swing.JTextField();
        txtMieAyam = new javax.swing.JTextField();
        btnTotalHarga = new javax.swing.JButton();
        cbRotiSweety = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbKwetiau = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        cbNasiPadang = new javax.swing.JComboBox<>();
        chkKwetiau = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("DAFTAR MENU MAKANAN");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));

        cbMieAyam.setBackground(new java.awt.Color(255, 204, 204));
        cbMieAyam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbMieAyam.setForeground(new java.awt.Color(255, 102, 102));
        cbMieAyam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbMieAyam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMieAyamActionPerformed(evt);
            }
        });

        chkNasiPadang.setBackground(new java.awt.Color(255, 204, 204));
        chkNasiPadang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkNasiPadang.setForeground(new java.awt.Color(255, 102, 102));
        chkNasiPadang.setText("Nasi Padang");
        chkNasiPadang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNasiPadangActionPerformed(evt);
            }
        });

        txtTotalRotiSweety.setBackground(new java.awt.Color(255, 204, 204));
        txtTotalRotiSweety.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTotalRotiSweety.setForeground(new java.awt.Color(255, 102, 102));
        txtTotalRotiSweety.setText("0");

        chkRotiSweety.setBackground(new java.awt.Color(255, 204, 204));
        chkRotiSweety.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkRotiSweety.setForeground(new java.awt.Color(255, 102, 102));
        chkRotiSweety.setText("Roti Sweety");
        chkRotiSweety.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRotiSweetyActionPerformed(evt);
            }
        });

        txtTotalKwetiau.setBackground(new java.awt.Color(255, 204, 204));
        txtTotalKwetiau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTotalKwetiau.setForeground(new java.awt.Color(255, 102, 102));
        txtTotalKwetiau.setText("0");

        chkMieAyam.setBackground(new java.awt.Color(255, 204, 204));
        chkMieAyam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkMieAyam.setForeground(new java.awt.Color(255, 102, 102));
        chkMieAyam.setText("Mie Ayam");
        chkMieAyam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMieAyamActionPerformed(evt);
            }
        });

        txtTotalNasiPadang.setBackground(new java.awt.Color(255, 204, 204));
        txtTotalNasiPadang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTotalNasiPadang.setForeground(new java.awt.Color(255, 102, 102));
        txtTotalNasiPadang.setText("0");

        txtRotiSweety.setBackground(new java.awt.Color(255, 204, 204));
        txtRotiSweety.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtRotiSweety.setForeground(new java.awt.Color(255, 102, 102));
        txtRotiSweety.setText("0");
        txtRotiSweety.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRotiSweetyActionPerformed(evt);
            }
        });

        txtTotalMieAyam.setBackground(new java.awt.Color(255, 204, 204));
        txtTotalMieAyam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTotalMieAyam.setForeground(new java.awt.Color(255, 102, 102));
        txtTotalMieAyam.setText("0");

        txtKwetiau.setBackground(new java.awt.Color(255, 204, 204));
        txtKwetiau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtKwetiau.setForeground(new java.awt.Color(255, 102, 102));
        txtKwetiau.setText("0");

        txtNasiPadang.setBackground(new java.awt.Color(255, 204, 204));
        txtNasiPadang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNasiPadang.setForeground(new java.awt.Color(255, 102, 102));
        txtNasiPadang.setText("0");
        txtNasiPadang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNasiPadangActionPerformed(evt);
            }
        });

        txtMieAyam.setBackground(new java.awt.Color(255, 204, 204));
        txtMieAyam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMieAyam.setForeground(new java.awt.Color(255, 102, 102));
        txtMieAyam.setText("0");

        btnTotalHarga.setBackground(new java.awt.Color(255, 204, 204));
        btnTotalHarga.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTotalHarga.setForeground(new java.awt.Color(255, 102, 102));
        btnTotalHarga.setText("Total Harga");
        btnTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalHargaActionPerformed(evt);
            }
        });

        cbRotiSweety.setBackground(new java.awt.Color(255, 204, 204));
        cbRotiSweety.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbRotiSweety.setForeground(new java.awt.Color(255, 102, 102));
        cbRotiSweety.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbRotiSweety.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRotiSweetyActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("TOTAL");

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("JUMLAH");

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("NAMA");

        cbKwetiau.setBackground(new java.awt.Color(255, 204, 204));
        cbKwetiau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbKwetiau.setForeground(new java.awt.Color(255, 102, 102));
        cbKwetiau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbKwetiau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKwetiauActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("HARGA");

        txtTotalHarga.setBackground(new java.awt.Color(255, 204, 204));
        txtTotalHarga.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTotalHarga.setForeground(new java.awt.Color(255, 102, 102));
        txtTotalHarga.setText("0");

        cbNasiPadang.setBackground(new java.awt.Color(255, 204, 204));
        cbNasiPadang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbNasiPadang.setForeground(new java.awt.Color(255, 102, 102));
        cbNasiPadang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jumlah", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbNasiPadang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNasiPadangActionPerformed(evt);
            }
        });

        chkKwetiau.setBackground(new java.awt.Color(255, 204, 204));
        chkKwetiau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chkKwetiau.setForeground(new java.awt.Color(255, 102, 102));
        chkKwetiau.setText("Kweatiau");
        chkKwetiau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKwetiauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(510, Short.MAX_VALUE)
                .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel4)
                            .addGap(102, 102, 102)
                            .addComponent(jLabel5)
                            .addGap(103, 103, 103)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(32, 32, 32))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(chkRotiSweety, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkKwetiau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkNasiPadang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkMieAyam, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtKwetiau, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNasiPadang, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMieAyam, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRotiSweety, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbNasiPadang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbKwetiau, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbRotiSweety, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTotalHarga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbMieAyam, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTotalKwetiau, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTotalNasiPadang, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTotalMieAyam, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTotalRotiSweety, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(21, 21, 21)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtTotalMieAyam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(txtTotalNasiPadang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtTotalKwetiau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(txtTotalRotiSweety, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbMieAyam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(cbNasiPadang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(cbKwetiau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(cbRotiSweety, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chkMieAyam)
                                        .addComponent(txtMieAyam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNasiPadang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkNasiPadang))
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chkKwetiau)
                                        .addComponent(txtKwetiau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chkRotiSweety)
                                        .addComponent(txtRotiSweety, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(48, 48, 48)
                            .addComponent(btnTotalHarga)))
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setForeground(new java.awt.Color(255, 102, 102));

        btnReset.setBackground(new java.awt.Color(255, 204, 204));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 102, 102));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnReturn.setBackground(new java.awt.Color(255, 204, 204));
        btnReturn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 102, 102));
        btnReturn.setText("Kembali ke Menu Utama");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(211, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMieAyamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMieAyamActionPerformed
        int jml = (int) cbMieAyam.getSelectedIndex();
        double harga = Double.parseDouble(txtMieAyam.getText());
        double total = jml*harga;
        txtTotalMieAyam.setText(Double.toString(total));
    }//GEN-LAST:event_cbMieAyamActionPerformed

    private void chkNasiPadangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNasiPadangActionPerformed
        txtNasiPadang.setText("45000");
    }//GEN-LAST:event_chkNasiPadangActionPerformed

    private void chkRotiSweetyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRotiSweetyActionPerformed
        txtRotiSweety.setText("1000000");
    }//GEN-LAST:event_chkRotiSweetyActionPerformed

    private void chkMieAyamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMieAyamActionPerformed
        txtMieAyam.setText("25000");
    }//GEN-LAST:event_chkMieAyamActionPerformed

    private void txtRotiSweetyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRotiSweetyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRotiSweetyActionPerformed

    private void txtNasiPadangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNasiPadangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNasiPadangActionPerformed

    private void btnTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalHargaActionPerformed
        double mieAyam = Double.parseDouble(txtTotalMieAyam.getText());
        double nasiPadang = Double.parseDouble(txtTotalNasiPadang.getText());
        double kwetiau = Double.parseDouble(txtTotalKwetiau.getText());
        double rotiSweety = Double.parseDouble(txtTotalRotiSweety.getText());

        double total = mieAyam + nasiPadang + kwetiau + rotiSweety;
        txtTotalHarga.setText(String.valueOf(total));
    }//GEN-LAST:event_btnTotalHargaActionPerformed

    private void cbRotiSweetyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRotiSweetyActionPerformed
        int jml = (int) cbRotiSweety.getSelectedIndex();
        double harga = Double.parseDouble(txtRotiSweety.getText());
        double total = jml*harga;
        txtTotalRotiSweety.setText(Double.toString(total));
    }//GEN-LAST:event_cbRotiSweetyActionPerformed

    private void cbKwetiauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKwetiauActionPerformed
        int jml = (int) cbKwetiau.getSelectedIndex();
        double harga = Double.parseDouble(txtKwetiau.getText());
        double total = jml*harga;
        txtTotalKwetiau.setText(Double.toString(total));
    }//GEN-LAST:event_cbKwetiauActionPerformed

    private void cbNasiPadangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNasiPadangActionPerformed
        int jml = (int) cbNasiPadang.getSelectedIndex();
        double harga = Double.parseDouble(txtNasiPadang.getText());
        double total = jml*harga;
        txtTotalNasiPadang.setText(Double.toString(total));
    }//GEN-LAST:event_cbNasiPadangActionPerformed

    private void chkKwetiauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKwetiauActionPerformed
        txtKwetiau.setText("45000");
    }//GEN-LAST:event_chkKwetiauActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMieAyam.setText("0");
        txtNasiPadang.setText("0");
        txtKwetiau.setText("0");
        txtRotiSweety.setText("0");
        txtTotalHarga.setText("0");
        cbMieAyam.setSelectedIndex(0);
        cbNasiPadang.setSelectedIndex(0);
        cbKwetiau.setSelectedIndex(0);
        cbRotiSweety.setSelectedIndex(0);
        chkMieAyam.setSelected(false);
        chkNasiPadang.setSelected(false);
        chkKwetiau.setSelected(false);
        chkRotiSweety.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        String total = txtTotalHarga.getText();
        utama.setTotalMakanan(total);
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnTotalHarga;
    private javax.swing.JComboBox<String> cbKwetiau;
    private javax.swing.JComboBox<String> cbMieAyam;
    private javax.swing.JComboBox<String> cbNasiPadang;
    private javax.swing.JComboBox<String> cbRotiSweety;
    private javax.swing.JCheckBox chkKwetiau;
    private javax.swing.JCheckBox chkMieAyam;
    private javax.swing.JCheckBox chkNasiPadang;
    private javax.swing.JCheckBox chkRotiSweety;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtKwetiau;
    private javax.swing.JTextField txtMieAyam;
    private javax.swing.JTextField txtNasiPadang;
    private javax.swing.JTextField txtRotiSweety;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JTextField txtTotalKwetiau;
    private javax.swing.JTextField txtTotalMieAyam;
    private javax.swing.JTextField txtTotalNasiPadang;
    private javax.swing.JTextField txtTotalRotiSweety;
    // End of variables declaration//GEN-END:variables
}
