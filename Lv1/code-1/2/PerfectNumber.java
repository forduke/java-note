/**
 *	编程找出 1000 以内的所有完数并打印出来。 所谓完数就是一个数恰好等于它的因子之和,如：6=1＋2＋3
 */
 
public class PerfectNumber {
	 
	public static void main(String[] args) {
		
		int num = 0;	// 设置一个初始值
		
		System.out.println("----------------------------------------");
		System.out.print("1000以内的完数有：");
		
		// 1000以内的循环，不算1了
		for(int i = 2;i < 1000;i++) {
			for(int j = 1;j < (i/2 + 1);j++) {
				// 因子循环，小于i的一半就行，但要能取值到一半
				if(i % j == 0) {	// 如果能整除就加起来保存到num里
					num += j;
				}
			}
			// 因子之和与i相等时打印
			if(num == i) {
				System.out.print(" " + num);
			}
			num = 0;	// 每次循环后重置num的值
		}
		System.out.println("");
		System.out.println("----------------------------------------");
	}
}