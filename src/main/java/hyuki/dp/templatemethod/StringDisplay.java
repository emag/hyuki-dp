package hyuki.dp.templatemethod;

/**
 * @author Yoshimasa Tanabe
 */
public class StringDisplay extends AbstractDisplay {

  private final String string;
  private final int width;

  public StringDisplay(String string) {
    this.string = string;
    this.width = string.getBytes().length;
  }

  @Override
  public void open() {
    printLine();
  }

  @Override
  public void print() {
    System.out.println(String.format("|%s|", string));
  }

  @Override
  public void close() {
    printLine();
  }

  private void printLine() {
    System.out.print("+");
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }
}