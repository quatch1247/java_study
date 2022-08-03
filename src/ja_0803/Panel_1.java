package ja_0803;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
 
public class Panel_1 {
 
    public static void main(String[] args) {
    
        Frame     frame = new Frame();
        String    [] msg = {"아래버튼", "위버튼", "오른쪽버튼", "왼쪽버튼", "가운데버튼"};
        Color    [] colors = {
                                    new Color(255, 128, 0), 
                                    new Color(251, 33, 13),
                                    new Color(15, 223, 0),
                                    new Color(72, 22, 243),
                                    new Color(236, 12, 253)
                                };
        String    [] location = {"South", "North", "East", "West", "Center"};
        Button    [] btn = new Button[msg.length];
        Button     btn1 = new Button("South");
        
        Panel panelNorth = new Panel();//패널(위) 생성
        Panel panelSouth = new Panel();//패널(아래) 생성
        
        for(int i=0; i<btn.length; i++) {
            btn[i] = new Button(msg[i]);    //버튼 생성
            btn[i].setBackground(colors[i]); //색 삽입
            panelNorth.add(btn[i]);    //panel 안에 btn.length의 버튼 삽입
        }
        
        for(int i=0; i<btn.length; i++) {
            btn[i] = new Button(msg[i]);    //버튼 생성
            btn[i].setBackground(colors[i]);
            panelSouth.add(btn[i]);
        }
        
        frame.add(panelNorth, "North");
        frame.add(panelSouth, "South");
        
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
 
}
 
