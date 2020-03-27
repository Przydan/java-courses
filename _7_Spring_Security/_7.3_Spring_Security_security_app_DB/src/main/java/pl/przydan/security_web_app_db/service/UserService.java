package pl.przydan.security_web_app_db.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import pl.przydan.security_web_app_db.entity.User;
import pl.przydan.security_web_app_db.user.CrmUser;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
