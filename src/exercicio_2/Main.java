package exercicio_2;

public class Main {
    public static void main(String[] args) {
        Playlist minha_playlist = new Playlist();
        
        minha_playlist.adicionar(new Musica("Fairytale", 182));
        minha_playlist.adicionar(new Musica("Arrival", 326));
        minha_playlist.adicionar(new Musica("Not Gonna Die", 225));

        minha_playlist.tocar();
        minha_playlist.avancar();        
        minha_playlist.voltar();
        minha_playlist.musica_remover();
        minha_playlist.tocar();
        minha_playlist.avancar();
        minha_playlist.avancar();
    }
}