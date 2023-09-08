package com.louis.xscanner;

import java.io.IOException;

/**
 * @Date:09/08/2023 13:38
 * @Description:
 */
public class TestDemo {

    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime.getRuntime().exec("tesseract /Users/landon.zhang/Downloads/Xnip2023-09-08_11-16-32.jpg output -l chi_sim");
        Thread.sleep(2000);
    }
}
