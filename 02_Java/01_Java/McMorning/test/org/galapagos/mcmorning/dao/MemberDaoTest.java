package org.galapagos.mcmorning.dao;

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
        MemberListDao dao = new MemberListDao();

        List<Member> list = dao.getMemberList();
        for ( Member m  : list ) {
            System.out.println(m);
        }
    }

    static void testAdd() {
        MemberListDao dao = new MemberListDao();
        List<Member> list = dao.getMemberList();

        Member m2 = new Member("AddTest1", "1234", "AddTester1", "AddTester1@naver.com");
        dao.add(m2);

        assert list.size() == 4 : "Add Fail";
    }

    static void testFindByUserid() {
        MemberListDao dao = new MemberListDao();

        String userid = "Test4";
        Member m = dao.findByUserid(userid);

        assert m != null && userid.equals(m.getUserid()) : userid + " Find Fail";

        userid = "donut";
        m = dao.findByUserid(userid);

        assert m == null : "Find Error";
    }

    static void testUpdate() {
        MemberListDao dao = new MemberListDao();

        Member m = new Member("Test3", "1234", "UpdateTester1", "UpdateTester1@naver.com");
        Member m2 = dao.update(m);

        System.out.println(m2);

        assert m2 != null && m == m2 : "Update Fail";
    }

    static void testDelete() {
        MemberListDao dao = new MemberListDao();

        Member m = dao.delete("Test3");

        assert m != null && m.getUserid().equals("Test3") : "Del Fail";
    }

}
