package net.jeeshop.services.manage.sms.bean;import java.io.Serializable;import net.jeeshop.core.dao.page.PagerModel;public class Sms extends PagerModel implements Serializable {	private static final long serialVersionUID = 1L;	private String id;	private String phone;	private String content;	private String sendTime;	private String type;	private String returnCode;	private String sendStatus;	@Override	public void clear() {		super.clear();		id = null;		phone = null;		content = null;		sendTime = null;		type = null;		returnCode = null;		sendStatus = null;	}	@Override	public String getId() {		return id;	}	@Override	public void setId(String id) {		this.id = id;	}	public String getPhone() {		return phone;	}	public void setPhone(String phone) {		this.phone = phone;	}	public String getContent() {		return content;	}	public void setContent(String content) {		this.content = content;	}	public String getSendTime() {		return sendTime;	}	public void setSendTime(String sendTime) {		this.sendTime = sendTime;	}	public String getType() {		return type;	}	public void setType(String type) {		this.type = type;	}	public String getReturnCode() {		return returnCode;	}	public void setReturnCode(String returnCode) {		this.returnCode = returnCode;	}	public String getSendStatus() {		return sendStatus;	}	public void setSendStatus(String sendStatus) {		this.sendStatus = sendStatus;	}}