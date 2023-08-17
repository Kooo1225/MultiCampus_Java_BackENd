package org.galapagos.mcmorning.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.galapagos.mcmorning.vo.Member;
public class MemberMapDao implements MemberDao {
    private Map<String, Member> memberMap; // Member를 Map으로 관리
    public MemberMapDao() {
        memberMap = new HashMap<String, Member>();
        memberMap.put("Test1",new Member("Test1", "1234", "Tester1", "Test1@naver.com"));
        memberMap.put("Test2",new Member("Test2", "1234", "Tester2", "Test2@naver.com"));
        memberMap.put("Test3",new Member("Test3", "1234", "Tester3", "Test3@naver.com"));
        memberMap.put("Test4",new Member("Test4", "1234", "Tester4", "Test4@naver.com"));
    }
    @Override
    public List<Member> getMemberList() {
        // TODO Auto-generated method stub
        return new ArrayList<>(memberMap.values());
    }
    @Override
    public void add(Member m) {
        memberMap.put(m.getUserid(),m);
    }
    @Override
    public Member findByUserid(String userid) {
        // TODO Auto-generated method stub
        return memberMap.get(userid);
    }
    @Override
    public Member update(Member m) {
        // TODO Auto-generated method stub
        return memberMap.put(m.getUserid(), m);
    }
    @Override
    public Member delete(String userid) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Member> searchByName(String name) {
        List<Member> list = new ArrayList<>();

        for ( Member m : memberMap.values() ) {
            if ( m.getName().contains(name) ) {
                list.add(m);
            }
        }
        return list;
    }

    @Override
    public void save() {

    }

    @Override
    public void load() {

    }
}