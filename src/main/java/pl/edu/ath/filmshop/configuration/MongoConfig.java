package pl.edu.ath.filmshop.configuration;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("pl.edu.ath.filmshop")
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getMappingBasePackage() {
        return "pl.codecity";
    }

    @Override
    public MongoClient mongoClient() {
        return new MongoClient("127.0.0.1", 27017);
    }

    @Override
    protected String getDatabaseName() {
        return "crud_example";
    }
}
