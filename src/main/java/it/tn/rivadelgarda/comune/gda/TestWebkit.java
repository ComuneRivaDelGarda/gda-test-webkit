package it.tn.rivadelgarda.comune.gda;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.webkit.QWebSettings;

/**
 * Created by tiziano on 16/12/16.
 */
public class TestWebkit {

    public static void main(String[] args) {

        QApplication.initialize(args);

        MyBrowser myBrowser = new MyBrowser("http://google.com");
        myBrowser.show();
        
        QApplication.instance().exec();

    }
}
