package com.example.jaz_s27275_nbp;

import com.example.jaz_s27275_nbp.models.NbpData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbRepository extends JpaRepository<NbpData, Integer> {

}
