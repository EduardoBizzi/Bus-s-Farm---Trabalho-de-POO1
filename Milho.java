package Plantas;

public class Milho extends Plantacoes{

    private int seedMilho, qntMilhoPlant;

    public Milho(int seedMilho){
        this.seedMilho = seedMilho;
    }

    @Override
    public void plantar(){
        setSeedMilho(getSeedMilho() - 1);
        setQntMilhoPlant(getQntMilhoPlant() + 1);
    }
    @Override
    public void colher(){
        setSeedMilho(getSeedMilho() + (getQntMilhoPlant() * 5));
    }
    @Override
    public void regar(){

    }
    public int getSeedMilho(){
        return seedMilho;
    }

    public void setSeedMilho(int seedMilho){
        this.qntseedMilho = qntseedMilho;
    }

    public int getQntMilhoPlant() {
        return qntMilhoPlant;
    }

    public void setQntMilhoPlant(int qntMilhoPlant) {
        this.qntMilhoPlant = qntMilhoPlant;
    }
}
