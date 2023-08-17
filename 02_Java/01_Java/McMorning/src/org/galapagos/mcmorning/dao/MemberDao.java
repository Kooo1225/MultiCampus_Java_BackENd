package org.galapagos.mcmorning.dao;

import java.util.List;

import org.galapagos.mcmorning.vo.Member;

public interface MemberDao {

    List<Member> getMemberList(); // @Getter

    void add(Member m);

    // userid로 찾기
    Member findByUserid(String userid);

    // 수정
    Member update(Member m);

    // 삭제
    Member delete(String userid);

    List<Member> searchByName(String name);


    void save() throws Exception;

    void load() throws Exception;

}