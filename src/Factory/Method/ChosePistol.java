package Factory.Method;

import Factory.FactoryMethod.GunFactory;
import Factory.FireArm.Pistol;

import java.util.Scanner;

public class ChosePistol {
    public void chosePistol(String tur) {
        GunFactory gunFactory = new GunFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girilebilecek mermi secenekleri\n1 - 7.65mm\n2 - 9mm");
        System.out.println("Mermi");
        String mermi = scanner.nextLine();


        System.out.println("Girilebilecek mermi secenekleri\n1 - 7.65mm\n2 - 9mm");
        if (mermi.equalsIgnoreCase("9mm")) {
            Pistol pistol = (Pistol) gunFactory.getGun(tur, mermi, "$448");
            System.out.println("Girmis oldugunuz " + pistol.getFireArm() +
                        " silah icin " + pistol.getBullet() + " mermili onerilecek silah Glock'dur, fiyati "
                        + pistol.getPrice() + " dir.");
        } else if (mermi.equalsIgnoreCase("7.65mm")) {
            Pistol pistol = (Pistol) gunFactory.getGun(tur, mermi, "$328");
            System.out.println("Girmis oldugunuz " + pistol.getFireArm() +
                        " silah icin " + pistol.getBullet() + " mermili onerilecek silah Kirikkale'dir, fiyati "
                        + pistol.getPrice() + " dir.");
        }else if (mermi.equalsIgnoreCase("Exit")) {
            System.out.println("Sistemden Cikiliyor");
            System.exit(0);
        }else System.out.println("Elimizde boyle bir pistol bulunmamaktadir.");
    }
}
