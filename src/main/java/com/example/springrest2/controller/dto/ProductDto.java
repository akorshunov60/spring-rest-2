package com.example.springrest2.controller.dto;

import com.example.springrest2.component.CartEntry;
import com.example.springrest2.component.Order;

import java.math.BigDecimal;
import java.util.List;

public class ProductDto {

    private Long id;
    private String name;
    private BigDecimal price;
    private List<Order> orders;
    private List<CartEntry> cartEntries;

    public ProductDto() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public List<CartEntry> getCartEntries() {
        return this.cartEntries;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void setCartEntries(List<CartEntry> cartEntries) {
        this.cartEntries = cartEntries;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductDto)) return false;
        final ProductDto other = (ProductDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$orders = this.getOrders();
        final Object other$orders = other.getOrders();
        if (this$orders == null ? other$orders != null : !this$orders.equals(other$orders)) return false;
        final Object this$cartEntries = this.getCartEntries();
        final Object other$cartEntries = other.getCartEntries();
        if (this$cartEntries == null ? other$cartEntries != null : !this$cartEntries.equals(other$cartEntries))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $orders = this.getOrders();
        result = result * PRIME + ($orders == null ? 43 : $orders.hashCode());
        final Object $cartEntries = this.getCartEntries();
        result = result * PRIME + ($cartEntries == null ? 43 : $cartEntries.hashCode());
        return result;
    }

    public String toString() {
        return "ProductDto(id=" + this.getId() + ", name=" + this.getName() + ", price=" + this.getPrice() + ", orders=" + this.getOrders() + ", cartEntries=" + this.getCartEntries() + ")";
    }
}
