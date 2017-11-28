package model;


import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


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
