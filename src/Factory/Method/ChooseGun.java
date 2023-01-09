package Factory.Method;

import java.util.Scanner;

public class ChooseGun {
    public void chooseGun(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Secilebilecek Silahlar:\n1 - Pistol\n2 - SmoothboreRifles\nCikis icin 'Exit' giriniz.");
        System.out.println("Silah turu");
        String tur = scanner.nextLine();

        while (true){
            if (tur.equalsIgnoreCase("Pistol")){
                ChosePistol chosePistol = new ChosePistol();
                chosePistol.chosePistol(tur);
            } else if (tur.equalsIgnoreCase("SmoothboreRifles")) {
                ChoseRifles choseRifles = new ChoseRifles();
                choseRifles.choseRifles(tur);
            } else if (tur.equalsIgnoreCase("Exit")) {
                System.out.println("Sistemden Cikiliyor");
                break;
            } else System.out.println("Boyle bir silah bulunmamaktadir.");
        }

    }
}
