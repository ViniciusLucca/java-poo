package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public String getNome() {
        return this.nome;
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            return;
        }
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public void setVitorias(int vitoria) {
        this.vitorias = vitoria;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setDerrotas(int derrota) {
        this.derrotas = derrota;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setEmpates(int empate) {
        this.empates = empate;
    }

    public int getEmpates() {
        return this.empates;
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.peso <= 52.2 || this.peso > 120.2) {
            this.categoria = "Inválido";
            return;
        }
        if (this.peso <= 70.3) {
            this.categoria = "Leve";
            return;
        }
        if (this.peso <= 83.9) {
            this.categoria = "Médio";
            return;
        }
        if (this.peso <= 120.2) {
            this.categoria = "Pesado";
            return;
        }
    }

    public void apresentar() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " Anos");
        System.out.println("Altura: " + getAltura());
        System.out.println("Pesando : " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void status() {
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias());
        System.out.println(getDerrotas());
        System.out.println(getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
        ;
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
        ;
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
        
    }

}
