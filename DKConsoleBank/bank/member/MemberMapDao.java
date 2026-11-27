package bank.member;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberMapDao implements MemberDao{
	
	Map<String, Member> memberDB = new HashMap<String, Member>();
	private final String dbfile = "memberDB.txt";
	
	public MemberMapDao() {

		loadMemberDB();
	}
	
	private void saveMemberDB() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dbfile))) {
            // 직렬화
            oos.writeObject(memberDB);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	@SuppressWarnings("unchecked")
	public void loadMemberDB() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dbfile))) {
            // 역직렬화
            memberDB = (Map<String, Member>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
		}
	}
	
	@Override
	public boolean save(Member m) {
		memberDB.put(m.getId(), m);
		return true;
	}

	@Override
	public List<Member> findAll() {
		if (!memberDB.isEmpty()) {
			List<Member> mlist = new ArrayList<>();
			for (Member m : memberDB.values()) {
				mlist.add(m);
			}
			return mlist;
		}
		return null;
	}

	@Override
	public Member findById(String id) {
		return memberDB.get(id);
	}

	@Override
	public boolean update(Member m) {
//		return save(m);
		memberDB.put(m.getId(), m);
		saveMemberDB();
		return true;
	}

	@Override
	public boolean delete(Member m) {
		memberDB.remove(m.getId());
		saveMemberDB();
		return true;
	}

	@Override
	public boolean existById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
