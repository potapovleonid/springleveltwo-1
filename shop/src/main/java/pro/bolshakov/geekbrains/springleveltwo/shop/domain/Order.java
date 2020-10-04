package pro.bolshakov.geekbrains.springleveltwo.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    private Long id;
    private LocalDateTime created;
    private LocalDateTime changed;
    private User user;
    private BigDecimal sum;
    private String address;
    private List<OrderDetails> details;

}
