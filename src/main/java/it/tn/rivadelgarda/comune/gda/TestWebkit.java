package it.tn.rivadelgarda.comune.gda;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.webkit.QWebSettings;

/**
 * Created by tiziano on 16/12/16.
 */
public class TestWebkit {

    public static void main(String[] args) {

        QApplication.initialize(args);

//        MyBrowser myBrowser = new MyBrowser("http://chromium.github.io/octane/");
//        MyBrowser myBrowser = new MyBrowser("https://html5test.com/");
        MyBrowser myBrowser = new MyBrowser("http://localhost:8080/gdadocer/index.html");
//        MyBrowser myBrowser = new MyBrowser("http://192.168.64.200:8080/gdadocer/");
        myBrowser.show();
        
        QApplication.instance().exec();

    }
}
