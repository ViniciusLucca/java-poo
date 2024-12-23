package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(3, "José da Silva");
        c1.depositar(100f);
        c1.abrirConta("cc");
        c1.depositar(100f);
        System.out.println( c1.getSaldo() );
        c1.sacar(1000f);
        c1.sacar(10f);
        c1.fecharConta();
        c1.pagarMensal();
        c1.contaDump();
        c1.sacar((c1.getSaldo()));
        c1.contaDump();
        c1.fecharConta();
    }
}