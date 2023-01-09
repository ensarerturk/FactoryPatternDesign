package Factory.FactoryMethod;

import Factory.FireArm.Pistol;
import Factory.FireArm.SmoothboreRifles;
import Factory.Interface.Gun;

public class GunFactory {
    public Gun getGun(String firearm, String bullet, String price){
        if (firearm.equalsIgnoreCase("Pistol")){
            return new Pistol(firearm,bullet,price);
        } else if (firearm.equalsIgnoreCase("SmoothboreRifles")) {
            return new SmoothboreRifles(firearm, bullet, price);
        }else return null;
    }
}
