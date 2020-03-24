package org.example.repo;

import org.example.model.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BaseRepository extends JpaRepository<Base, String> {
    @Query("SELECT b FROM Base b where b.middle.target.field = :value")
    List<Base> customQuery(String value);
}
