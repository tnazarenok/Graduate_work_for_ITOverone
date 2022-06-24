package com.example.Graduate_work_for_ITOverone.repos;

import com.example.Graduate_work_for_ITOverone.models.TruboprovodnArmatura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruboprovodnArmaturaRepo extends CrudRepository<TruboprovodnArmatura, Long> {
}
