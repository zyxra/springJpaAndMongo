package sample.data.jpa.service;

//import org.springframework.data.repository.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import sample.data.jpa.domain.Account;

public interface AccountRepository extends MongoRepository<Account, Long> {

    public Account findByUsername(String username);
}
