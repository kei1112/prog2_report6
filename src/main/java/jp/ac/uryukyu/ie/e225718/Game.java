package jp.ac.uryukyu.ie.e225718;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * ごかくしゲームの実装
 * 
 * 
 * 
 * 
 */

class Sabu{
    String name;
    Integer number;
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Integer> numbers2 = new ArrayList<Integer>();
    Iterator<Integer> iterator1 = numbers.iterator();
    Iterator<Integer> iterator2 = numbers2.iterator();
}

public class Game extends Sabu{

    /**
     * ユーザーの名前を登録するメソッド
     */
    public void setName(String username){
        this.name = username;
    }

    /**
     * ユーザーの名前をゲットするメソッド
     */
    public String getName(){
        return this.name;
    }

    //コンストラクタ
    Game(String username){
        this.setName(username);
        System.out.println("・ユーザーネームを" + name + "で始めるね♡\n  私の名前はみちぇだよ");   
    }

    /**
     * ゲームの説明をする
     */
    public void explain(){
        System.out.println("＊今から説明するよ＊\n1 まず、1~5の中で1つ数字を選ぶ\n2 みちぇが、君の選んだ数より大きい数を言うよ\n3 君はそれより大きい数を選ぼう\n4 相手が5を選んだ時はパスしなければならないよ\n5 5つ数を言えたら勝ちだよ");
    }

    //メソッド2 マスターの中身
    /**
     * ユーザーが数字を5つ選択し、勝利するまで続ける <br>
     * ユーザーが5を選択した場合は、パスをし、数字は0を選択することにする <br>
     * ゲームのマスターの選ぶ数字は、ランダムに選択ようにする <br>
     * まだ選んでない数字　かつ　ユーザーの選んだ数字より大きい場合　ー＞　その数字を選択
     * 
     * @param number ユーザーの選んだ数字
     */
    public void master(int number){//number>>相手が選んだ数
        //ユーザーより大きい数を選ぶ。ルールに則って
        int i = 1;
        while(i == 1 && numbers.size()<5){

            if(number == 5){
                System.out.println("----- みちぇは パス をした -----");
                game(0);
                break;
            }else{
                Random ran = new Random();
                int my_number = ran.nextInt(5) + 1;

                boolean result = numbers2.contains(my_number);
                boolean okisa = my_number > number;// number < my_number がない時

                if(!result && okisa){
                        System.out.println("-- みちぇは " + my_number + " を選んだ --");
                        numbers2.add(my_number);
                        game(my_number);
                        break;
                }else{
                    i = 1;
                }
            }
        }
        System.out.println("~~ ゲーム終了 " + name + " の勝ち ~~");
        System.exit(0);
    }


    /**
     * マスターが数字を5つ選択し、勝利するまで続ける <br>
     * 
     * 数字を打ち込んでもらう <br>
     * マスターが5を選択した場合は、パスし、0を選択することにする <br>
     * まだ選んでない数字　かつ　マスターの選んだ数字より大きい場合　ー＞　その数字を選択 <br>
     * 
     * @param number ゲームマスターの選んだ数字
     */
    public void game(int number){//number = master の数字
        int input;
        int i = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("~~~~~ " + name + "のターンだよ ~~~~~");

        while(i == 1 && numbers2.size() < 5){

            if(number == 5 ){
                System.out.println("~~ パスしか出せないよ(・Д・) ~~");
                master(0);
                break;
            }else{
                System.out.println("~~ ここにあるものは出せないよ　" + numbers + "~~　");    
                input = in.nextInt();
                boolean result = numbers.contains(input);
                boolean okisa = input > number;

                if(!result && okisa){
                    System.out.println("~~ " + name + " は " + input + " を選んだ ~~");
                    numbers.add(input);
                    master(input);
                    break;
                }else{
                    i = 1;
                }
            }
        }
        in.close();
        System.out.println("~~ ゲーム終了 みちぇの勝ち ~~");
        System.exit(0);
        
    }    
}

