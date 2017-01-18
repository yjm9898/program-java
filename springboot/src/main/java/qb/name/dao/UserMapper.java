package qb.name.dao;

import org.apache.ibatis.annotations.Param;
import qb.name.entities.User;

/**
 * @author qb
 * @description:
 * @date 2017-1-15 16:30
 */
public interface UserMapper {

    public void insertUser(@Param("user") User user);

    public User selectUserByName(@Param("name") String name);
}
