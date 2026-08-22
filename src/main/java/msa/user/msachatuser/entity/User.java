package msa.user.msachatuser.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String loginId;

    private String password;

    private String username;

    @Builder
    public User(String loginId, String password, String username) {
        this.loginId = loginId;
        this.password = password;
        this.username = username;
    }

}
