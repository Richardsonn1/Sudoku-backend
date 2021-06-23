package se.junior.developer.sudokubackend.dtos;

import com.google.common.hash.Hashing;
import lombok.Getter;
import lombok.Setter;

import java.nio.charset.StandardCharsets;

@Getter
@Setter
public class AccountDto {

    private String username;
    private String password;

    /**
     * Temporary password hash, moving it to frontend later.
     */
    public void setPassword(String password) {
        this.password = Hashing.sha256().hashString(password, StandardCharsets.UTF_8).toString();
    }
}
