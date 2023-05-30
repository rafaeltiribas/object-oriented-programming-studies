public class Texto {
    private String conteudo;
    private User autor;

    public Texto(String conteudo, User autor){
        this.conteudo = conteudo;
        this.autor = autor;
    }
    public User getAutor(){
        return autor;
    }
}