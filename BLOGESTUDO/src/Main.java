// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dono rafaelUser = new Dono("rafaeltiribas@outlook.com", "RafaelPiratinha");
        Blog blogRafael = new Blog(rafaelUser, "blog-do-rafael");
        rafaelUser.criarPost("Esta é uma postagem do meu blog.", rafaelUser, blogRafael);

        //Dono outroUser = new Dono("outroemail@outlookl.com", "OutroUser");
        //outroUser.criarPost("Tentando postar.", outroUser, blogRafael);
    }
}