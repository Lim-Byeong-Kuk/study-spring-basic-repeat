package hello.study_spring_basic_repeat.order;

import hello.study_spring_basic_repeat.discount.DiscountPolicy;
import hello.study_spring_basic_repeat.discount.FixDiscountPolicy;
import hello.study_spring_basic_repeat.member.Member;
import hello.study_spring_basic_repeat.member.MemberRepository;
import hello.study_spring_basic_repeat.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
