package view;

import javax.swing.JOptionPane;

import controller.ConfiguracionController;
import controller.JuegoController;
import model.Jugador;

public class JuegoView {
	
	
	public static void main(String[] args) {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            		
            	JuegoController   jugarTricki=     new JuegoController();
            	
            	jugarTricki.setJugadorO(new Jugador());
            	jugarTricki.setJugadorX(new Jugador()); 
            	jugarTricki.getJugadorO().setNombre(JOptionPane.showInputDialog ( "Nombre del jugador O" ));
            	jugarTricki.getJugadorX().setNombre(JOptionPane.showInputDialog ( "Nombre del jugador X" ));
            	ConfiguracionController configuracionTablero = new ConfiguracionController(jugarTricki);
            	configuracionTablero.setVisible(true);	
            		
            			
            
            }
        });
		
		
	}

}
