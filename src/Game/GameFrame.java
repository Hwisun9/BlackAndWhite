package Game;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame() {

        setSize(1000, 600);
        setContentPane(new StartPanel()); // StartPanel 의 객체를 생성하여 컨텐트팬으로 설정
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setResizable(false);
        setVisible(true);

    }

    private class StartPanel extends JPanel {

        public StartPanel() {

            this.setLayout(null);

            JButton check = new JButton("확인");
            check.setBorderPainted(false); // 테두리를 그리지 않음
            check.setFocusPainted(false); // 포커스를 얻었을 때 외형을 그리지 않음
            check.setBounds(670, 420, 100, 55);
            add(check); // 패널에 추가
        }
    }
}

