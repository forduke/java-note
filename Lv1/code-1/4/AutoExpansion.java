/*
 *	�Զ����������ݹ��򣬵��Ѵ洢Ԫ�������ﵽ�������� 80%ʱ������ 1.5 ���� 
 *	���磬�������� 10��������� 8 ��Ԫ��ʱ������������ݣ������� 10 �� 15��
 *	��������һ��Ҫ����ʾ�û������һ�����̣���ʱ�ﵽ80%��������������
 */

import java.util.Scanner;
import java.util.Arrays;

public class AutoExpansion {
	 
	public static void main(String[] args) {
		
		System.out.println("�����ʼ����Ϊ10�����������룬�˳�������'quit'��");
		System.out.println("-----------------------------------------------------------------------");
		
		// �����±�
		int i = 0;
		// �½��ַ�������
		String[] arr = new String[10];
		
		// ����ѭ���������Ӧָ������
		for(;;) {
			// ���㵱ǰ�����80%
			int num = arr.length * 8 / 10;
			// �������Ԫ����������80%����������
			if(i == num) {
				System.out.println("���������Ѵ�80%�������������ݣ�����1.5����");
				// �½������飬������֮ǰ�����1.5��
				String[] newArr = new String[arr.length * 15 / 10];
				// ��ԭ�������ݿ�������������ٰ������鸳ֵ��ԭ����
				for(int j = 0;j < arr.length;j++) {
					newArr[j] = arr[j];
				}
				arr = newArr;
				System.out.println("��ǰ����Ϊ��" + Arrays.toString(arr));
				System.out.println("-----------------------------------------------------------------------");
			}	
			
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			
			// ����"quit"�˳�
			if("quit".equals(str)) {
				break;
			}
			
			arr[i] = str;
			System.out.println("��ǰ����Ϊ��" + Arrays.toString(arr));
			System.out.println("-----------------------------------------------------------------------");
			i++;
		}
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Ъ�ᣬ��ǰ����Ϊ��" + Arrays.toString(arr));
		
	}
}