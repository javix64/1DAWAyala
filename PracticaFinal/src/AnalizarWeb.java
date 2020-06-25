/*
TO DO:
✔densidad de palabras
✔imagenes
    ✔alt
    ✔cantidad

✔si tiene videos,
✔longitud de encabezados (ME FALTA MOSTRAR LA VARIABLE)
✔longitud de parrafos

modificar verencabezados para mostrarlo en una tabla en vez de en un jtextarea

✔info pagina
    ✔titulo
    ✔meta descripcion
    ✔lenguaje

Análisis TF/IDF
Canonical
✔keywords
✔tiene robots.txt?

enlaces
    href
    externos
    internos
    follow
    no follow
    enlaces rotos
    ugc
    sponsored
✔(problema: suman mas de 20)   palabras totales
✔ n` de javascriptses

*/
import ExportCSV.ExportCSV;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jsoup.nodes.Document;

public class AnalizarWeb extends javax.swing.JFrame {
    Document doc;
    Metodos sacarWeb;
    ContarPalabras sacarKeywords;
    String guardarWebsite="";
    public AnalizarWeb() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        General = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        setH1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        setH2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        setH3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        setH4 = new javax.swing.JLabel();
        cuentalasPalabras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        palabrasTotales = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        javascriptTotales = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        setParrafos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mediaH1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mediaH2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        mediaH3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        mediaH4 = new javax.swing.JLabel();
        palabrasClave = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buscarKeywords = new javax.swing.JButton();
        opcionPalabras = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        exportCsv = new javax.swing.JButton();
        comboBoxExportar = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPalabras = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEncabezados = new javax.swing.JTable();
        Multimedia1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        obtenerImagenes = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaImagenes = new java.awt.List();
        jLabel18 = new javax.swing.JLabel();
        cantidadImagenes = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        obtenerVideos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        metadescripcion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lenguaje = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        robots = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        analizarWeb = new javax.swing.JButton();
        website = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));

        jLabel2.setText("H1:");

        setH1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        setH1.setForeground(new java.awt.Color(255, 127, 0));
        setH1.setText("0");

        jLabel10.setText("H2:");

        setH2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        setH2.setForeground(new java.awt.Color(255, 127, 0));
        setH2.setText("0");

        jLabel12.setText("H3:");

        setH3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        setH3.setForeground(new java.awt.Color(255, 127, 0));
        setH3.setText("0");

        jLabel14.setText("H4:");

        setH4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        setH4.setForeground(new java.awt.Color(255, 127, 0));
        setH4.setText("0");

        cuentalasPalabras.setText("Cuenta las palabras");
        cuentalasPalabras.setEnabled(false);
        cuentalasPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentalasPalabrasActionPerformed(evt);
            }
        });

        jLabel3.setText("Palabras totales: ");

        palabrasTotales.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        palabrasTotales.setForeground(new java.awt.Color(255, 127, 0));
        palabrasTotales.setText("0");

        jLabel4.setText("Javascript:");

        javascriptTotales.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        javascriptTotales.setForeground(new java.awt.Color(255, 127, 0));
        javascriptTotales.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(palabrasTotales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 725, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(setH1)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(setH2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(setH3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(setH4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(javascriptTotales)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuentalasPalabras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuentalasPalabras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javascriptTotales)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(setH4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(setH3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(setH2)
                        .addComponent(setH1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(palabrasTotales)))
                .addGap(30, 30, 30))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Media de palabras"));

        jLabel5.setText("parrafos:");

        setParrafos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        setParrafos.setForeground(new java.awt.Color(255, 127, 0));
        setParrafos.setText("0");

        jLabel11.setText("h1");

        mediaH1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mediaH1.setForeground(new java.awt.Color(255, 127, 0));
        mediaH1.setText("0");

        jLabel13.setText("h2");

        mediaH2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mediaH2.setForeground(new java.awt.Color(255, 127, 0));
        mediaH2.setText("0");

        jLabel15.setText("h3");

        mediaH3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mediaH3.setForeground(new java.awt.Color(255, 127, 0));
        mediaH3.setText("0");

        jLabel16.setText("h4");

        mediaH4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mediaH4.setForeground(new java.awt.Color(255, 127, 0));
        mediaH4.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(mediaH2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(mediaH3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(mediaH4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(setParrafos))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(mediaH1)))
                .addContainerGap(1032, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setParrafos)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaH1)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaH2)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaH3)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaH4)
                    .addComponent(jLabel16))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout GeneralLayout = new javax.swing.GroupLayout(General);
        General.setLayout(GeneralLayout);
        GeneralLayout.setHorizontalGroup(
            GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        GeneralLayout.setVerticalGroup(
            GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("General", General);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("KeyWords"));

        buscarKeywords.setText("Buscar keywords");
        buscarKeywords.setEnabled(false);
        buscarKeywords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarKeywordsActionPerformed(evt);
            }
        });

        opcionPalabras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 palabra", "2 palabras", "3 palabras", "4 palabras" }));
        opcionPalabras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opcionPalabrasItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscarKeywords)
                .addGap(18, 18, 18)
                .addComponent(opcionPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarKeywords)
                    .addComponent(opcionPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar KeyWords"));

        exportCsv.setText("Exportar a CSV");
        exportCsv.setEnabled(false);
        exportCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCsvActionPerformed(evt);
            }
        });

        comboBoxExportar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tabla de palabras", "Tabla de encabezados" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(exportCsv)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportCsv)
                    .addComponent(comboBoxExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tablaPalabras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Veces", "Palabras", "Densidad KeyWord"
            }
        ));
        jScrollPane5.setViewportView(tablaPalabras);

        tablaEncabezados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Encabezado", "Longitud", "Contenido"
            }
        ));
        jScrollPane2.setViewportView(tablaEncabezados);

        javax.swing.GroupLayout palabrasClaveLayout = new javax.swing.GroupLayout(palabrasClave);
        palabrasClave.setLayout(palabrasClaveLayout);
        palabrasClaveLayout.setHorizontalGroup(
            palabrasClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palabrasClaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(palabrasClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(palabrasClaveLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        palabrasClaveLayout.setVerticalGroup(
            palabrasClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(palabrasClaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(palabrasClaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Palabras Clave", palabrasClave);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagenes"));
        jPanel3.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel3.setPreferredSize(new java.awt.Dimension(257, 205));

        obtenerImagenes.setText("Obtener imagenes");
        obtenerImagenes.setEnabled(false);
        obtenerImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerImagenesActionPerformed(evt);
            }
        });

        jScrollPane4.setMaximumSize(new java.awt.Dimension(32767, 500));

        jLabel18.setText("Cantidad:");

        cantidadImagenes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cantidadImagenes.setForeground(new java.awt.Color(255, 127, 0));
        cantidadImagenes.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(obtenerImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadImagenes)
                        .addGap(111, 111, 111))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(obtenerImagenes)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listaImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(cantidadImagenes))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Videos"));

        obtenerVideos.setText("Obtener videos");
        obtenerVideos.setEnabled(false);
        obtenerVideos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerVideosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obtenerVideos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(obtenerVideos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Multimedia1Layout = new javax.swing.GroupLayout(Multimedia1);
        Multimedia1.setLayout(Multimedia1Layout);
        Multimedia1Layout.setHorizontalGroup(
            Multimedia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Multimedia1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Multimedia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Multimedia1Layout.setVerticalGroup(
            Multimedia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Multimedia1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Multimedia", Multimedia1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("MetaDescripcion"));

        jLabel6.setText("Titulo: ");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 127, 0));
        titulo.setText("0");

        metadescripcion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        metadescripcion.setForeground(new java.awt.Color(255, 127, 0));
        metadescripcion.setText("0");
        metadescripcion.setMaximumSize(new java.awt.Dimension(300, 16));

        jLabel7.setText("MetaDescripcion:");

        lenguaje.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lenguaje.setForeground(new java.awt.Color(255, 127, 0));
        lenguaje.setText("0");

        jLabel8.setText("Lenguaje:");

        jLabel9.setText("Robots:");

        robots.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        robots.setForeground(new java.awt.Color(255, 127, 0));
        robots.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(metadescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(robots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(titulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(metadescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lenguaje))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(robots, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MetaDescripcion", jPanel9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 790));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Multimedia");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Website"));

        analizarWeb.setText("Analizar Web");
        analizarWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizarWebActionPerformed(evt);
            }
        });

        jLabel1.setText("Website:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(website, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(analizarWeb)
                .addContainerGap(799, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(website, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(analizarWeb))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1230, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarWebActionPerformed
       //cogemos del JTextArea la pagina web
        if(website.getText().equals("")==false){
            sacarWeb= new Metodos(website.getText());
            cuentalasPalabras.setEnabled(true);
            analizarWeb.setEnabled(false);
            buscarKeywords.setEnabled(true);
            obtenerImagenes.setEnabled(true);
            obtenerVideos.setEnabled(true);
       }else{
            JOptionPane.showMessageDialog(null, "Tienes que introducir una url correcta \n"
                    + "la forma correcta es 'ideal.es'");
        }
       
    }//GEN-LAST:event_analizarWebActionPerformed

    private void cuentalasPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentalasPalabrasActionPerformed
    sacarWeb.verEncabezados(setH1, setH2, setH3, setH4);
    palabrasTotales.setText(sacarWeb.palabrasBody()+"");
    sacarWeb.verJavascript(javascriptTotales);
    sacarWeb.mediadePalabras(setParrafos);
    sacarWeb.mediadeEncabezados(mediaH1,mediaH2,mediaH3,mediaH4);
    sacarWeb.verRobotsTxt(robots);
    sacarWeb.metaDescripcion(titulo,metadescripcion,lenguaje);
    sacarWeb.ponerPalabrasBody();
    }//GEN-LAST:event_cuentalasPalabrasActionPerformed

    private void buscarKeywordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarKeywordsActionPerformed
        exportCsv.setEnabled(true);
        sacarKeywords= new ContarPalabras(sacarWeb.ponerPalabrasBody());
        sacarKeywords.SepararPalabras(opcionPalabras);
        tablaPalabras.setModel(sacarKeywords.ordenarDatos(sacarWeb.palabrasBody()));
        tablaEncabezados.setModel(sacarWeb.tablaEncabezados());
        
    }//GEN-LAST:event_buscarKeywordsActionPerformed

    private void opcionPalabrasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opcionPalabrasItemStateChanged
        //Cada vez que cambies de opcion, borra la tabla
        DefaultTableModel vacio=new DefaultTableModel();
        tablaPalabras.setModel(vacio);
        
    }//GEN-LAST:event_opcionPalabrasItemStateChanged

    private void obtenerImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenerImagenesActionPerformed
            sacarWeb.obtenerImagenes(jScrollPane4,cantidadImagenes,listaImagenes);
        
    }//GEN-LAST:event_obtenerImagenesActionPerformed

    private void obtenerVideosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenerVideosActionPerformed
        try {
            sacarWeb.obtenerVideos();
        } catch (IOException ex) {
            Logger.getLogger(AnalizarWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }//GEN-LAST:event_obtenerVideosActionPerformed

    private void exportCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCsvActionPerformed
        ExportCSV exportar=new ExportCSV();
        switch(comboBoxExportar.getSelectedIndex()){
            case 0:
                File archivo= new File("output",website.getText()+" "+"Palabras.csv");
                exportar.toCsv(tablaPalabras, archivo);
                break;
            case 1:
                File archivo2= new File("output",website.getText()+" "+"Encabezados.csv");
                exportar.toCsv(tablaPalabras, archivo2);
            break;
        }
        
    }//GEN-LAST:event_exportCsvActionPerformed

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
            java.util.logging.Logger.getLogger(AnalizarWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalizarWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalizarWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalizarWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and disp^lay the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalizarWeb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel General;
    private javax.swing.JPanel Multimedia1;
    private javax.swing.JButton analizarWeb;
    private javax.swing.JButton buscarKeywords;
    private javax.swing.JLabel cantidadImagenes;
    private javax.swing.JComboBox<String> comboBoxExportar;
    private javax.swing.JButton cuentalasPalabras;
    private javax.swing.JButton exportCsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel javascriptTotales;
    private javax.swing.JLabel lenguaje;
    private java.awt.List listaImagenes;
    private javax.swing.JLabel mediaH1;
    private javax.swing.JLabel mediaH2;
    private javax.swing.JLabel mediaH3;
    private javax.swing.JLabel mediaH4;
    private javax.swing.JLabel metadescripcion;
    private javax.swing.JButton obtenerImagenes;
    private javax.swing.JButton obtenerVideos;
    private javax.swing.JComboBox<String> opcionPalabras;
    private javax.swing.JPanel palabrasClave;
    private javax.swing.JLabel palabrasTotales;
    private javax.swing.JLabel robots;
    private javax.swing.JLabel setH1;
    private javax.swing.JLabel setH2;
    private javax.swing.JLabel setH3;
    private javax.swing.JLabel setH4;
    private javax.swing.JLabel setParrafos;
    private javax.swing.JTable tablaEncabezados;
    private javax.swing.JTable tablaPalabras;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField website;
    // End of variables declaration//GEN-END:variables
}
