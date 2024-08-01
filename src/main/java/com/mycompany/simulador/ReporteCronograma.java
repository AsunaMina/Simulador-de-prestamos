package com.mycompany.simulador;
import clases.Cronograma;
import java.text.DecimalFormat;
import javax.swing.JTable;

public class ReporteCronograma extends javax.swing.JFrame {
    Cronograma c = new Cronograma();
     private double monto;
    private int meses;
    private String interesAnual;
    private String diaPago;
    private double pagoEnvio;
    private String tem;
    private Double tea;
    private Double seguro;
  
    
    public ReporteCronograma() {
        initComponents();   
    }

    public void obtenerDato(double monto, int meses, String interesAnual, String diaPago, Double pagoEnvio, Double seguro ){
        //recibe parametros
        this.monto = monto;
        this.meses = meses;
        this.interesAnual = interesAnual;
        this.diaPago = diaPago;
        this.pagoEnvio=pagoEnvio;
        this.seguro=seguro;
        //guarda los parametros en las cajas
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String montoFormateado = decimalFormat.format(monto);
        Boxmonto.setText(montoFormateado);
        Boxplazo.setText(Integer.toString(meses));
        Boxtea.setText(interesAnual);
        Boxpago.setText(diaPago);
        Boxenvio.setText(Double.toString(pagoEnvio));
        //Calcular tem por valor tea
        String teaText = Boxtea.getText();
        double tea= c.calcularTEA(teaText);
        double tem = c.calcularTEM(tea);
        Boxtem.setText(String.format("%.2f%%", tem));   
    }
    
    public String getValorTEM() {
        String temtex = Boxtem.getText();
        temtex = temtex.replaceAll("[%]", "");// quita %
        return temtex;
    }
    public String getValorEnvio() {
        return Double.toString(pagoEnvio);
    }
    public String valorSegDesgrav() {
        String seguroText = Boxseg.getText();
        seguroText = seguroText.replaceAll("[%]", "");
        return seguroText;
    }
    public void setCoutaTotal(String coutaFinalFor) {
        Boxcouta.setText(coutaFinalFor);
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
        Txtitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Boxmonto = new javax.swing.JTextField();
        Boxtea = new javax.swing.JTextField();
        Boxpago = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Boxseg = new javax.swing.JTextField();
        Boxtem = new javax.swing.JTextField();
        Boxplazo = new javax.swing.JTextField();
        Boxenvio = new javax.swing.JTextField();
        Boxcouta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte de simulación");

        jPanel1.setBackground(new java.awt.Color(238, 241, 246));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 15, true));

        Txtitulo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        Txtitulo.setForeground(new java.awt.Color(51, 0, 255));
        Txtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txtitulo.setText("<html>Simulador de préstamos personales de Caja Huancayo<html>");
        Txtitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Txtitulo.setMaximumSize(new java.awt.Dimension(461, 25));
        Txtitulo.setPreferredSize(new java.awt.Dimension(461, 25));

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel2.setText("Monto del préstamo:");

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel1.setText("Día de pago:");

        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel3.setText("TEA:");

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel4.setText("TEM:");

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel5.setText("Plazo:");

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel6.setText("Seguro desgravament:");

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel7.setText("Couta:");

        jLabel8.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel8.setText("Costo de envío:");

        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jLabel9.setText("Penalidad de pago:");

        Tabla1.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° de couta", "Fecha de Pago", "Saldo Inicial", "Interes Total", "Amortización", "Saldo Final", "Costo Envio", "Total couta"
            }
        ));
        Tabla1.setEnabled(false);
        Tabla1.setGridColor(new java.awt.Color(255, 255, 255));
        Tabla1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tabla1);
        if (Tabla1.getColumnModel().getColumnCount() > 0) {
            Tabla1.getColumnModel().getColumn(0).setHeaderValue("N° de couta");
            Tabla1.getColumnModel().getColumn(1).setHeaderValue("Fecha de Pago");
            Tabla1.getColumnModel().getColumn(2).setHeaderValue("Saldo Inicial");
            Tabla1.getColumnModel().getColumn(3).setHeaderValue("Interes Total");
            Tabla1.getColumnModel().getColumn(4).setHeaderValue("Amortización");
            Tabla1.getColumnModel().getColumn(5).setHeaderValue("Saldo Final");
            Tabla1.getColumnModel().getColumn(6).setHeaderValue("Costo Envio");
            Tabla1.getColumnModel().getColumn(7).setHeaderValue("Total couta");
        }

        jButton1.setBackground(new java.awt.Color(51, 0, 255));
        jButton1.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular otro préstamo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel10.setText("Reporte");
        jLabel10.setToolTipText("");

        Boxmonto.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxmonto.setEnabled(false);
        Boxmonto.setHighlighter(null);
        Boxmonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxmontoActionPerformed(evt);
            }
        });

        Boxtea.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxtea.setEnabled(false);
        Boxtea.setHighlighter(null);

        Boxpago.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxpago.setEnabled(false);
        Boxpago.setHighlighter(null);
        Boxpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxpagoActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jTextField4.setText("5% de cada couta");
        jTextField4.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        jTextField4.setEnabled(false);
        jTextField4.setHighlighter(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        Boxseg.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxseg.setText("0.056%");
        Boxseg.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        Boxseg.setEnabled(false);
        Boxseg.setHighlighter(null);
        Boxseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxsegActionPerformed(evt);
            }
        });

        Boxtem.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxtem.setEnabled(false);
        Boxtem.setHighlighter(null);
        Boxtem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxtemActionPerformed(evt);
            }
        });

        Boxplazo.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxplazo.setEnabled(false);
        Boxplazo.setHighlighter(null);
        Boxplazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxplazoActionPerformed(evt);
            }
        });

        Boxenvio.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxenvio.setEnabled(false);
        Boxenvio.setHighlighter(null);
        Boxenvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxenvioActionPerformed(evt);
            }
        });

        Boxcouta.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        Boxcouta.setEnabled(false);
        Boxcouta.setHighlighter(null);
        Boxcouta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxcoutaActionPerformed(evt);
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
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(107, 107, 107)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Boxpago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(Boxenvio, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Boxcouta, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Boxseg, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Boxplazo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Boxtem, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Boxtea, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Boxmonto)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(128, 128, 128)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(409, 409, 409)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 234, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(Txtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(364, 364, 364))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Txtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(Boxmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boxpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boxtea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boxtem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boxplazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boxseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boxenvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boxcouta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        Simulador s = new Simulador();
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void BoxpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxpagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxpagoActionPerformed

    private void BoxsegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxsegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxsegActionPerformed

    private void BoxtemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxtemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxtemActionPerformed

    private void BoxplazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxplazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxplazoActionPerformed

    private void BoxenvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxenvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxenvioActionPerformed

    private void BoxcoutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxcoutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxcoutaActionPerformed

    private void BoxmontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxmontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxmontoActionPerformed
    public JTable getTabla() {
        
    return Tabla1;
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Boxcouta;
    private javax.swing.JTextField Boxenvio;
    private javax.swing.JTextField Boxmonto;
    private javax.swing.JTextField Boxpago;
    private javax.swing.JTextField Boxplazo;
    private javax.swing.JTextField Boxseg;
    private javax.swing.JTextField Boxtea;
    private javax.swing.JTextField Boxtem;
    private static javax.swing.JTable Tabla1;
    private javax.swing.JLabel Txtitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}