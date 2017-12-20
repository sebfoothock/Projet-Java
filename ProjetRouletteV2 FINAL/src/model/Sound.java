package model;


import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * This class return the sound of the wheel when the player spin the wheel.
 * It is import with an extern API found on the web.
 * @author MASSON JULIEN 2TL2
 * GROUPE 17
 *
 */
public class Sound {
	public static void sound() {
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\JULIEN\\eclipse-workspace\\ProjetRoulette\\sound\\SFB-roulette-1.mp3");
			Player player = new Player(fileInputStream);
			player.play();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (JavaLayerException e) {
				e.printStackTrace();
			}
	}
}
