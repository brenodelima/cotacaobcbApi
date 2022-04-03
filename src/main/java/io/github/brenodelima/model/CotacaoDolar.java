package io.github.brenodelima.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class CotacaoDolar {
    private Double cotacaoCompra;
    private Double cotacaoVenda;
    private LocalDateTime dataHoraCotacao;
}
