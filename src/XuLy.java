import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số N");
		int n = Integer.parseInt(scan.nextLine());
		thapHaNoi(n, 'A', 'B', 'C');
	}
	
	public static long tinhTong(int n) {
		if(n == 1) {
			return 1;
		}
	  return tinhTong(n - 1) + n;
	}
	
	public static long giaiThua(int n) {
		if(n == 1) {
			return 1;
		}
		return giaiThua(n - 1)*n;
	}
	
	public static long tongGiaiThua(int n) {
		if(n == 1) {
			return 1;
		}
		return tongGiaiThua(n-1) + giaiThua(n-1)*n;
	}
	
	public static void chuyen(int n, char X, char Y) {
		System.out.println("Chuyển đĩa thứ " + n + " từ cọc " + X + " sang cọc " + Y);
	}
	
	public static void thapHaNoi(int n, char A, char B, char C) {
		if(n == 1) {
			chuyen(1, A, C);
		} else {
			thapHaNoi(n-1, A, C, B);
			chuyen(n, A, C);
			thapHaNoi(n-1, B, A, C);
		}
	}
}
