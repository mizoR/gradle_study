package com.github.mizor;

import java.io.*;

public class GradleStudy {
    public static void main(String... args) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Please input your name: ");
      System.out.flush();
      String username = in.readLine();
      System.out.println("Hello, " + username + " :metal:");
    }
}
