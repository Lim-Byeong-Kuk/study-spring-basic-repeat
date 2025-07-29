package hello.study_spring_basic_repeat.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
