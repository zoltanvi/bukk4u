package hu.rendszerfejlesztes.bookshopbackend.dao.entities;

import static javax.persistence.GenerationType.IDENTITY;


import javax.persistence.*;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer orderId;
	private String email;
	private Integer cartTotal;
	private Integer total;
	private Integer deliveryPrice;

	@Enumerated(value = EnumType.STRING)
	private DeliveryMethod deliveryMethod;

	@Enumerated(value = EnumType.STRING)
	private PaymentMethod paymentMethod ;

	@Enumerated(value = EnumType.STRING)
	private OrderStatus status;

	@OneToOne
	private Cart cart;

	public Order(){}

	public Order(Integer orderId, String email, Integer cartTotal, Integer total, Integer deliveryPrice,
				 DeliveryMethod deliveryMethod, PaymentMethod paymentMethod, OrderStatus status, Cart cart) {
		this.orderId = orderId;
		this.email = email;
		this.cartTotal = cartTotal;
		this.total = total;
		this.deliveryPrice = deliveryPrice;
		this.deliveryMethod = deliveryMethod;
		this.paymentMethod = paymentMethod;
		this.status = status;
		this.cart = cart;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(Integer cartTotal) {
		this.cartTotal = cartTotal;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getDeliveryPrice() {
		return deliveryPrice;
	}

	public void setDeliveryPrice(Integer deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Order{" +
				"orderId=" + orderId +
				", email='" + email + '\'' +
				", cartTotal=" + cartTotal +
				", total=" + total +
				", deliveryPrice=" + deliveryPrice +
				", deliveryMethod=" + deliveryMethod +
				", paymentMethod=" + paymentMethod +
				", status=" + status +
				", cart=" + cart +
				'}';
	}
}
