package Animais;
package Plantas;

public class Vaca implements animais {
    private int qntVacas, leite;

    public Vaca (int qntVacas, int leite){
        this.qntVacas = qntVacas;
        this.leite = leite;
    }

    @Override
    public void alimentar (){
        setseedSoja(getseedSoja() - (qntVacas * 3);
    }

    @Override
    public void coletar() {

    }
    public int getQntVacas(){
        return qntVacas;
    }

    public void setQntVacas(int qntVacas){
        this.qntVacas = qntVacas;
    }
}
