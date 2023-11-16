package moreira.jeffrei.jsmchocolateservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import moreira.jeffrei.jsmchocolateservice.web.model.enums.ChocolateStyleEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by jeffr on 2023-11-15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChocolateDto {
    private UUID id;
    private Integer version;

    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

    private String name;
    private ChocolateStyleEnum style;

    private Long code;

    private BigDecimal price;

    private Integer quantityOnHand;
}
