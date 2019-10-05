package chatProject.member.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import chatProject.member.vo.MemberVo;

public class MemberDao extends SqlSessionDaoSupport{
	
	public List<MemberVo> getMemberInfo() throws Exception{
		return getSqlSession().selectList("memberDao.getMemberInfo");
	}

}
