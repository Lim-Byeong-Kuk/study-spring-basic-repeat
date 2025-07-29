package hello.study_spring_basic_repeat.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
