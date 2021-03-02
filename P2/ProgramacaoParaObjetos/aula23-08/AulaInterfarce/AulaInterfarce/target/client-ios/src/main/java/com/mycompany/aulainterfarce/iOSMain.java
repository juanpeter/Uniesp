package com.mycompany.aulainterfarce;

import net.java.html.boot.BrowserBuilder;

public final class iOSMain {
    public static void main(String... args) throws Exception {
        BrowserBuilder.newBrowser().
            loadPage("pages/index.html").
            loadClass(iOSMain.class).
            invoke("onPageLoad", args).
            showAndWait();
        System.exit(0);
    }

    public static void onPageLoad() throws Exception {
        DataModel.onPageLoad();
    }
}


