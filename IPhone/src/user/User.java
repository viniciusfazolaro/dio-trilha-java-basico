package user;

import iphone.IPhone;

public class User extends IPhone{
    
    public static void main(String[] args) {
        
        User u = new User();

        u.call();

        u.answer();

        u.startVoicemail();

        u.addNewTab();

        u.reloadPage();

        u.play();

        u.pause();

        u.selectMusic();
    }
}
