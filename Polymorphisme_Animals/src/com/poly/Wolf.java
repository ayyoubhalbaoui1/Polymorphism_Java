package com.poly;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Wolf extends Savage {
	
	private String color;
	private String place;
	private String sound;
	
	public Wolf() {
		super();
		
	}
	public Wolf(String gender, String name, int number, String color , String place, String sound, String owner) {
		super(gender, name, number, owner);
		
		this.color = color;
		this.place = place;
		this.sound = sound;
		
	}
	
	@Override
	public String toString() {
		return "Wolf : Color=" + color + ", Place " + place + " , Owner=  " + owner + ", "
				+ super.toString();
	}
	public String getSound() {
		return sound;
	}
	public void setsond(String sound) {
		this.sound = sound;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
	public void ReadSound(String sonTigre) throws UnsupportedAudioFileException, IOException, 
	LineUnavailableException{
		for(int i = 0;i<3;i++) {
			super.ReadSound(sonTigre);
		}
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
