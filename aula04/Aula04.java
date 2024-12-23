package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Manoel Gomes", 0.5f , true,  "Preta");
        Caneta c2 = new Caneta("NIC", 1.5f, false, "Vermelha");
        // c1.setModelo("Manoel Gomes");
        // c1.setPonta(1.5f);
        //c1.tampada = true
        c1.status();
        c2.status();
    }
}