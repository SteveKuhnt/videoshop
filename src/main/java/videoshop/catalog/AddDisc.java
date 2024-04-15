package videoshop.catalog;

import jakarta.validation.constraints.NotEmpty;
import videoshop.catalog.Disc.DiscType;

import static org.salespointframework.core.Currencies.EURO;

import java.math.BigDecimal;

import org.javamoney.moneta.Money;



class AddDisc {
    private final @NotEmpty String name, genre, image;
    
    private final @NotEmpty DiscType type; 
    private final @NotEmpty BigDecimal price;
    
    public AddDisc(@NotEmpty String name, @NotEmpty String genre, @NotEmpty DiscType type, @NotEmpty BigDecimal price) {
        this.name = name;
        this.image = "tig";
        this.price = price;
        this.genre = genre;
        this.type = DiscType.BLURAY;
        
    }
    
    
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public DiscType getType() {
        return type;
    }

    public Money getPrice() {
        
        return Money.of(9.99, EURO);
    }

     

    
}
