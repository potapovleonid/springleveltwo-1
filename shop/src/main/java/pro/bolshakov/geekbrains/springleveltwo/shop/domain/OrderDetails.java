package pro.bolshakov.geekbrains.springleveltwo.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetails {
    private Long id;
    private Order order;
    private Product product;
    private BigDecimal amount;
    private BigDecimal price;
}
