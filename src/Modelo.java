package Parejas;

import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Modelo {
	Modelo() throws IOException {
		iniciarPartida();
	}

	private static String imagen1 = "mono.jpg";
	private static String imagen2 = "ajolote.jpg";
	private static String imagen3 = "gato.jpg";
	private static String imagen4 = "perro2.jpg";
	private static String imagen5 = "caballo.jpg";
	private static String imagen6 = "pato.jpg";

	public static List<String> imagenes = new ArrayList<>(Arrays.asList(imagen1, imagen2, imagen3, imagen4, imagen5,
			imagen6, imagen1, imagen2, imagen3, imagen4, imagen5, imagen6));

	private static boolean fichaSeleccionada = false;
	private static String seleccionada = "";
	private static String comparada = "";
	private static int parejas = 0;

	public static List<Integer> parejasEncontradas = new ArrayList<>();

	public static String fondoFicha = "naturaleza";
	private static Color fondo = new Color(46, 139, 87);

	public static void iniciarPartida() {
		Collections.shuffle(imagenes);
		fichaSeleccionada = false;
		parejasEncontradas.clear();
		parejas = 0;
		System.out.println(imagenes);
	}

	public static void pasarPaso(String ficha, int posicion) {
		if (!fichaSeleccionada) {
			Controlador.resetearFichas();
			seleccionada = ficha;
			fichaSeleccionada = true;
			parejasEncontradas.add(posicion);
		} else {
			comparada = ficha;
			if (seleccionada.equals(comparada) && parejasEncontradas.get(parejasEncontradas.size() - 1) != posicion) {
				parejas++;
				parejasEncontradas.add(posicion);
				Controlador.bloquearFichas();
				if (parejas == 6) {
					JOptionPane.showMessageDialog(null, "Has encontrado todas las parejas", "Victoria",
							JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				parejasEncontradas.remove(parejasEncontradas.size() - 1);

			}
			fichaSeleccionada = false;
		}
		System.out.println(parejasEncontradas);
	}

	public static ImageIcon seleccionarFicha(int num) {
		try {
			File fichero = new File("./src/Parejas/Imagenes/" + Modelo.imagenes.get(num));
			Image imagen = ImageIO.read(fichero);
			Image imagenEscalada = imagen.getScaledInstance(214, 362, Image.SCALE_SMOOTH);
			ImageIcon imagenIcon = new ImageIcon(imagenEscalada);
			return imagenIcon;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}

	public static ImageIcon girarFicha() {
		try {
			File fichero = null;
			if (fondoFicha == "naturaleza") {
				fichero = new File("./src/Parejas/Imagenes/patronaturaleza.jpg");
			}
			if (fondoFicha == "playa") {
				fichero = new File("./src/Parejas/Imagenes/patronverano.jpg");
			}
			if (fondoFicha == "mosaico") {
				fichero = new File("./src/Parejas/Imagenes/patronmosaico.jpg");
			}
			if (fondoFicha == "colores") {
				fichero = new File("./src/Parejas/Imagenes/patroncolores.jpg");
			}
			Image imagen = ImageIO.read(fichero);
			Image imagenEscalada = imagen.getScaledInstance(214, 362, Image.SCALE_SMOOTH);
			ImageIcon imagenIcon = new ImageIcon(imagenEscalada);
			return imagenIcon;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}

	public static Color cambiarFondo(String color) throws IOException {
		if (color == "verde") {
			fondo = new Color(46, 139, 87);
		}
		if (color == "naranja") {
			fondo = new Color(255, 204, 102);
		}
		if (color == "azul") {
			fondo = new Color(100, 149, 237);
		}
		return fondo;
	}
}
