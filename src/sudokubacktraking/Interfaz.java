package sudokubacktraking;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interfaz extends javax.swing.JFrame {

    int vector9[][] = new int[9][9];
    int vector4[][] = new int[4][4];
    int extraer11 = 0;
    int extraer12 = 0;
    int extraer13 = 0;
    int extraer14 = 0;
    int extraer21 = 0;
    int extraer22 = 0;
    int extraer23 = 0;
    int extraer24 = 0;
    int extraer31 = 0;
    int extraer32 = 0;
    int extraer33 = 0;
    int extraer34 = 0;
    int extraer41 = 0;
    int extraer42 = 0;
    int extraer43 = 0;
    int extraer44 = 0;
    int extraers11 = 0;
    int extraers12 = 0;
    int extraers13 = 0;
    int extraers14 = 0;
    int extraers15 = 0;
    int extraers16 = 0;
    int extraers17 = 0;
    int extraers18 = 0;
    int extraers19 = 0;
    int extraers21 = 0;
    int extraers22 = 0;
    int extraers23 = 0;
    int extraers24 = 0;
    int extraers25 = 0;
    int extraers26 = 0;
    int extraers27 = 0;
    int extraers28 = 0;
    int extraers29 = 0;
    int extraers31 = 0;
    int extraers32 = 0;
    int extraers33 = 0;
    int extraers34 = 0;
    int extraers35 = 0;
    int extraers36 = 0;
    int extraers37 = 0;
    int extraers38 = 0;
    int extraers39 = 0;
    int extraers41 = 0;
    int extraers42 = 0;
    int extraers43 = 0;
    int extraers44 = 0;
    int extraers45 = 0;
    int extraers46 = 0;
    int extraers47 = 0;
    int extraers48 = 0;
    int extraers49 = 0;
    int extraers51 = 0;
    int extraers52 = 0;
    int extraers53 = 0;
    int extraers54 = 0;
    int extraers55 = 0;
    int extraers56 = 0;
    int extraers57 = 0;
    int extraers58 = 50;
    int extraers59 = 0;
    int extraers61 = 0;
    int extraers62 = 0;
    int extraers63 = 0;
    int extraers64 = 0;
    int extraers65 = 0;
    int extraers66 = 0;
    int extraers67 = 0;
    int extraers68 = 06;
    int extraers69 = 0;
    int extraers71 = 0;
    int extraers72 = 0;
    int extraers73 = 0;
    int extraers74 = 0;
    int extraers75 = 0;
    int extraers76 = 0;
    int extraers77 = 0;
    int extraers78 = 0;
    int extraers79 = 0;
    int extraers81 = 0;
    int extraers82 = 0;
    int extraers83 = 0;
    int extraers84 = 0;
    int extraers85 = 0;
    int extraers86 = 0;
    int extraers87 = 0;
    int extraers88 = 0;
    int extraers89 = 0;
    int extraers91 = 0;
    int extraers92 = 0;
    int extraers93 = 0;
    int extraers94 = 0;
    int extraers95 = 0;
    int extraers96 = 0;
    int extraers97 = 0;
    int extraers98 = 0;
    int extraers99 = 0;

    public Interfaz() {
        initComponents();
    }

    private void mostrarTarjetas(JPanel panel, String cadena) {//strin g es latargeta ala que quieres ir 
        CardLayout card = (CardLayout) panel.getLayout();
        card.show(panel, cadena);
    }

    public void Cronometro() {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Hay un error en el cronometro" + e);
        }

    }

    public void imprimirCronometro() {
        int minutos = 0;
        int segundos = 0;
        for (minutos = 0; segundos < 60; segundos++) {
            System.out.println(minutos + ":" + segundos);
            TAtiempo.setText("Minutos :" + minutos + "\nSegundos :" + segundos);
            Cronometro();
        }
    }

    public void llenarMatriz4() {
        extraer11 = Integer.parseInt(tf11.getText());
        //System.out.println(extraer11);
        extraer12 = Integer.parseInt(tf12.getText());
        extraer13 = Integer.parseInt(tf13.getText());
        extraer14 = Integer.parseInt(tf14.getText());
        extraer21 = Integer.parseInt(tf21.getText());
        extraer22 = Integer.parseInt(tf22.getText());
        extraer23 = Integer.parseInt(tf23.getText());
        extraer24 = Integer.parseInt(tf24.getText());
        extraer31 = Integer.parseInt(tf31.getText());
        extraer32 = Integer.parseInt(tf32.getText());
        extraer33 = Integer.parseInt(tf33.getText());
        extraer34 = Integer.parseInt(tf34.getText());
        extraer41 = Integer.parseInt(tf41.getText());
        extraer42 = Integer.parseInt(tf42.getText());
        extraer43 = Integer.parseInt(tf43.getText());
        extraer44 = Integer.parseInt(tf44.getText());
       // System.out.println(extraer44);

    }

    public void llenarMatriz9() {
        extraers11 = Integer.parseInt(tfs11.getText());
        extraers12 = Integer.parseInt(tfs12.getText());
        extraers13 = Integer.parseInt(tfs13.getText());
        extraers14 = Integer.parseInt(tfs14.getText());
        extraers15 = Integer.parseInt(tfs15.getText());
        extraers16 = Integer.parseInt(tfs16.getText());
        extraers17 = Integer.parseInt(tfs17.getText());
        extraers18 = Integer.parseInt(tfs18.getText());
        extraers19 = Integer.parseInt(tfs19.getText());
        extraers21 = Integer.parseInt(tfs21.getText());
        extraers22 = Integer.parseInt(tfs22.getText());
        extraers23 = Integer.parseInt(tfs23.getText());
        extraers24 = Integer.parseInt(tfs24.getText());
        extraers25 = Integer.parseInt(tfs25.getText());
        extraers26 = Integer.parseInt(tfs26.getText());
        extraers27 = Integer.parseInt(tfs27.getText());
        extraers28 = Integer.parseInt(tfs28.getText());
        extraers29 = Integer.parseInt(tfs29.getText());
        extraers31 = Integer.parseInt(tfs31.getText());
        extraers32 = Integer.parseInt(tfs32.getText());
        extraers33 = Integer.parseInt(tfs33.getText());
        extraers34 = Integer.parseInt(tfs34.getText());
        extraers35 = Integer.parseInt(tfs35.getText());
        extraers36 = Integer.parseInt(tfs36.getText());
        extraers37 = Integer.parseInt(tfs37.getText());
        extraers38 = Integer.parseInt(tfs38.getText());
        extraers39 = Integer.parseInt(tfs39.getText());
        extraers41 = Integer.parseInt(tfs41.getText());
        extraers42 = Integer.parseInt(tfs42.getText());
        extraers43 = Integer.parseInt(tfs43.getText());
        extraers44 = Integer.parseInt(tfs44.getText());
        extraers45 = Integer.parseInt(tfs45.getText());
        extraers46 = Integer.parseInt(tfs46.getText());
        extraers47 = Integer.parseInt(tfs47.getText());
        extraers48 = Integer.parseInt(tfs48.getText());
        extraers49 = Integer.parseInt(tfs49.getText());
        extraers51 = Integer.parseInt(tfs51.getText());
        extraers52 = Integer.parseInt(tfs52.getText());
        extraers53 = Integer.parseInt(tfs53.getText());
        extraers54 = Integer.parseInt(tfs54.getText());
        extraers55 = Integer.parseInt(tfs55.getText());
        extraers56 = Integer.parseInt(tfs56.getText());
        extraers57 = Integer.parseInt(tfs57.getText());
        extraers58 = Integer.parseInt(tfs58.getText());
        extraers59 = Integer.parseInt(tfs59.getText());
        extraers61 = Integer.parseInt(tfs61.getText());
        extraers62 = Integer.parseInt(tfs62.getText());
        extraers63 = Integer.parseInt(tfs63.getText());
        extraers64 = Integer.parseInt(tfs64.getText());
        extraers65 = Integer.parseInt(tfs65.getText());
        extraers66 = Integer.parseInt(tfs66.getText());
        extraers67 = Integer.parseInt(tfs67.getText());
        extraers68 = Integer.parseInt(tfs68.getText());
        extraers69 = Integer.parseInt(tfs69.getText());
        extraers71 = Integer.parseInt(tfs71.getText());
        extraers72 = Integer.parseInt(tfs72.getText());
        extraers73 = Integer.parseInt(tfs73.getText());
        extraers74 = Integer.parseInt(tfs74.getText());
        extraers75 = Integer.parseInt(tfs75.getText());
        extraers76 = Integer.parseInt(tfs76.getText());
        extraers77 = Integer.parseInt(tfs77.getText());
        extraers78 = Integer.parseInt(tfs78.getText());
        extraers79 = Integer.parseInt(tfs79.getText());
        extraers81 = Integer.parseInt(tfs81.getText());
        extraers82 = Integer.parseInt(tfs82.getText());
        extraers83 = Integer.parseInt(tfs83.getText());
        extraers84 = Integer.parseInt(tfs84.getText());
        extraers85 = Integer.parseInt(tfs85.getText());
        extraers86 = Integer.parseInt(tfs86.getText());
        extraers87 = Integer.parseInt(tfs87.getText());
        extraers88 = Integer.parseInt(tfs88.getText());
        extraers89 = Integer.parseInt(tfs89.getText());
        extraers91 = Integer.parseInt(tfs91.getText());
        extraers92 = Integer.parseInt(tfs92.getText());
        extraers93 = Integer.parseInt(tfs93.getText());
        extraers94 = Integer.parseInt(tfs94.getText());
        extraers95 = Integer.parseInt(tfs95.getText());
        extraers96 = Integer.parseInt(tfs96.getText());
        extraers97 = Integer.parseInt(tfs97.getText());
        extraers98 = Integer.parseInt(tfs98.getText());
        extraers99 = Integer.parseInt(tfs99.getText());

    }

    public void llenarMatrizSudoku4() {
        vector4[0][0] = extraer11;
        //System.out.println(vector4[0][0]);
        vector4[0][1] = extraer12;
        vector4[0][2] = extraer13;
        vector4[0][3] = extraer14;
        vector4[1][0] = extraer21;
        vector4[1][1] = extraer22;
        vector4[1][2] = extraer23;
        vector4[1][3] = extraer24;
        vector4[2][0] = extraer31;
        vector4[2][1] = extraer32;
        vector4[2][2] = extraer33;
        vector4[2][3] = extraer34;
        vector4[3][0] = extraer41;
        vector4[3][1] = extraer42;
        vector4[3][2] = extraer43;
        vector4[3][3] = extraer44;

    }

    public void llenarMatrizSudoku9() {

        vector9[0][0] = extraers11;
        vector9[0][1] = extraers12;
        vector9[0][2] = extraers13;
        vector9[0][3] = extraers14;
        vector9[0][4] = extraers15;
        vector9[0][5] = extraers16;
        vector9[0][6] = extraers17;
        vector9[0][7] = extraers18;
        vector9[0][8] = extraers19;
        vector9[1][0] = extraers21;
        vector9[1][1] = extraers22;
        vector9[1][2] = extraers23;
        vector9[1][3] = extraers24;
        vector9[1][4] = extraers25;
        vector9[1][5] = extraers26;
        vector9[1][6] = extraers27;
        vector9[1][7] = extraers28;
        vector9[1][8] = extraers29;
        vector9[2][0] = extraers31;
        vector9[2][1] = extraers32;
        vector9[2][2] = extraers33;
        vector9[2][3] = extraers34;
        vector9[2][4] = extraers35;
        vector9[2][5] = extraers36;
        vector9[2][6] = extraers37;
        vector9[2][7] = extraers38;
        vector9[2][8] = extraers39;
        vector9[3][0] = extraers41;
        vector9[3][1] = extraers42;
        vector9[3][2] = extraers43;
        vector9[3][3] = extraers44;
        vector9[3][4] = extraers45;
        vector9[3][5] = extraers46;
        vector9[3][6] = extraers47;
        vector9[3][7] = extraers48;
        vector9[3][8] = extraers49;
        vector9[4][0] = extraers51;
        vector9[4][1] = extraers52;
        vector9[4][2] = extraers53;
        vector9[4][3] = extraers54;
        vector9[4][4] = extraers55;
        vector9[4][5] = extraers56;
        vector9[4][6] = extraers57;
        vector9[4][7] = extraers58;
        vector9[4][8] = extraers59;
        vector9[5][0] = extraers61;
        vector9[5][1] = extraers62;
        vector9[5][2] = extraers63;
        vector9[5][3] = extraers64;
        vector9[5][4] = extraers65;
        vector9[5][5] = extraers66;
        vector9[5][6] = extraers67;
        vector9[5][7] = extraers68;
        vector9[5][8] = extraers69;
        vector9[6][0] = extraers71;
        vector9[6][1] = extraers72;
        vector9[6][2] = extraers73;
        vector9[6][3] = extraers74;
        vector9[6][4] = extraers75;
        vector9[6][5] = extraers76;
        vector9[6][6] = extraers77;
        vector9[6][7] = extraers78;
        vector9[6][8] = extraers79;
        vector9[7][0] = extraers81;
        vector9[7][1] = extraers82;
        vector9[7][2] = extraers83;
        vector9[7][3] = extraers84;
        vector9[7][4] = extraers85;
        vector9[7][5] = extraers86;
        vector9[7][6] = extraers87;
        vector9[7][7] = extraers88;
        vector9[7][8] = extraers89;
        vector9[8][0] = extraers91;
        vector9[8][1] = extraers92;
        vector9[8][2] = extraers93;
        vector9[8][3] = extraers94;
        vector9[8][4] = extraers95;
        vector9[8][5] = extraers96;
        System.out.println(vector9[8][5]);
        vector9[8][6] = extraers97;
        vector9[8][7] = extraers98;
        vector9[8][8] = extraers99;

    }

    public void imprimir4() {
        String salida = "";
        for (int i = 0; i < vector4.length; i++) {
            for (int j = 0; j < vector4.length; j++) {

                salida += vector4[i][j] + "   ";

            }
            System.out.println(salida + "\n");
            salida = "";
        }
    }

    public void imprimir9() {
        String salida = "";
        for (int i = 0; i < vector9.length; i++) {
            for (int j = 0; j < vector9.length; j++) {

                salida += vector9[i][j] + "   ";

            }
            System.out.println(salida + "\n");
            salida = "";
        }
    }
    public void colocar()
    {
        tf14.setText(""+(int) (Math.random()*4+1));
        tf22.setText(""+(int) (Math.random()*4+1));
        tf31.setText(""+(int) (Math.random()*4+1));
        tf44.setText(""+(int) (Math.random()*4+1));
        tf12.setText(""+(int) (Math.random()*4+1));
        
    
    }
    public  boolean comprobar_valor ( int valor ){
   
  if ( valor >0 && valor < 5)
   return true;
  else
      JOptionPane.showMessageDialog(null, "Cambie el numero "+valor+" esta fuera del rango de los candidatos");
   return false;
   
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        IngresoSudo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf11 = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        tf12 = new javax.swing.JTextField();
        jScrollPane21 = new javax.swing.JScrollPane();
        tf13 = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        tf21 = new javax.swing.JTextField();
        jScrollPane23 = new javax.swing.JScrollPane();
        tf14 = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        tf22 = new javax.swing.JTextField();
        jScrollPane25 = new javax.swing.JScrollPane();
        tf23 = new javax.swing.JTextField();
        jScrollPane26 = new javax.swing.JScrollPane();
        tf24 = new javax.swing.JTextField();
        jScrollPane27 = new javax.swing.JScrollPane();
        tf31 = new javax.swing.JTextField();
        jScrollPane28 = new javax.swing.JScrollPane();
        tf33 = new javax.swing.JTextField();
        jScrollPane29 = new javax.swing.JScrollPane();
        tf32 = new javax.swing.JTextField();
        jScrollPane30 = new javax.swing.JScrollPane();
        tf34 = new javax.swing.JTextField();
        jScrollPane31 = new javax.swing.JScrollPane();
        tf41 = new javax.swing.JTextField();
        jScrollPane32 = new javax.swing.JScrollPane();
        tf42 = new javax.swing.JTextField();
        jScrollPane33 = new javax.swing.JScrollPane();
        tf44 = new javax.swing.JTextField();
        jScrollPane34 = new javax.swing.JScrollPane();
        tf43 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf15 = new javax.swing.JTextField();
        jScrollPane35 = new javax.swing.JScrollPane();
        tf16 = new javax.swing.JTextField();
        jScrollPane36 = new javax.swing.JScrollPane();
        tf17 = new javax.swing.JTextField();
        jScrollPane38 = new javax.swing.JScrollPane();
        tf18 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAtiempo = new javax.swing.JTextArea();
        jLabel87 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        ResolverSudo4 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tf19 = new javax.swing.JTextField();
        jScrollPane37 = new javax.swing.JScrollPane();
        tf20 = new javax.swing.JTextField();
        jScrollPane39 = new javax.swing.JScrollPane();
        tf25 = new javax.swing.JTextField();
        jScrollPane40 = new javax.swing.JScrollPane();
        tf26 = new javax.swing.JTextField();
        jScrollPane41 = new javax.swing.JScrollPane();
        tf27 = new javax.swing.JTextField();
        jScrollPane42 = new javax.swing.JScrollPane();
        tf28 = new javax.swing.JTextField();
        jScrollPane43 = new javax.swing.JScrollPane();
        tf29 = new javax.swing.JTextField();
        jScrollPane44 = new javax.swing.JScrollPane();
        tf30 = new javax.swing.JTextField();
        jScrollPane45 = new javax.swing.JScrollPane();
        tf35 = new javax.swing.JTextField();
        jScrollPane46 = new javax.swing.JScrollPane();
        tf36 = new javax.swing.JTextField();
        jScrollPane47 = new javax.swing.JScrollPane();
        tf37 = new javax.swing.JTextField();
        jScrollPane48 = new javax.swing.JScrollPane();
        tf38 = new javax.swing.JTextField();
        jScrollPane49 = new javax.swing.JScrollPane();
        tf45 = new javax.swing.JTextField();
        jScrollPane50 = new javax.swing.JScrollPane();
        tf46 = new javax.swing.JTextField();
        jScrollPane51 = new javax.swing.JScrollPane();
        tf47 = new javax.swing.JTextField();
        jScrollPane52 = new javax.swing.JScrollPane();
        tf48 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IngresoSudo9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jTextField15 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tfs11 = new javax.swing.JTextField();
        jScrollPane53 = new javax.swing.JScrollPane();
        tfs12 = new javax.swing.JTextField();
        jScrollPane54 = new javax.swing.JScrollPane();
        tfs13 = new javax.swing.JTextField();
        jScrollPane55 = new javax.swing.JScrollPane();
        tfs21 = new javax.swing.JTextField();
        jScrollPane56 = new javax.swing.JScrollPane();
        tfs14 = new javax.swing.JTextField();
        jScrollPane57 = new javax.swing.JScrollPane();
        tfs22 = new javax.swing.JTextField();
        jScrollPane58 = new javax.swing.JScrollPane();
        tfs23 = new javax.swing.JTextField();
        jScrollPane59 = new javax.swing.JScrollPane();
        tfs24 = new javax.swing.JTextField();
        jScrollPane60 = new javax.swing.JScrollPane();
        tfs31 = new javax.swing.JTextField();
        jScrollPane61 = new javax.swing.JScrollPane();
        tfs33 = new javax.swing.JTextField();
        jScrollPane62 = new javax.swing.JScrollPane();
        tfs32 = new javax.swing.JTextField();
        jScrollPane63 = new javax.swing.JScrollPane();
        tfs34 = new javax.swing.JTextField();
        jScrollPane64 = new javax.swing.JScrollPane();
        tfs41 = new javax.swing.JTextField();
        jScrollPane65 = new javax.swing.JScrollPane();
        tfs42 = new javax.swing.JTextField();
        jScrollPane66 = new javax.swing.JScrollPane();
        tfs44 = new javax.swing.JTextField();
        jScrollPane67 = new javax.swing.JScrollPane();
        tfs43 = new javax.swing.JTextField();
        jScrollPane94 = new javax.swing.JScrollPane();
        tfs27 = new javax.swing.JTextField();
        jScrollPane95 = new javax.swing.JScrollPane();
        tfs28 = new javax.swing.JTextField();
        jScrollPane96 = new javax.swing.JScrollPane();
        tfs26 = new javax.swing.JTextField();
        jScrollPane97 = new javax.swing.JScrollPane();
        tfs25 = new javax.swing.JTextField();
        jScrollPane98 = new javax.swing.JScrollPane();
        tfs18 = new javax.swing.JTextField();
        jScrollPane99 = new javax.swing.JScrollPane();
        tfs16 = new javax.swing.JTextField();
        jScrollPane100 = new javax.swing.JScrollPane();
        tfs17 = new javax.swing.JTextField();
        jScrollPane101 = new javax.swing.JScrollPane();
        tfs15 = new javax.swing.JTextField();
        jScrollPane78 = new javax.swing.JScrollPane();
        tfs19 = new javax.swing.JTextField();
        jScrollPane79 = new javax.swing.JScrollPane();
        tfs29 = new javax.swing.JTextField();
        jScrollPane102 = new javax.swing.JScrollPane();
        tfs37 = new javax.swing.JTextField();
        jScrollPane103 = new javax.swing.JScrollPane();
        tfs36 = new javax.swing.JTextField();
        jScrollPane104 = new javax.swing.JScrollPane();
        tfs38 = new javax.swing.JTextField();
        jScrollPane105 = new javax.swing.JScrollPane();
        tfs45 = new javax.swing.JTextField();
        jScrollPane106 = new javax.swing.JScrollPane();
        tfs46 = new javax.swing.JTextField();
        jScrollPane80 = new javax.swing.JScrollPane();
        tfs49 = new javax.swing.JTextField();
        jScrollPane107 = new javax.swing.JScrollPane();
        tfs48 = new javax.swing.JTextField();
        jScrollPane108 = new javax.swing.JScrollPane();
        tfs47 = new javax.swing.JTextField();
        jScrollPane81 = new javax.swing.JScrollPane();
        tfs39 = new javax.swing.JTextField();
        jScrollPane109 = new javax.swing.JScrollPane();
        tfs35 = new javax.swing.JTextField();
        jScrollPane76 = new javax.swing.JScrollPane();
        tfs62 = new javax.swing.JTextField();
        jScrollPane110 = new javax.swing.JScrollPane();
        tfs86 = new javax.swing.JTextField();
        jScrollPane111 = new javax.swing.JScrollPane();
        tfs57 = new javax.swing.JTextField();
        jScrollPane77 = new javax.swing.JScrollPane();
        tfs54 = new javax.swing.JTextField();
        jScrollPane82 = new javax.swing.JScrollPane();
        tfs83 = new javax.swing.JTextField();
        jScrollPane112 = new javax.swing.JScrollPane();
        tfs85 = new javax.swing.JTextField();
        jScrollPane113 = new javax.swing.JScrollPane();
        tfs56 = new javax.swing.JTextField();
        jScrollPane83 = new javax.swing.JScrollPane();
        tfs61 = new javax.swing.JTextField();
        jScrollPane84 = new javax.swing.JScrollPane();
        tfs84 = new javax.swing.JTextField();
        jScrollPane114 = new javax.swing.JScrollPane();
        tfs78 = new javax.swing.JTextField();
        jScrollPane85 = new javax.swing.JScrollPane();
        tfs82 = new javax.swing.JTextField();
        jScrollPane86 = new javax.swing.JScrollPane();
        tfs79 = new javax.swing.JTextField();
        jScrollPane115 = new javax.swing.JScrollPane();
        tfs58 = new javax.swing.JTextField();
        jScrollPane116 = new javax.swing.JScrollPane();
        tfs87 = new javax.swing.JTextField();
        jScrollPane87 = new javax.swing.JScrollPane();
        tfs53 = new javax.swing.JTextField();
        jScrollPane117 = new javax.swing.JScrollPane();
        tfs76 = new javax.swing.JTextField();
        jScrollPane118 = new javax.swing.JScrollPane();
        tfs65 = new javax.swing.JTextField();
        jScrollPane88 = new javax.swing.JScrollPane();
        tfs52 = new javax.swing.JTextField();
        jScrollPane89 = new javax.swing.JScrollPane();
        tfs81 = new javax.swing.JTextField();
        jScrollPane119 = new javax.swing.JScrollPane();
        tfs77 = new javax.swing.JTextField();
        jScrollPane120 = new javax.swing.JScrollPane();
        tfs66 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tfs51 = new javax.swing.JTextField();
        jScrollPane90 = new javax.swing.JScrollPane();
        tfs74 = new javax.swing.JTextField();
        jScrollPane91 = new javax.swing.JScrollPane();
        tfs69 = new javax.swing.JTextField();
        jScrollPane121 = new javax.swing.JScrollPane();
        tfs75 = new javax.swing.JTextField();
        jScrollPane122 = new javax.swing.JScrollPane();
        tfs68 = new javax.swing.JTextField();
        jScrollPane92 = new javax.swing.JScrollPane();
        tfs72 = new javax.swing.JTextField();
        jScrollPane123 = new javax.swing.JScrollPane();
        tfs67 = new javax.swing.JTextField();
        jScrollPane93 = new javax.swing.JScrollPane();
        tfs59 = new javax.swing.JTextField();
        jScrollPane124 = new javax.swing.JScrollPane();
        tfs73 = new javax.swing.JTextField();
        jScrollPane125 = new javax.swing.JScrollPane();
        tfs71 = new javax.swing.JTextField();
        jScrollPane126 = new javax.swing.JScrollPane();
        tfs64 = new javax.swing.JTextField();
        jScrollPane127 = new javax.swing.JScrollPane();
        tfs88 = new javax.swing.JTextField();
        jScrollPane128 = new javax.swing.JScrollPane();
        tfs63 = new javax.swing.JTextField();
        jScrollPane129 = new javax.swing.JScrollPane();
        tfs89 = new javax.swing.JTextField();
        jScrollPane130 = new javax.swing.JScrollPane();
        tfs55 = new javax.swing.JTextField();
        jScrollPane131 = new javax.swing.JScrollPane();
        tfs98 = new javax.swing.JTextField();
        jScrollPane132 = new javax.swing.JScrollPane();
        tfs94 = new javax.swing.JTextField();
        jScrollPane133 = new javax.swing.JScrollPane();
        tfs92 = new javax.swing.JTextField();
        jScrollPane134 = new javax.swing.JScrollPane();
        tfs97 = new javax.swing.JTextField();
        jScrollPane135 = new javax.swing.JScrollPane();
        tfs99 = new javax.swing.JTextField();
        jScrollPane136 = new javax.swing.JScrollPane();
        tfs91 = new javax.swing.JTextField();
        jScrollPane137 = new javax.swing.JScrollPane();
        tfs96 = new javax.swing.JTextField();
        jScrollPane138 = new javax.swing.JScrollPane();
        tfs95 = new javax.swing.JTextField();
        jScrollPane139 = new javax.swing.JScrollPane();
        tfs93 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tf63 = new javax.swing.JTextField();
        jScrollPane68 = new javax.swing.JScrollPane();
        tf64 = new javax.swing.JTextField();
        jScrollPane69 = new javax.swing.JScrollPane();
        tf65 = new javax.swing.JTextField();
        jScrollPane70 = new javax.swing.JScrollPane();
        tf66 = new javax.swing.JTextField();
        jScrollPane71 = new javax.swing.JScrollPane();
        tf68 = new javax.swing.JTextField();
        jScrollPane72 = new javax.swing.JScrollPane();
        tf67 = new javax.swing.JTextField();
        jScrollPane73 = new javax.swing.JScrollPane();
        tf69 = new javax.swing.JTextField();
        jScrollPane74 = new javax.swing.JScrollPane();
        tf70 = new javax.swing.JTextField();
        jScrollPane75 = new javax.swing.JScrollPane();
        tf71 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        TAtiempo1 = new javax.swing.JTextArea();
        jLabel91 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        Contenedor.setLayout(new java.awt.CardLayout());

        jTextField14.setBorder(null);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField29.setBorder(null);
        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        tf11.setForeground(new java.awt.Color(102, 255, 102));
        tf11.setBorder(null);
        tf11.setCaretColor(new java.awt.Color(255, 51, 0));
        tf11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf11.setDisabledTextColor(new java.awt.Color(255, 255, 51));
        tf11.setSelectedTextColor(new java.awt.Color(255, 51, 255));
        jScrollPane4.setViewportView(tf11);

        tf12.setBorder(null);
        jScrollPane20.setViewportView(tf12);

        tf13.setBorder(null);
        jScrollPane21.setViewportView(tf13);

        tf21.setBorder(null);
        jScrollPane22.setViewportView(tf21);

        tf14.setBorder(null);
        jScrollPane23.setViewportView(tf14);

        tf22.setBorder(null);
        jScrollPane24.setViewportView(tf22);

        tf23.setBorder(null);
        jScrollPane25.setViewportView(tf23);

        tf24.setBorder(null);
        jScrollPane26.setViewportView(tf24);

        tf31.setBorder(null);
        jScrollPane27.setViewportView(tf31);

        tf33.setBorder(null);
        jScrollPane28.setViewportView(tf33);

        tf32.setBorder(null);
        jScrollPane29.setViewportView(tf32);

        tf34.setBorder(null);
        jScrollPane30.setViewportView(tf34);

        tf41.setBorder(null);
        jScrollPane31.setViewportView(tf41);

        tf42.setBorder(null);
        jScrollPane32.setViewportView(tf42);

        tf44.setBorder(null);
        jScrollPane33.setViewportView(tf44);

        tf43.setBorder(null);
        jScrollPane34.setViewportView(tf43);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tf15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf15.setForeground(new java.awt.Color(102, 255, 102));
        tf15.setText("1");
        tf15.setBorder(null);
        tf15.setCaretColor(new java.awt.Color(255, 51, 0));
        tf15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf15.setDisabledTextColor(new java.awt.Color(255, 255, 51));
        tf15.setSelectedTextColor(new java.awt.Color(255, 51, 255));
        jScrollPane5.setViewportView(tf15);

        tf16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf16.setText("2");
        tf16.setBorder(null);
        jScrollPane35.setViewportView(tf16);

        tf17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf17.setText("3");
        tf17.setBorder(null);
        jScrollPane36.setViewportView(tf17);

        tf18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf18.setText("4");
        tf18.setBorder(null);
        jScrollPane38.setViewportView(tf18);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel89.setBackground(new java.awt.Color(102, 102, 0));
        jLabel89.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 153, 102));
        jLabel89.setText("NUMERO A ESCOGER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField29)
                                    .addComponent(jTextField14)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jTextField29)
                .addGap(34, 34, 34)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jScrollPane1.setViewportView(jPanel3);

        jButton1.setText("NIVEL DIFICL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("INICIAR PARTIDA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("REINICIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TAtiempo.setColumns(20);
        TAtiempo.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        TAtiempo.setForeground(new java.awt.Color(255, 102, 102));
        TAtiempo.setRows(5);
        TAtiempo.setCaretColor(new java.awt.Color(255, 255, 51));
        jScrollPane2.setViewportView(TAtiempo);

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel87.setText("APRENDIENDO BACKTRAKING CON SUDOKU");

        jButton4.setText("RESOLVER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton11.setText("TERMINAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresoSudoLayout = new javax.swing.GroupLayout(IngresoSudo);
        IngresoSudo.setLayout(IngresoSudoLayout);
        IngresoSudoLayout.setHorizontalGroup(
            IngresoSudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresoSudoLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoSudoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(IngresoSudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IngresoSudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addGroup(IngresoSudoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoSudoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(399, 399, 399))
        );
        IngresoSudoLayout.setVerticalGroup(
            IngresoSudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresoSudoLayout.createSequentialGroup()
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(IngresoSudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngresoSudoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(IngresoSudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 232, Short.MAX_VALUE))
                    .addGroup(IngresoSudoLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Contenedor.add(IngresoSudo, "card2");

        tf19.setBackground(new java.awt.Color(255, 255, 102));
        tf19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf19.setBorder(null);
        tf19.setCaretColor(new java.awt.Color(255, 51, 0));
        tf19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf19.setDisabledTextColor(new java.awt.Color(255, 255, 51));
        tf19.setSelectedTextColor(new java.awt.Color(255, 51, 255));
        jScrollPane6.setViewportView(tf19);

        tf20.setBackground(new java.awt.Color(255, 255, 0));
        tf20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf20.setBorder(null);
        jScrollPane37.setViewportView(tf20);

        tf25.setBackground(new java.awt.Color(255, 255, 0));
        tf25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf25.setBorder(null);
        jScrollPane39.setViewportView(tf25);

        tf26.setBackground(new java.awt.Color(255, 255, 0));
        tf26.setBorder(null);
        jScrollPane40.setViewportView(tf26);

        tf27.setBackground(new java.awt.Color(255, 255, 0));
        tf27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf27.setBorder(null);
        jScrollPane41.setViewportView(tf27);

        tf28.setBackground(new java.awt.Color(255, 255, 0));
        tf28.setBorder(null);
        jScrollPane42.setViewportView(tf28);

        tf29.setBackground(new java.awt.Color(255, 255, 0));
        tf29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf29.setBorder(null);
        jScrollPane43.setViewportView(tf29);

        tf30.setBackground(new java.awt.Color(255, 255, 0));
        tf30.setBorder(null);
        jScrollPane44.setViewportView(tf30);

        tf35.setBackground(new java.awt.Color(255, 255, 0));
        tf35.setBorder(null);
        jScrollPane45.setViewportView(tf35);

        tf36.setBackground(new java.awt.Color(255, 255, 0));
        tf36.setBorder(null);
        jScrollPane46.setViewportView(tf36);

        tf37.setBackground(new java.awt.Color(255, 255, 0));
        tf37.setBorder(null);
        jScrollPane47.setViewportView(tf37);

        tf38.setBackground(new java.awt.Color(255, 255, 0));
        tf38.setForeground(new java.awt.Color(255, 255, 0));
        tf38.setBorder(null);
        tf38.setCaretColor(new java.awt.Color(255, 255, 0));
        jScrollPane48.setViewportView(tf38);

        tf45.setBackground(new java.awt.Color(255, 255, 0));
        tf45.setBorder(null);
        jScrollPane49.setViewportView(tf45);

        tf46.setBackground(new java.awt.Color(255, 255, 0));
        tf46.setBorder(null);
        jScrollPane50.setViewportView(tf46);

        tf47.setBackground(new java.awt.Color(255, 255, 0));
        tf47.setBorder(null);
        jScrollPane51.setViewportView(tf47);

        tf48.setBackground(new java.awt.Color(255, 255, 0));
        tf48.setBorder(null);
        jScrollPane52.setViewportView(tf48);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel88.setText("TU SUDOKU RESUELTO!!!");

        jButton5.setText("VOLVER A INTENTAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResolverSudo4Layout = new javax.swing.GroupLayout(ResolverSudo4);
        ResolverSudo4.setLayout(ResolverSudo4Layout);
        ResolverSudo4Layout.setHorizontalGroup(
            ResolverSudo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResolverSudo4Layout.createSequentialGroup()
                .addGroup(ResolverSudo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResolverSudo4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResolverSudo4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ResolverSudo4Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(637, Short.MAX_VALUE))
        );
        ResolverSudo4Layout.setVerticalGroup(
            ResolverSudo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResolverSudo4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Contenedor.add(ResolverSudo4, "card4");

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel1.setText("APRENDE BACKTRAKING CON SUDOKU");
        Contenedor.add(jLabel1, "card3");

        jTextField15.setBorder(null);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField30.setBorder(null);
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        tfs11.setForeground(new java.awt.Color(102, 255, 102));
        tfs11.setBorder(null);
        tfs11.setCaretColor(new java.awt.Color(255, 51, 0));
        tfs11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfs11.setDisabledTextColor(new java.awt.Color(255, 255, 51));
        tfs11.setSelectedTextColor(new java.awt.Color(255, 51, 255));
        jScrollPane7.setViewportView(tfs11);

        tfs12.setBorder(null);
        jScrollPane53.setViewportView(tfs12);

        tfs13.setBorder(null);
        jScrollPane54.setViewportView(tfs13);

        tfs21.setBorder(null);
        jScrollPane55.setViewportView(tfs21);

        tfs14.setBorder(null);
        jScrollPane56.setViewportView(tfs14);

        tfs22.setBorder(null);
        jScrollPane57.setViewportView(tfs22);

        tfs23.setBorder(null);
        jScrollPane58.setViewportView(tfs23);

        tfs24.setBorder(null);
        jScrollPane59.setViewportView(tfs24);

        tfs31.setBorder(null);
        jScrollPane60.setViewportView(tfs31);

        tfs33.setBorder(null);
        jScrollPane61.setViewportView(tfs33);

        tfs32.setBorder(null);
        jScrollPane62.setViewportView(tfs32);

        tfs34.setBorder(null);
        jScrollPane63.setViewportView(tfs34);

        tfs41.setBorder(null);
        jScrollPane64.setViewportView(tfs41);

        tfs42.setBorder(null);
        jScrollPane65.setViewportView(tfs42);

        tfs44.setBorder(null);
        jScrollPane66.setViewportView(tfs44);

        tfs43.setBorder(null);
        jScrollPane67.setViewportView(tfs43);

        tfs27.setBorder(null);
        jScrollPane94.setViewportView(tfs27);

        tfs28.setBorder(null);
        jScrollPane95.setViewportView(tfs28);

        tfs26.setBorder(null);
        jScrollPane96.setViewportView(tfs26);

        tfs25.setBorder(null);
        jScrollPane97.setViewportView(tfs25);

        tfs18.setBorder(null);
        jScrollPane98.setViewportView(tfs18);

        tfs16.setBorder(null);
        jScrollPane99.setViewportView(tfs16);

        tfs17.setBorder(null);
        jScrollPane100.setViewportView(tfs17);

        tfs15.setBorder(null);
        jScrollPane101.setViewportView(tfs15);

        tfs19.setBorder(null);
        jScrollPane78.setViewportView(tfs19);

        tfs29.setBorder(null);
        jScrollPane79.setViewportView(tfs29);

        tfs37.setBorder(null);
        jScrollPane102.setViewportView(tfs37);

        tfs36.setBorder(null);
        jScrollPane103.setViewportView(tfs36);

        tfs38.setBorder(null);
        jScrollPane104.setViewportView(tfs38);

        tfs45.setBorder(null);
        jScrollPane105.setViewportView(tfs45);

        tfs46.setBorder(null);
        jScrollPane106.setViewportView(tfs46);

        tfs49.setBorder(null);
        jScrollPane80.setViewportView(tfs49);

        tfs48.setBorder(null);
        jScrollPane107.setViewportView(tfs48);

        tfs47.setBorder(null);
        jScrollPane108.setViewportView(tfs47);

        tfs39.setBorder(null);
        jScrollPane81.setViewportView(tfs39);

        tfs35.setBorder(null);
        jScrollPane109.setViewportView(tfs35);

        tfs62.setBorder(null);
        jScrollPane76.setViewportView(tfs62);

        tfs86.setBorder(null);
        jScrollPane110.setViewportView(tfs86);

        tfs57.setBorder(null);
        jScrollPane111.setViewportView(tfs57);

        tfs54.setBorder(null);
        jScrollPane77.setViewportView(tfs54);

        tfs83.setBorder(null);
        jScrollPane82.setViewportView(tfs83);

        tfs85.setBorder(null);
        jScrollPane112.setViewportView(tfs85);

        tfs56.setBorder(null);
        jScrollPane113.setViewportView(tfs56);

        tfs61.setBorder(null);
        jScrollPane83.setViewportView(tfs61);

        tfs84.setBorder(null);
        jScrollPane84.setViewportView(tfs84);

        tfs78.setBorder(null);
        jScrollPane114.setViewportView(tfs78);

        tfs82.setBorder(null);
        jScrollPane85.setViewportView(tfs82);

        tfs79.setBorder(null);
        jScrollPane86.setViewportView(tfs79);

        tfs58.setBorder(null);
        jScrollPane115.setViewportView(tfs58);

        tfs87.setBorder(null);
        jScrollPane116.setViewportView(tfs87);

        tfs53.setBorder(null);
        jScrollPane87.setViewportView(tfs53);

        tfs76.setBorder(null);
        jScrollPane117.setViewportView(tfs76);

        tfs65.setBorder(null);
        jScrollPane118.setViewportView(tfs65);

        tfs52.setBorder(null);
        jScrollPane88.setViewportView(tfs52);

        tfs81.setBorder(null);
        jScrollPane89.setViewportView(tfs81);

        tfs77.setBorder(null);
        jScrollPane119.setViewportView(tfs77);

        tfs66.setBorder(null);
        jScrollPane120.setViewportView(tfs66);

        tfs51.setForeground(new java.awt.Color(102, 255, 102));
        tfs51.setBorder(null);
        tfs51.setCaretColor(new java.awt.Color(255, 51, 0));
        tfs51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfs51.setDisabledTextColor(new java.awt.Color(255, 255, 51));
        tfs51.setSelectedTextColor(new java.awt.Color(255, 51, 255));
        jScrollPane10.setViewportView(tfs51);

        tfs74.setBorder(null);
        jScrollPane90.setViewportView(tfs74);

        tfs69.setBorder(null);
        jScrollPane91.setViewportView(tfs69);

        tfs75.setBorder(null);
        jScrollPane121.setViewportView(tfs75);

        tfs68.setBorder(null);
        jScrollPane122.setViewportView(tfs68);

        tfs72.setBorder(null);
        jScrollPane92.setViewportView(tfs72);

        tfs67.setBorder(null);
        jScrollPane123.setViewportView(tfs67);

        tfs59.setBorder(null);
        jScrollPane93.setViewportView(tfs59);

        tfs73.setBorder(null);
        jScrollPane124.setViewportView(tfs73);

        tfs71.setBorder(null);
        jScrollPane125.setViewportView(tfs71);

        tfs64.setBorder(null);
        jScrollPane126.setViewportView(tfs64);

        tfs88.setBorder(null);
        jScrollPane127.setViewportView(tfs88);

        tfs63.setBorder(null);
        jScrollPane128.setViewportView(tfs63);

        tfs89.setBorder(null);
        jScrollPane129.setViewportView(tfs89);

        tfs55.setBorder(null);
        jScrollPane130.setViewportView(tfs55);

        tfs98.setBorder(null);
        jScrollPane131.setViewportView(tfs98);

        tfs94.setBorder(null);
        jScrollPane132.setViewportView(tfs94);

        tfs92.setBorder(null);
        jScrollPane133.setViewportView(tfs92);

        tfs97.setBorder(null);
        jScrollPane134.setViewportView(tfs97);

        tfs99.setBorder(null);
        jScrollPane135.setViewportView(tfs99);

        tfs91.setBorder(null);
        jScrollPane136.setViewportView(tfs91);

        tfs96.setBorder(null);
        jScrollPane137.setViewportView(tfs96);

        tfs95.setBorder(null);
        jScrollPane138.setViewportView(tfs95);

        tfs93.setBorder(null);
        jScrollPane139.setViewportView(tfs93);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane105, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane109, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane103, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane102, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane106, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane108, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane104, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane81, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane107, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane80, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane101, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane97, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane99, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane100, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane96, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane94, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane98, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane95, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane88, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane87, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane83, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane76, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane128, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane126, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane130, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane118, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane113, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane111, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane120, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane123, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane115, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jScrollPane93, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane122, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane91, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jScrollPane136, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jScrollPane133, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jScrollPane139, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jScrollPane132, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jScrollPane138, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jScrollPane137, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jScrollPane134, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jScrollPane131, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane135, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane125, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane89, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jScrollPane92, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jScrollPane124, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jScrollPane85, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jScrollPane82, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(4, 4, 4)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane90, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane84, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane121, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane112, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jScrollPane117, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(jScrollPane119, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jScrollPane110, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(jScrollPane116, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jScrollPane114, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jScrollPane86, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jScrollPane127, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane129, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane101, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane99, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane100, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane98, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane97, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                .addComponent(jScrollPane96, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                .addComponent(jScrollPane94, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                .addComponent(jScrollPane95, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                            .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane60, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jScrollPane62, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jScrollPane61, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane63, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane109, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jScrollPane103, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jScrollPane102, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jScrollPane104, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jScrollPane81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane105)
                            .addComponent(jScrollPane106)
                            .addComponent(jScrollPane108)
                            .addComponent(jScrollPane107, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane80, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane88, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane87, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane83, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane76, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane128, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane126, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane130, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane113, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane111, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane115, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane93, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane118, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane120, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane123, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane122, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane91, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane125, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane92, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane124, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane90, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane89, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane85, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane82, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane84, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane121, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane117, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane119, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane114, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane86, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane112, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane110, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane116, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane127, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane129, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane136, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane133, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane139, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane132, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane138, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane137, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane134, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane131, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane135, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        tf63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf63.setForeground(new java.awt.Color(102, 255, 102));
        tf63.setText("1");
        tf63.setBorder(null);
        tf63.setCaretColor(new java.awt.Color(255, 51, 0));
        tf63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tf63.setDisabledTextColor(new java.awt.Color(255, 255, 51));
        tf63.setSelectedTextColor(new java.awt.Color(255, 51, 255));
        jScrollPane8.setViewportView(tf63);

        tf64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf64.setText("2");
        tf64.setBorder(null);
        jScrollPane68.setViewportView(tf64);

        tf65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf65.setText("3");
        tf65.setBorder(null);
        jScrollPane69.setViewportView(tf65);

        tf66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf66.setText("8");
        tf66.setBorder(null);
        tf66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf66ActionPerformed(evt);
            }
        });
        jScrollPane70.setViewportView(tf66);

        tf68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf68.setText("4");
        tf68.setBorder(null);
        jScrollPane71.setViewportView(tf68);

        tf67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf67.setText("5");
        tf67.setBorder(null);
        tf67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf67ActionPerformed(evt);
            }
        });
        jScrollPane72.setViewportView(tf67);

        tf69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf69.setText("6");
        tf69.setBorder(null);
        tf69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf69ActionPerformed(evt);
            }
        });
        jScrollPane73.setViewportView(tf69);

        tf70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf70.setText("9");
        tf70.setBorder(null);
        tf70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf70ActionPerformed(evt);
            }
        });
        jScrollPane74.setViewportView(tf70);

        tf71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf71.setText("7");
        tf71.setBorder(null);
        tf71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf71ActionPerformed(evt);
            }
        });
        jScrollPane75.setViewportView(tf71);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane73, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane75, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane74, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane74, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane73, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane75, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel90.setBackground(new java.awt.Color(102, 102, 0));
        jLabel90.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 153, 102));
        jLabel90.setText("NUMERO A ESCOGER");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(240, 240, 240)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField30)
                    .addComponent(jTextField15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jTextField30, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel5);

        jButton6.setText("NIVEL DIFICL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("INICIAR PARTIDA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("REINICIAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        TAtiempo1.setColumns(20);
        TAtiempo1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        TAtiempo1.setForeground(new java.awt.Color(255, 102, 102));
        TAtiempo1.setRows(5);
        TAtiempo1.setCaretColor(new java.awt.Color(255, 255, 51));
        jScrollPane9.setViewportView(TAtiempo1);

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel91.setText("APRENDIENDO BACKTRAKING CON SUDOKU");

        jButton9.setText("RESOLVER");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("VERIFICAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresoSudo9Layout = new javax.swing.GroupLayout(IngresoSudo9);
        IngresoSudo9.setLayout(IngresoSudo9Layout);
        IngresoSudo9Layout.setHorizontalGroup(
            IngresoSudo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoSudo9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(IngresoSudo9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IngresoSudo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addGroup(IngresoSudo9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(IngresoSudo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(IngresoSudo9Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngresoSudo9Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        IngresoSudo9Layout.setVerticalGroup(
            IngresoSudo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresoSudo9Layout.createSequentialGroup()
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(IngresoSudo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngresoSudo9Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(IngresoSudo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(IngresoSudo9Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Contenedor.add(IngresoSudo9, "card9");

        getContentPane().add(Contenedor, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
       mostrarTarjetas(Contenedor, "card4");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tf11.setText("");
        tf12.setText("");
        tf13.setText("");
        tf14.setText("");
        tf21.setText("");
        tf22.setText("");
        tf23.setText("");
        tf24.setText("");
        tf31.setText("");
        tf32.setText("");
        tf33.setText("");
        tf34.setText("");
        tf41.setText("");
        tf42.setText("");
        tf43.setText("");
        tf44.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mostrarTarjetas(Contenedor, "card2");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        imprimirCronometro();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        imprimirCronometro();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        tfs11.setText("");
        tfs12.setText("");
        tfs13.setText("");
        tfs14.setText("");
        tfs15.setText("");
        tfs16.setText("");
        tfs17.setText("");
        tfs18.setText("");
        tfs19.setText("");
        tfs21.setText("");
        tfs22.setText("");
        tfs23.setText("");
        tfs24.setText("");
        tfs25.setText("");
        tfs26.setText("");
        tfs27.setText("");
        tfs28.setText("");
        tfs29.setText("");
        tfs31.setText("");
        tfs32.setText("");
        tfs33.setText("");
        tfs34.setText("");
        tfs35.setText("");
        tfs36.setText("");
        tfs37.setText("");
        tfs38.setText("");
        tfs39.setText("");
        tfs41.setText("");
        tfs42.setText("");
        tfs43.setText("");
        tfs44.setText("");
        tfs45.setText("");
        tfs46.setText("");
        tfs47.setText("");
        tfs48.setText("");
        tfs49.setText("");
        tfs51.setText("");
        tfs52.setText("");
        tfs53.setText("");
        tfs54.setText("");
        tfs55.setText("");
        tfs56.setText("");
        tfs57.setText("");
        tfs58.setText("");
        tfs59.setText("");
        tfs61.setText("");
        tfs62.setText("");
        tfs63.setText("");
        tfs64.setText("");
        tfs65.setText("");
        tfs66.setText("");
        tfs67.setText("");
        tfs68.setText("");
        tfs69.setText("");
        tfs71.setText("");
        tfs72.setText("");
        tfs73.setText("");
        tfs74.setText("");
        tfs75.setText("");
        tfs76.setText("");
        tfs77.setText("");
        tfs78.setText("");
        tfs79.setText("");
        tfs81.setText("");
        tfs82.setText("");
        tfs83.setText("");
        tfs84.setText("");
        tfs85.setText("");
        tfs86.setText("");
        tfs87.setText("");
        tfs88.setText("");
        tfs89.setText("");
        tfs91.setText("");
        tfs92.setText("");
        tfs93.setText("");
        tfs94.setText("");
        tfs95.setText("");
        tfs96.setText("");
        tfs97.setText("");
        tfs98.setText("");
        tfs99.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrarTarjetas(Contenedor, "card9");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf66ActionPerformed

    private void tf67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf67ActionPerformed

    private void tf69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf69ActionPerformed

    private void tf70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf70ActionPerformed

    private void tf71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf71ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        llenarMatriz9();
        llenarMatrizSudoku9();
        imprimir9();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        llenarMatriz4();
        llenarMatrizSudoku4();
        imprimir4();
        for(int i =0;i<vector4.length;i++)
        {
            for(int j =0;j<vector4.length;j++)
        {
        comprobar_valor(vector4[i][j]);
        }
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
                 

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel IngresoSudo;
    private javax.swing.JPanel IngresoSudo9;
    private javax.swing.JPanel ResolverSudo4;
    private javax.swing.JTextArea TAtiempo;
    private javax.swing.JTextArea TAtiempo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane100;
    private javax.swing.JScrollPane jScrollPane101;
    private javax.swing.JScrollPane jScrollPane102;
    private javax.swing.JScrollPane jScrollPane103;
    private javax.swing.JScrollPane jScrollPane104;
    private javax.swing.JScrollPane jScrollPane105;
    private javax.swing.JScrollPane jScrollPane106;
    private javax.swing.JScrollPane jScrollPane107;
    private javax.swing.JScrollPane jScrollPane108;
    private javax.swing.JScrollPane jScrollPane109;
    private javax.swing.JScrollPane jScrollPane110;
    private javax.swing.JScrollPane jScrollPane111;
    private javax.swing.JScrollPane jScrollPane112;
    private javax.swing.JScrollPane jScrollPane113;
    private javax.swing.JScrollPane jScrollPane114;
    private javax.swing.JScrollPane jScrollPane115;
    private javax.swing.JScrollPane jScrollPane116;
    private javax.swing.JScrollPane jScrollPane117;
    private javax.swing.JScrollPane jScrollPane118;
    private javax.swing.JScrollPane jScrollPane119;
    private javax.swing.JScrollPane jScrollPane120;
    private javax.swing.JScrollPane jScrollPane121;
    private javax.swing.JScrollPane jScrollPane122;
    private javax.swing.JScrollPane jScrollPane123;
    private javax.swing.JScrollPane jScrollPane124;
    private javax.swing.JScrollPane jScrollPane125;
    private javax.swing.JScrollPane jScrollPane126;
    private javax.swing.JScrollPane jScrollPane127;
    private javax.swing.JScrollPane jScrollPane128;
    private javax.swing.JScrollPane jScrollPane129;
    private javax.swing.JScrollPane jScrollPane130;
    private javax.swing.JScrollPane jScrollPane131;
    private javax.swing.JScrollPane jScrollPane132;
    private javax.swing.JScrollPane jScrollPane133;
    private javax.swing.JScrollPane jScrollPane134;
    private javax.swing.JScrollPane jScrollPane135;
    private javax.swing.JScrollPane jScrollPane136;
    private javax.swing.JScrollPane jScrollPane137;
    private javax.swing.JScrollPane jScrollPane138;
    private javax.swing.JScrollPane jScrollPane139;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane63;
    private javax.swing.JScrollPane jScrollPane64;
    private javax.swing.JScrollPane jScrollPane65;
    private javax.swing.JScrollPane jScrollPane66;
    private javax.swing.JScrollPane jScrollPane67;
    private javax.swing.JScrollPane jScrollPane68;
    private javax.swing.JScrollPane jScrollPane69;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane70;
    private javax.swing.JScrollPane jScrollPane71;
    private javax.swing.JScrollPane jScrollPane72;
    private javax.swing.JScrollPane jScrollPane73;
    private javax.swing.JScrollPane jScrollPane74;
    private javax.swing.JScrollPane jScrollPane75;
    private javax.swing.JScrollPane jScrollPane76;
    private javax.swing.JScrollPane jScrollPane77;
    private javax.swing.JScrollPane jScrollPane78;
    private javax.swing.JScrollPane jScrollPane79;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane80;
    private javax.swing.JScrollPane jScrollPane81;
    private javax.swing.JScrollPane jScrollPane82;
    private javax.swing.JScrollPane jScrollPane83;
    private javax.swing.JScrollPane jScrollPane84;
    private javax.swing.JScrollPane jScrollPane85;
    private javax.swing.JScrollPane jScrollPane86;
    private javax.swing.JScrollPane jScrollPane87;
    private javax.swing.JScrollPane jScrollPane88;
    private javax.swing.JScrollPane jScrollPane89;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPane90;
    private javax.swing.JScrollPane jScrollPane91;
    private javax.swing.JScrollPane jScrollPane92;
    private javax.swing.JScrollPane jScrollPane93;
    private javax.swing.JScrollPane jScrollPane94;
    private javax.swing.JScrollPane jScrollPane95;
    private javax.swing.JScrollPane jScrollPane96;
    private javax.swing.JScrollPane jScrollPane97;
    private javax.swing.JScrollPane jScrollPane98;
    private javax.swing.JScrollPane jScrollPane99;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf14;
    private javax.swing.JTextField tf15;
    private javax.swing.JTextField tf16;
    private javax.swing.JTextField tf17;
    private javax.swing.JTextField tf18;
    private javax.swing.JTextField tf19;
    private javax.swing.JTextField tf20;
    private javax.swing.JTextField tf21;
    private javax.swing.JTextField tf22;
    private javax.swing.JTextField tf23;
    private javax.swing.JTextField tf24;
    private javax.swing.JTextField tf25;
    private javax.swing.JTextField tf26;
    private javax.swing.JTextField tf27;
    private javax.swing.JTextField tf28;
    private javax.swing.JTextField tf29;
    private javax.swing.JTextField tf30;
    private javax.swing.JTextField tf31;
    private javax.swing.JTextField tf32;
    private javax.swing.JTextField tf33;
    private javax.swing.JTextField tf34;
    private javax.swing.JTextField tf35;
    private javax.swing.JTextField tf36;
    private javax.swing.JTextField tf37;
    private javax.swing.JTextField tf38;
    private javax.swing.JTextField tf41;
    private javax.swing.JTextField tf42;
    private javax.swing.JTextField tf43;
    private javax.swing.JTextField tf44;
    private javax.swing.JTextField tf45;
    private javax.swing.JTextField tf46;
    private javax.swing.JTextField tf47;
    private javax.swing.JTextField tf48;
    private javax.swing.JTextField tf63;
    private javax.swing.JTextField tf64;
    private javax.swing.JTextField tf65;
    private javax.swing.JTextField tf66;
    private javax.swing.JTextField tf67;
    private javax.swing.JTextField tf68;
    private javax.swing.JTextField tf69;
    private javax.swing.JTextField tf70;
    private javax.swing.JTextField tf71;
    private javax.swing.JTextField tfs11;
    private javax.swing.JTextField tfs12;
    private javax.swing.JTextField tfs13;
    private javax.swing.JTextField tfs14;
    private javax.swing.JTextField tfs15;
    private javax.swing.JTextField tfs16;
    private javax.swing.JTextField tfs17;
    private javax.swing.JTextField tfs18;
    private javax.swing.JTextField tfs19;
    private javax.swing.JTextField tfs21;
    private javax.swing.JTextField tfs22;
    private javax.swing.JTextField tfs23;
    private javax.swing.JTextField tfs24;
    private javax.swing.JTextField tfs25;
    private javax.swing.JTextField tfs26;
    private javax.swing.JTextField tfs27;
    private javax.swing.JTextField tfs28;
    private javax.swing.JTextField tfs29;
    private javax.swing.JTextField tfs31;
    private javax.swing.JTextField tfs32;
    private javax.swing.JTextField tfs33;
    private javax.swing.JTextField tfs34;
    private javax.swing.JTextField tfs35;
    private javax.swing.JTextField tfs36;
    private javax.swing.JTextField tfs37;
    private javax.swing.JTextField tfs38;
    private javax.swing.JTextField tfs39;
    private javax.swing.JTextField tfs41;
    private javax.swing.JTextField tfs42;
    private javax.swing.JTextField tfs43;
    private javax.swing.JTextField tfs44;
    private javax.swing.JTextField tfs45;
    private javax.swing.JTextField tfs46;
    private javax.swing.JTextField tfs47;
    private javax.swing.JTextField tfs48;
    private javax.swing.JTextField tfs49;
    private javax.swing.JTextField tfs51;
    private javax.swing.JTextField tfs52;
    private javax.swing.JTextField tfs53;
    private javax.swing.JTextField tfs54;
    private javax.swing.JTextField tfs55;
    private javax.swing.JTextField tfs56;
    private javax.swing.JTextField tfs57;
    private javax.swing.JTextField tfs58;
    private javax.swing.JTextField tfs59;
    private javax.swing.JTextField tfs61;
    private javax.swing.JTextField tfs62;
    private javax.swing.JTextField tfs63;
    private javax.swing.JTextField tfs64;
    private javax.swing.JTextField tfs65;
    private javax.swing.JTextField tfs66;
    private javax.swing.JTextField tfs67;
    private javax.swing.JTextField tfs68;
    private javax.swing.JTextField tfs69;
    private javax.swing.JTextField tfs71;
    private javax.swing.JTextField tfs72;
    private javax.swing.JTextField tfs73;
    private javax.swing.JTextField tfs74;
    private javax.swing.JTextField tfs75;
    private javax.swing.JTextField tfs76;
    private javax.swing.JTextField tfs77;
    private javax.swing.JTextField tfs78;
    private javax.swing.JTextField tfs79;
    private javax.swing.JTextField tfs81;
    private javax.swing.JTextField tfs82;
    private javax.swing.JTextField tfs83;
    private javax.swing.JTextField tfs84;
    private javax.swing.JTextField tfs85;
    private javax.swing.JTextField tfs86;
    private javax.swing.JTextField tfs87;
    private javax.swing.JTextField tfs88;
    private javax.swing.JTextField tfs89;
    private javax.swing.JTextField tfs91;
    private javax.swing.JTextField tfs92;
    private javax.swing.JTextField tfs93;
    private javax.swing.JTextField tfs94;
    private javax.swing.JTextField tfs95;
    private javax.swing.JTextField tfs96;
    private javax.swing.JTextField tfs97;
    private javax.swing.JTextField tfs98;
    private javax.swing.JTextField tfs99;
    // End of variables declaration//GEN-END:variables
}
