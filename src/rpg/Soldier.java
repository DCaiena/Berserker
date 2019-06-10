package rpg;

public class Soldier extends Warrior {
    
    int hps, forcas, agilidades, defesas, danos;
    String armadura;

    public Soldier(String nick, String armadura, String arma) {
        super(nick, arma);
        this.armadura = armadura;
        this.hps = 80;
        this.forcas = 100;
        this.agilidades = 30;
        this.danos = (forcas + hps) - agilidades;
        this.defesas = hps + forcas - danos;
        
    }


    public String getArmadura() {
        return this.armadura;
    }

    public int getHp() {
        return hps;
    }

    public void setHp(int hp) {
        this.hps = hp;
    }

    public int getForca() {
        return forcas;
    }

    public void setForca(int forca) {
        this.forcas = forca;
    }

    public int getAgilidade() {
        return agilidades;
    }

    public void setAgilidade(int agilidade) {
        this.agilidades = agilidade;
    }

    public int getDefesa() {
        return defesas;
    }

    public void setDefesa(int defesa) {
        this.defesas = defesa;
    }

    public int getDano() {
        return danos;
    }

    public void setDano(int dano) {
        this.danos = dano;
    }
    
    

    @Override
    public String toString() {
        return "Soldier{" + "hp=" + hps + ", forca=" + forcas + ", agilidade=" + agilidades + ", defesa=" + defesas + ", dano=" + danos + ", armadura=" + armadura + '}';
    }

}
