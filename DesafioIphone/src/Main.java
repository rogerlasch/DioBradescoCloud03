/**
 * Classe principal para testar a implementação do iPhone.
 *
 * Esta implementação do iPhone segue o princípio da Programação Orientada a Objetos (POO),
 * utilizando interfaces para representar funcionalidades separadas:
 *
 * - MusicPlayer: Define métodos para tocar, pausar e selecionar músicas.
 * - Telephone: Define métodos para realizar chamadas, atender e iniciar correio de voz.
 * - InternetBrowser: Define métodos para exibir páginas, adicionar abas e atualizar páginas.
 *
 * A classe iPhone implementa todas essas interfaces, garantindo que o dispositivo possua todas as funcionalidades esperadas.
 *
 * Autor: Róger Matheus Lasch
 * Data: 26/03/2025
 */

public class Main {
    public static void main(String[] args) {

        iPhone sf = new iPhone();

        sf.selectMusic("good music.mp3");
        sf.play();
        sf.pause();

        sf.call("0011223344");
        sf.answer();
        sf.startVoiceMail();

        sf.showPage("www.google.com");
        sf.addNewTab();
        sf.updatePage();
    }
}