package net.jeeshop.services.manage.company.bean;import java.io.Serializable;/** * 卖家 *  * @author penguin *  */public class Company extends net.jeeshop.services.common.Company implements		Serializable {	private static final long serialVersionUID = 1L;	private int top;// 促销前10个	private String endtime;// 查询录入的结束时间	public int getTop() {		return top;	}	public void setTop(int top) {		this.top = top;	}	public String getEndtime() {		return endtime;	}	public void setEndtime(String endtime) {		this.endtime = endtime;	}	@Override	public void clear() {		super.clear();	}}