

/**
 * @Author 张乾
 * @Date 2020/11/13 17:35
 * @Description: （1）绘制棋盘 - 写一个成员方法实现
 * （2）提示黑方和白方分别下棋并重新绘制棋盘 - 写一个成员方法实现。
 * （3）每当一方下棋后判断是否获胜 - 写一个成员方法实现。
 * （4）提示： 采用二维数组来模拟并描述棋盘，棋盘如下：
 * 0 1 2 3 4 5 6 7 8 9 a b c d e f
 * 0 + + + + + + + + + + + + + + + +
 * 1 + + + + + + + + + + + + + + + +
 * 2 + + + + + + + + + + + + + + + +
 * 3 + + + + + + + + + + + + + + + +
 * 4 + + + + + + + + + + + + + + + +
 * 5 + + + + + + + + + + + + + + + +
 * 6 + + + + + + + + + + + + + + + +
 * 7 + + + + + + + + + + + + + + + +
 * 8 + + + + + + + + + + + + + + + +
 * 9 + + + + + + + + + + + + + + + +
 * a + + + + + + + + + + + + + + + +
 * b + + + + + + + + + + + + + + + +
 * c + + + + + + + + + + + + + + + +
 * d + + + + + + + + + + + + + + + +
 * e + + + + + + + + + + + + + + + +
 * f + + + + + + + + + + + + + + + +
 */

import java.util.Scanner;

public class GoBang {

    public String[][] arr = new String[17][17];
    public boolean isBlack = true;                 // true 黑方下棋，false白方下棋

    // 1. 二维数组绘制棋盘，长度 [17][17]
    public void chessboard() {
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                if (i == 0) {
                    if (j == 0) {
                        arr[i][j] = " ";
                    } else if (j < 11) {
                        arr[i][j] = Integer.toString(j - 1);
                    } else if (j == 11) {
                        arr[i][j] = "a";
                    } else if (j == 12) {
                        arr[i][j] = "b";
                    } else if (j == 13) {
                        arr[i][j] = "c";
                    } else if (j == 14) {
                        arr[i][j] = "d";
                    } else if (j == 15) {
                        arr[i][j] = "e";
                    } else {
                        arr[i][j] = "f";
                    }
                } else {
                    if (j == 0) {
                        if (i < 11) {
                            arr[i][j] = Integer.toString(i - 1);
                        } else if (i == 11) {
                            arr[i][j] = "a";
                        } else if (i == 12) {
                            arr[i][j] = "b";
                        } else if (i == 13) {
                            arr[i][j] = "c";
                        } else if (i == 14) {
                            arr[i][j] = "d";
                        } else if (i == 15) {
                            arr[i][j] = "e";
                        } else {
                            arr[i][j] = "f";
                        }
                    } else {
                        arr[i][j] = "+";
                    }
                }
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        playChess();
    }

    // 2. 提示黑方和白方分别下棋并重新绘制棋盘
    public void playChess() {

        int rowX = 0;       // 当前下棋的横坐标 X
        int columnY = 0;    // 当前下棋的纵坐标 Y
        int num = 0;        // 用来给坐标赋值, 0为x，1为y
        String player;

        if(isBlack) {
            player = "黑";
        } else {
            player = "白";
        }
        System.out.println(player + " 方请输入要下棋坐标，左侧标识开始，例：12，ab");

        String str = null;
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        if(str.length() != 2) {
            System.out.println("坐标有误，请重新输入");
            System.out.println("--------------------------------------------------------");
            playChess();
            return;
        }
        String x = str.substring(0, 1); // 输入值取第一个字符
        String y = str.substring(1, 2); // 输入值取第二个字符

        // 循环两次，分别为横纵坐标赋值
        for (int i = 0; i < 2; i++) {
            String s = null;
            if(i == 0) {
                s = x;
            } else {
                s = y;
            }
            switch (s) {
                case "0":
                    num = 1;
                    break;
                case "1":
                    num = 2;
                    break;
                case "2":
                    num = 3;
                    break;
                case "3":
                    num = 4;
                    break;
                case "4":
                    num = 5;
                    break;
                case "5":
                    num = 6;
                    break;
                case "6":
                    num = 7;
                    break;
                case "7":
                    num = 8;
                    break;
                case "8":
                    num = 9;
                    break;
                case "9":
                    num = 10;
                    break;
                case "a":
                    num = 11;
                    break;
                case "b":
                    num = 12;
                    break;
                case "c":
                    num = 13;
                    break;
                case "d":
                    num = 14;
                    break;
                case "e":
                    num = 15;
                    break;
                case "f":
                    num = 16;
                    break;
                default:
                    System.out.println("输入数值有误");
                    playChess();
                    return;
            }

            if(i == 0) {
                rowX = num;
            } else {
                columnY = num;
            }
        }

        // 判断下棋位置是否为 +
        if(!arr[rowX][columnY].equals("+")) {
            System.out.println("当前位置已有棋子，请重新放置。");
            playChess();
            return;
        }

        arr[rowX][columnY] = player;
        // 改变下棋方
        isBlack = !isBlack;
        // 绘制棋盘
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------------------");
        whoWin(rowX, columnY);
    }

    // 3. 判断谁赢了
    public void whoWin(int x, int y) {

        int topNum = 0;
        int bottomNum = 0;
        int leftNum = 0;
        int rightNum = 0;
        int leftTopNum = 0;
        int rightTopNum = 0;
        int leftBottomNum = 0;
        int rightBottomNum = 0;

        String chess = arr[x][y];

        // 1. 向上查找
        for(int i = 1;i < 5;i++) {
            if(x - i > 0){
                if(arr[x - i][y].equals(chess)) {
                    topNum += 1;
                } else {
                    break;
                }
            }
            if(topNum == 4) {
                System.out.println(chess + "方获胜！");
                return;
            }
        }

        // 2. 向下查找
        for(int i = 1;i < 5;i++) {
            if(x + i < 17){
                if(arr[x + i][y].equals(chess)) {
                    bottomNum += 1;
                } else {
                    break;
                }
            }
            if(topNum + bottomNum == 4) {
                System.out.println(chess + "方获胜！");
                return;
            }
        }

        // 3. 向左查找
        for(int i = 1;i < 5;i++) {
            if(y - i > 0){
                if(arr[x][y - i].equals(chess)) {
                    leftNum += 1;
                } else {
                    break;
                }
            }
            if(leftNum == 4) {
                System.out.println(chess + "方获胜！");
                return;
            }
        }
        // 4. 向右查找
        for(int i = 1;i < 5;i++) {
            if(y + i < 17){
                if(arr[x][y + i].equals(chess)) {
                    rightNum += 1;
                } else {
                    break;
                }
            }
            if(leftNum + rightNum == 4) {
                System.out.println(chess + "方获胜！");
                return;
            }
        }
        // 5. 向左上查找
        for(int i = 1;i < 5;i++) {
            if(x - i > 1 && y - i > 1){
                if(arr[x - i][y - i].equals(chess)) {
                    leftTopNum += 1;
                } else {
                    break;
                }
            }
            if(leftTopNum == 4) {
                System.out.println(chess + "方获胜！");
                return;
            }
        }
        // 6. 向右上查找
        for(int i = 1;i < 5;i++) {
            if(x - i > 1 && y + i < 17){
                if(arr[x - i][y + i].equals(chess)) {
                    rightTopNum += 1;
                } else {
                    break;
                }
            }
            if(rightTopNum == 4) {
                System.out.println(chess + "方获胜！");
                return;
            }
        }
        // 7. 向左下查找
        for(int i = 1;i < 5;i++) {
            if(x + i < 17 && y - i > 1){
                if(arr[x + i][y - i].equals(chess)) {
                    leftBottomNum += 1;
                } else {
                    break;
                }
            }
            if(rightTopNum + leftBottomNum == 4) {
                System.out.println(chess + "方获胜！");
                return;
            }
        }
        // 8. 向右下查找
        for(int i = 1;i < 5;i++) {
            if(x + i < 17 && y + i > 1){
                if(arr[x + i][y + i].equals(chess)) {
                    rightBottomNum += 1;
                } else {
                    break;
                }
            }
            if(leftTopNum + rightBottomNum == 4) {
                System.out.println(chess + "方获胜！");
                return;
            }
        }

        playChess();
    }

}
