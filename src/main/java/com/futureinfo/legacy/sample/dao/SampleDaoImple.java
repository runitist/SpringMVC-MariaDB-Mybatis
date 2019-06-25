package com.futureinfo.legacy.sample.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("sampleDao")
public class SampleDaoImple implements SampleDao {

	@Autowired
	@Qualifier("testMariaDBSqlSession")
	protected SqlSessionTemplate sqlSession;//이 객체가 mapper xml파일의 sql을 읽어와 JDBC로 실행한다.
	
	@Override
	public String selectSampleData() throws Exception {
		return sqlSession.selectOne("SampleMapper.selectSampleTable");
	}

}
