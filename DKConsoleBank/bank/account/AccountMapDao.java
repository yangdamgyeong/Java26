package bank.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMapDao implements AccountDao{
	
	Map<Integer, Account> accountDB = new HashMap<Integer, Account>();

	@Override
	public boolean save(Account a) {
		accountDB.put(a.getNo(), a);
		return true;
	}

	@Override
	public List<Account> findAll() {
		if (!accountDB.isEmpty()) {
			List<Account> alist = new ArrayList<>();
			for (Account a : accountDB.values()) {
				alist.add(a);
			}
			return alist;
		}
		return null;
	}

	@Override
	public Account findByNo(int no) {
		// TODO Auto-generated method stub
		return accountDB.get(no);
	}

	@Override
	public List<Account> findByMemberId(String memberId) {
		List<Account> alist = new ArrayList<>();
		for (Account a : accountDB.values()) {
	        if (a.getMemberId() != null && a.getMemberId().equals(memberId)) {
	            alist.add(a);
	        }
	    }
		if (alist.isEmpty()) {
	        return null;
	    }
		return alist;
	}

	@Override
	public boolean update(Account a) {
		// TODO Auto-generated method stub
		accountDB.put(a.getNo(), a);
		return true;
	}

	@Override
	public boolean delete(Account a) {
		// TODO Auto-generated method stub
		accountDB.remove(a.getNo());
		return true;
	}

	@Override
	public boolean existByNo(int no) {
		// TODO Auto-generated method stub
		return false;
	}

}
