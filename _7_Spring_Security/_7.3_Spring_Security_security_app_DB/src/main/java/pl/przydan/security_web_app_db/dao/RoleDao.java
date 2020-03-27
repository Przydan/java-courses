package pl.przydan.security_web_app_db.dao;


import pl.przydan.security_web_app_db.entity.Role;

public interface RoleDao {

    Role findRoleByName(String theRoleName);

}
