package qb.name.dao.daoImpl;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import qb.name.dao.UserMapper;
import qb.name.entities.User;

/**
 * @author qb
 * @description:
 * @date 2017-1-15 16:15
 */
@EnableAutoConfiguration
@Service("userDao")
public class UserMapperImpl implements UserMapper {
    SqlSessionFactory sqlSessionFactory ;
    SqlSession sqlSession;

    @Override
    public void insertUser(User user) {
        // TODO
    }

    public User selectUserByName(String name){
        User user = null;
        sqlSession = sqlSessionFactory.openSession();
        try {
            user = sqlSession.getMapper(UserMapper.class).selectUserByName(name);
            sqlSession.commit();
        }catch (Exception e){
            System.out.println("查找用户异常！");
            e.printStackTrace();
        }
        return user;
    }

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
