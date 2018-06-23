package com.exapmle.sweater.repos;

import com.exapmle.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageRepo extends CrudRepository<Message, Long> {
}
