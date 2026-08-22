package msa.user.msachatuser.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SignupRequest {

    private final String loginId;

    private final String password;

    private final String username;

}
