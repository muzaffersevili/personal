import java.util.Scanner;

public class bomba {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		long n= sc.nextLong();
		long m= sc.nextLong();

		long ahududu = 21 * m;
		long cilek = 2 * m;
		long cikolata = 11 * m;
		long bcikolata = 9 * m;
		long visne = 7 * m;

		long dublesos = 0;
		long teksos = 0;

		long hamur = 35 * n;
		long sos = ahududu + cilek + visne + cikolata + bcikolata;

		long full = 29 * m;
		long maxim = hamur * 2;

		if (maxim > sos && hamur > full) {
			while (sos > hamur && sos > 0 && hamur > 0) {

				if (ahududu != 0 && cilek != 0) {
					cilek--;
					ahududu--;
					dublesos++;
					sos -= 2;
					hamur--;
				}

				else if (ahududu != 0 && visne != 0) {
					visne--;
					ahududu--;
					dublesos++;
					sos -= 2;
					hamur--;
				}

				else if (ahududu != 0 && bcikolata != 0) {
					bcikolata--;
					ahududu--;
					dublesos++;
					sos -= 2;
					hamur--;
				}

				else if (ahududu != 0 && cikolata != 0) {
					cikolata--;
					ahududu--;
					dublesos++;
					sos -= 2;
					hamur--;
				}

				else if (hamur != 0 && sos == 0) {
					System.out.println("Eksik sos");
					break;
				}

				else if (sos != 0 && hamur == 0) {
					System.out.println("Eksik hamur");
					break;
				}
			}

			while (sos > hamur && sos > 0 && hamur > 0) {

				if (ahududu != 0) {
					ahududu--;
					teksos++;
					sos -= 1;
					hamur--;
				}

				if (bcikolata != 0) {
					bcikolata--;
					teksos++;
					sos -= 1;
					hamur--;
				}

				if (cikolata != 0) {
					cikolata--;
					teksos++;
					sos -= 1;
					hamur--;
				}

				if (visne != 0) {
					visne--;
					teksos++;
					sos -= 1;
					hamur--;
				}

				if (cilek != 0) {
					visne--;
					teksos++;
					sos -= 1;
					hamur--;
				}
			}
		}
		if(dublesos>0 && n<Math.pow(10, 8) && m<Math.pow(10, 8))
			System.out.println(dublesos);
		else
			System.out.println(-1);
	}
}
