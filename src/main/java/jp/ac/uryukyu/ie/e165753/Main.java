package jp.ac.uryukyu.ie.e165753;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player[] player = new Player[2];
        player[0] = new Player("プレイヤー１", "○");
        player[1] = new Player("プレイヤー２", "×");
        int judgment = 0;
        int turn = 0;

        while (true) {
            while (true) {
                board.show();
                System.out.printf("%sさんの番です (1～9を入力) >", player[turn].getName());
                int number = player[turn].play();
                if (number == 0) {
                    System.out.println("1～9の数字を入力してください");
                    continue;
                }
                if (board.check(number)) {
                    board.set(number, player[turn].getMark());
                    break;
                }
                System.out.println("そこには置けません");
            }
            judgment = board.judge();
            if (judgment != 0) {
                break;
            }
            turn = (turn + 1) % 2;
        }

        board.show();
        System.out.println("ゲーム終了！");

        switch (judgment) {
            case 1:
                System.out.printf("%sさんの勝ちです%n", player[0]);
                break;
            case 2:
                System.out.printf("%sさんの勝ちです%n", player[1]);
                break;
            default:
                System.out.println("勝負はつきませんでした");
        }
    }
}