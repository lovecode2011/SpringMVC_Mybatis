package test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.booksales.dao.UserMapper;
import com.booksales.model.User;
import com.booksales.util.MyBatisUtil;

public class TestBookDao {
	static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }
    @Test
    public  void testAdd() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user =new User();
            user.setEmail("898979@qq.com");
            user.setPassword("111");
            user.setUsername("grgr");
            userMapper.insert2(user);
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
}
