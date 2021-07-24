package com.example.springrest2.controller.dto;

import com.example.springrest2.component.Order;
import com.example.springrest2.component.Product;

import java.math.BigDecimal;

public class CartEntryDto {

    private Long id;
    private Order order;
    private Product product;
    private Long quantity;
    private BigDecimal acquirePrice;

    public CartEntryDto() {
    }

    public Long getId() {
        return this.id;
    }

    public Order getOrder() {
        return this.order;
    }

    public Product getProduct() {
        return this.product;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public BigDecimal getAcquirePrice() {
        return this.acquirePrice;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setAcquirePrice(BigDecimal acquirePrice) {
        this.acquirePrice = acquirePrice;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CartEntryDto)) return false;
        final CartEntryDto other = (CartEntryDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$order = this.getOrder();
        final Object other$order = other.getOrder();
        if (this$order == null ? other$order != null : !this$order.equals(other$order)) return false;
        final Object this$product = this.getProduct();
        final Object other$product = other.getProduct();
        if (this$product == null ? other$product != null : !this$product.equals(other$product)) return false;
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        if (this$quantity == null ? other$quantity != null : !this$quantity.equals(other$quantity)) return false;
        final Object this$acquirePrice = this.getAcquirePrice();
        final Object other$acquirePrice = other.getAcquirePrice();
        if (this$acquirePrice == null ? other$acquirePrice != null : !this$acquirePrice.equals(other$acquirePrice))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CartEntryDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $order = this.getOrder();
        result = result * PRIME + ($order == null ? 43 : $order.hashCode());
        final Object $product = this.getProduct();
        result = result * PRIME + ($product == null ? 43 : $product.hashCode());
        final Object $quantity = this.getQuantity();
        result = result * PRIME + ($quantity == null ? 43 : $quantity.hashCode());
        final Object $acquirePrice = this.getAcquirePrice();
        result = result * PRIME + ($acquirePrice == null ? 43 : $acquirePrice.hashCode());
        return result;
    }

    public String toString() {
        return "CartEntryDto(id=" + this.getId() + ", order=" + this.getOrder() + ", product=" + this.getProduct() + ", quantity=" + this.getQuantity() + ", acquirePrice=" + this.getAcquirePrice() + ")";
    }
}
