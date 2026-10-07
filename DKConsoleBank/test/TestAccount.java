package test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountDao;
import bank.account.AccountListDao;

public class TestAccount {
	public static void main(String[] args) {
		testAccountDao();
	}
	
	public static void testAccountDao() {
		AccountDao adao = new AccountListDao();
		
		// 계좌 추가
		System.out.println(">>> 계좌 추가");
		adao.save(new Account(1111, "1234", "damgyeong", 10000));
		adao.save(new Account(1112, "1234", "curi", 50000));
		
		// 계좌 모두 찾기
		System.out.println(">>> 계좌 목록");
		List<Account> alist = adao.findAll();
		printAccountList(alist);
		
		// 번호로 계좌 찾기
		System.out.println(">>> 번호로 계좌 찾기");
		Account acc = adao.findByNo(1111);
		System.out.println(acc);
		
		// 회원 ID로 계좌 찾기
		System.out.println(">>> 회원 ID로 계좌 찾기");
		List<Account> memberAccounts = adao.findByMemberId("curi");
		printAccountList(memberAccounts);
		
		// 계좌 존재 여부 확인
		System.out.println(">>> 계좌 존재 여부 확인" + adao.existByNo(1112));
		
		// 계좌 정보 변경 (예: 잔액 수정)
		System.out.println(">>> 계좌 정보 변경");
		acc.setBalance(20000);
		adao.update(acc);
		printAccountList(adao.findAll());
		
		// 계좌 삭제
		System.out.println(">>> 계좌 삭제");
		adao.delete(adao.findByNo(1111));
		printAccountList(adao.findAll());
		
	}

	private static void printAccountList(List<Account> alist) {
		for(Account a : alist) {
			System.out.println(a);
		}
	}
}