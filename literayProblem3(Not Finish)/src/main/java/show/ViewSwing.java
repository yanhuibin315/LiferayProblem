package show;

import url.analyURL;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ViewSwing {

    private static analyURL au;

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("漫画下载器");
        // Setting the width and height of frame
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();
        
        frame.add(panel);
        
        placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
     
        panel.setLayout(null);
     
        JLabel userLabel = new JLabel("漫画首页地址");
        
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JButton analyButton = new JButton("解析");
        analyButton.setBounds(280, 20, 60, 25);
        panel.add(analyButton);

		new JLabel("解析结果:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JLabel comic_Name = new JLabel("漫画名");

        comic_Name.setBounds(10,20,80,25);
        panel.add(comic_Name);

        JTextArea comicName = new JTextArea(20,40);
        comicName.setBounds(100,50,165,25);
        panel.add(comicName);

        JLabel chapter_name = new JLabel("章节名");

        chapter_name.setBounds(10,20,80,25);
        panel.add(chapter_name);

//        List<String> chapters = new ArrayList<String>(); 
//        chapters =  au.getChapters("http://baidu.com", "img");
//        DefaultListModel lIterms = new DefaultListModel();
//        JList lst = new JList(lIterms);
//        JTextArea t = new JTextArea(chapters.size(), 20);
//        panel.add(lst);

        JButton loginButton = new JButton("下载");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
    }


}