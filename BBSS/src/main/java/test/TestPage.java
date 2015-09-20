package test;

import org.apache.ibatis.session.SqlSessionFactory;

import com.booksales.util.MyBatisUtil;

public class TestPage {
	static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }
}
