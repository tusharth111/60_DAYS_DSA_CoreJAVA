package org.studyeasy.DAY2;

/***
 Developer Name : Tushar Thakur
 Developer Contact : tusharth111@gmail.com
 Created on:  17 12/17/2025 12:47 PM
 Project Name : 30Days_Java
 ***/
public class SimpleInterest {
    int Principle;//GLOBAL VARIABLE
    int ROI;
    int Time;

    public SimpleInterest(int p ,int r, int t){
        this.Principle  =p;
        this.ROI = r;
        this.Time = t;
    }
    public void SI(){
        System.out.println("Simple Interest :" +(float)(Principle * ROI * Time)/100 );

    }

    public static void main(String[] args) {
        SimpleInterest s1 = new SimpleInterest(10000,5 , 5);
        s1.SI();
    }
}

