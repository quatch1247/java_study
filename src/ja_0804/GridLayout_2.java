package ja_0804;


import java.awt.*;

 

class GridLayout_2{

       public static void main(String args[]){

             Frame f = new Frame("GridLayoutTest");

             f.setSize(150, 150);

            

             //3행 2열의 테이블을 만든다.

             f.setLayout(new GridLayout(3,2));

             f.add(new Button("1"));

             f.add(new Button("2"));

             f.add(new Button("3"));

             f.add(new Button("4"));

             f.add(new Button("5"));

             f.add(new Button("6"));

            

             f.setVisible(true);

       }

}