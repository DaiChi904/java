package examination.middle_period;

class Tape {
    char[] cells = new char[5];
    int head = 0;

    void write(char data) {
        cells[head] = data;
        head++;
    }

    char delete() {
        head--;
        return cells[head];
    }

    void view() {
        System.out.print(" tape ’s state : ");
        for (int i = 0; i < head; i++) {
            System.out.print(" " + cells[i]);
        }
        System.out.println();
    }
}

public class ReadWriteTest {
  public static void main ( String [] args ) {
    Tape tape = new Tape ();

    tape . write ( '5' ); // '5 ' から '5' に修正しました (末尾のスペースを削除)
    tape . write ( '2' ); // '2 ' から '2' に修正しました (末尾のスペースを削除)
    tape . write ( '+' ); // '+ ' から '+' に修正しました (末尾のスペースを削除)

    tape . view ();

    for ( int i = 0; i < 5; i ++) {
        tape . delete ();
    }
    tape . write ('7');
  }
}
