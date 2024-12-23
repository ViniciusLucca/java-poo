package homework01;

public class Produto {
    String nome;
    String categoria;
    boolean disponivel;
    float valor;
    int qtd_em_estoque;

    void vender() {
        if (!(this.qtd_em_estoque < 1 || this.disponivel == false)) {
            this.qtd_em_estoque -= 1;
            System.out.println("Produto vendido!");
            System.out.println("Quantidade em estoque: " + this.qtd_em_estoque);

            if (this.qtd_em_estoque == 0) {
                this.disponivel = false;
            }
        } else {
            System.out.println("ERRO! Não foi possível realizar a venda.");
        }
    }

    void adicionarEstoque(int qtd){
        if (qtd < 0) {
            System.out.println("Não é possível adicionar uma quantidade negativa de itens ao estoque!");
            return;
        }
        this.qtd_em_estoque += qtd;
        System.out.println(qtd + " itens adicionados ao estoque!");
    }
}
