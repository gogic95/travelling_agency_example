/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.form;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gogic
 */
public class FrmAranzmanMain extends javax.swing.JDialog {

    /**
     * Creates new form FrmAranzmanMain
     * @param parent
     * @param modal
     */
    public FrmAranzmanMain(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lblI3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lblUkupan = new javax.swing.JLabel();
        lblPopunjen = new javax.swing.JLabel();
        lblDestinacija = new javax.swing.JLabel();
        lblNaziv = new javax.swing.JLabel();
        lblOpis = new javax.swing.JLabel();
        lblKomercijalista = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAranzmani = new javax.swing.JTable();
        btnDodajAranzman = new javax.swing.JButton();
        btnIzmeniAranzman = new javax.swing.JButton();
        btnObrisiAranzman = new javax.swing.JButton();
        btnPogledajUgovor = new javax.swing.JButton();
        btnKreirajUgovor = new javax.swing.JButton();
        btnPretraziUgovore = new javax.swing.JButton();
        txtPretrazi = new javax.swing.JTextField();
        btnPretraziAranzmane = new javax.swing.JButton();
        btnResetujTabelu = new javax.swing.JButton();
        txtPretraziUgovore = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("[Client] - agency v1.0 - Aranzman");
        setModal(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Destinacija"));

        lbl1.setText("Komercijalista: ");

        lbl2.setText("Naziv:");

        lb3.setText("Opis:");

        lblI3.setText("ID Destinacije:");

        lbl4.setText("Ukupan kapacitet:");

        lbl5.setText("Popunjen kapacitet:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(lblOpis, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblKomercijalista, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl4)
                            .addComponent(lbl5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPopunjen)
                            .addComponent(lblUkupan))
                        .addGap(524, 524, 524))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblI3)
                        .addGap(18, 18, 18)
                        .addComponent(lblDestinacija, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(lbl4)
                    .addComponent(lblUkupan)
                    .addComponent(lblNaziv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(lbl5)
                    .addComponent(lblPopunjen)
                    .addComponent(lblOpis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblI3)
                    .addComponent(lblDestinacija))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKomercijalista))
                .addContainerGap())
        );

        tblAranzmani.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAranzmani.setRowHeight(22);
        jScrollPane1.setViewportView(tblAranzmani);

        btnDodajAranzman.setText("Dodaj aranzman");

        btnIzmeniAranzman.setText("Izmeni aranzman");

        btnObrisiAranzman.setText("Obrisi aranzman");

        btnPogledajUgovor.setText("Pogledaj ugovor");

        btnKreirajUgovor.setText("Kreiraj ugovor");

        btnPretraziUgovore.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnPretraziUgovore.setText("Pretrazi po broju ugovora");

        btnPretraziAranzmane.setText("Pretrazi aranzmane");

        btnResetujTabelu.setText("Resetuj tabelu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnPretraziAranzmane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnResetujTabelu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtPretrazi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPretraziUgovore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(btnDodajAranzman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIzmeniAranzman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnObrisiAranzman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPogledajUgovor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKreirajUgovor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPretraziUgovore))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodajAranzman)
                        .addGap(18, 18, 18)
                        .addComponent(btnIzmeniAranzman)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisiAranzman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(btnKreirajUgovor)
                        .addGap(18, 18, 18)
                        .addComponent(btnPogledajUgovor)
                        .addGap(18, 18, 18)
                        .addComponent(btnPretraziUgovore))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPretraziUgovore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPretraziAranzmane)
                    .addComponent(btnResetujTabelu))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnDodajAranzman() {
        return btnDodajAranzman;
    }

    public JButton getBtnIzmeniAranzman() {
        return btnIzmeniAranzman;
    }

    public JButton getBtnKreirajUgovor() {
        return btnKreirajUgovor;
    }

    public JButton getBtnObrisiAranzman() {
        return btnObrisiAranzman;
    }

    public JButton getBtnPretraziAranzmane() {
        return btnPretraziAranzmane;
    }

    public JButton getBtnPretraziUgovore() {
        return btnPretraziUgovore;
    }

    public JButton getBtnResetujTabelu() {
        return btnResetujTabelu;
    }

    public JButton getBtnStorniraj() {
        return btnPogledajUgovor;
    }

    

    public JLabel getLblDestinacija() {
        return lblDestinacija;
    }

    public JLabel getLblKomercijalista() {
        return lblKomercijalista;
    }

    public JLabel getLblNaziv() {
        return lblNaziv;
    }

    public JLabel getLblOpis() {
        return lblOpis;
    }

    public JLabel getLblPopunjen() {
        return lblPopunjen;
    }

    public JLabel getLblUkupan() {
        return lblUkupan;
    }

    public JTable getTblAranzmani() {
        return tblAranzmani;
    }

    public JTextField getTxtPretrazi() {
        return txtPretrazi;
    }
    public void addBtnDodajAranzmanActionListener(ActionListener actionListener){
        btnDodajAranzman.addActionListener(actionListener);
    }
    public void addBtnIzmeniAranzmanActionListener(ActionListener actionListener){
        btnIzmeniAranzman.addActionListener(actionListener);
    }
    public void addBtnKreirajUgovorActionListener(ActionListener actionListener){
        btnKreirajUgovor.addActionListener(actionListener);
    }
    public void addBtnObrisiAranzmanActionListener(ActionListener actionListener){
        btnObrisiAranzman.addActionListener(actionListener);
    }
    public void addBtnPretraziAranzmanActionListener(ActionListener actionListener){
        btnPretraziAranzmane.addActionListener(actionListener);
    }
    public void addBtnPretraziUgovorActionListener(ActionListener actionListener){
        btnPretraziUgovore.addActionListener(actionListener);
    }
    public void addBtnResetujTabeluActionListener(ActionListener actionListener){
        btnResetujTabelu.addActionListener(actionListener);
    }
    public void addBbtnPogledajUgovorActionListener(ActionListener actionListener){
        btnPogledajUgovor.addActionListener(actionListener);
    }

    public JTextField getTxtPretraziUgovore() {
        return txtPretraziUgovore;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajAranzman;
    private javax.swing.JButton btnIzmeniAranzman;
    private javax.swing.JButton btnKreirajUgovor;
    private javax.swing.JButton btnObrisiAranzman;
    private javax.swing.JButton btnPogledajUgovor;
    private javax.swing.JButton btnPretraziAranzmane;
    private javax.swing.JButton btnPretraziUgovore;
    private javax.swing.JButton btnResetujTabelu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblDestinacija;
    private javax.swing.JLabel lblI3;
    private javax.swing.JLabel lblKomercijalista;
    private javax.swing.JLabel lblNaziv;
    private javax.swing.JLabel lblOpis;
    private javax.swing.JLabel lblPopunjen;
    private javax.swing.JLabel lblUkupan;
    private javax.swing.JTable tblAranzmani;
    private javax.swing.JTextField txtPretrazi;
    private javax.swing.JTextField txtPretraziUgovore;
    // End of variables declaration//GEN-END:variables

    public void setColumnWidth() {
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        tblAranzmani.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblAranzmani.getColumnModel().getColumn(2).setMaxWidth(150);
        tblAranzmani.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        
        tblAranzmani.getColumnModel().getColumn(3).setPreferredWidth(150);
        tblAranzmani.getColumnModel().getColumn(3).setMaxWidth(150);
        tblAranzmani.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        
        
        tblAranzmani.getColumnModel().getColumn(0).setPreferredWidth(150);
        tblAranzmani.getColumnModel().getColumn(0).setMaxWidth(150);
        tblAranzmani.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        
        tblAranzmani.getColumnModel().getColumn(4).setPreferredWidth(150);
        tblAranzmani.getColumnModel().getColumn(4).setMaxWidth(150);
        
    }
}
