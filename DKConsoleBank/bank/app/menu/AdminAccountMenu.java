package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class AdminAccountMenu extends ConsoleMenu{

	protected AdminAccountMenu(AccountService as, MemberService ms) {
		super(as, ms);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("::: 계좌 관리 메뉴 :::");
		while (true) {
			int menu = selectMenu();
			switch (menu) {
			case 1 -> showAllAccountList();
			case 2 -> showAccountsByUser();
			case 0 -> {return;}
			default -> System.out.println("메뉴에 있는 번호를 선택");
			}
	}

}

	private void showAccountsByUser() {
		System.out.println("::: 회원별 계좌 목록 :::");
	}

	private void showAllAccountList() {
		System.out.println("::: 전체 계좌 목록 :::");
	}

}
