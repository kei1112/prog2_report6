package jp.ac.uryukyu.ie.e225718;
import java.util.ArrayList;
import java.util.Scanner;

//ごかくし
public class Game{
    private String name;
    private int number;

    public void setName(String username){
        this.name = username;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }


    public Game(String username,int number){
        this.setName(username);
        System.out.println("・ユーザーネームを" + name + "で始めるね♡\n  私の名前はみちぇだよ");
        this.setNumber(number);
        System.out.println("・５で行くよ");
    }
    public void explain(){
        System.out.println("＊今から説明するよ＊\n1 まず、1~5の中で1つ数字を選ぶ\n2 みちぇが、君の選んだ数より大きい数を言うよ\n3 君はそれより大きい数を選ぼう\n4 言いたくない時や、大きい数がない時は、パスを選択できるよ");
    }
    public void master(int number){
        //ユーザーより大きい数を選ぶ。ルールに則って
        if(number < 4){
        int mm = 4;
        System.out.println("みちぇは " + mm + " を選んだ");
        }

    }
    public void gaming(){  
        int i = 5;
        int input1;
        System.out.println("~~~~~ では、初めていくよ！ ~~~~~");
        Scanner in = new Scanner(System.in);
        while(i > 0){
            System.out.println("----- 君の番 -----\n数字を選んでね");
            input1 = in.nextInt();
            System.out.println("君が選んだのは " + input1);
            Integer number1 = input1;
            //numbers.add(number1);
            System.out.println("----- みちぇの番 -----");
            master(input1);
            //numbers.get(0);
            //int number1 = scanner.nextInt();
            //System.out.println("君が選んだのは " + number1);
            //System.out.println("----- みちぇの番 -----");
            //master(number1);
            i -= 1;
  
        }
        in.close();
        System.out.println("~~~~~ 君の勝ち！ ~~~~~");
    }
    
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

}

