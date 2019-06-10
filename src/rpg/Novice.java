package rpg;

public class Novice extends Mage {

    int mpn, hpn, danon, defesan;
    String pet;

    public Novice(String nick, String arma, String pet) {
        super(nick, arma);
        this.pet = pet;
        this.mpn = 150;
        this.hpn = 50;
        this.nick = nick;
        this.arma = arma;
        this.danon = mpn * 2;
        this.defesan = (mpn / 2) + hpn;
    }

    public String getPet() {
        return this.pet;
    }

    public int getMpn() {
        return mpn;
    }

    public void setMpn(int mpn) {
        this.mpn = mpn;
    }

    public int getHpn() {
        return hpn;
    }

    public void setHpn(int hpn) {
        this.hpn = hpn;
    }

    public int getDanon() {
        return danon;
    }

    public void setDanon(int danon) {
        this.danon = danon;
    }

    public int getDefesan() {
        return defesan;
    }

    public void setDefesan(int defesan) {
        this.defesan = defesan;
    }

    @Override
    public String toString() {
        return "Novice{" + "mpn=" + mpn + ", hpn=" + hpn + ", danon=" + danon + ", defesan=" + defesan + ", pet=" + pet + '}';
    }

}
