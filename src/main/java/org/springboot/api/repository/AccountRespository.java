package org.springboot.api.repository;

import org.springboot.api.entity.AccountEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRespository<P> extends CrudRepository<AccountEntity, Integer> {


}
