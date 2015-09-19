package hyuki.dp.adapter.exercise;

import java.io.IOException;

/**
 * @author Yoshimasa Tanabe
 */
public interface FileIO {

  void readFromFile(String fileName) throws IOException;
  void writeToFile(String fileName) throws IOException;
  void setValue(String key, String value);
  String getValue(String key);

}
