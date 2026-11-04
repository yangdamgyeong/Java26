package test;

import java.util.List;

import bank.member.DKMemberService;
import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;
import bank.member.MemberService;

public class TestMember {
	public static void main(String[] args) {
		testMemberService();
//		testMemberDao();
	}
	
	public static void testMemberService() {
		MemberService ms = new DKMemberService(new MemberListDao());
		
		System.out.println(">> 회원 가입 및 목록 조회");
		ms.join("curi", "1234", "큐리");
		ms.join("curi2", "1111", "큐리2");
		printMemberList(ms.getAllMembers());
		
		System.out.println(">> 로그인, 로그아웃 ");
		if (ms.login("curi", "1234"))
			System.out.println(ms.getLoggedMemeber());
		ms.logout();
		System.out.println(ms.getLoggedMemeber());
		
		System.out.println(">> 회원 정보 보기");
		ms.login("admin", "1234");
		System.out.println(ms.getMemberInfo("curi"));
		
		System.out.println(">> 비밀번호 변경");
		ms.changePassword("curi", "1234", "1111");
		printMemberList(ms.getAllMembers());
		
		
	}
	
	public static void testMemberDao() {
		MemberDao mdao = new MemberListDao();
		// 회원 추가
		System.out.println(">>> 회원 추가");
		mdao.save(new Member("admin", "1234", "admin", null, null, Member.USER));
		mdao.save(new Member("damgyeong", "1111", "양담경", null, null, Member.USER));
		mdao.save(new Member("curi", "1111", "큐리", null, null, Member.USER));
		printMemberList(mdao.findAll());
		
		// 회원 모두 찾기
		System.out.println(">>> 회원 목록");
		List<Member> mlist = mdao.findAll();
		
		// 회원 출력
		printMemberList(mlist);
		
		System.out.println(">>> id로 회원찾기");
		Member m = mdao.findById("curi");
		System.out.println(m);
		
		System.out.println(">>> 비밀번호 변경");
		m.setPassword("1234");
		mdao.update(m);
		printMemberList(mdao.findAll());
		
		System.out.println(">>> 회원 삭제");
		mdao.delete(mdao.findById("curi"));
		printMemberList(mdao.findAll());
		
	}
	

	private static void printMemberList(List<Member> mlist) {
		for(Member m : mlist) {
			System.out.println(m);
		}
		
	}
}
