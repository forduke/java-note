

/**
 * @Author ��Ǭ
 * @Date 2020/11/13 17:18
 * @Description: ����һ������Ϊ[16][16]�����Ͷ�ά���鲢�����ָ������λ�õ�Ԫ��ֵ��
 * �ֱ�ʵ�ֶ�ά�����������к�������������Ԫ�ص��ۼӺͲ���ӡ��
 * �ٷֱ�ʵ�ֶ�ά���������Ͻǵ����½Ǻ����Ͻǵ����½�����Ԫ�ص��ۼӺͲ���ӡ��
 */

public class Summation {

    public static void main(String[] args) {

        // 1. �Ƚ���һ���յĶ�ά���飬�к���Ϊ16
        int[][] arr = new int[16][16];
        // 3. �½�4�������飬�ֱ�洢 ÿ���ۼ�ֵ��ÿ���ۼ�ֵ������-���£�����-����
        int[] columnArr = new int[16];
        int[] rowArr = new int[16];
        int[] leftTopToRightBottomArr = new int[16];
        int[] rightTopToLeftBottomArr = new int[16];
        int leftTopToRightBottomNum = 0;
        int rightTopToLeftBottomNum = 0;

        // 2. ˫��ѭ�������鸳ֵ����ʼֵΪ10��ÿ�м�1
        int num = 10;   // ��һ��Ϊ10-26�����涼Ϊ10������һЩ
        for (int i = 0; i < 16; i++) {
            int rowNum = 0; // ÿ���ܺ͵ı���
            for(int j = 0; j < 16; j++) {
                if(i == 0) {
                    arr[i][j] = num;
                    rowNum = rowNum + num; // ÿ���ܺ� �ۼ�
                    columnArr[j] = columnArr[j] + num;  // 4. ��ÿ�е�ֵ�ۼӺ����¸�ֵ��ÿ���ܺ͵�������
                    num += 1;   // ��ʼֵ��1
                } else {
                    arr[i][j] = 10;
                    rowNum = rowNum + 10; // ÿ���ܺ� �ۼ�
                    columnArr[j] = columnArr[j] + 10;  // 4. ��ÿ�е�ֵ�ۼӺ����¸�ֵ��ÿ���ܺ͵�������
                }
                System.out.print(" " + arr[i][j]);
            }
            leftTopToRightBottomArr[i] = arr[i][i]; // 5. ���ϵ����µĸ�ֵ���±�����ѭ��iһ��
            rightTopToLeftBottomArr[i] = arr[i][(15 - i)];  // 6. ���ϵ����£��Ӻ���ǰȡֵ�����±��15-i��ʼ
            rowArr[i] = rowNum; // ÿ���ܺ͵ĸ�ֵ
            System.out.println("");
        }
        // 7. 4�����飬4��ѭ���ֱ��ӡ������Ӧ��ֵ������-���£�����-���� ��1���ۼ�ֵ
        System.out.println("--------------------------------------------------");
        for (int k = 0;k < rowArr.length;k++) {
            System.out.println("��" + (k + 1) + "������Ԫ�ص��ۼ�ֵΪ��" + rowArr[k]);
        }
        System.out.println("--------------------------------------------------");
        for (int k = 0;k < columnArr.length;k++) {
            System.out.println("��" + (k + 1) + "������Ԫ�ص��ۼ�ֵΪ��" + columnArr[k]);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("���Ͻǵ����½�����Ԫ�ص��ۼ�ֵΪ��");
        for (int k = 0;k < leftTopToRightBottomArr.length;k++) {
            System.out.print(leftTopToRightBottomArr[k] + " + ");
            leftTopToRightBottomNum = leftTopToRightBottomNum + leftTopToRightBottomArr[k];
        }
        System.out.print(" = " + leftTopToRightBottomNum);
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("���Ͻǵ����½�����Ԫ�ص��ۼ�ֵΪ��");
        for (int k = 0;k < rightTopToLeftBottomArr.length;k++) {
            System.out.print(rightTopToLeftBottomArr[k] + " + ");
            rightTopToLeftBottomNum = rightTopToLeftBottomNum + rightTopToLeftBottomArr[k];
        }
        System.out.print(" = " + rightTopToLeftBottomNum);
    }
}
