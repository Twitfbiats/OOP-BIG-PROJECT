import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import GUI.packageMainGUI;

// import Customer.Human;
// import Customer.Receiver;
// import Customer.Sender;

public class Main {
    public static void main(String[] args) {
        // Human human = new Human(1, "Trieu Dinh Toan"
        // , "0968600120", "Tran Phu", "Vip");
        // Human receiver = new Receiver(2, "Le Nguyen Receiver", "0923618507", "Ha Noi", "Receiver");
        // Human sender = new Sender(3, "Tran Trung Sender", "0123456789", "An Giang", "Sender");
        // System.out.println(human.getRole());
        // System.out.println(receiver.getRole());
        // System.out.println(sender.getRole());
        // String s = "Rộng lớn";
        // ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(s);
        // String utf8 = new String(byteBuffer.array(), StandardCharsets.UTF_8);
        // try {
        //     PrintStream out = new PrintStream(System.out, true, "UTF-8");
        //     out.println(utf8);
        // } catch (Exception e) {
        //    e.printStackTrace();
        // }
        // System.out.println(utf8);
        // System.out.println("R" + "\u1ED9");
        packageMainGUI packageMainGUI = new packageMainGUI();
        packageMainGUI.setVisible(true);
    }
}
