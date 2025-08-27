package Parejas;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;

public class Vista {

	private JFrame frame;
	private JButton ficha0;
	private JButton ficha1;
	private JButton ficha2;
	private JButton ficha3;
	private JButton ficha4;
	private JButton ficha5;
	private JButton ficha6;
	private JButton ficha7;
	private JButton ficha8;
	private JButton ficha9;
	private JButton ficha10;
	private JButton ficha11;
	private JButton btnNuevaPartida;
	private JRadioButton rdbtnNaturaleza;
	private JRadioButton rdbtnPlaya;
	private JRadioButton rdbtnColores;
	private JRadioButton rdbtnMosaico;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnVerde;
	private JRadioButton rdbtnNaranja;
	private JRadioButton rdbtnAzul;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	public Vista() throws IOException {
		// Reverso de las cartas
		File fichero = new File("./src/Parejas/Imagenes/patronaturaleza.jpg");
		Image imagen = ImageIO.read(fichero);

		Image imagenEscalada = imagen.getScaledInstance(214, 362, Image.SCALE_SMOOTH);

		ImageIcon fondo = new ImageIcon(imagenEscalada);

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(46, 139, 87));
		frame.setBounds(100, 100, 1125, 1018);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ficha0 = new JButton(fondo);
		ficha0.setBounds(49, 36, 216, 212);
		frame.getContentPane().add(ficha0);

		ficha1 = new JButton(fondo);
		ficha1.setBounds(315, 36, 216, 212);
		frame.getContentPane().add(ficha1);

		ficha2 = new JButton(fondo);
		ficha2.setBounds(575, 36, 216, 212);
		frame.getContentPane().add(ficha2);

		ficha3 = new JButton(fondo);
		ficha3.setBounds(845, 36, 216, 212);
		frame.getContentPane().add(ficha3);

		ficha4 = new JButton(fondo);
		ficha4.setBounds(49, 293, 216, 212);
		frame.getContentPane().add(ficha4);

		ficha5 = new JButton(fondo);
		ficha5.setBounds(315, 293, 216, 212);
		frame.getContentPane().add(ficha5);

		ficha6 = new JButton(fondo);
		ficha6.setBounds(575, 293, 216, 212);
		frame.getContentPane().add(ficha6);

		ficha7 = new JButton(fondo);
		ficha7.setBounds(845, 293, 216, 212);
		frame.getContentPane().add(ficha7);

		ficha8 = new JButton(fondo);
		ficha8.setBounds(49, 545, 216, 212);
		frame.getContentPane().add(ficha8);

		ficha9 = new JButton(fondo);
		ficha9.setBounds(315, 545, 216, 212);
		frame.getContentPane().add(ficha9);

		ficha10 = new JButton(fondo);
		ficha10.setBounds(575, 545, 216, 212);
		frame.getContentPane().add(ficha10);

		ficha11 = new JButton(fondo);
		ficha11.setBounds(845, 545, 216, 212);
		frame.getContentPane().add(ficha11);

		btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.setBounds(429, 891, 120, 23);
		frame.getContentPane().add(btnNuevaPartida);

		rdbtnNaturaleza = new JRadioButton("Naturaleza");
		rdbtnNaturaleza.setBackground(new Color(46, 139, 87));
		rdbtnNaturaleza.setSelected(true);
		buttonGroup.add(rdbtnNaturaleza);
		rdbtnNaturaleza.setBounds(49, 856, 109, 23);
		frame.getContentPane().add(rdbtnNaturaleza);

		rdbtnPlaya = new JRadioButton("Playa");
		rdbtnPlaya.setBackground(new Color(46, 139, 87));
		buttonGroup.add(rdbtnPlaya);
		rdbtnPlaya.setBounds(49, 882, 109, 23);
		frame.getContentPane().add(rdbtnPlaya);

		rdbtnColores = new JRadioButton("Colores");
		rdbtnColores.setBackground(new Color(46, 139, 87));
		buttonGroup.add(rdbtnColores);
		rdbtnColores.setBounds(49, 909, 109, 23);
		frame.getContentPane().add(rdbtnColores);

		rdbtnMosaico = new JRadioButton("Mosaico");
		rdbtnMosaico.setBackground(new Color(46, 139, 87));
		buttonGroup.add(rdbtnMosaico);
		rdbtnMosaico.setBounds(49, 935, 109, 23);
		frame.getContentPane().add(rdbtnMosaico);

		JLabel lblNewLabel = new JLabel("Reverso de las fichas");
		lblNewLabel.setBounds(49, 835, 132, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Color de fondo");
		lblNewLabel_1.setBounds(745, 835, 109, 14);
		frame.getContentPane().add(lblNewLabel_1);

		rdbtnVerde = new JRadioButton("Verde");
		rdbtnVerde.setSelected(true);
		buttonGroup_1.add(rdbtnVerde);
		rdbtnVerde.setBackground(new Color(46, 139, 87));
		rdbtnVerde.setBounds(654, 882, 109, 23);
		frame.getContentPane().add(rdbtnVerde);

		rdbtnNaranja = new JRadioButton("Naranja");
		buttonGroup_1.add(rdbtnNaranja);
		rdbtnNaranja.setBackground(new Color(255, 204, 102));
		rdbtnNaranja.setBounds(765, 882, 109, 23);
		frame.getContentPane().add(rdbtnNaranja);

		rdbtnAzul = new JRadioButton("Azul");
		buttonGroup_1.add(rdbtnAzul);
		rdbtnAzul.setBackground(new Color(100, 149, 237));
		rdbtnAzul.setBounds(876, 882, 109, 23);
		frame.getContentPane().add(rdbtnAzul);

		frame.setVisible(true);
	}

	public void setFicha(ImageIcon carta, JButton ficha) {
		ficha.setIcon(carta);
		ficha.revalidate();
		ficha.repaint();
	}

	public JButton getBtnNuevaPartida() {
		return btnNuevaPartida;
	}

	public JButton getficha0() {
		return ficha0;
	}

	public JButton getficha1() {
		return ficha1;
	}

	public JButton getficha2() {
		return ficha2;
	}

	public JButton getficha3() {
		return ficha3;
	}

	public JButton getficha4() {
		return ficha4;
	}

	public JButton getficha5() {
		return ficha5;
	}

	public JButton getficha6() {
		return ficha6;
	}

	public JButton getficha7() {
		return ficha7;
	}

	public JButton getficha8() {
		return ficha8;
	}

	public JButton getficha9() {
		return ficha9;
	}

	public JButton getficha10() {
		return ficha10;
	}

	public JButton getficha11() {
		return ficha11;
	}

	public JRadioButton getRdbtnNaturaleza() {
		return rdbtnNaturaleza;
	}

	public JRadioButton getRdbtnPlaya() {
		return rdbtnPlaya;
	}

	public JRadioButton getRdbtnColores() {
		return rdbtnColores;
	}

	public JRadioButton getRdbtnMosaico() {
		return rdbtnMosaico;
	}

	public JRadioButton getRdbtnVerde() {
		return rdbtnVerde;
	}

	public JRadioButton getRdbtnNaranja() {
		return rdbtnNaranja;
	}

	public JRadioButton getRdbtnAzul() {
		return rdbtnAzul;
	}

	public JFrame getFrame() {
		return frame;
	}
}
