package workshop.introMVC.model;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Portfolio {

    @Getter
    @Setter
    private List<Stock> stocks;

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private double balance;

    public Portfolio() {
        this.id = UUID.randomUUID().toString();
    }
}