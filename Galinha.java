package Animais;
package Plantas;

public class Galinha implements animais {
    private int qntGalinhas, ovos;

    public Galinha (int qntGalinhas,int ovos ){
        this.qntGalinhas = qntGalinhas;
        this.ovos = ovos;
    }

    @Override
    public void alimentar (){
        setSeedMilho(getSeedMilho() - (qntGalinhas * 3));
    }

    @Override
    public void coletar() {

    }

    public int getQntGalinhas(){
        return qntGalinhas;
    }

    public void setQntGalinhas(int qntGalinhas){
        this.qntGalinhas = qntGalinhas;
    }

}
