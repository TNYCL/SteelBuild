package com.steel.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.steel.Main;
import com.steel.user.module.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

public class Spring {

    private MongoClient mongoClient;
    private MongoTemplate mongoTemplate;

    public Spring() {
        if(createConnection()) System.out.println("Mongo Spring Aktif!");
        else System.out.println("Mongo Spring Deaktif!");
    }

    @Bean
    public boolean createConnection() {
        try {
            mongoClient = MongoClients.create("mongodb://TNYCL:Tunabir6796.@185.255.94.243:27017/?authSource=admin");
            mongoTemplate = new MongoTemplate(mongoClient, "admin");
            return true;
        } catch(Exception ex) {
            return false;
        }
    }

    @Bean
    public MongoClient mongoClient() {
        return mongoClient;
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return mongoTemplate;
    }

    public User getUser(String key, String value) {
        return this.mongoTemplate().findOne(Query.query(Criteria.where(key).is(value)), User.class);
    }

    public void setUser(User user) {
        this.mongoTemplate().insert(user);
    }

    public void updateUser(String where, Object is, String key, Object value) {
        Query query = new Query();
        query.addCriteria(Criteria.where(where).is(is));
        Update update = new Update();
        update.set(key, value);
        Main.getSpring().mongoTemplate().updateFirst(query, update, User.class);
    }


    public List<User> getAllUser() {
        return mongoTemplate().findAll(User.class);
    }

}
