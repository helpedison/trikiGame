//package triqui;
//librerias
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/*
 * @author Estudiantes: 
 * CINDY TATIANA RICO CORT?S 
 * JESSICA MILDREY SIVA FORERO
 * DAVID ALEJANDRO ARAGON OLARTE
 * EDISON JAHIR VARGAS MAYORGA
 * SILVANA STEYSI GIRALDO ARISMENDY
 * POLITECNICO 2021
*/
public class triqui extends javax.swing.JFrame {
	
	//variables principales
    int juegos;
    int jx;
    int jo;
    int control = 1;
    int contax = 0;
    int contao = 0;
    int conempate = 0;
    int matriz[][] = new int[3][3];
    int multijugador = 3;
    int contjuegos = 0;
    int numjuegos=1; 
    String JugadorX ;
    String JugadorO;
    
    public triqui() {
		
		//se solicita el nombre del jugador que utiliara la X en el juego
    	JugadorX = JOptionPane.showInputDialog ( "Nombre del jugador X" );
    	//se solicita el nombre del jugador que utiliara la O en el juego
    	JugadorO = JOptionPane.showInputDialog ( "Nombre del jugador O" );
		 
		 //inicializa la interfaz
    	initComponents(JugadorX,JugadorO); 
	}

    @SuppressWarnings("unchecked")
	
    //interfaz
    private void initComponents(String JugadorX,String JugadorO) {
		//controles
    	b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        puntao = new javax.swing.JTextField();
        puntax1 = new javax.swing.JTextField();
        empate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //eventos de los controles (cuadros del triqui)
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        
        //eventos de los controles (cuadros del triqui)
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        }); 
        
        //eventos de los controles (cuadros del triqui)
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

       //eventos de los controles (cuadros del triqui)
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        //eventos de los controles (cuadros del triqui)
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        
        //eventos de los controles (cuadros del triqui)
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
 
        //eventos de los controles (cuadros del triqui)
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        //eventos de los controles (cuadros del triqui)      
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
 
        //eventos de los controles (cuadros del triqui)   
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        //control juGador X
        jLabel1.setText("JUGADOR X: "+JugadorX);
        //control juGador O
        jLabel2.setText("JUGADOR O: "+JugadorO);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel3.setText("PUNTAJE "); 

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel4.setText("TRIQUI");

        puntao.setEnabled(false);

        puntax1.setEnabled(false);

        empate.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel5.setText("EMPATE");

        jButton1.setText("Volver a Jugar");
        //eventos del control volver a jugar
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        }); 
        
        //ajustar el frame 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout); 
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(puntax1))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(puntao)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(empate))))
                        .addContainerGap(116, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1) 
                        .addGap(23, 23, 23) )))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238)
                .addComponent(jLabel3)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(puntao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(puntax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(empate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    } 
    
    //metodo que verifica si existe empate, es decir que no hay posibilidad de hacer el triqui
    private void empatejuego() {
        int acu = 0;

        for (int j = 0; j <= 2; j++) {
			for (int k = 0; k <= 2; k++) {
                acu = acu + matriz[j][k];
            }
        }
        if (acu == 1380 || acu == 1536) {
            JOptionPane.showMessageDialog(rootPane, JugadorX+" y "+JugadorO+" quedaron en empate se reiniciara el juego");
            conempate = conempate + 1;
            contjuegos = contjuegos + 1;
            String e = Integer.toString(conempate);
            empate.setText(e);
            borra();
        }
    }

    //metodo que limpia los cuadros del triqui
    private void borra() {
        b1.setText("");
        b1.setEnabled(true);
        b2.setText("");
        b2.setEnabled(true);
        b3.setText("");
        b3.setEnabled(true);
        b4.setText("");
        b4.setEnabled(true);
        b5.setText("");
        b5.setEnabled(true);
        b6.setText("");
        b6.setEnabled(true);
        b7.setText("");
        b7.setEnabled(true);
        b8.setText("");
        b8.setEnabled(true);
        b9.setText("");
        b9.setEnabled(true);

        for (int x = 0; x <= 2; x++) {
            for (int i = 0; i <= 2; i++) {

                matriz[x][i] = 0;
            }
        }
    }

    //metodo que limpia todos los controles del juego 
    private void borracompleto() {
        b1.setText("");
        b1.setEnabled(true);
        b2.setText("");
        b2.setEnabled(true);
        b3.setText("");
        b3.setEnabled(true);
        b4.setText("");
        b4.setEnabled(true);
        b5.setText("");
        b5.setEnabled(true);
        b6.setText("");
        b6.setEnabled(true);
        b7.setText("");
        b7.setEnabled(true);
        b8.setText("");
        b8.setEnabled(true);
        b9.setText("");
        b9.setEnabled(true);

        puntax1.setText(null);
        puntao.setText(null);
        empate.setText(null);

        contax = 0;
        contao = 0;
        conempate = 0;
        contjuegos = 0;

        for (int x = 0; x <= 2; x++) {
            for (int i = 0; i <= 2; i++) {

                matriz[x][i] = 0;
            }
        }

    }

    //se valida cuando juega el jugador x
    private void contx() {
        contax = contax + 1;
        String x = Integer.toString(contax);
        puntax1.setText(x);
    }

    //se valida cuando juega el jugador O
    private void conto() {
        contao = contao + 1;
        String o = Integer.toString(contao);
        puntao.setText(o);
    }

    //se valida si formado la linea de 3 con la misma figura
    private void linea1() {
        if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 252) {
            JOptionPane.showMessageDialog(null, "JUGADOR X: " +JugadorX+" GANO");
            contjuegos = contjuegos + 1;
            contx();
            borra(); 
        }
        if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 720) {
            JOptionPane.showMessageDialog(null, "JUGADOR O: " +JugadorO+"  GANO");
            contjuegos = contjuegos + 1;
            conto();
            borra(); 
        }
    }

    //se valida si formado la linea de 3 con la misma figura
    private void linea2() {
        if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 252) {
            JOptionPane.showMessageDialog(null, "JUGADOR X: " +JugadorX+" GANO");
            contjuegos = contjuegos + 1;
            contx();
            borra(); 
        }
        if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 720) {
            JOptionPane.showMessageDialog(null, "JUGADOR O: " +JugadorO+" GANO");
            contjuegos = contjuegos + 1;
            conto();
            borra(); 
        }
    }

    //se valida si formado la linea de 3 con la misma figura
    private void linea3() {
        if (matriz[2][0] + matriz[2][1] + matriz[2][2] == 252) {
            JOptionPane.showMessageDialog(null, "JUGADOR X: " +JugadorX+" GANO");
            contjuegos = contjuegos + 1;
            contx();
            borra(); 
        }
        if (matriz[2][0] + matriz[2][1] + matriz[2][2] == 720) {
            JOptionPane.showMessageDialog(null, "JUGADOR O: " +JugadorO+"  GANO");
            contjuegos = contjuegos + 1;
            conto();
            borra(); 
        }
    }

    //se valida si formado la linea de 3 con la misma figura
    private void linea4() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {
            acu = acu + matriz[x][0];
            if (acu == 252) {
                JOptionPane.showMessageDialog(null, "JUGADOR X: " +JugadorX+" GANO");
                contjuegos = contjuegos + 1;
                contx();
                borra(); 
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR O: " +JugadorO+"  GANO");
                contjuegos = contjuegos + 1;
                conto();
                borra(); 
            }
        }
    }

    //se valida si formado la linea de 3 con la misma figura
    private void linea5() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {
            acu = acu + matriz[x][1];
            if (acu == 252) {
                JOptionPane.showMessageDialog(null, "JUGADOR X: " +JugadorX+"  GANO");
                contjuegos = contjuegos + 1;
                contx();
                borra(); 
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR O: " +JugadorO+"  GANO");
                contjuegos = contjuegos + 1;
                conto();
                borra(); 
            }
        }
    }
    
    //se valida si formado la linea de 3 con la misma figura
    private void linea6() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {
            acu = acu + matriz[x][2];
            if (acu == 252) {
                JOptionPane.showMessageDialog(null, "JUGADOR X: " +JugadorX+" GANO");
                contjuegos = contjuegos + 1;
                contx();
                borra(); 
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR O: " +JugadorO+"  GANO");
                contjuegos = contjuegos + 1;
                conto();
                borra(); 
            }
        }
    }

    //se valida si formado la linea de 3 con la misma figura
    private void lineaformx() {
        int acu = 0;
        for (int x = 0; x <= 2; x++) {
            acu = acu + matriz[x][x];
            if (acu == 252) {
                JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
                contjuegos = contjuegos + 1;
                contx();
                borra(); 
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
                contjuegos = contjuegos + 1;
                conto();
                borra(); 
            }
        }
    }

    //se valida si formado la linea de 3 con la misma figura
    private void lineaformx2() {
        int acu = 0;
        int cont = 2;
        for (int i = 0; i <= 2; i++) {
            acu = acu + matriz[cont][i];
            cont = cont - 1;
            if (acu == 252) {
                JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
                contjuegos = contjuegos + 1;
                contx();
                borra(); 
            }
            if (acu == 720) {
                JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
                contjuegos = contjuegos + 1;
                conto();
                borra(); 
            }
        }
    }

    //metodo que se ejecuta cada vez que interactuan con el control 1 de la matriz 
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
    	preguntas();
    	if (control == 1) {
            b1.setText("X");
            matriz[0][0] = 84;
            control = 2;
            b1.setEnabled(false);
        } else {
            b1.setText("O");
            matriz[0][0] = 240;
            control = 1;
            b1.setEnabled(false);
        }

        empatejuego();
        linea1();
        linea4();
        lineaformx(); 
    }
    
    //metodo que se ejecuta cada vez que interactuan con el control 2 de la matriz
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
    	preguntas();
    	if (control == 1) {
            b2.setText("X");
            matriz[0][1] = 84;
            control = 2;
            b2.setEnabled(false);
        } 
		else {
			b2.setText("O");
            matriz[0][1] = 240;
            control = 1;
            b2.setEnabled(false);
        }

        empatejuego();
        linea1();
        linea5();
        lineaformx(); 
    }

    //metodo que se ejecuta cada vez que interactuan con el control 3 de la matriz
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
    	preguntas();
    	if (control == 1) {
            b3.setText("X");
            matriz[0][2] = 84;
            control = 2;
            b3.setEnabled(false);
        } 
		else {
            b3.setText("O");
            matriz[0][2] = 240;
            control = 1;
            b3.setEnabled(false);
        }

        empatejuego();
        linea1();
        linea2();
        linea4();
        lineaformx();
        linea6();
        lineaformx2();
    }

    //metodo que se ejecuta cada vez que interactuan con el control 4 de la matriz
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {
    	preguntas();
    	if (control == 1) {
            b4.setText("X");
            matriz[1][0] = 84;
            control = 2;
            b4.setEnabled(false);
        } 
		else {
            b4.setText("O");
            matriz[1][0] = 240;
            control = 1;
            b4.setEnabled(false);
        }
        
        empatejuego();
        linea2();
        linea4();
        lineaformx();
        linea6();
    }

    //metodo que se ejecuta cada vez que interactuan con el control 5 de la matriz
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
    	preguntas();
    	if (control == 1) {
            b5.setText("X");
            matriz[1][1] = 84;
            control = 2;
            b5.setEnabled(false);
        } 
		else {
            b5.setText("O");
            matriz[1][1] = 240;
            control = 1;
            b5.setEnabled(false);
        }

        empatejuego();
        linea2();
        linea5();
        lineaformx();
        lineaformx2();
    }

    //metodo que se ejecuta cada vez que interactuan con el control 6 de la matriz
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
    	preguntas();
    	if (control == 1) {
            b6.setText("X");
            matriz[1][2] = 84;
            control = 2;
            b6.setEnabled(false);
        } else {
            b6.setText("O");
            matriz[1][2] = 240;
            control = 1;
            b6.setEnabled(false);
        }

        empatejuego();
        linea2();
        linea4();
        linea6();
        lineaformx(); 
    }

    //metodo que se ejecuta cada vez que interactuan con el control 7 de la matriz
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
    	preguntas();
    	if (control == 1) {
            b7.setText("X");
            matriz[2][0] = 84;
            control = 2;
            b7.setEnabled(false);
        } else {
            b7.setText("O");
            matriz[2][0] = 240;
            control = 1;
            b7.setEnabled(false);
        }

        empatejuego();
        linea3();
        linea4();
        lineaformx();
        lineaformx2();
    }

    //metodo que se ejecuta cada vez que interactuan con el control 8 de la matriz
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
    	preguntas();
    	if (control == 1) {
            b8.setText("X");
            matriz[2][1] = 84;
            control = 2;
            b8.setEnabled(false);
        } else {
            b8.setText("O");
            matriz[2][1] = 240;
            control = 1;
            b8.setEnabled(false);
        }

        empatejuego();
        linea3();
        linea5();
        lineaformx();
    }

    //metodo que se ejecuta cada vez que interactuan con el control 9 de la matriz
    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {
    	preguntas(); 
    	if (control == 1) {
            b9.setText("X");
            matriz[2][2] = 84;
            control = 2;
            b9.setEnabled(false);
        } 
		else {
            b9.setText("O");
            matriz[2][2] = 240;
            control = 1;
            b9.setEnabled(false);
        }

        empatejuego();
        linea3();
        linea4();
        linea6();
        lineaformx();
    }
 
    //metodo que se ejecuta cada vez que interactuan con el control volver a jugar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        borracompleto();
        multijugador = JOptionPane.showConfirmDialog(null, "Quieres salir del programa");
        if(multijugador==0) {
        	System.exit(0);
        	
        }
        if(multijugador==1) {
        	JOptionPane.showMessageDialog(null, "Se reiniciara el juego");        	
        }
        
    }
    
    //metodo que genera aleatoriamente las preguntas en cada una de las jugadas por cada jugador
    //debe responde correctamente de lo contrario el sistema le genera preguntas 
    public void preguntas() {
        int randomNum = 0;
        int respuesta;
        int seleccion;
        boolean encontro = false;
        System.out.println("el ramdom");
        do {
            randomNum = 1 + (int) (Math.random() * 20);
            System.out.println("el ramdom es " + randomNum);

            switch (randomNum) {
            	case 1:{
            		seleccion = JOptionPane.showOptionDialog( 
                			   b1, "El n?mero cinco mil cuatrocientos treinta y uno, se escribe", 
                			   "Selector de opciones",
                			   JOptionPane.YES_NO_CANCEL_OPTION,
                			   JOptionPane.QUESTION_MESSAGE, 
                			   null, new Object[] { "A. 4421", "B. 4531", "C. 5421","D. 5431" },   
                			   "opcion 1");
                	if (seleccion==3) {
                		
                    }
                	else {
                		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                	}
                	}
                    break;
                case 2:{
                	seleccion = JOptionPane.showOptionDialog( 
             			   b2, "El resultado de 270+145 es", 
             			   "Selector de opciones",
             			   JOptionPane.YES_NO_CANCEL_OPTION,
             			   JOptionPane.QUESTION_MESSAGE, 
             			   null, new Object[] { "A. 310", "B. 315", "C. 410","D. 415" },   
             			   "opcion 1");
                	if (seleccion==3) {
                		encontro = true;
                	}
                	else {
                		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                	}
             		}
                    break;
                case 3:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b2, "Para obtener la misma cantidad de dinero, un billete de $ 2.000 lo puedo cambiar por", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. 3 monedas de $ 200, 2 monedas de $ 500 y 7 monedas de $100", "B. 5 monedas de $200, 4 monedas de $ 500 y 6 monedas de $ 100", "C. 2 monedas de $ 500, 2 monedas de $ 200 y 6 monedas de $ 100","D. 3 monedas de $ 500, 3 monedas de $ 200 y 4 monedas de $ 100" },   
              			   "opcion 1");
                 	if (seleccion==2) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		}
                     break;
                case 4:{
                	seleccion = JOptionPane.showOptionDialog( 
               			   b4, "120 minutos y 120segundos, equivalen a", 
               			   "Selector de opciones",
               			   JOptionPane.YES_NO_CANCEL_OPTION,
               			   JOptionPane.QUESTION_MESSAGE, 
               			   null, new Object[] { "A. 240 segundos", "B. 4 horas", "C. 1 hora y 3 minutos","D. 2 horas y 2 minutos" },   
               			   "opcion 1");
                  	if (seleccion==3) {
                  		encontro = true;
                  	}
                  	else {
                  		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                  	}
               		}
                    break;
                case 5:{
                	seleccion = JOptionPane.showOptionDialog( 
               			   b5, "El poeta colombiano Rafael Pombo escritor de la pobre viejecita, naci? en el a?o 1833 y muri? en 1912. ?De cuantos a?os muri? el poeta?", 
               			   "Selector de opciones",
               			   JOptionPane.YES_NO_CANCEL_OPTION,
               			   JOptionPane.QUESTION_MESSAGE, 
               			   null, new Object[] { "A. 79", "B. 69", "C. 59","D. 49" },   
               			   "opcion 1");
                  	if (seleccion==0) {
                  		encontro = true;
                  	}
                  	else {
                  		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                  	}
               		}
                    break; 
                case 6:{
                	seleccion = JOptionPane.showOptionDialog( 
               			   b6, "El resultado de (20 + 15) + 30 es", 
               			   "Selector de opciones",
               			   JOptionPane.YES_NO_CANCEL_OPTION,
               			   JOptionPane.QUESTION_MESSAGE, 
               			   null, new Object[] { "A. 30","B. 35","C. 50","D. 65" },   
               			   "opcion 1");
                  	if (seleccion==3) {
                  		encontro = true;
                  	}
                  	else {
                  		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                  	}
               		}
                    break;
                case 7:{
                	seleccion = JOptionPane.showOptionDialog( 
                			   b6, "El resultado de (45 + 8) x 3 es", 
                			   "Selector de opciones",
                			   JOptionPane.YES_NO_CANCEL_OPTION,
                			   JOptionPane.QUESTION_MESSAGE, 
                			   null, new Object[] { "A. 169","B. 159","C. 149","D. 139" },   
                			   "opcion 1");
                   	if (seleccion==2) {
                   		encontro = true;
                   	}
                   	else {
                   		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                   	}
                	} 
                    break;
                case 8:{
                	seleccion = JOptionPane.showOptionDialog( 
             			   b6, "El n?mero mil cuatrocientos veintis?is, se escribe", 
             			   "Selector de opciones",
             			   JOptionPane.YES_NO_CANCEL_OPTION,
             			   JOptionPane.QUESTION_MESSAGE, 
             			   null, new Object[] { "A. 1406","B. 1416","C. 1426","D. 1436" },   
             			   "opcion 1");
                	if (seleccion==2) {
                		encontro = true;
                	}
                	else {
                		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                	}
             	} 
                 break;
                case 9:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "El resultado de 25 + (99+ 29) es", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. 143","B. 135","C. 163","D. 153" },   
              			   "opcion 1");
                 	if (seleccion==3) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break;
                case 10:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "El n?mero siete mil veintitr?s se escribe", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. 7023","B. 723","C. 7230","D. 7203" },   
              			   "opcion 1");
                 	if (seleccion==0) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break;                    
                case 11:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de Amazonas es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. Leticia","B. Arauca","C. Neiva","D. Bogot?" },   
              			   "opcion 1");
                 	if (seleccion==0) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break; 
                case 12:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de Antioquia es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. Pereira","B. Neiva","C. C?cuta","D. Medell?n" },   
              			   "opcion 1");
                 	if (seleccion==3) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break; 
                case 13:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de Boyac? es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. Florencia","B. Manizales","C. Tunja","D. Medell?n " },   
              			   "opcion 1");
                 	if (seleccion==2) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break; 
                case 14:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de Caldas es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. Florencia","B. Manizales","C. Tunja","D. Monter?a " },   
              			   "opcion 1");
                 	if (seleccion==1) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break; 
                case 15:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de Cundinamarca es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. Yopal","B. Bogot?","C. In?rida","D. C?cuta" },   
              			   "opcion 1");
                 	if (seleccion==1) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break; 
                case 16:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de Cesar es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. Cartagena","B. Bogot?","C. Tunja","D. Valledupar" },   
              			   "opcion 1");
                 	if (seleccion==3) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break; 
                case 17:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de Meta es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. Villavicencio","B. Bogot?","C. In?rida","D. Riohacha" },   
              			   "opcion 1");
                 	if (seleccion==0) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break; 
                case 18:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de Nari?o es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. Yopal","B. Pasto","C. In?rida","D. Monter?a " },   
              			   "opcion 1");
                 	if (seleccion==1) {
                 		encontro = true;
                 	}
                 	else {
                 		JOptionPane.showConfirmDialog(null, "Respuesta incorrecta");
                 	}
              		} 
                    break; 
                case 19:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de San Andr?s y Providencia es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. San Andr?s","B. Monter?a","C. Florencia","D. Tunja  " },   
              			   "opcion 1");
                 	if (seleccion==0) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break; 
                case 20:{
                	seleccion = JOptionPane.showOptionDialog( 
              			   b9, "La Capital del Departamento de Santander es:", 
              			   "Selector de opciones",
              			   JOptionPane.YES_NO_CANCEL_OPTION,
              			   JOptionPane.QUESTION_MESSAGE, 
              			   null, new Object[] { "A. Medell?n","B. Pereira","C. Arauca","D. Bucaramanga " },   
              			   "opcion 1");
                 	if (seleccion==3) {
                 		encontro = true;
                 	}
                 	else {
                 		respuesta=JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
                    	//si la respuesta es si 
                		if (respuesta==0) {
                			encontro = true;
                			preguntas();
                        }
                		if (respuesta==1) {
                			System.exit(0);
                        }
                 	}
              		} 
                    break; 
                    }
        } while (encontro == false);

    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(triqui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new triqui().setVisible(true);
            }
        });
    }



    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JTextField empate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField puntao;
    private javax.swing.JTextField puntax1;
}
