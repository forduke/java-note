/*
 *	ʹ��˫��ѭ��ʵ����������Ϸ���̵Ļ���
 */

public class Gobang {
	
	public static void main(String[] args) {
		
		// �½����к��ж�Ϊ17�Ķ�ά����
		char[][] arr = new char[17][17];
		
		// ��ѭ��
		for(int i = 0;i < 17;i++) {
			// ��ѭ��
			for(int j = 0;j < 17;j++) {
				// ֻ����ߺ��ϱ��й��ɣ��м䶼�� + 
				// �����0-9֮ǰ����int���������滻������intתchar����ȫ����ASCII������
				if(i == 0) {
					if(j == 0) {
						arr[i][j] = '\u0000';
					} else {
						switch(j) {
							case 1:
								arr[i][j] = '\u0030';
							break;
							case 2:
								arr[i][j] = '\u0031';
							break;
							case 3:
								arr[i][j] = '\u0032';
							break;
							case 4:
								arr[i][j] = '\u0033';
							break;
							case 5:
								arr[i][j] = '\u0034';
							break;
							case 6:
								arr[i][j] = '\u0035';
							break;
							case 7:
								arr[i][j] = '\u0036';
							break;
							case 8:
								arr[i][j] = '\u0037';
							break;
							case 9:
								arr[i][j] = '\u0038';
							break;
							case 10:
								arr[i][j] = '\u0039';
							break;
							case 11:
								arr[i][j] = '\u0061';
							break;
							case 12:
								arr[i][j] = '\u0062';
							break;
							case 13:
								arr[i][j] = '\u0063';
							break;
							case 14:
								arr[i][j] = '\u0064';
							break;
							case 15:
								arr[i][j] = '\u0065';
							break;
							default:
								arr[i][j] = '\u0066';
						}
					}
				} else {
					if(j == 0) {
						switch(i) {
							case 1:
								arr[i][j] = '\u0030';
							break;
							case 2:
								arr[i][j] = '\u0031';
							break;
							case 3:
								arr[i][j] = '\u0032';
							break;
							case 4:
								arr[i][j] = '\u0033';
							break;
							case 5:
								arr[i][j] = '\u0034';
							break;
							case 6:
								arr[i][j] = '\u0035';
							break;
							case 7:
								arr[i][j] = '\u0036';
							break;
							case 8:
								arr[i][j] = '\u0037';
							break;
							case 9:
								arr[i][j] = '\u0038';
							break;
							case 10:
								arr[i][j] = '\u0039';
							break;
							case 11:
								arr[i][j] = '\u0061';
							break;
							case 12:
								arr[i][j] = '\u0062';
							break;
							case 13:
								arr[i][j] = '\u0063';
							break;
							case 14:
								arr[i][j] = '\u0064';
							break;
							case 15:
								arr[i][j] = '\u0065';
							break;
							default:
								arr[i][j] = '\u0066';
						}
					} else {
						arr[i][j] = '\u002B';
					}
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}