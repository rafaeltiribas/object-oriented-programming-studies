public class Dono extends User{
    public Dono(String email, String nome){
        super(email, nome);
    }

    public void criarPost(String conteudo, User autor, Blog blog){
        Post postagem = new Post(conteudo, autor);
        blog.publicaPostagem(postagem);
    }
}
