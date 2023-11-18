package moreira.jeffrei.jsmchocolateservice.bootstrap;

import moreira.jeffrei.jsmchocolateservice.domain.Chocolate;
import moreira.jeffrei.jsmchocolateservice.repositories.ChocolateRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by jeffr on 2023-11-17
 */
@Component
public class ChocolateLoader implements CommandLineRunner {

    private final ChocolateRepository chocolateRepository;

    public ChocolateLoader(ChocolateRepository chocolateRepository) {
        this.chocolateRepository = chocolateRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadChocolateObjects();
    }

    private void loadChocolateObjects() {
        if (chocolateRepository.count() == 0) {
            chocolateRepository.save((Chocolate.builder()
                    .name("Cacau Show")
                    .style("Dark")
                    .quantityToFabricate(200)
                    .minOnHand(15)
                    .code(12300001L)
                    .price(new BigDecimal("12.95"))
                    .build()));
            chocolateRepository.save((Chocolate.builder()
                    .name("Garoto")
                    .style("Milk")
                    .quantityToFabricate(200)
                    .minOnHand(15)
                    .code(12300002L)
                    .price(new BigDecimal("10.95"))
                    .build()));
        }

        //System.out.println("Loaded Chocolates: " + chocolateRepository.count());
    }
}
