package user.management.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class UserEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String userId;
     @Column(nullable = false)
     private String name;
     @Column(nullable = false, unique = true)
     private String userName;
     @Column(nullable = false,unique = true)
     private String email;
     @Column(nullable = false)
     private String password;

}
