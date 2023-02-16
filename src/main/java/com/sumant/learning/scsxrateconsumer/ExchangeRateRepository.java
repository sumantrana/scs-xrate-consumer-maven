package com.sumant.learning.scsxrateconsumer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRateRecord, String> {
}
