/*
 *	ʵ��˫ɫ��齱��Ϸ�н���������ɣ��н������� 6 ���������� 1 �����������ɡ� 
 *	���к������Ҫ��������� 6 �� 1~33 ֮�䲻�ظ���������롣 
 *	�����������Ҫ��������� 1 �� 1~16 ֮���������롣
 */

import java.util.Random;

public class TwoColorBalls {
 
	public static void main(String[] args) {
		
		Random ra = new Random();
		
		int[] arr = new int[6];	// ����������
		int i = 0;				// ��0��ʼѭ��
		boolean isSame = false;	// �Ƿ���һ���ĺ���
		
		// һֱѭ����������û���ظ�Ԫ��Ϊֹ
		while(i < 6) {
			arr[i] = ra.nextInt(33) + 1;
			if(i > 0) {	// �ӵڶ���Ԫ�ؿ�ʼ�ж�
				// ������ǰ����Ԫ�أ��Ƚ��Ƿ���ͬ����ͬ�Ļ�����θ�ֵ��Ԫ�ر��0������ѭ�����������
				for(int j = 0;j < i;j++) {
					if(arr[j] == arr[i]) {
						arr[i] = 0;
						isSame = true;
						break;
					}
				}
				// û��һ����Ԫ�ؾͰ�i��1,
				if(!isSame) {
					i++;
				}
			} else {
				i++;
			}
			// ���ñ�ʶ
			isSame = false;
		};
		
		int blueNum = ra.nextInt(16) + 1;
		
		System.out.println("-----------------------------------");
		System.out.print("����˫ɫ���н����룺���� ");
		
		for(int k = 0;k < arr.length;k++) {
				System.out.print(arr[k] + " ");
		}
		
		System.out.println("���� " + blueNum);
		System.out.println("-----------------------------------");
		
	}
}