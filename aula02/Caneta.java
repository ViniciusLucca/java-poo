package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //status(): basicamente um `var_dump()` do PHP
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? \t" + this.tampada);

    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso rabiscar tampada.");
        } else{
            System.out.println("Estou rabiscando.");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }

}
