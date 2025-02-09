package aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = true;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    public String detalhes() {
        return "Livro [titulo=" + titulo + 
        ",\n autor=" + autor + 
        ",\n totPaginas=" + totPaginas + 
        ",\n aberto=" + aberto + 
        ",\npagAtual="+ pagAtual +
        ",\n nome leitor=" + leitor.getNome() + 
        ",\n idade leitor=" + leitor.getIdade() + 
        ",\n sexo leitor=" + leitor.getSexo() + "]";
    }
    
    @Override
    public void abrir() {
        this.aberto = true;
    }
    
    @Override
    public void fechar() {
        this.aberto = false;
    }
    
    @Override
    public void folhear(int p) {
        this.pagAtual = p;
        if(p < 0 || p > this.totPaginas)
        {
            this.pagAtual = 0;
        } else{
            this.pagAtual = p;
        }
    }
    
    @Override
    public void avancarPag() {
        this.pagAtual += 1;
    }
    
    @Override
    public void voltarPag() {
        this.pagAtual -= 1;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getTotPaginas() {
        return totPaginas;
    }
    
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    
    public int getPagAtual() {
        return pagAtual;
    }
    
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    
    public boolean isAberto() {
        return aberto;
    }
    
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public Pessoa getLeitor() {
        return leitor;
    }
    
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
