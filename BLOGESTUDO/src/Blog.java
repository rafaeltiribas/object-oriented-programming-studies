import java.util.ArrayList;
import java.util.List;
public class Blog {
    private User dono;
    private String nome;
    private List<Post> postagens;

    public Blog(User dono, String nome){
        this.dono = dono;
        this.nome = nome;
        this.postagens = new ArrayList<>();
    }
    public void publicaPostagem(Post post){
        if(post.getAutor().getEmail() == dono.getEmail()){
            this.postagens.add(post);
        }
        else{
            System.out.println("Permissão negada.\n");
        }
    }
}
