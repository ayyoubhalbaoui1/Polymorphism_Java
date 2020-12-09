package com.poly;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {
	
	private String gender; 
	private String name; 
	private int number; 
	
	public Animal(String gender, String name, int number) {
		
		this.gender = gender; 
		this.name = name; 
		this.number = number; 
		
	}
		
		public Animal() {
		// TODO Auto-generated constructor stub
	}

		@Override
		public String toString() {
			
			return "Gender ? " + gender + ", Name=" + name + ", Number=" + number + ". ";
		}
		
		public String getGender() {
			
			return gender; 
		}
		
		public void setGender(String gender) {
			
			this.gender = gender;
		}
		
		public String getName() {
			return name; 
		}
		
		public void setName() {
			
			this.name = name;
		}
		
		public int getNumber() {
			return number; 
		}
		
		public void setNumber(int number) {
			
			this.number = number; 
		}
		public void ReadSound(String effectSource) throws UnsupportedAudioFileException, IOException, 
		LineUnavailableException{
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(effectSource));
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		  Scanner scanner = new Scanner(System.in);

		System.out.println(effectSource+" sound is start ! ");
		
		String response = "";

		while(!response.equals("Q")) {
			
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			   System.out.print("Enter your choice: ");
			   
			   response = scanner.next();
			   response = response.toUpperCase();
			   
			   switch(response) {
			    case ("P"): clip.start();
			    break;
			    case ("S"): clip.stop();
			    break;
			    case ("R"): clip.setMicrosecondPosition(0);
			    break;
			    case ("Q"): clip.close();
			    break;
			    default: System.out.println("Not a valid response");
			   }
			   
			  }
			  System.out.println("Byeeee!"); 
			 }
			}
	
	


