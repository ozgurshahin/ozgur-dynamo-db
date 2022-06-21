package com.example.ozgurdynamodb.repositories;

import com.example.ozgurdynamodb.entities.TestLogs;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableScan
@Repository
public interface TestLogsRepository extends CrudRepository<TestLogs, String> {
    TestLogs findFirstByTransactionId(String transactionId);

    List<TestLogs> findAllByTransactionId(String transactionId);
}
