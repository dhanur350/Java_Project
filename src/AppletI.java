import java.applet.*;
import java.awt.Image;
import java.awt.event.*;
//import javafx.event.ActionEvent;

import java.awt.*;
//import javafx.scene.image.*;
/*
<applet code="AppletI.class" height="100" width="200"></applet>
 */
public class AppletI extends Applet implements ActionListener{
    Image img; //Image class object
    AudioClip aud;
    public void init(){
        img = getImage(getCodeBase(),"../build/ZOOM.JPG");
        aud = getAudioClip(getCodeBase(),"../build/Sound.wav");
    }
    public void paint(Graphics grp){
        grp.drawImage(img, 200, 300, this);
        grp.drawArc(100, 100, 100, 40, 0, 180);
        aud.play();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    /*public static void main(String[] args) {
        AppletI ap = new AppletI();
        ap.init();
    }*/
}
