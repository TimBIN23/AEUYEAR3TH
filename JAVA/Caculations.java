// EX1
import javax.swing.JOptionPane;

// public class Caculations {
//   public static void main(String[] args) {
//     double n1, n2;
//     String str1, str2;
//     str1 = JOptionPane.showInputDialog("input number 1");
//     n1 = Double.parseDouble(str1);
//     str2 = JOptionPane.showInputDialog("input number 2");
//     n2 = Double.parseDouble(str2);
//     JOptionPane.showMessageDialog(null,
//         "Result of The Operations: "
//         +"\nnumber1 ="+ n1+", number2 ="+ n2
//         + "\n====================================="
//         + String.format("\n Addition : %.2f", (n1+n2))
//         + "\n Subtract : " + (n1-n2)
//         + String.format("\n Multiplication : %.2f", (n1*n2))
//         + String.format("\n device :  %.2f", (n1/n2))
//     );
//   }
// }

// ex2 Ractangle

// public class Caculations {
//   public static void main(String[] args) {
//     double n1, n2;
//     String str1, str2;
//     str1 = JOptionPane.showInputDialog("input Widht 1");
//     n1 = Double.parseDouble(str1);
//     str2 = JOptionPane.showInputDialog("input Hight 2");
//     n2 = Double.parseDouble(str2);
//     JOptionPane.showMessageDialog(null,
//         " input widht: "+ n1
//         +"\n input hight: "+ n2
//         +"\n The result of the Rectangle : "
//         + "\n --------------------------"
//         +"\n widht = "+ n1 + ", height = "+ n2
//         + String.format("\n Ractangle's Area : %.5f", (n1*n2)+0.00003)
//         + String.format("\n Ractangle's Perimeter : %.1f", (2*(n1+n2)))
//     );
//   }
// }

//ex3/homework Change money from kh to $
public class Caculations {
  public static void main(String[] args) {
    double n1, n2;
    String str1, str2;
    str1 = JOptionPane.showInputDialog("input KH Money: ");
    n1 = Double.parseDouble(str1);
    str2 = JOptionPane.showInputDialog("input Rate Money: ");
    n2 = Double.parseDouble(str2);
    JOptionPane.showMessageDialog(null,
        "\n Khmer Money:"+ n1 + ", USA Rate: "+ n2
        + "\n Total Dollars:" + (n1/n2)
    );
  }
}
