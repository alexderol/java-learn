package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Ay adı girin = ");
		String ay = sc.nextLine().toLowerCase();
		switch (ay){
			case "ocak":
			case "mart":
			case "mayıs":
			case "temmuz":
			case "ağustos":
			case "ekim":
			case "aralık":
				System.out.println("31 gün çeker");
				break;
			case "nisan":
			case "haziran":
			case "eylül":
			case "kasım":
				System.out.println("30 gün çeker");
				break;
			case "şubat":
				System.out.print("yılı giriniz = ");
				int yıl = sc.nextInt();
				if(yıl%4==0){
					System.out.println("şubat 29 çeker");
				}else System.out.println("şubat 28 çeker");
				break;
			default:
				System.out.println("Birşeyler ters gidiyor dikket et");







		}





	}

}
