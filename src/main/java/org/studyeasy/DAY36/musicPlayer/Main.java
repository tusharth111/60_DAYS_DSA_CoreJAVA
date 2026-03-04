package org.studyeasy.DAY36.musicPlayer;

import javax.sound.sampled.*;
import javax.swing.plaf.synth.SynthTreeUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  23 1/23/2026 8:09 PM
 Project Name : 30Days_Java
 ***/
public class Main {
    public static void main(String[] args) {
        String filepath = "src/lovely_bgm.wav";//this is the file path of the audio file
        File file = new File(filepath);// this is used to handle the worling with file
        try(Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file))// these are created in try block ..because we are telling the java to auto close these when we are done to not waste resources
        {
            Clip clip = AudioSystem.getClip();// this class is used to play the sound
            clip.open(audioStream);// this is used to open the audio file to play it

            String response ="";//user responses
            while(!response.equals("Q"))
            {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter you Choice: ");
                response = sc.next().toUpperCase();
                switch (response){//using the clip obj to perform the operation on the audio
                    case"P" ->clip.start();
                    case"S" ->clip.stop();
                    case"R" ->clip.setMicrosecondPosition(0);
                    case"Q" ->clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }


        }
        catch (FileNotFoundException e){
            System.out.println("Could not loacte the file");
        }
        catch (UnsupportedAudioFileException e)
        {
            System.out.println("Audio file not supportted");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch (IOException e){
            System.out.println("Some thing went wrong");
        }
        finally {
            System.out.println("Bye");

        }
    }
}
