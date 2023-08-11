package org.galapagos.mcmorning.service;

import org.galapagos.mcmorning.cil.Input;
import org.galapagos.mcmorning.dao.MemberDao;
import org.galapagos.mcmorning.exception.UseridCountOverException;
import org.galapagos.mcmorning.vo.Member;

import java.util.Scanner;

public class MemberService {
    MemberDao dao = new MemberDao();

    public void singUP(){
        // Member 정보 입력
        // id 중복 체크

        try {
            Member member = inputMember();
        }
        catch (UseridCountOverException e) {
            System.out.println(e.getMessage());
        }
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
}
