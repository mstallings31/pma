package us.stallings.pma.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import us.stallings.pma.entities.UserAccount;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {

}
