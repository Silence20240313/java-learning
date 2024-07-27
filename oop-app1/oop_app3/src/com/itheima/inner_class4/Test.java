package com.itheima.inner_class4;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test {
    public static void main(String[] args) {
        // TODO 匿名内部类在开发中的真实使用场景
        // GUI编程
        // 1.创建窗口
        JFrame win = new JFrame("登陆界面");
        JPanel panel = new JPanel();
        win.add(panel);
        JButton btn = new JButton("登录");
        panel.add(btn);

        // 给按钮绑定单击事件监听器
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"登陆一下");
            }
        });
        // 最终的核心目的是简化代码

        win.setSize(400,400);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setVisible(true);

    }
}
