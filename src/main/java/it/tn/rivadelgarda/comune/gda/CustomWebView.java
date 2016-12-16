package it.tn.rivadelgarda.comune.gda;

import com.trolltech.qt.gui.QWidget;
import com.trolltech.qt.network.QNetworkCookieJar;
import com.trolltech.qt.webkit.QWebPage;
import com.trolltech.qt.webkit.QWebSettings;
import com.trolltech.qt.webkit.QWebView;

/**
 * Created by tiziano on 16/12/16.
 */
public class CustomWebView extends QWebView {

    private QNetworkCookieJar cookieJar;

    public CustomWebView() {
        this(null);
    }

    public CustomWebView(QWidget parent) {
        super(parent);
        this.cookieJar = new QNetworkCookieJar();
        this.page().networkAccessManager().setCookieJar(this.cookieJar);
        this.page().loadFinished.connect(this, "loadFinished()");
        this.page().windowCloseRequested.connect(this, "close()");

        settings().globalSettings().setAttribute(QWebSettings.WebAttribute.DeveloperExtrasEnabled, true);
    }

    @Override
    protected QWebView createWindow(QWebPage.WebWindowType type) {
        CustomWebView view = new CustomWebView();
        view.page().networkAccessManager().setCookieJar(this.cookieJar);
        view.show();
        return view;
    }

    private void loadFinished(){
        // page loaded
    }

}
