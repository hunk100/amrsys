package cn.mldn.service;

import java.util.List;

import cn.mldn.vo.Message;

public interface IMessageService {
	public boolean add(Message vo) throws Exception;
 
	public List<Message> list(String column, String keyWord, int currentPage,
			int lineSize) throws Exception;
}
