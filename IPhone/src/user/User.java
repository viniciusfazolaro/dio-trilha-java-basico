package user;

import iphone.IPhone;

public class User{
    
    public static void main(String[] args) {
        
        IPhone i = new IPhone();

        i.call();

        i.answer();

        i.startVoicemail();

        i.addNewTab();

        i.reloadPage();

        i.play();

        i.pause();

        i.selectMusic();
    }
}
