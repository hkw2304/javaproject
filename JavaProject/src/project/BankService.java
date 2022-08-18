package project;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BankService {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	static boolean checkaccount = false;

	public void createAccount(List<Bank> banklist) {
	
		int account = (int) (Math.random() * 9000 + 999);
		String accountNum = Integer.toString(account);
		if(checkaccount) {
			loop: while(true) {
			for(Bank b : banklist) {
				if(accountNum.equals(b.getAccuntNum())) {
					System.out.println("다른 계좌 생성중 . . . . .");
					account = (int) (Math.random() * 9000 + 999);
					accountNum = Integer.toString(account);
				}
				else
					break loop;
			}
			}
		}
		System.out.print("성함 >>");
		String name = sc.next();
		System.out.print("비밀번호 >>");
		String pwd = sc.next();
		System.out.print("초기 금액 >>");
		int balance = sc.nextInt();

		System.out.println("_____계좌개설정보_____");
		System.out.println("계좌번호 : " + accountNum);
		System.out.println("성함 : " + name);
		System.out.println("비밀번호 : " + pwd);
		System.out.println("초기 입금액 : " + balance);

		banklist.add(new Bank(accountNum, name, pwd, balance));
		checkaccount = true;
	}

	public void input(List<Bank> banklist) {
		int cnt = 0;
		if (!checkaccount) {
			System.out.println("계좌를 먼저 생성");
			return;
		}
		System.out.print("입금 계좌 >> ");
		String accountNum = sc.next();
		System.out.print("비밀번호 >> ");
		String pwd = sc.next();

		for (Bank b : banklist) {
			if (accountNum.equals(b.getAccuntNum()) && pwd.equals(b.getPwd())) {
				while (true) {
					System.out.print("입금 금액 >>");
					int money = sc.nextInt();
					if (money < 0) {
						System.out.println("금액은 1원 부터입니다.");
					} else {
						b.setBalace(money);
						break;
					}
				}
				System.out.printf("현재 잔고 : %s원 \n", b.getBalace());
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("정보 오류");
		}

	}

	public void output(List<Bank> banklist) {
		int cnt = 0;
		if (!checkaccount) {
			System.out.println("계좌를 먼저 생성");
			return;
		}
		System.out.print("출금 계좌: ");
		String accountNum = sc.next();
		System.out.print("비밀번호 >> ");
		String pwd = sc.next();
		for (Bank b : banklist) {
			if (accountNum.equals(b.getAccuntNum()) && pwd.equals(b.getPwd())) {
				System.out.print("출금 금액: ");
				int money = sc.nextInt();
				if (money < 0 || money > b.getBalace()) {
					System.out.println("잘못된 금액");
					cnt++;
					break;
				} else {
					b.setBalace(-money);
					System.out.printf("출금후 잔액: %d원 \n", b.getBalace());
					cnt++;
				}
			}
		}
		if (cnt == 0) {
			System.out.println("정보 오류");
		}

	}
}
