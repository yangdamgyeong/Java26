package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class MyInfoMenu extends ConsoleMenu{

	protected MyInfoMenu(AccountService as, MemberService ms) {
		super(as, ms);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("::: 내 정보 메뉴 :::");
		while (true) {
			int menu = selectMenu();
			switch (menu) {
			case 1 -> updatePassword();
			case 2 -> withdrawMember();
			case 0 -> {return;}
			default -> System.out.println("메뉴에 있는 번호를 선택");
			}
	}

}

	private void withdrawMember() {
		System.out.println("::: 회원 탈퇴 :::");
	}

	private void updatePassword() {
		System.out.println("::: 비밀번호 수정 :::");
	}

}