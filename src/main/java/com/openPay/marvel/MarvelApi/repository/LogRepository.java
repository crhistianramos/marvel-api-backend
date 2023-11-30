package com.openPay.marvel.MarvelApi.repository;


import com.openPay.marvel.MarvelApi.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogRepository extends JpaRepository<Log, Long> {
    List<Log> findAllByOrderByIdDesc();

}
