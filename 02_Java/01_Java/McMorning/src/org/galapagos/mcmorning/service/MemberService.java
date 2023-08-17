package org.galapagos.mcmorning.service;

import org.galapagos.mcmorning.cil.Input;
import org.galapagos.mcmorning.dao.MemberDao;
import org.galapagos.mcmorning.dao.MemberListDao;
import org.galapagos.mcmorning.dao.MemberMapDao;
import org.galapagos.mcmorning.exception.UseridCountOverException;
import org.galapagos.mcmorning.vo.Member;

import java.util.List;

public class MemberService {
    MemberDao dao;

    public MemberService(){}

    public MemberService(MemberListDao dao){
        this.dao = dao;
    }

    public MemberService(MemberMapDao dao){
        this.dao = dao;
    }

    public void singUP(){
        // Member 정보 입력
        // id 중복 체크
        Member member;
        try {
            member = inputMember();
            dao.add(member);
        }
        catch (UseridCountOverException e) {
            System.out.println(e.getMessage());
        }
    }

    public Member login() {
        System.out.println("[ Login ]");
        String userId = Input.read("User ID : ");
        String password = Input.read("Password : ");

        Member m = dao.findByUserid(userId);
        // 사용자 ID가 존재하는지 검사
        if ( m != null ) {
            // 그 다음 PW가 맞는지 검사
            if (password.equals(m.getPassword())) {
                return m;
            }
        }
        // 로그인 실패 시 null 리턴
        return null;
    }

    public Member inputMember() throws UseridCountOverException {
        String userid = inputUserid();
        String password = Input.read("Password : ");
        String name = Input.read("Name : ");
        String email = Input.read("Email : ");

        return new Member(userid, password, name, email);

    }

    public String inputUserid() throws UseridCountOverException {
        String userid = "";

        for(int i = 0; i < 3; i++) {
            userid = Input.read("Userid : ");
            Member m = dao.findByUserid(userid);

            if (m != null) {
                System.out.println(userid + " is Duplicated!");
            } else {
                return userid;
            }
        }
        throw new UseridCountOverException();
    }

    public void searchByName() {
        System.out.println("[ Search for Name ]");
        String keyword = Input.read("KeyWord : ");

        List<Member> list = dao.searchByName(keyword);
        System.out.println("Search Result : " + list.size());
        for ( Member m : list ) {
            System.out.println(m);
        }
    }
}
