/**
 * Created by puiutz on 24.02.2015.
 */
public class Login2 {

    private  String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saying() {
        System.out.println("Numele tau este  " + getName());

    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void saying2() {
        System.out.println("Parola ta este  " + getPassword());

    }
}