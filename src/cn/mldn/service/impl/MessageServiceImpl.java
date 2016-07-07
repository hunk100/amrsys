package cn.mldn.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import cn.mldn.service.IMessageService;
import cn.mldn.vo.Message;

@Service
public class MessageServiceImpl implements IMessageService {
	@Resource
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public boolean add(Message vo) throws Exception {
		return this.sqlSessionFactory.openSession().insert(
				"cn.mldn.mapping.MessageNS.doCreate", vo) > 0;
	}

	@Override
	public List<Message> list(String column, String keyWord, int currentPage,
			int lineSize) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if (!"".equals(keyWord)) { // 现在不是空
			map.put("keyWord", "%" + keyWord + "%");
		}
		map.put("column", column);
		map.put("start", (currentPage - 1) * lineSize);
		map.put("lineSize", lineSize);
		return this.sqlSessionFactory.openSession().selectList(
				"cn.mldn.mapping.MessageNS.findAllSplit", map);
	}

}
