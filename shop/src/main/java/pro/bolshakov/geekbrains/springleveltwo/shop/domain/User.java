package pro.bolshakov.geekbrains.springleveltwo.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private Long id;
    private String name;
    private String password;
    private String email;
    private boolean archive;
    private Role role;
    private Bucket bucket;

}
