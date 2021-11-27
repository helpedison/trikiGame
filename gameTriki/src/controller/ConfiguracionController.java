package controller;

import model.Jugador;

@SuppressWarnings("serial")
public class ConfiguracionController extends javax.swing.JFrame {

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

	public ConfiguracionController(JuegoController juegoTricki) {
		configurarFrame(juegoTricki);
	}

	public void configurarFrame(JuegoController juegoTricki) {

		// controles
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

		// eventos de los controles (cuadros del triqui)
		b1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.b1ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});

		// eventos de los controles (cuadros del triqui)
		b2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.b2ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});

		// eventos de los controles (cuadros del triqui)
		b3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.b3ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});

		// eventos de los controles (cuadros del triqui)
		b4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.b4ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});

		// eventos de los controles (cuadros del triqui)
		b5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.b5ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});

		// eventos de los controles (cuadros del triqui)
		b6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.b6ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});

		// eventos de los controles (cuadros del triqui)
		b7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.b7ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});
		// eventos de los controles (cuadros del triqui)
		b8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.b8ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});

		// eventos de los controles (cuadros del triqui)
		b9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.b9ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});

		// control juGador X
		jLabel1.setText("JUGADOR X: " + juegoTricki.getJugadorO().getNombre());
		// control juGador O
		jLabel2.setText("JUGADOR O: " + juegoTricki.getJugadorO().getNombre());

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
		// eventos del control volver a jugar
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				juegoTricki.jButton1ActionPerformed(evt, b1, b2, b3, b4, b5, b6, b7, b8, b9, puntax1, puntao, empate);
			}
		});

		// ajustar el frame
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
								.createSequentialGroup().addGroup(layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.TRAILING).addGroup(
												layout.createSequentialGroup()
														.addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(34, 34, 34)
														.addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(31, 31, 31).addComponent(b6,
																javax.swing.GroupLayout.PREFERRED_SIZE, 63,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(34, 34, 34)
												.addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(31, 31, 31).addComponent(b3,
														javax.swing.GroupLayout.PREFERRED_SIZE, 63,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(105, 105, 105).addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(puntax1)).addGap(46, 46, 46)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(puntao)))
										.addGroup(layout.createSequentialGroup().addGap(167, 167, 167).addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(empate))))
								.addContainerGap(116, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(34, 34, 34)
										.addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(31, 31, 31)
										.addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jButton1).addGap(23, 23, 23))))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(238, 238, 238).addComponent(jLabel3).addGap(172, 172, 172)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jButton1)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(52, 52, 52).addComponent(jLabel3)
										.addGap(26, 26, 26))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addContainerGap()
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18)))
								.addGroup(
										layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																b2, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(30, 30, 30)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(b6,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		b4, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		b5, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1).addComponent(jLabel2))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(puntao,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(puntax1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(28, 28, 28).addComponent(jLabel5)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(empate, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(28, 28, 28)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(87, Short.MAX_VALUE)));

		pack();

	}

}
