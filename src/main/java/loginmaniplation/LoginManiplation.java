package loginmaniplation;

public class LoginManiplation {
    String userName, password;

    public void userLogin(String userName, String password) {
        userName = this.userName;
        password = this.password;
        if (userName.equals("mdk") && password.equals("123")) {

            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Hatalı Giriş");


        }


    }

}