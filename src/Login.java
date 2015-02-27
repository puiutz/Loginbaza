/**
 * Created by puiutz on 24.02.2015.
 */


import java.util.Scanner;
import java.io.*;

public class Login {


    public static void main(String[] args) {
     boolean isCorrect=false;

do{

        Scanner scan = new Scanner(System.in);

    String nume ="utilizator";
    String password= "parola";
        Login2 object = new Login2();
            System.out.println("Introdu primul nume");

            String temp =scan.nextLine();
            object.setName(temp);
            object.saying();
            object.getName();
    System.out.println("Introdu parola:");
            String temp2 =scan.nextLine();
            object.setPassword(temp2);
            object.getPassword();
            object.saying2();

    if(object.getName().equals(nume) && object.getPassword().equals(password))


        isCorrect= true;
        }while (!isCorrect);




                Runtime rs = Runtime.getRuntime();

                try {
                    rs.exec("notepad");
                }
                catch (IOException e) {
                    System.out.println(e);
                }
            }
        }














