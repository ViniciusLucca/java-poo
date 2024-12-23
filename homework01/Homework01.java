package homework01;

public class Homework01 {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.nome = "Cadeira";
        prod1.categoria = "Mobilha";
        prod1.valor = 89.99f;
        prod1.disponivel = true;
        prod1.qtd_em_estoque = 3;

        prod1.adicionarEstoque(2);
        prod1.adicionarEstoque(-2);
        prod1.vender();
    }
}
