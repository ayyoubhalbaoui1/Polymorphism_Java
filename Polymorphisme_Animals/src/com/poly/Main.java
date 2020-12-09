package com.poly;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		
		
		Wolf wolf = new Wolf("Male","Wolfie",1,"White","Cage1","wolf10.wav", "Ayyoub");
		System.out.println(wolf.toString());
		System.out.println("Wolf sound : ");
		
		wolf.ReadSound(wolf.getSound());
		
		
		
		

	}

}
