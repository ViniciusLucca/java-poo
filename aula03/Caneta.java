package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;

    //status(): basicamente um `var_dump()` do PHP
    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? \t" + this.tampada);
    }
    
    public void rabiscar(){
        if(!(this.tampada)){
            System.out.println("ERRO! Não posso rabiscar tampada.");
        } else{
            System.out.println("Estou rabiscando.");
        }
    }

    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }

}
