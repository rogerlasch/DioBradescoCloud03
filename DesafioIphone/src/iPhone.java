import interfaces.InternetBrowser;
import interfaces.MusicPlayer;
import interfaces.Telephone;

public class iPhone implements InternetBrowser, MusicPlayer, Telephone {

    // Implementação de MusicPlayer
    @Override
    public void play() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada...");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecionando a música: \"" + music + "\"...");
    }

    // Implementação de Telephone
    @Override
    public void call(String number) {
        System.out.println("Ligando para o número: " + number);
    }

    @Override
    public void answer() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação de InternetBrowser
    @Override
    public void showPage(String url) {
        System.out.println("Exibindo a página da URL: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void updatePage() {
        System.out.println("Recarregando página...");
    }
}
