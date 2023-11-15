import javax.swing.JOptionPane;

public class Exercise {
    public static void main(String[] args) {
    double n1, n2, n3, n4;
    String str1, str2, str3, str4, result;
    str1 = JOptionPane.showInputDialog("input attendance: ");
    n1 = Double.parseDouble(str1);
    str2 = JOptionPane.showInputDialog("input midterm: ");
    n2 = Double.parseDouble(str2);
    str3 = JOptionPane.showInputDialog("input assignment: ");
    n3 = Double.parseDouble(str3);
    str4 = JOptionPane.showInputDialog("input final exam: ");
    n4 = Double.parseDouble(str4);
    result = ((n1 + n2 + n3 + n4) >= 50)? "So, He/She is passed." : "So, He/She is failed.";
    JOptionPane.showMessageDialog(null,
        "Student Result: "
        + "\n -------------------------"
        + "\n Attendance:" + n1
        + "\n Midterm:" + n2
        + "\n Assignment:" + n3
        + "\n Final Exam:" + n4
        + "\n Total Score:" + (n1+n2+n3+n4)
        + "\n " + result
    );
  }
}
