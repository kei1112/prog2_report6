package jp.ac.uryukyu.ie.e225718;

import java.util.ArrayList;
import java.util.Scanner;

class Sabu{
    String name;
    Integer number;
    ArrayList<Integer> numbers = new ArrayList<Integer>();
}
class gaming extends Sabu{
    gaming(String username){
        this.setName(username);
        System.out.println("・ユーザーネームを" + name + "で始めるね♡\n  私の名前はみちぇだよ");
    }
    public void setName(String username){
        this.name = username;
    }
    public void game(String name){
        int input;
        System.out.println("~~~~~ では、初めていくよ！ ~~~~~");

        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("~~~~~ では、初めていくよ！ ~~~~~");
            input = in.nextInt();
            if(numbers.contains(input)){//numbersのリスト内に選んだ数字がある場合
                System.out.println(name + "これはもう出しているよ。");
                
                break;
            }else{//数字がない場合
                numbers.add(input);
                System.out.println(name + "は" + input + "を選んだ");
            }
        }
        in.close();

    }
    public void explain(){
        System.out.println("＊今から説明するよ＊\n1 まず、1~5の中で1つ数字を選ぶ\n2 みちぇが、君の選んだ数より大きい数を言うよ\n3 君はそれより大きい数を選ぼう\n4 言いたくない時や、大きい数がない時は、パスを選択できるよ");
    }
}
