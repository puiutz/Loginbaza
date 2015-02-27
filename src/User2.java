/**
 * Created by puiutz on 27.02.2015.
 */


public class User2 {
    private String name;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void told() {
        System.out.println("Numele tau este  " + getName());
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void told2() {
        System.out.println("Parola ta este  " + getPassword());
    }
}
