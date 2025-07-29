package Parejas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Controlador {
	private Modelo modelo;
	private static Vista vista;
	public String usuario;

	private ActionListener actionListener_NuevaPartida, actionListener_ficha0, actionListener_ficha1,
			actionListener_ficha2, actionListener_ficha3, actionListener_ficha4, actionListener_ficha5,
			actionListener_ficha6, actionListener_ficha7, actionListener_ficha8, actionListener_ficha9,
			actionListener_ficha10, actionListener_ficha11, actionListener_rdbtnNaturaleza, actionListener_rdbtnPlaya,
			actionListener_rdbtnMosaico, actionListener_rdbtnColores, actionListener_rdbtnVerde,
			actionListener_rdbtnNaranja, actionListener_rdbtnAzul;

	public Controlador(Modelo modelo, Vista vista) {
		// TODO Auto-generated constructor stub
		this.modelo = modelo;
		this.vista = vista;
		Control();
	}

	public void Control() {

		// boton nueva partida
		actionListener_NuevaPartida = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.iniciarPartida();
				Controlador.debloquearFichas();
				Controlador.resetearFichas();
			}
		};
		vista.getBtnNuevaPartida().addActionListener(actionListener_NuevaPartida);

		// Ficha0
		actionListener_ficha0 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(0), 0);
				vista.setFicha(Modelo.seleccionarFicha(0), vista.getficha0());
			}
		};
		vista.getficha0().addActionListener(actionListener_ficha0);

		// Ficha1
		actionListener_ficha1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(1), 1);
				vista.setFicha(Modelo.seleccionarFicha(1), vista.getficha1());
			}
		};
		vista.getficha1().addActionListener(actionListener_ficha1);

		// Ficha2
		actionListener_ficha2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(2), 2);
				vista.setFicha(Modelo.seleccionarFicha(2), vista.getficha2());
			}
		};
		vista.getficha2().addActionListener(actionListener_ficha2);

		// Ficha3
		actionListener_ficha3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(3), 3);
				vista.setFicha(Modelo.seleccionarFicha(3), vista.getficha3());
			}
		};
		vista.getficha3().addActionListener(actionListener_ficha3);

		// Ficha4
		actionListener_ficha4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(4), 4);
				vista.setFicha(Modelo.seleccionarFicha(4), vista.getficha4());
			}
		};
		vista.getficha4().addActionListener(actionListener_ficha4);

		// Ficha5
		actionListener_ficha5 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(5), 5);
				vista.setFicha(Modelo.seleccionarFicha(5), vista.getficha5());
			}
		};
		vista.getficha5().addActionListener(actionListener_ficha5);

		// Ficha6
		actionListener_ficha6 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(6), 6);
				vista.setFicha(Modelo.seleccionarFicha(6), vista.getficha6());
			}
		};
		vista.getficha6().addActionListener(actionListener_ficha6);

		// Ficha7
		actionListener_ficha7 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(7), 7);
				vista.setFicha(Modelo.seleccionarFicha(7), vista.getficha7());
			}
		};
		vista.getficha7().addActionListener(actionListener_ficha7);

		// Ficha8
		actionListener_ficha8 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(8), 8);
				vista.setFicha(Modelo.seleccionarFicha(8), vista.getficha8());
			}
		};
		vista.getficha8().addActionListener(actionListener_ficha8);

		// Ficha9
		actionListener_ficha9 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(9), 9);
				vista.setFicha(Modelo.seleccionarFicha(9), vista.getficha9());
			}
		};
		vista.getficha9().addActionListener(actionListener_ficha9);

		// Ficha10
		actionListener_ficha10 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(10), 10);
				vista.setFicha(Modelo.seleccionarFicha(10), vista.getficha10());
			}
		};
		vista.getficha10().addActionListener(actionListener_ficha10);

		// Ficha11
		actionListener_ficha11 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.pasarPaso(Modelo.imagenes.get(11), 11);
				vista.setFicha(Modelo.seleccionarFicha(11), vista.getficha11());
			}
		};
		vista.getficha11().addActionListener(actionListener_ficha11);

		// RadioButton Naturaleza
		actionListener_rdbtnNaturaleza = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.fondoFicha = "naturaleza";
				resetearFichas();
			}
		};
		vista.getRdbtnNaturaleza().addActionListener(actionListener_rdbtnNaturaleza);

		// RadioButton Playa
		actionListener_rdbtnPlaya = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.fondoFicha = "playa";
				resetearFichas();
			}
		};
		vista.getRdbtnPlaya().addActionListener(actionListener_rdbtnPlaya);

		// RadioButton Mosaico
		actionListener_rdbtnMosaico = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.fondoFicha = "mosaico";
				resetearFichas();
			}
		};
		vista.getRdbtnMosaico().addActionListener(actionListener_rdbtnMosaico);

		// RadioButton Colores
		actionListener_rdbtnColores = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Modelo.fondoFicha = "colores";
				resetearFichas();
			}
		};
		vista.getRdbtnColores().addActionListener(actionListener_rdbtnColores);

		// RadioButton Verde
		actionListener_rdbtnVerde = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					vista.getFrame().getContentPane().setBackground(Modelo.cambiarFondo("verde"));
					vista.getRdbtnMosaico().setBackground(Modelo.cambiarFondo("verde"));
					vista.getRdbtnColores().setBackground(Modelo.cambiarFondo("verde"));
					vista.getRdbtnNaturaleza().setBackground(Modelo.cambiarFondo("verde"));
					vista.getRdbtnPlaya().setBackground(Modelo.cambiarFondo("verde"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		vista.getRdbtnVerde().addActionListener(actionListener_rdbtnVerde);

		// RadioButton Naranja
		actionListener_rdbtnNaranja = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					vista.getFrame().getContentPane().setBackground(Modelo.cambiarFondo("naranja"));
					vista.getRdbtnMosaico().setBackground(Modelo.cambiarFondo("naranja"));
					vista.getRdbtnColores().setBackground(Modelo.cambiarFondo("naranja"));
					vista.getRdbtnNaturaleza().setBackground(Modelo.cambiarFondo("naranja"));
					vista.getRdbtnPlaya().setBackground(Modelo.cambiarFondo("naranja"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		vista.getRdbtnNaranja().addActionListener(actionListener_rdbtnNaranja);

		// RadioButton Azul
		actionListener_rdbtnAzul = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					vista.getFrame().getContentPane().setBackground(Modelo.cambiarFondo("azul"));
					vista.getRdbtnMosaico().setBackground(Modelo.cambiarFondo("azul"));
					vista.getRdbtnColores().setBackground(Modelo.cambiarFondo("azul"));
					vista.getRdbtnNaturaleza().setBackground(Modelo.cambiarFondo("azul"));
					vista.getRdbtnPlaya().setBackground(Modelo.cambiarFondo("azul"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		vista.getRdbtnAzul().addActionListener(actionListener_rdbtnAzul);

	}

	public static void resetearFichas() {
		try {
			if (vista.getficha0().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha0());
			}
			if (vista.getficha1().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha1());
			}
			if (vista.getficha2().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha2());
			}
			if (vista.getficha3().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha3());
			}
			if (vista.getficha4().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha4());
			}
			if (vista.getficha5().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha5());
			}
			if (vista.getficha6().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha6());
			}
			if (vista.getficha7().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha7());
			}
			if (vista.getficha8().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha8());
			}
			if (vista.getficha9().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha9());
			}
			if (vista.getficha10().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha10());
			}
			if (vista.getficha11().isEnabled() == true) {
				vista.setFicha(Modelo.girarFicha(), vista.getficha11());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void bloquearFichas() {
		try {
			for (int i = 0; i < Modelo.parejasEncontradas.size(); i++) {
				switch (Modelo.parejasEncontradas.get(i)) {
				case 0:
					vista.getficha0().setEnabled(false);
					break;
				case 1:
					vista.getficha1().setEnabled(false);
					break;
				case 2:
					vista.getficha2().setEnabled(false);
					break;
				case 3:
					vista.getficha3().setEnabled(false);
					break;
				case 4:
					vista.getficha4().setEnabled(false);
					break;
				case 5:
					vista.getficha5().setEnabled(false);
					break;
				case 6:
					vista.getficha6().setEnabled(false);
					break;
				case 7:
					vista.getficha7().setEnabled(false);
					break;
				case 8:
					vista.getficha8().setEnabled(false);
					break;
				case 9:
					vista.getficha9().setEnabled(false);
					break;
				case 10:
					vista.getficha10().setEnabled(false);
					break;
				case 11:
					vista.getficha11().setEnabled(false);
					break;

				default:
					break;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void debloquearFichas() {
		vista.getficha0().setEnabled(true);
		vista.getficha1().setEnabled(true);
		vista.getficha2().setEnabled(true);
		vista.getficha3().setEnabled(true);
		vista.getficha4().setEnabled(true);
		vista.getficha5().setEnabled(true);
		vista.getficha6().setEnabled(true);
		vista.getficha7().setEnabled(true);
		vista.getficha8().setEnabled(true);
		vista.getficha9().setEnabled(true);
		vista.getficha10().setEnabled(true);
		vista.getficha11().setEnabled(true);
	}

}