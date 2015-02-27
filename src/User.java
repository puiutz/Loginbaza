/**
 * Created by puiutz on 26.02.2015.
 */
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scaneaza = new Scanner(System.in);
        System.out.println("Introdu primul nume");


        ArrayList List = new ArrayList();
        List userList = new ArrayList();
        String temp3 = scaneaza.nextLine();
        User2 member = new User2();
        System.out.println("Introdu parola:");


        member.setName(temp3);
        member.told();

        member.setPassword(temp3);
        member.told2();

        User2 member2 = new User2();
        member2.setName(temp3);
        member2.told();


        member2.setPassword(temp3);
        member2.told2();

        List.add(userList);


        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec("notepad");
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}

