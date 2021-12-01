package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.loginMethod();
    }

    private void loginMethod(){

        Scanner scannerUserName = new Scanner(System.in);
        Scanner scannerPassword = new Scanner(System.in);
        String userName = scannerUserName.nextLine();
        String password = scannerPassword.nextLine();
        boolean correctPassword = false;

        String[][] loginData = new String[3][4];
        loginData[0][0] = "Denis";
        loginData[0][1] = "Hascik";
        loginData[1][1] = "123";
        loginData[1][2] = "123";
        loginData[2][2] = "321";
        loginData[2][3] = "321";

        for(int i = 0; i< loginData.length; i++){
            if (loginData[i][i].equals(userName) && loginData[i][i + 1].equals(password)) {
                correctPassword = true;
                break;
            }
        }

        if(correctPassword){
            System.out.println("successful!!");
        }
        else{
            System.out.println("failed!!!");
        }
    }
}
