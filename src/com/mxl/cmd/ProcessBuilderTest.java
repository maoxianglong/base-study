package com.mxl.cmd;

import java.io.IOException;

public class ProcessBuilderTest {

    public static void main(String[] args) throws IOException {

        Process processBuilder = new ProcessBuilder(new String[]{"cmd.exe", "/c","calc"}).start();

    }

}
