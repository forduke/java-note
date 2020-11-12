/*
 *	使用双重循环实现五子棋游戏棋盘的绘制
 */

public class Gobang {
	
	public static void main(String[] args) {
		
		// 新建个行和列都为17的二维数组
		char[][] arr = new char[17][17];
		
		// 行循环
		for(int i = 0;i < 17;i++) {
			// 列循环
			for(int j = 0;j < 17;j++) {
				// 只有左边和上边有规律，中间都是 + 
				// 这里的0-9之前想用int来自增来替换，不会int转char，就全部用ASCII代替了
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