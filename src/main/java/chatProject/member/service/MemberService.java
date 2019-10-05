package chatProject.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chatProject.member.vo.MemberVo;

public interface MemberService {

	public MemberVo insertMemberInfo() throws Exception;
	
	public List<MemberVo> getMemberInfo() throws Exception;
}
