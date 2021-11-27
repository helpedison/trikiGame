package controller;

import javax.swing.JOptionPane;

import model.Jugador;

@SuppressWarnings("serial")
public class JuegoController extends javax.swing.JFrame {

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
	int numjuegos = 1;

	private Jugador jugadorX;
	private Jugador jugadorO;
//    private javax.swing.JTextField empate;
//    private javax.swing.JTextField puntao;
//    private javax.swing.JTextField puntax1;
//    

	public Jugador getJugadorX() {
		return jugadorX;
	}

	public void setJugadorX(Jugador jugadorX) {
		this.jugadorX = jugadorX;
	}

	public Jugador getJugadorO() {
		return jugadorO;
	}

	public void setJugadorO(Jugador jugadorO) {
		this.jugadorO = jugadorO;
	}

	// variables de la pantalla del juego

	public JuegoController() {

		// inicializa la interfaz
		// initComponents(jugadorX,jugadorO);
	}

	// metodo que verifica si existe empate, es decir que no hay posibilidad de
	// hacer el triqui
	private void empatejuego(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3,
			javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7,
			javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField empate) {
		int acu = 0;

		for (int j = 0; j <= 2; j++) {
			for (int k = 0; k <= 2; k++) {
				acu = acu + matriz[j][k];
			}
		}
		if (acu == 1380 || acu == 1536) {
			JOptionPane.showMessageDialog(rootPane,
					jugadorX.getNombre() + " y " + jugadorO.getNombre() + " quedaron en empate se reiniciara el juego");
			conempate = conempate + 1;
			contjuegos = contjuegos + 1;
			String e = Integer.toString(conempate);
			empate.setText(e);
			borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		}
	}

	// metodo que limpia los cuadros del triqui
	private void borra(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3, javax.swing.JButton b4,
			javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7, javax.swing.JButton b8,
			javax.swing.JButton b9) {
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

	// metodo que limpia todos los controles del juego
	private void borracompleto(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3,
			javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7,
			javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField empate,
			javax.swing.JTextField puntao, javax.swing.JTextField puntax1) {

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

	// se valida cuando juega el jugador x
	private void contx(javax.swing.JTextField puntax1) {
		contax = contax + 1;
		String x = Integer.toString(contax);
		puntax1.setText(x);
	}

	// se valida cuando juega el jugador O
	private void conto(javax.swing.JTextField puntao) {
		contao = contao + 1;
		String o = Integer.toString(contao);
		puntao.setText(o);
	}

	// se valida si formado la linea de 3 con la misma figura
	private void linea1(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3, javax.swing.JButton b4,
			javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7, javax.swing.JButton b8,
			javax.swing.JButton b9, javax.swing.JTextField puntao, javax.swing.JTextField puntax1) {
		if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 252) {
			JOptionPane.showMessageDialog(null, "JUGADOR X: " + jugadorX.getNombre() + " GANO");
			contjuegos = contjuegos + 1;
			contx(puntax1);
			borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		}
		if (matriz[0][0] + matriz[0][1] + matriz[0][2] == 720) {
			JOptionPane.showMessageDialog(null, "JUGADOR O: " + jugadorO.getNombre() + "  GANO");
			contjuegos = contjuegos + 1;
			conto(puntao);
			borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		}
	}

	// se valida si formado la linea de 3 con la misma figura
	private void linea2(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3, javax.swing.JButton b4,
			javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7, javax.swing.JButton b8,
			javax.swing.JButton b9, javax.swing.JTextField puntax1, javax.swing.JTextField puntao) {
		if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 252) {
			JOptionPane.showMessageDialog(null, "JUGADOR X: " + jugadorX.getNombre() + " GANO");
			contjuegos = contjuegos + 1;
			contx(puntax1);
			borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		}
		if (matriz[1][0] + matriz[1][1] + matriz[1][2] == 720) {
			JOptionPane.showMessageDialog(null, "JUGADOR O: " + jugadorO.getNombre() + " GANO");
			contjuegos = contjuegos + 1;
			conto(puntao);
			borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		}
	}

	// se valida si formado la linea de 3 con la misma figura
	private void linea3(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3, javax.swing.JButton b4,
			javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7, javax.swing.JButton b8,
			javax.swing.JButton b9, javax.swing.JTextField puntax1, javax.swing.JTextField puntao) {
		if (matriz[2][0] + matriz[2][1] + matriz[2][2] == 252) {
			JOptionPane.showMessageDialog(null, "JUGADOR X: " + jugadorX.getNombre() + " GANO");
			contjuegos = contjuegos + 1;
			contx(puntax1);
			borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		}
		if (matriz[2][0] + matriz[2][1] + matriz[2][2] == 720) {
			JOptionPane.showMessageDialog(null, "JUGADOR O: " + jugadorO.getNombre() + "  GANO");
			contjuegos = contjuegos + 1;
			conto(puntao);
			borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		}
	}

	// se valida si formado la linea de 3 con la misma figura
	private void linea4(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3, javax.swing.JButton b4,
			javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7, javax.swing.JButton b8,
			javax.swing.JButton b9, javax.swing.JTextField puntax1, javax.swing.JTextField puntao) {
		int acu = 0;
		for (int x = 0; x <= 2; x++) {
			acu = acu + matriz[x][0];
			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X: " + jugadorX.getNombre() + " GANO");
				contjuegos = contjuegos + 1;
				contx(puntax1);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O: " + jugadorO.getNombre() + "  GANO");
				contjuegos = contjuegos + 1;
				conto(puntao);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
		}
	}

	// se valida si formado la linea de 3 con la misma figura
	private void linea5(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3, javax.swing.JButton b4,
			javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7, javax.swing.JButton b8,
			javax.swing.JButton b9, javax.swing.JTextField puntax1, javax.swing.JTextField puntao) {
		int acu = 0;
		for (int x = 0; x <= 2; x++) {
			acu = acu + matriz[x][1];
			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X: " + jugadorX.getNombre() + "  GANO");
				contjuegos = contjuegos + 1;
				contx(puntax1);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O: " + jugadorO.getNombre() + "  GANO");
				contjuegos = contjuegos + 1;
				conto(puntao);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
		}
	}

	// se valida si formado la linea de 3 con la misma figura
	private void linea6(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3, javax.swing.JButton b4,
			javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7, javax.swing.JButton b8,
			javax.swing.JButton b9, javax.swing.JTextField puntax1, javax.swing.JTextField puntao) {
		int acu = 0;
		for (int x = 0; x <= 2; x++) {
			acu = acu + matriz[x][2];
			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X: " + jugadorX.getNombre() + " GANO");
				contjuegos = contjuegos + 1;
				contx(puntax1);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O: " + jugadorO.getNombre() + "  GANO");
				contjuegos = contjuegos + 1;
				conto(puntao);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
		}
	}

	// se valida si formado la linea de 3 con la misma figura
	private void lineaformx(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3,
			javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7,
			javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao) {
		int acu = 0;
		for (int x = 0; x <= 2; x++) {
			acu = acu + matriz[x][x];
			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
				contjuegos = contjuegos + 1;
				contx(puntax1);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
				contjuegos = contjuegos + 1;
				conto(puntao);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
		}
	}

	// se valida si formado la linea de 3 con la misma figura
	private void lineaformx2(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3,
			javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7,
			javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao) {
		int acu = 0;
		int cont = 2;
		for (int i = 0; i <= 2; i++) {
			acu = acu + matriz[cont][i];
			cont = cont - 1;
			if (acu == 252) {
				JOptionPane.showMessageDialog(null, "JUGADOR X GANO");
				contjuegos = contjuegos + 1;
				contx(puntax1);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
			if (acu == 720) {
				JOptionPane.showMessageDialog(null, "JUGADOR O GANO");
				contjuegos = contjuegos + 1;
				conto(puntao);
				borra(b1, b2, b3, b4, b5, b6, b7, b8, b9);
			}
		}
	}

	// metodo que se ejecuta cada vez que interactuan con el control 1 de la matriz
	public void b1ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate) {
		preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
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

		empatejuego(b1, b2, b3, b4, b5, b6, b7, b8, b9, empate);
		linea1(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea4(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
	}

	// metodo que se ejecuta cada vez que interactuan con el control 2 de la matriz
	public void b2ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate) {
		preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		if (control == 1) {
			b2.setText("X");
			matriz[0][1] = 84;
			control = 2;
			b2.setEnabled(false);
		} else {
			b2.setText("O");
			matriz[0][1] = 240;
			control = 1;
			b2.setEnabled(false);
		}
		empatejuego(b1, b2, b3, b4, b5, b6, b7, b8, b9, empate);
		linea1(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea5(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
	}

	// metodo que se ejecuta cada vez que interactuan con el control 3 de la matriz
	public void b3ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate) {
		preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		if (control == 1) {
			b3.setText("X");
			matriz[0][2] = 84;
			control = 2;
			b3.setEnabled(false);
		} else {
			b3.setText("O");
			matriz[0][2] = 240;
			control = 1;
			b3.setEnabled(false);
		}

		empatejuego(b1, b2, b3, b4, b5, b6, b7, b8, b9, empate);
		linea1(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea2(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea4(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea6(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx2(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
	}

	// metodo que se ejecuta cada vez que interactuan con el control 4 de la matriz
	public void b4ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate) {
		preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		if (control == 1) {
			b4.setText("X");
			matriz[1][0] = 84;
			control = 2;
			b4.setEnabled(false);
		} else {
			b4.setText("O");
			matriz[1][0] = 240;
			control = 1;
			b4.setEnabled(false);
		}

		empatejuego(b1, b2, b3, b4, b5, b6, b7, b8, b9, empate);
		linea2(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea4(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea6(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
	}

	// metodo que se ejecuta cada vez que interactuan con el control 5 de la matriz
	public void b5ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate

	) {
		preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		if (control == 1) {
			b5.setText("X");
			matriz[1][1] = 84;
			control = 2;
			b5.setEnabled(false);
		} else {
			b5.setText("O");
			matriz[1][1] = 240;
			control = 1;
			b5.setEnabled(false);
		}

		empatejuego(b1, b2, b3, b4, b5, b6, b7, b8, b9, empate);
		linea2(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea5(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx2(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
	}

	// metodo que se ejecuta cada vez que interactuan con el control 6 de la matriz
	public void b6ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate) {
		preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
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

		empatejuego(b1, b2, b3, b4, b5, b6, b7, b8, b9, empate);
		linea2(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea4(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea6(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
	}

	// metodo que se ejecuta cada vez que interactuan con el control 7 de la matriz
	public void b7ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate

	) {
		preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
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

		empatejuego(b1, b2, b3, b4, b5, b6, b7, b8, b9, empate);
		linea3(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea4(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx2(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
	}

	// metodo que se ejecuta cada vez que interactuan con el control 8 de la matriz
	public void b8ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate) {
		preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
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

		empatejuego(b1, b2, b3, b4, b5, b6, b7, b8, b9, empate);
		linea3(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea5(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
	}

	// metodo que se ejecuta cada vez que interactuan con el control 9 de la matriz
	public void b9ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate) {
		preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
		if (control == 1) {
			b9.setText("X");
			matriz[2][2] = 84;
			control = 2;
			b9.setEnabled(false);
		} else {
			b9.setText("O");
			matriz[2][2] = 240;
			control = 1;
			b9.setEnabled(false);
		}

		empatejuego(b1, b2, b3, b4, b5, b6, b7, b8, b9, empate);
		linea3(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea4(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		linea6(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
		lineaformx(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao);
	}

	// metodo que se ejecuta cada vez que interactuan con el control volver a jugar
	public void jButton1ActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton b1, javax.swing.JButton b2,
			javax.swing.JButton b3, javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6,
			javax.swing.JButton b7, javax.swing.JButton b8, javax.swing.JButton b9, javax.swing.JTextField puntax1,
			javax.swing.JTextField puntao, javax.swing.JTextField empate) {
		borracompleto(b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
		multijugador = JOptionPane.showConfirmDialog(null, "Quieres salir del programa");
		if (multijugador == 0) {
			System.exit(0);

		}
		if (multijugador == 1) {
			JOptionPane.showMessageDialog(null, "Se reiniciara el juego");
		}

	}

	public void preguntas(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3,
			javax.swing.JButton b4, javax.swing.JButton b5, javax.swing.JButton b6, javax.swing.JButton b7,
			javax.swing.JButton b8, javax.swing.JButton b9) {
		int randomNum = 0;
		int respuesta;
		int seleccion;
		boolean encontro = false;
		System.out.println("el ramdom");
		do {
			randomNum = 1 + (int) (Math.random() * 20);
			System.out.println("el ramdom es " + randomNum);

			switch (randomNum) {
			case 1: {
				seleccion = JOptionPane.showOptionDialog(b1,
						"El número cinco mil cuatrocientos treinta y uno, se escribe", "Selector de opciones",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. 4421", "B. 4531", "C. 5421", "D. 5431" }, "opcion 1");
				if (seleccion == 3) {

				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 2: {
				seleccion = JOptionPane.showOptionDialog(b2, "El resultado de 270+145 es", "Selector de opciones",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. 310", "B. 315", "C. 410", "D. 415" }, "opcion 1");
				if (seleccion == 3) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 3: {
				seleccion = JOptionPane.showOptionDialog(b2,
						"Para obtener la misma cantidad de dinero, un billete de $ 2.000 lo puedo cambiar por",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. 3 monedas de $ 200, 2 monedas de $ 500 y 7 monedas de $100",
								"B. 5 monedas de $200, 4 monedas de $ 500 y 6 monedas de $ 100",
								"C. 2 monedas de $ 500, 2 monedas de $ 200 y 6 monedas de $ 100",
								"D. 3 monedas de $ 500, 3 monedas de $ 200 y 4 monedas de $ 100" },
						"opcion 1");
				if (seleccion == 2) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 4: {
				seleccion = JOptionPane.showOptionDialog(
						b4, "120 minutos y 120segundos, equivalen a", "Selector de opciones",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {
								"A. 240 segundos", "B. 4 horas", "C. 1 hora y 3 minutos", "D. 2 horas y 2 minutos" },
						"opcion 1");
				if (seleccion == 3) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 5: {
				seleccion = JOptionPane.showOptionDialog(b5,
						"El poeta colombiano Rafael Pombo escritor de la pobre viejecita, nació en el año 1833 y murió en 1912. ¿De cuantos años murió el poeta?",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. 79", "B. 69", "C. 59", "D. 49" }, "opcion 1");
				if (seleccion == 0) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 6: {
				seleccion = JOptionPane.showOptionDialog(b6, "El resultado de (20 + 15) + 30 es",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. 30", "B. 35", "C. 50", "D. 65" }, "opcion 1");
				if (seleccion == 3) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 7: {
				seleccion = JOptionPane.showOptionDialog(b6, "El resultado de (45 + 8) x 3 es", "Selector de opciones",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. 169", "B. 159", "C. 149", "D. 139" }, "opcion 1");
				if (seleccion == 2) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 8: {
				seleccion = JOptionPane.showOptionDialog(b6, "El número mil cuatrocientos veintiséis, se escribe",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. 1406", "B. 1416", "C. 1426", "D. 1436" }, "opcion 1");
				if (seleccion == 2) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 9: {
				seleccion = JOptionPane.showOptionDialog(b9, "El resultado de 25 + (99+ 29) es", "Selector de opciones",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. 143", "B. 135", "C. 163", "D. 153" }, "opcion 1");
				if (seleccion == 3) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 10: {
				seleccion = JOptionPane.showOptionDialog(b9, "El número siete mil veintitrés se escribe",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. 7023", "B. 723", "C. 7230", "D. 7203" }, "opcion 1");
				if (seleccion == 0) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 11: {
				seleccion = JOptionPane.showOptionDialog(b9, "La Capital del Departamento de Amazonas es:",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. Leticia", "B. Arauca", "C. Neiva", "D. Bogotá" }, "opcion 1");
				if (seleccion == 0) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 12: {
				seleccion = JOptionPane.showOptionDialog(b9, "La Capital del Departamento de Antioquia es:",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. Pereira", "B. Neiva", "C. Cúcuta", "D. Medellín" }, "opcion 1");
				if (seleccion == 3) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 13: {
				seleccion = JOptionPane.showOptionDialog(b9, "La Capital del Departamento de Boyacá es:",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. Florencia", "B. Manizales", "C. Tunja", "D. Medellín " }, "opcion 1");
				if (seleccion == 2) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 14: {
				seleccion = JOptionPane.showOptionDialog(b9, "La Capital del Departamento de Caldas es:",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. Florencia", "B. Manizales", "C. Tunja", "D. Montería " }, "opcion 1");
				if (seleccion == 1) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 15: {
				seleccion = JOptionPane.showOptionDialog(b9, "La Capital del Departamento de Cundinamarca es:",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. Yopal", "B. Bogotá", "C. Inírida", "D. Cúcuta" }, "opcion 1");
				if (seleccion == 1) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 16: {
				seleccion = JOptionPane.showOptionDialog(b9, "La Capital del Departamento de Cesar es:",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. Cartagena", "B. Bogotá", "C. Tunja", "D. Valledupar" }, "opcion 1");
				if (seleccion == 3) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 17: {
				seleccion = JOptionPane.showOptionDialog(b9, "La Capital del Departamento de Meta es:",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. Villavicencio", "B. Bogotá", "C. Inírida", "D. Riohacha" }, "opcion 1");
				if (seleccion == 0) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 18: {
				seleccion = JOptionPane.showOptionDialog(b9, "La Capital del Departamento de Nariño es:",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. Yopal", "B. Pasto", "C. Inírida", "D. Montería " }, "opcion 1");
				if (seleccion == 1) {
					encontro = true;
				} else {
					JOptionPane.showConfirmDialog(null, "Respuesta incorrecta");
				}
			}
				break;
			case 19: {
				seleccion = JOptionPane.showOptionDialog(b9,
						"La Capital del Departamento de San Andrés y Providencia es:", "Selector de opciones",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. San Andrés", "B. Montería", "C. Florencia", "D. Tunja  " }, "opcion 1");
				if (seleccion == 0) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			case 20: {
				seleccion = JOptionPane.showOptionDialog(b9, "La Capital del Departamento de Santander es:",
						"Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "A. Medellín", "B. Pereira", "C. Arauca", "D. Bucaramanga " }, "opcion 1");
				if (seleccion == 3) {
					encontro = true;
				} else {
					respuesta = JOptionPane.showConfirmDialog(null, "Respuesta incorrecta, desea continuar");
					// si la respuesta es si
					if (respuesta == 0) {
						encontro = true;
						preguntas(b1, b2, b3, b4, b5, b6, b7, b8, b9);
					}
					if (respuesta == 1) {
						System.exit(0);
					}
				}
			}
				break;
			}
		} while (encontro == false);

	}

}
