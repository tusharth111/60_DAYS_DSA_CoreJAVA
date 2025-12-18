package org.studyeasy.DAY3;
import java.util.Scanner;
/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  18 12/18/2025 9:10 PM
 Project Name : 30Days_Java
 ***/
public class CaesarCipher {

    public static String encrypt(String text, int Shift){
        StringBuilder result = new StringBuilder();
        for(char c : text.toCharArray()){
            if(Character.isLetter(c)){
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                char shifted = (char) ((c - base + Shift) % 26+ base);
                result.append(shifted);
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text to encrypt: ");
        String inputText = sc.nextLine();

        System.out.print("Enter the shift key (0-25): " );
        int shiftkey = sc.nextInt();

        String encrypted = encrypt(inputText,shiftkey);
        System.out.println("Encrypted text: "+encrypted);


    }
}
