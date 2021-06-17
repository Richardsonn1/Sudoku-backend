package se.junior.developer.sudokubackend;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEncryptableProperties
@SpringBootApplication
public class SudokuBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SudokuBackendApplication.class, args);
    }

}
