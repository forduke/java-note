

/**
 * @Author 张乾
 * @Date 2020/11/13 17:18
 * @Description: 定义一个长度为[16][16]的整型二维数组并输入或指定所有位置的元素值，
 * 分别实现二维数组中所有行和所有列中所有元素的累加和并打印。
 * 再分别实现二维数组中左上角到右下角和右上角到左下角所有元素的累加和并打印。
 */

public class Summation {

    public static void main(String[] args) {

        // 1. 先建立一个空的二维数组，行和列为16
        int[][] arr = new int[16][16];
        // 3. 新建4个空数组，分别存储 每行累加值，每列累加值，左上-右下，右上-左下
        int[] columnArr = new int[16];
        int[] rowArr = new int[16];
        int[] leftTopToRightBottomArr = new int[16];
        int[] rightTopToLeftBottomArr = new int[16];
        int leftTopToRightBottomNum = 0;
        int rightTopToLeftBottomNum = 0;

        // 2. 双重循环给数组赋值，初始值为10，每行加1
        int num = 10;   // 第一行为10-26，后面都为10，好算一些
        for (int i = 0; i < 16; i++) {
            int rowNum = 0; // 每行总和的变量
            for(int j = 0; j < 16; j++) {
                if(i == 0) {
                    arr[i][j] = num;
                    rowNum = rowNum + num; // 每行总和 累加
                    columnArr[j] = columnArr[j] + num;  // 4. 把每列的值累加后重新赋值到每列总和的数组中
                    num += 1;   // 初始值加1
                } else {
                    arr[i][j] = 10;
                    rowNum = rowNum + 10; // 每行总和 累加
                    columnArr[j] = columnArr[j] + 10;  // 4. 把每列的值累加后重新赋值到每列总和的数组中
                }
                System.out.print(" " + arr[i][j]);
            }
            leftTopToRightBottomArr[i] = arr[i][i]; // 5. 左上到右下的赋值，下标和外层循环i一样
            rightTopToLeftBottomArr[i] = arr[i][(15 - i)];  // 6. 右上到左下，从后往前取值，列下标就15-i开始
            rowArr[i] = rowNum; // 每行总和的赋值
            System.out.println("");
        }
        // 7. 4个数组，4个循环分别打印出来相应的值，左上-右下，右上-左下 是1个累加值
        System.out.println("--------------------------------------------------");
        for (int k = 0;k < rowArr.length;k++) {
            System.out.println("第" + (k + 1) + "行所有元素的累加值为：" + rowArr[k]);
        }
        System.out.println("--------------------------------------------------");
        for (int k = 0;k < columnArr.length;k++) {
            System.out.println("第" + (k + 1) + "列所有元素的累加值为：" + columnArr[k]);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("左上角到右下角所有元素的累加值为：");
        for (int k = 0;k < leftTopToRightBottomArr.length;k++) {
            System.out.print(leftTopToRightBottomArr[k] + " + ");
            leftTopToRightBottomNum = leftTopToRightBottomNum + leftTopToRightBottomArr[k];
        }
        System.out.print(" = " + leftTopToRightBottomNum);
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("右上角到左下角所有元素的累加值为：");
        for (int k = 0;k < rightTopToLeftBottomArr.length;k++) {
            System.out.print(rightTopToLeftBottomArr[k] + " + ");
            rightTopToLeftBottomNum = rightTopToLeftBottomNum + rightTopToLeftBottomArr[k];
        }
        System.out.print(" = " + rightTopToLeftBottomNum);
    }
}
