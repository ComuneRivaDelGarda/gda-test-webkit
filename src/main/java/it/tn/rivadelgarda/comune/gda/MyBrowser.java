package it.tn.rivadelgarda.comune.gda;

import com.trolltech.qt.core.QUrl;
import com.trolltech.qt.gui.QDialog;
import com.trolltech.qt.gui.QVBoxLayout;
import com.trolltech.qt.webkit.QWebSettings;

/**
 * Created by tiziano on 16/12/16.
 */
public class MyBrowser extends QDialog {

    public MyBrowser(String url) {
        super();

        CustomWebView webView = new CustomWebView();
        QVBoxLayout vLayout = new QVBoxLayout(this);
        vLayout.addWidget(webView);

        webView.load(new QUrl(url));
        webView.settings().setAttribute(QWebSettings.WebAttribute.JavascriptEnabled, true);
        webView.settings().setAttribute(QWebSettings.WebAttribute.JavascriptCanOpenWindows, true);
        webView.settings().setAttribute(QWebSettings.WebAttribute.JavascriptCanAccessClipboard, true);

    }
}
