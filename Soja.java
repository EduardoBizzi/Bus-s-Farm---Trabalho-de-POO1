package Plantas;

public class Soja extends Plantacoes {

    private int seedSoja, qntSojaPlant;

    public Soja(int seedSoja){
        this.seedSoja = seedSoja;
    }

    @Override
    public void plantar(){
        setseedSoja(getseedSoja() - 1);
        setQntSojaPlant(getQntSojaPlant() + 1);
    }
    @Override
    public void colher(){
        setseedSoja(getseedSoja() + (getQntSojaPlant() * 5));
    }
    @Override
    public void regar(){

    }
    public int getseedSoja(){
        return seedSoja;
    }

    public void setseedSoja(int seedSoja){
        this.seedSoja = seedSoja;
    }

    public int getQntSojaPlant() {
        return qntSojaPlant;
    }

    public void setQntSojaPlant(int qntSojaPlant) {
        this.qntSojaPlant = qntSojaPlant;
    }
}
