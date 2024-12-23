package aula07;
import java.util.Random;
public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.equals(l2) || !(l1.getCategoria().equals(l2.getCategoria()))) {

            aprovada = false;
            desafiante = null;
            desafiado = null;

            return;
        }
        aprovada = true;
        desafiante = l1;
        desafiado = l2;
    }

    public void lutar() {
        if(!aprovada){
            System.err.println("Não foi possível realizar a luta!\n");
            return;
        }        
        desafiante.apresentar();
        desafiado.apresentar();
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        switch (vencedor) {
            case 0:
                System.err.println("Empate!");
                desafiante.empatarLuta();
                desafiado.empatarLuta();
                break;
            case 1:
                System.out.println(desafiante.getNome() + "Ganhou!");
                desafiante.ganharLuta();
                desafiado.perderLuta();
            case 2:
                System.out.println(desafiado.getNome() + "Ganhou!");
                desafiante.perderLuta();
                desafiado.ganharLuta();
            default:
                break;
        }
    }

}
