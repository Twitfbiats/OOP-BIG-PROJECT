import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;

import GUI.MainMenuGUI;

public class Main {
    public static void main(String[] args) {
        try 
        {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        MainMenuGUI mainMenuGUI = new MainMenuGUI();
        mainMenuGUI.setVisible(true);
    }
}
