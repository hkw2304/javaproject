package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Bank> banklist = new ArrayList<>();
		BankService bs = new BankService();

		while (true) {
			System.out.println("_____은행업무_____");
			System.out.println("       1.계좌개설");
			System.out.println("       2.입금하기");
			System.out.println("       3.출금하기");
			System.out.println("________________");
			System.out.print("선택 >> ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				bs.createAccount(banklist);
				break;
			case 2:
				bs.input(banklist);
				break;
			case 3:
				bs.output(banklist);
				break;
			default:
				System.out.println("<<기능은 1~ 3번 까지입니다.>>");

			}

		}
	}

}
