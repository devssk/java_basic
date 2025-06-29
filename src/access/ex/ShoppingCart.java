package access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (items.size() >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getTotalPrice());
        }
        System.out.println("총 상품 합계 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
