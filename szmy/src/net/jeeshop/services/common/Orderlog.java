package net.jeeshop.services.common;import java.io.Serializable;import net.jeeshop.core.dao.page.PagerModel;public class Orderlog extends PagerModel implements Serializable {	private static final long serialVersionUID = 1L;	private String id;	private String orderid;	private String account;	private String createdate;	private String content;	private String accountType;//w:会员;m:后台管理人员;		public static final String orderlog_accountType_w = "w";//日志类型：前台	public static final String orderlog_accountType_m = "m";//日志类型：后台	public static final String orderlog_accountType_p = "p";//日志类型：支付系统回调	public Orderlog() {		super();	}	public Orderlog(String orderid) {		super();		this.orderid = orderid;	}	@Override	public void clear() {		super.clear();		id = null;		orderid = null;		account = null;		createdate = null;		content = null;		accountType = null;	}	@Override	public String getId() {		return id;	}	@Override	public void setId(String id) {		this.id = id;	}	public String getAccount() {		return account;	}	public void setAccount(String account) {		this.account = account;	}	public String getCreatedate() {		return createdate;	}	public void setCreatedate(String createdate) {		this.createdate = createdate;	}	public String getContent() {		return content;	}	public void setContent(String content) {		this.content = content;	}	public String getOrderid() {		return orderid;	}	public void setOrderid(String orderid) {		this.orderid = orderid;	}	public String getAccountType() {		return accountType;	}	public void setAccountType(String accountType) {		this.accountType = accountType;	}	}