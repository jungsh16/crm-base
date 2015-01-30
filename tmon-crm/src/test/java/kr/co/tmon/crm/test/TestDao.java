package kr.co.tmon.crm.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:test/spring/applicationContext.xml", "classpath:test/spring/dispatcher-servlet.xml" })
public class TestDao {
	@Autowired
	private SqlSession sqlSession;

	@Test
	public void test() {
		System.out.println("test");
		List<Object> selectList = sqlSession.selectList("kr.co.tmon.test.db.mapper.Test.getDatabaseList");
		System.out.println(selectList);
	}
}
