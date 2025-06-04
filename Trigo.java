package Plantas;

public class Trigo extends Plantacoes{

    private int seedTrigo, qntTrigoPlant;

    public Trigo(int seedTrigo){
        this.seedTrigo = seedTrigo;
    }

    @Override
    public void plantar(){
        setseedTrigo(getseedTrigo() - 1);
        setQntTrigoPlant(getQntTrigoPlant() + 1);
    }
    @Override
    public void colher(){
        setseedTrigo(getseedTrigo() + (getQntTrigoPlant() * 5));
    }
    @Override
    public void regar(){

    }
    public int getseedTrigo(){
        return seedTrigo;
    }

    public void setseedTrigo(int seedTrigo){
        this.qntseedTrigo = qntseedTrigo;
    }

    public int getQntTrigoPlant() {
        return qntTrigoPlant;
    }

    public void setQntTrigoPlant(int qntTrigoPlant) {
        this.qntTrigoPlant = qntTrigoPlant;
    }
}
