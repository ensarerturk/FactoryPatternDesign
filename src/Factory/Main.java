package Factory;

import Factory.FactoryMethod.GunFactory;
import Factory.FireArm.Pistol;
import Factory.Method.ChooseGun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Silah Secim Sayfasina Hosgeldiniz.");
        System.out.println("------------------------------------");

        ChooseGun chooseGun = new ChooseGun();
        chooseGun.chooseGun();

    }
}
