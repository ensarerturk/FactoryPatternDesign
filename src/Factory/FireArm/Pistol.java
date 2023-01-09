package Factory.FireArm;

import Factory.Interface.Gun;

public class Pistol implements Gun {

    private String firearm;
    private String bullet;
    private String price;

    @Override
    public String getFireArm() {
        return firearm;
    }

    @Override
    public String getBullet() {
        return bullet;
    }

    @Override
    public String getPrice() {
        return price;
    }

    public Pistol(String firearm, String bullet, String price) {
        this.firearm = firearm;
        this.bullet = bullet;
        this.price = price;
    }
}
