public class User {
    private String email;
    private String nome;

    public User(String email, String nome){
        this.email = email;
        this.nome = nome;
    }
    public String getEmail(){
        return this.email;
    }

    public void criarComentario(String conteudo, Post post){
        Texto comentario = new Texto(conteudo, this);
        post.adicionaComentario(comentario);
    }
}
