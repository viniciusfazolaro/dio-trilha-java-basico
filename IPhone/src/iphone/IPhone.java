package iphone;

import apps.browser.WebBrowser;
import apps.music.MusicPlayer;
import apps.phone.Phone;

public class IPhone implements WebBrowser, MusicPlayer, Phone {

    private void showPage() {
        System.out.println("Exibindo a página no Safari");
    }

    public void addNewTab() {
        System.out.println("Adicionando uma nova aba no Safari");
        showPage();
    }

    public void reloadPage() {
        System.out.println("Recarregando a página no Safari");
        showPage();
    }

    public void play() {
        System.out.println("Tocando música no iTunes");
    }

    public void pause() {
        System.out.println("Pausando música no iTunes");
    }

    public void selectMusic() {
        System.out.println("Selecionando música no iTunes");
    }

    public void call() {
        System.out.println("Ligando pelo iPhone");
    }

    public void answer() {
        System.out.println("Atendendo chamada no iPhone");
    }

    public void startVoicemail() {
        System.out.println("Iniciando correio de voz no iPhone");
    }
}
