import java.util.ArrayList;
import java.util.List;
public class Post extends Texto{
    private List<Texto> comentarios;
    public Post(String conteudo, User autor){
        super(conteudo, autor);
        this.comentarios = new ArrayList<>();
    }
    public void adicionaComentario(Texto texto){
        this.comentarios.add(texto);
    }
}
