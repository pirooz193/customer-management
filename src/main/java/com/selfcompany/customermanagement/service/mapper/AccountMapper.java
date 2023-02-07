package com.selfcompany.customermanagement.service.mapper;

import com.selfcompany.customermanagement.domain.Account;
import com.selfcompany.customermanagement.domain.dto.AccountDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
//@Component
public interface AccountMapper {
    Account toEntity(AccountDTO accountDTO);

    AccountDTO toDto(Account account);
}
