package org.galapagos.mcmorning.dao;

import lombok.Getter;
import lombok.ToString;
import org.galapagos.mcmorning.vo.Member;

import java.util.ArrayList;
import java.util.List;

@ToString
public class MemberDao {
    @Getter
    // List 이면서 Member 형식의 데이터를 받을 수 있는 memberList
    private List<Member> memberList;

    public MemberDao(){
        // 를 ArrayList 의 객체로 생성하여 4개의 값 저장
        memberList = new ArrayList<>();
        memberList.add(new Member("Test1", "1234", "Tester1", "Test1@naver.com"));
        memberList.add(new Member("Test2", "1234", "Tester2", "Test2@naver.com"));
        memberList.add(new Member("Test3", "1234", "Tester3", "Test3@naver.com"));
        memberList.add(new Member("Test4", "1234", "Tester4", "Test4@naver.com"));
    }

    public void add(Member m){
        this.memberList.add(m);
    }

    private int indexOf(String userid){
        for (int i=0; i < memberList.size(); i++){
            if(userid.equals(memberList.get(i).getUserid())) {
                return i;
            }
        }
        return -1;
    }

    public Member findByUserid(String userid) {
        int ix = indexOf(userid);

        if (ix != -1){
            return memberList.get(ix);
        }
        return null;
    }

    public Member Update(Member m){
        int ix = indexOf(m.getUserid());

        if (ix != -1){
            memberList.set(ix, m);
            return m;
        }
        else { return null; }
    }

    public Member delete(String userid){
        int ix = indexOf(userid);

        if (ix != -1){
            return memberList.remove(ix);
        }
        else {
            return null;
        }
    }
}
