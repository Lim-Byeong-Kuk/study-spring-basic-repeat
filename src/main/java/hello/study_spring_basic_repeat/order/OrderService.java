package hello.study_spring_basic_repeat.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
