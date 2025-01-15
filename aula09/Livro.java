package aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor = new Pessoa();
    
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.leitor = leitor;
    }
    
    public String detalhes() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", aberto=" + aberto
        + ", leitor=" + leitor + "]";
    }
    
    @Override
    public void abrir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abrir'");
    }
    
    @Override
    public void fechar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fechar'");
    }
    
    @Override
    public void folhear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'folhear'");
    }
    
    @Override
    public void avancarPag() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'avancarPag'");
    }
    
    @Override
    public void voltarPag() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'voltarPag'");
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
