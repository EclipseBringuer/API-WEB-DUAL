package com.gabimiguesamu.appWebDual.util;

import java.io.IOException;

public class Utility {
    public static void launchWeb() {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if(os.contains("win")) {
                Runtime.getRuntime().exec("cmd /c start chrome http://localhost:8080/web/login");
            }else{
                Runtime.getRuntime().exec("open -a Safari http://localhost:8080/web/login");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
