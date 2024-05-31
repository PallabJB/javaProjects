
package notepad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    About(){
        
        setBounds(400, 100, 600, 550);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(70, 40, 400, 80);
        add(headerIcon);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(50, 180, 70, 70);
        add(icon);
        
        JLabel text = new JLabel("<html>Microsoft Windows<br>Version 22H2 (OS Build 19045.3086)<br>© Microsoft Corporation. All rights reserved.<br><br><br>The Windows 10 Home Single Language operating system and its user<br>interface are protected by trademark nad other pending or exixting<br>intellectual property rights in the United States and other<br>countries/regions.<br><br><br>This product is licenced under the Microsoft Software License<br>Terms to:<br><br>  Windows User</html>");
        text.setBounds(150, 8, 500, 600);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 12));
        add(text);
        
        JButton b1 = new JButton("OK");
        b1.setBounds(450, 470, 120, 25);
        b1.addActionListener(this);
        add(b1);
        setVisible(true);     
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        
    }
    
    
    
    public static void main(String [] args){
        new About();
    }
}

