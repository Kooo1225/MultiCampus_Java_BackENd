package org.galapagos.mcmorning.service;

import org.galapagos.mcmorning.dao.MemberListDao;
import org.galapagos.mcmorning.dao.MemberMapDao;
import org.galapagos.mcmorning.exception.UseridCountOverException;
import org.galapagos.mcmorning.vo.Member;

public class MemberServiceTest {
    public static void main(String[] args) {
//        testInputMember();
//        testLogin();
        testSearch();
    }

    static void testInputMember(){
        MemberService service = new MemberService(new MemberMapDao());
        
        try {
            Member m = service.inputMember();
            System.out.println(m);

        }
        catch (UseridCountOverException e) {
            System.out.println(e.getMessage());
        }

    }


    static void testLogin() {
        // Dependancy Injection, 의존성 주입
        MemberService service = new MemberService(new MemberListDao());
        Member m = service.login();

        if ( m != null ){
            System.out.println("Login Success : " + m);
        }
        else {
            System.out.println("Login Fail");
        }
    }

    static void testSearch() {
        MemberService service = new MemberService(new MemberMapDao());
        service.searchByName();
    }
}
