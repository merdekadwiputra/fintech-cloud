package ramdan.project.fintech.transfer.mapper;

import org.mapstruct.Mapper;
import ramdan.project.fintech.transfer.domain.Account;
import ramdan.project.fintech.transfer.dto.AccountDto;

@Mapper(componentModel = "spring")
public interface AccountMapper extends EntityMapper<AccountDto, Account> {

    default Account fromNumber(final String id) {

        if (id == null) {
            return null;
        }

        return Account.builder().number(id).build();
    }
}
