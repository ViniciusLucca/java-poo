package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();

        Caneta c3 = new Caneta();
        c3.modelo = "Manoel Gomes";
        c3.cor = "Azul";
        c3.destampar();
        c3.rabiscar();
    }
}