package com.sumant.learning.scsxrateconsumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="exchangeraterecord")
@JsonIgnoreProperties(value={ "id" }, allowGetters=true)
public class ExchangeRateRecord {

    @Id
    String id;
    String fromCurrency;
    String toCurrency;
    Double rate;
}
