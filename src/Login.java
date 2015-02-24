/**
 * Created by puiutz on 24.02.2015.
 */


import java.util.Scanner;

public class Login {


    public static void main(String[] args) {
     boolean isCorrect=false;
        String name ="name";
         String password= "password";
do{

        Scanner scan = new Scanner(System.in);
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

    if(object.getName().equals(temp) && object.getPassword().equals(temp2))


        isCorrect= true;
        }while (!isCorrect);
        System.out.println(" run notepad as a process , because when here it means you guessed the user/pwd combination");

        }

    }









