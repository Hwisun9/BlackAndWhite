package Game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class loginpanel extends JPanel {

    private Image backgroundImage;

    public loginpanel() {
        // 배경 이미지 로드
        try {
            // "images/login_sample.png" 경로에 있는 이미지를 로드
            backgroundImage = ImageIO.read(new File("src/images/login_sample.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("배경 이미지를 로드할 수 없습니다.");
        }

        // 패널의 레이아웃을 null로 설정 (자유롭게 배치)
        this.setLayout(null);

        // 예시로 버튼 추가
        JButton loginButton = new JButton("로그인");
        loginButton.setBounds(400, 400, 150, 50);
        //add(loginButton);  // 버튼을 패널에 추가

        // 패널 크기 설정
        setSize(960, 600);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            // 배경 이미지가 null이 아니면 그리기
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            } else {
                System.out.println("배경 이미지가 로드되지 않았습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // JFrame을 생성하여 LoginPanel을 추가
        JFrame frame = new JFrame("Login Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960, 600);
        frame.setResizable(false);

        // LoginPanel 객체를 JFrame에 추가
        frame.setContentPane(new loginpanel());
        frame.setVisible(true);
    }
}
