package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.DKAccountService;
import bank.app.menu.StartMenu;
import bank.member.DKMemberService;
import bank.member.MemberListDao;
import bank.member.MemberService;

public class DKConsoleBankApp {
	
	public static void main(String[] args) {
		MemberService ms = new DKMemberService(new MemberListDao());
		AccountService as = new DKAccountService(new AccountListDao());
		
		new StartMenu(as, ms).run();
		
	}
}
