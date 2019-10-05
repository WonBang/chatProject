package chatProject.member.service.impl;

import java.util.List;

import chatProject.member.dao.MemberDao;
import chatProject.member.service.MemberService;
import chatProject.member.vo.MemberVo;

public class MemberServiceImpl implements MemberService {
	
	private MemberDao memberDao;
	
	@Override
	public List<MemberVo> getMemberInfo() throws Exception{
		return memberDao.getMemberInfo();
		
	}

	@Override
	public MemberVo insertMemberInfo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	};

}
