package io.github.brenodelima.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class CotacaoDolarDTO {
    private Double valorDolar;
    private LocalDate cotacaoDolar;
}
