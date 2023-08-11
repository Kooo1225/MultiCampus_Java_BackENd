package org.galapagos.mcmorning.dao;

import lombok.ToString;
import org.galapagos.mcmorning.vo.Member;

import java.util.List;

public class MemberDaoTest {
    public static void main(String[] args) {
        testRead();
        testAdd();
        testFindByUserid();
        testUpdate();
        testDelete();
    }

    static void testRead() {
        MemberDao dao = new MemberDao();

        List<Member> list = dao.getMemberList();
        for ( Member m  : list ) {
            System.out.println(m);
        }
    }

    static void testAdd() {
        MemberDao dao = new MemberDao();
        List<Member> list = dao.getMemberList();

        Member m2 = new Member("AddTest1", "1234", "AddTester1", "AddTester1@naver.com");
        dao.add(m2);

        assert list.size() == 4 : "Add Fail";
    }

    static void testFindByUserid() {
        MemberDao dao = new MemberDao();

        String userid = "Test4";
        Member m = dao.findByUserid(userid);

        assert m != null && userid.equals(m.getUserid()) : userid + " Find Fail";

        userid = "donut";
        m = dao.findByUserid(userid);

        assert m == null : "Find Error";
    }

    static void testUpdate() {
        MemberDao dao = new MemberDao();

        Member m = new Member("Test3", "1234", "UpdateTester1", "UpdateTester1@naver.com");
        Member m2 = dao.Update(m);

        System.out.println(m2);

        assert m2 != null && m == m2 : "Update Fail";
    }

    static void testDelete() {
        MemberDao dao = new MemberDao();

        Member m = dao.delete("Test3");

        assert m != null && m.getUserid().equals("Test3") : "Del Fail";
    }
}
