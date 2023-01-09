package Factory.Method;

import Factory.FactoryMethod.GunFactory;
import Factory.FireArm.SmoothboreRifles;

import java.util.Scanner;

public class ChoseRifles {
    public void choseRifles(String tur){
        GunFactory gunFactory = new GunFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girilebilecek mermi secenekleri\n1 - 7.62mm\n2 - 36cal");

        System.out.println("Mermi");
        String mermi = scanner.nextLine();

        if (mermi.equalsIgnoreCase("7.62mm")){
            SmoothboreRifles smoothboreRifles = (SmoothboreRifles) gunFactory.getGun(tur,mermi,"$1100");
            System.out.println("Girmis oldugunuz " + smoothboreRifles.getFireArm() +
                        " silah icin " + smoothboreRifles.getBullet() + " mermili onerilecek silah AK-47'dir, fiyati "
                        + smoothboreRifles.getPrice() + " dir." );
        } else if (mermi.equalsIgnoreCase("36cal")){
            SmoothboreRifles smoothboreRifles = (SmoothboreRifles) gunFactory.getGun(tur,mermi,"$600");
            System.out.println("Girmis oldugunuz " + smoothboreRifles.getFireArm() +
                        " silah icin " + smoothboreRifles.getBullet() + " mermili onerilecek silah Pompali Ranger'dir, fiyati "
                        + smoothboreRifles.getPrice() + " dir." );
        } else if (mermi.equalsIgnoreCase("Exit")) {
            System.out.println("Sistemden Cikiliyor");
            System.exit(0);
        } else System.out.println("Boyle bir tüfek bulunmamaktadir.");
    }
}
