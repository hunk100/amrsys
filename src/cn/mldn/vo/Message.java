package cn.mldn.vo;

import java.io.Serializable;
import java.util.Date;


@SuppressWarnings("serial")
public class Message implements Serializable {
	private Integer mid ;
	private String title ;
	private Date pubdate ;
	private String content ;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
