/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;


public class popup_proyek extends javax.swing.JFrame {
private Connection conn = new koneksi().connect();
private DefaultTableModel tabmode;
public form_pendapatan proyek=null;

    public popup_proyek() {
        initComponents();
        datatable();
        this.setLocationRelativeTo(null);
    }

    protected void datatable (){
        Object[] Baris ={"Kode Proyek","Nama Proyek","Tanggal", "ID Client","Nama Perusahaan", "Kode Subklasifikasi", "Klasifikasi Bidan Usaha", "Waktu Pelaksanaan","Harga Project"};
        tabmode = new DefaultTableModel(null, Baris);
        String cariitem =tcari.getText();
        try {
             String sql="SELECT * FROM data_proyek where kd_proyek like '%"+cariitem+"%'or nama_proyek like"
                    + "'%"+cariitem+"%'order by kd_proyek asc";
            Statement stat = conn.createStatement();
            ResultSet hasil=stat.executeQuery(sql);
            while (hasil.next()) { 
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                    hasil.getString(6),
                    hasil.getString(7),
                    hasil.getString(8),
                    hasil.getString(9)
                });
            }
            tabelproyek.setModel(tabmode);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"data gagal dipanggil"+e);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelproyek = new javax.swing.JTable();
        tcari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/LOGO1.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Data Project");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel3.setBackground(new java.awt.Color(255, 171, 30));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelproyek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelproyek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelproyekMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelproyek);

        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcariKeyReleased(evt);
            }
        });

        jLabel2.setText("CARI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        jPanel4.setBackground(new java.awt.Color(39, 97, 184));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CV.Aeknagok");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(404, 404, 404))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelproyekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelproyekMouseClicked
        int bar = tabelproyek.getSelectedRow();
        proyek.kdproyek = tabelproyek.getValueAt(bar, 0).toString();
        proyek.nama =tabelproyek.getValueAt(bar, 1).toString();
        proyek.id_client = tabelproyek.getValueAt(bar, 2).toString();
        proyek.nm_p = tabelproyek.getValueAt(bar, 3).toString();
        proyek.tgl = tabelproyek.getValueAt(bar, 4).toString();
        proyek.kodesub = tabelproyek.getValueAt(bar, 5).toString();
        proyek.klasi = tabelproyek.getValueAt(bar, 6).toString();
        proyek.waktu =tabelproyek.getValueAt(bar, 7).toString();
        proyek.harga = tabelproyek.getValueAt(bar, 8).toString();
        proyek.itemTerpilih();
        this.dispose();        
    }//GEN-LAST:event_tabelproyekMouseClicked

    private void tcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyReleased
    tabmode.getDataVector().removeAllElements();
    tabmode.fireTableDataChanged();
        try {
            String sql = "select * from data_proyek where kd_proyek like '%" + tcari.getText() + "%' or nama_proyek like'%" + tcari.getText() + "%' or tanggal like'%" + tcari.getText() + "%' or id_client like'%" + tcari.getText() + "%' or nama_proyek like'%" + tcari.getText() + "%' ";
            try (java.sql.Statement stat = conn.createStatement()) {
                ResultSet hasil = stat.executeQuery(sql);
                while(hasil.next()){
                    String a = hasil.getString("kd_proyek");
                    String b = hasil.getString("nama_proyek");
                    String c = hasil.getString("tanggal");
                    String d = hasil.getString("id_client");
                    String e = hasil.getString("nama_perusahaan");
                    String f = hasil.getString("klasifikasi_bu");
                    String g = hasil.getString("kd_subklasifikasi");
                    String h = hasil.getString("lama_waktu");
                    String i = hasil.getString("harga_proyek");
                    String[] data = {a,b,c,d,e,f,g,h,i};
            tabmode.addRow(data);
                }
                hasil.close();
                    stat.close();
            }
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
    }//GEN-LAST:event_tcariKeyReleased

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
            java.util.logging.Logger.getLogger(popup_proyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popup_proyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popup_proyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popup_proyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popup_proyek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelproyek;
    private javax.swing.JTextField tcari;
    // End of variables declaration//GEN-END:variables
}
