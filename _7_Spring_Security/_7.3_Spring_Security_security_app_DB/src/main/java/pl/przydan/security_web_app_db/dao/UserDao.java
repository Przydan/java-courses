package pl.przydan.security_web_app_db.dao;


import pl.przydan.security_web_app_db.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User user);

}
