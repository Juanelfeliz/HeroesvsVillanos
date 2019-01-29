import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;
import java.awt.event.*;

public class Pantalladebatalla extends javax.swing.JFrame {
    public Pantalladebatalla() {
        initComponents();
        Reiniciar.setVisible(false);
        verestadisticas.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelHeroe = new javax.swing.JLabel();
        LabelArmaheroe = new javax.swing.JLabel();
        LabelVillano = new javax.swing.JLabel();
        LabelArmavillano = new javax.swing.JLabel();
        Numbatallas = new javax.swing.JComboBox<>();
        Comenzar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Numerodepelea = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Reiniciar = new javax.swing.JButton();
        verestadisticas = new javax.swing.JButton();
        Ganadorpelea = new javax.swing.JLabel();
        Muerto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Louie/Mazzaro/Juan corp.");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Heroe:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Arma:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Villano:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Arma:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("VS.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("¿Cuántas batallas quieres? min. 1 - max. 8");

        Numbatallas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        Comenzar.setBackground(new java.awt.Color(102, 255, 102));
        Comenzar.setText("¡Comenzar!");
        Comenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarActionPerformed(evt);
            }
        });

        jLabel7.setText("Numero de batalla:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel9.setText("Ganador:");

        Reiniciar.setBackground(new java.awt.Color(161, 19, 32));
        Reiniciar.setText("Reiniciar");
        Reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReiniciarMouseClicked(evt);
            }
        });

        verestadisticas.setBackground(new java.awt.Color(102, 255, 102));
        verestadisticas.setText("Ver estadisticas");
        verestadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verestadisticasActionPerformed(evt);
            }
        });

        Ganadorpelea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Muerto))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Numerodepelea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(Ganadorpelea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LabelHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LabelArmaheroe, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelArmavillano, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Numbatallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Comenzar))
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(verestadisticas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Muerto)
                .addGap(11, 11, 11)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numbatallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comenzar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Ganadorpelea, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Numerodepelea, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(LabelHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelArmaheroe, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelVillano, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(LabelArmavillano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reiniciar)
                    .addComponent(verestadisticas))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void ComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarActionPerformed
        Iniciarpeleas();       
    }//GEN-LAST:event_ComenzarActionPerformed

    private void ReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReiniciarMouseClicked
        
        Borrardatos();
        
    }//GEN-LAST:event_ReiniciarMouseClicked

    private void verestadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verestadisticasActionPerformed
        //ABRIR VENTANA DE ESTADISTICAS:
            Estadisticas abrir = new Estadisticas();
            abrir.setVisible(true);
    }//GEN-LAST:event_verestadisticasActionPerformed

    //LLAMADA PARA LAS PELEAS:
    public void Iniciarpeleas(){
    
        Random aleatorio = new Random();   // Random listo para utilizarse despues.
        int Notificacion;
        int a = 4; //EN ALGUN MOMENTO PUEDO TOCAR ESTO
        
        String[] Heroes = {"Rey","Reina","Bishop","Caballero"};
        String[] Villanos = {"Lilith","Wizard","Troll","Ghoul"};
        String[] Armas = {"Cuchillo","Hacha","Arcoyflecha","Espada"};
   
        int batallas = Integer.parseInt((String)Numbatallas.getSelectedItem());
        
        for (int i = 0; i <= batallas; i++) {
           
                int randomheroe = aleatorio.nextInt(a);
                int randomvillano = aleatorio.nextInt(a);
                int randomarmaH = aleatorio.nextInt(a);
                int randomarmaV = aleatorio.nextInt(a);
               
                //NUMERO DE BATALLA:
                Numerodepelea.setText(String.valueOf(i));
                
                LabelHeroe.setText(Heroes[randomheroe]);
                LabelArmaheroe.setText(Armas[randomarmaH]);
                LabelVillano.setText(Villanos[randomvillano]);
                LabelArmavillano.setText(Armas[randomarmaV]);
                    
                
                    //AQUI SE DECIDE QUIEN GANA LA PELEA Y QUIEN PIERDE:
                    if(veredictobatallas(Heroes[randomheroe],Villanos[randomvillano],Armas[randomarmaH],Armas[randomarmaV]))
                    {
                        break;
                    }
                    
                    
                    
                    //MENSAJE DE CONFIRMACION PARA LA PELEA SIGUIENTE:
                if( i >= 1 && i < batallas){   
                    Notificacion = JOptionPane.showConfirmDialog(null, "Siguiente pelea?", "Notificacion", NORMAL);
                        if(Notificacion == JOptionPane.NO_OPTION){
                            Borrardatos();
                            break; //PARA QUE SE REINCIEN LAS PELEAS.
                        }
                }
        }
        
        Muertos[] ingresar = new Muertos[3];
        ingresar[0] = new Muertos();
        int z = 0;
        while( z < 8 ){
            System.out.println(ingresar[z].VillanoMuerto);
        }
        
        Comenzar.setEnabled(false);
        Reiniciar.setVisible(true);
        verestadisticas.setVisible(true);
        
        
}
    
    @SuppressWarnings("StringEquality")
    public boolean veredictobatallas(String Heroe,String Villano,String ArmaH,String ArmaV){
        
        Muertos[] ingresar = new Muertos[4];
        
           //VEREDICTO DE LOS HEROES
            switch (Heroe){
                
                case "Rey":
                    if (Villano == "") {
                            Ganadorpelea.setText("Nada");
                        }
                    break;
                    
                case "Reina":
                    if(Villano == "Lilith" && ArmaV == "Espada" && ArmaH == "Espada"){
                        Ganadorpelea.setText("Empate");
                    }
                    if(Villano == "Lilith" && ArmaV != "Espada" && ArmaH == "Espada"){
                            /*
                            ingresar[0] = new Muertos();
                            ingresar[0].VillanoMuerto = Villano;
                            /
                            break;
                    } 
                    if(Villano != "Lilith"){
                            Ganadorpelea.setText("Reina");
                            ingresar[0].VillanoMuerto = Villano;
                        }
                    break;
                    
                case "Bishop":
                    if(Villano == "Troll" || Villano == "Ghoul" && ArmaV != "Arcoyflecha"){
                        Ganadorpelea.setText("Bishop");
                        ingresar[1].VillanoMuerto = Villano;
                    }
                    break; 
                                      
                case "Caballero":
                    if(Villano == "Troll" && ArmaH == "Hacha"){
                        Ganadorpelea.setText("Caballero");
                        ingresar[2].VillanoMuerto = Villano;
                    }
                    
                break;
                    
            }
            
            
            switch(Villano){
                
                case "Lilith":
                    if(Heroe == "Reina" && ArmaV == "Espada" && ArmaH != "Espada"){
                            Ganadorpelea.setText("Lilith");
                            ingresar[3].HeroeMuerto = Heroe;
                    } 
                    if(Heroe == "Reina" && ArmaH !="Espada" && ArmaV !="Espada"){
                        Ganadorpelea.setText("Nada");
                        break;
                    }
                    if(Heroe == "Rey"){
                        Ganadorpelea.setText("Lilith");
                        JOptionPane.showConfirmDialog(null, "Los villanos ganan la partida.", "Notificacion", NORMAL);
                        ingresar[4].HeroeMuerto = Heroe;
                        return true;
                    }
                    if(Heroe != "Reina") {
                            Ganadorpelea.setText("Lilith");
                            ingresar[5].HeroeMuerto = Heroe;
                        }
                break;
                    
                case "Wizard":
                    if(Heroe == "Bishop" || Heroe == "Caballero"){
                        Ganadorpelea.setText("Wizard");
                        ingresar[6].HeroeMuerto = Heroe;
                    }
                break;    
                    
                        
                case "Troll":
                    if(Heroe == "Caballero"){
                        Ganadorpelea.setText("Troll");
                        ingresar[7].HeroeMuerto = Heroe;
                    }
                break;    
                    
                case "Ghoul":
                    if(Heroe == "Bishop" && ArmaV == "Arcoyflecha"){
                         Ganadorpelea.setText("Ghoul");
                         ingresar[8].HeroeMuerto = Heroe;
                    }
                break;    
            }
    return false;
}
    
    
    private void Borrardatos(){
    
        //LIMPIAR PARA QUE SE VEA BONITA LA INTERFAZ:
        //COMENZAR A REINICIAR TODO:
        LabelHeroe.setText(" ");
        LabelArmaheroe.setText(" ");
        LabelVillano.setText(" ");
        LabelArmavillano.setText(" ");
        Ganadorpelea.setText(" ");
        Numerodepelea.setText(" ");
        
        Comenzar.setEnabled(true);
        Reiniciar.setVisible(false);
        verestadisticas.setVisible(false);
    
    
    
    }
    
    public void Estadisticas(){
        
        //ARREGLO PARA GUARDAR A LOS GANADORES:
        String[] Ganadores = new String[7];
            
        for (int i = 0; i < Ganadores.length; i++) {
            Ganadores[i] = this.Ganadorpelea.getText();
        }
    }
    
    private String Muerto(String HoV){
        
        String Muertito = HoV;
        
        return Muertito;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Pantalladebatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalladebatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalladebatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalladebatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalladebatalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comenzar;
    public javax.swing.JLabel Ganadorpelea;
    private javax.swing.JLabel LabelArmaheroe;
    private javax.swing.JLabel LabelArmavillano;
    private javax.swing.JLabel LabelHeroe;
    private javax.swing.JLabel LabelVillano;
    private javax.swing.JLabel Muerto;
    private javax.swing.JComboBox<String> Numbatallas;
    private javax.swing.JLabel Numerodepelea;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton verestadisticas;
    // End of variables declaration//GEN-END:variables

}
