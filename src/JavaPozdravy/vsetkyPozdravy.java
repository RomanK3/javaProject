package JavaPozdravy;

import JavaPozdravy.anglicky.Hello;
import JavaPozdravy.nemecky.Hallo;
import JavaPozdravy.slovensky.Ahoj;

public class vsetkyPozdravy {
    public static void main(String[] args) {
        Hello.pozdravujem();
        Hallo.pozdravujem();
        Ahoj.pozdravujem();

        System.out.println();

        Hello helloObj = new Hello();
        Hallo halloObj = new Hallo();
        Ahoj ahojObj = new Ahoj();
        helloObj.pozdravujem();
        halloObj.pozdravujem();
        ahojObj.pozdravujem();
    }
}
