package com.futureinfo.legacy.sample.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.futureinfo.legacy.sample.dto.SampleDto;

@Repository("sampleDao")
public class SampleDaoImple implements SampleDao {

	@Autowired
	protected SqlSessionTemplate sqlSession;
	
	@Override
	public String selectSampleData() throws Exception {
		return sqlSession.selectOne("SampleMapper.selectSampleTable");
	}

}
