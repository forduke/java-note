/**
 *	��ʾ�û�������������Ϣ���ж���һ������һ���еĵڼ��첢��ӡ
 *	˼·��
 *	1. ��ȷ�������ʽ��Ȼ��ʹ����Ӧ���������жϳ� �ꡢ�¡���
 *	2. �ж��Ƿ�Ϊ���꣬��һ��boolean�������
 *	3. �������ĸ�ʽ�Ƿ�Ϲ棬�겻��С��1���·�Ҫ����0С��13���ո����·����ж�
 *	4. ��ʽ��ȷ������������
 */
 
import java.util.Scanner;

public class WhichDay {
	
	public static void main(String[] args) {
		
		System.out.println("�����������ա�����2020��1��1������ 20200101 ");
		Scanner sc = new Scanner(System.in);
		
		int birthday = sc.nextInt();
		// �����ڹ�Ԫǰ�Ĳ���
		if(birthday < 10101) {
			System.out.println("��Ԫǰ�Ĳ����㣬����󰴸�ʽ�������롣����2020��1��1������ 20200101 ");
			return;
		}
		
		int year = birthday / 10000;		// ������һ��
		int month = birthday % 10000 / 100;	// ������һ��
		int day = birthday % 100;			// ������һ��
		int days = 0;							// ������
		boolean isLeapYear = false;			// �Ƿ�Ϊ����
		
		// �ж��Ƿ�Ϊ���꣬���������400
		if(year % 100 == 0) {
			if(year % 400 == 0) {
				isLeapYear = true;
			}
		} else if(year % 4 == 0) {
			isLeapYear = true;
		}
		
		// ����·ݻ�����������Ϊ0
		if((month == 0 || month > 12) || day == 0) {
			System.out.println("������·ݻ����ڲ���Ϊ0������󰴸�ʽ�������롣����2020��1��1������ 20200101 ");
			return;
		}
		// ���²��ܳ���31��
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
			if(day > 31) {
				System.out.println("�����������������󰴸�ʽ�������롣����2020��1��1������ 20200101 ");
				return;
			}
		// С�²��ܳ���30��
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day > 30) {
				System.out.println("�����������������󰴸�ʽ�������롣����2020��1��1������ 20200101 ");
				return;
			}
		// 2�£����겻�ܳ���29�죬��ͨ�겻�ܳ���28��
		} else {
			if(isLeapYear) {
				if(day > 29) {
					System.out.println("�����������������󰴸�ʽ�������롣����2020��1��1������ 20200101 ");
					return;
				}
			} else {
				if(day > 28) {
					System.out.println("�����������������󰴸�ʽ�������롣����2020��1��1������ 20200101 ");
					return;
				}
			}
		}
		
		// �·�ѭ���жϼ���������
		switch(month) {
			case 1:
				days = day;
			break;
			case 2:
				days = 31 + day;
			break;
			case 3:
				days = 31 + 28 + day;
			break;
			case 4:
				days = 31 + 28 + 31 + day;
			break;
			case 5:
				days = 31 + 28 + 31 + 30 + day;
			break;
			case 6:
				days = 31 + 28 + 31 + 30 + 31 + day;
			break;
			case 7:
				days = 31 + 28 + 31 + 30 + 31 + 30 + day;
			break;
			case 8:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
			break;
			case 9:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
			break;
			case 10:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			break;
			case 11:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			break;
			default:
				days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}
		
		// ��������꣬����2�·ݶ��1��
		if(isLeapYear && month > 2) {
			days += 1;
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("����������ǣ���Ԫ" + year + "��ĵ�" + days + "��");
		System.out.println("--------------------------------------------------");
	}
}