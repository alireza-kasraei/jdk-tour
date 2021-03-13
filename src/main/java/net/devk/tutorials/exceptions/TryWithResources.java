package net.devk.tutorials.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * @since 1.7
 */
public class TryWithResources {


  public static void traditionalCopy(File in, File out) {
    BufferedReader src = null;
    BufferedWriter dest = null;
    try {
      src = new BufferedReader(new FileReader(in));
      dest = new BufferedWriter(new FileWriter(out));
      String line;
      while ((line = src.readLine()) != null) {
        dest.write(line);
        dest.newLine(); // write a newline
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    } finally { // always close the streams
      try {
        if (src != null)
          src.close(); // close() throw IOException
        if (dest != null)
          dest.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }

  public static void copy(File in, File out) {
    try (BufferedReader src = new BufferedReader(new FileReader(in));
        BufferedWriter dest = new BufferedWriter(new FileWriter(out))) {
      String line;
      while ((line = src.readLine()) != null) {
        dest.write(line);
        dest.newLine();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) throws IOException {
    File in = new File(TryWithResources.class.getResource("/in.txt").getFile());
    File out = File.createTempFile("out", ".tmp");
    traditionalCopy(in, out);
    copy(in, out);
  }

}
