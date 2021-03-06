package jbr.prog2impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader {
  private StringBuffer stringBuffer;
  private BufferedReader reader;

  public FileDataReader(String fileName) {
    stringBuffer = new StringBuffer();

    try {
      reader = new BufferedReader(new FileReader(new File(fileName)));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public String readData() {
    try {
      String line;
      while ((line = reader.readLine()) != null) {
        stringBuffer.append(line + " \n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return stringBuffer.toString();
  }
}
