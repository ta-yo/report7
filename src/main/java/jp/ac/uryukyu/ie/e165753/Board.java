package jp.ac.uryukyu.ie.e165753;

/**
 * Created by e165753 on 2017/02/06.
 */
public class Board {
    private String[][] pos = new String[3][3];
    private int cnt;

    Board() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                pos[x][y] = "－";
            }
        }
        cnt = 0;
    }

    void show() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.printf("%s ", pos[x][y]);
            }
            System.out.println("");
        }
    }

    public boolean check(int number) {
        switch (number) {
            case 1:
                return pos[0][0] == "－";
            case 2:
                return pos[0][1] == "－";
            case 3:
                return pos[0][2] == "－";
            case 4:
                return pos[1][0] == "－";
            case 5:
                return pos[1][1] == "－";
            case 6:
                return pos[1][2] == "－";
            case 7:
                return pos[2][0] == "－";
            case 8:
                return pos[2][1] == "－";
            case 9:
                return pos[2][2] == "－";
        }
        return false;
    }

    public void set(int number, String mark) {
        switch (number) {
            case 1:
                pos[0][0] = mark;
                cnt++;
                break;
            case 2:
                pos[0][1] = mark;
                cnt++;
                break;
            case 3:
                pos[0][2] = mark;
                cnt++;
                break;
            case 4:
                pos[1][0] = mark;
                cnt++;
                break;
            case 5:
                pos[1][1] = mark;
                cnt++;
                break;
            case 6:
                pos[1][2] = mark;
                cnt++;
                break;
            case 7:
                pos[2][0] = mark;
                cnt++;
                break;
            case 8:
                pos[2][1] = mark;
                cnt++;
                break;
            case 9:
                pos[2][2] = mark;
                cnt++;
                break;
            default:
        }
    }

    public int judge() {
        if (cnt == 9) {
            return 3;
        }
        return 0;
    }
}