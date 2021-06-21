package se.junior.developer.sudokubackend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se.junior.developer.sudokubackend.dtos.AccountDto;
import se.junior.developer.sudokubackend.models.Account;

/**
 * Mapper with MapStruct
 * https://mapstruct.org/documentation/reference-guide/
 *
 * Maps the dto:information to entities
 */

@Mapper
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    Account dtoToAccount(AccountDto accountDto);
}
