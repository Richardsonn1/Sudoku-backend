package se.junior.developer.sudokubackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long map;
    private double finishTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Account account;
}
