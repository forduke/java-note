/**
 *	����ҳ� 1000 ���ڵ�������������ӡ������ ��ν��������һ����ǡ�õ�����������֮��,�磺6=1��2��3
 */
 
public class PerfectNumber {
	 
	public static void main(String[] args) {
		
		int num = 0;	// ����һ����ʼֵ
		
		System.out.println("----------------------------------------");
		System.out.print("1000���ڵ������У�");
		
		// 1000���ڵ�ѭ��������1��
		for(int i = 2;i < 1000;i++) {
			for(int j = 1;j < (i/2 + 1);j++) {
				// ����ѭ����С��i��һ����У���Ҫ��ȡֵ��һ��
				if(i % j == 0) {	// ����������ͼ��������浽num��
					num += j;
				}
			}
			// ����֮����i���ʱ��ӡ
			if(num == i) {
				System.out.print(" " + num);
			}
			num = 0;	// ÿ��ѭ��������num��ֵ
		}
		System.out.println("");
		System.out.println("----------------------------------------");
	}
}