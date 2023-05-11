package loginmaniplation;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        //kullanıcı adı: mdk
        //şifre        : 123
        LoginManiplation login=new LoginManiplation();
        Scanner scan=new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        String user=scan.nextLine() ;
        login.userName=user;
        System.out.print("Şifrenizi giriniz: ");
        String sifre=scan.nextLine() ;
        login.password=sifre;
        login.userLogin(user,sifre);

    }
}
