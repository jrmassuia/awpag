package com.algaworks.awpag.domain.model;

import com.algaworks.awpag.domain.validation.ValidationGroups;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import jakarta.validation.groups.ConvertGroup;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Parcelamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

//    @Valid
//    @ConvertGroup(to = ValidationGroups.ClienteId.class)
//    @NotNull
    @ManyToOne
    private Cliente cliente;

//    @NotBlank
//    @Size(max = 20)
    private String descricao;

//    @NotNull
//    @Positive
    private BigDecimal valorTotal;

//    @NotNull
//    @Positive
//    @Max(value = 12)
    private Integer quantidadeParcelas;


    private OffsetDateTime dataCriacao;
}
