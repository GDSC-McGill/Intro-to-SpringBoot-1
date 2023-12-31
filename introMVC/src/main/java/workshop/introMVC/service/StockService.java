package workshop.introMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import workshop.introMVC.model.Stock;
import workshop.introMVC.repository.StockRepository;

@Service
public class StockService {
    
    @Autowired
    private StockRepository stockRepository;

    public Stock viewStock(String ticker) {
        return stockRepository.viewStock(ticker);
    }
}
