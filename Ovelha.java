package Animais;
package Plantas;

public class Ovelha implements animais{
    private int qntOvelhas, la;

    public Ovelha(int qntOvelhas, int la){
        this.qntOvelhas = qntOvelhas;
        this.la = la;
    }

    @Override
    public void alimentar (){
        setseedTrigo(getseedTrigo() - (qntOvelhas * 3);
    }

    @Override
    public void coletar() {

    }
    public int getQntOvelhas(){
        return qntOvelhas;
    }

    public void setQntOvelhas(int qntOvelhas){
        this.qntOvelhas = qntOvelhas;
    }
}
