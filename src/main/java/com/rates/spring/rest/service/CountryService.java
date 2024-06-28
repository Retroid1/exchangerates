package com.rates.spring.rest.service;

import com.rates.spring.rest.dto.CountryDTO;
import com.rates.spring.rest.entity.CountryEntity;
import com.rates.spring.rest.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;

    public CountryEntity create(CountryDTO dto){
        CountryEntity country = CountryEntity.builder()
                .name(dto.getName())
                .numCode(dto.getNumCode())
                .charCode(dto.getCharCode())
                .build();
        return countryRepository.save(country);
    }

    public List<CountryEntity> readAll(){
        return countryRepository.findAll();
    }

    public CountryEntity update(CountryEntity country){
        return countryRepository.save(country);
    }

    public void delete(UUID id){
        countryRepository.deleteById(id);
    }
}