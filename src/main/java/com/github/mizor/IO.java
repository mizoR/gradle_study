package com.github.mizor;

import java.io.*;

public interface IO {
  public String read() throws IOException;

  public static final IO STDIN = Stdin.INSTANCE;

  enum Stdin implements IO {
    INSTANCE;

    public String read() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuffer buf = new StringBuffer();

      while (true) {
        String line = br.readLine();

        if (line == null) {
          break;
        }
        buf.append(line);
      }

      return buf.toString();
    }
  }
}
