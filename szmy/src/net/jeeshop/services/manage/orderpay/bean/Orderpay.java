package net.jeeshop.services.manage.orderpay.bean;import java.io.Serializable;public class Orderpay extends net.jeeshop.services.common.Orderpay implements Serializable {	private static final long serialVersionUID = 1L;	public static final String orderpay_paymethod_alipayescow = "alipayescow";//支付宝纯担保交易接口		private String startDate;	private String endDate;			public String getStartDate() {		return startDate;	}	public void setStartDate(String startDate) {		this.startDate = startDate;	}	public String getEndDate() {		return endDate;	}	public void setEndDate(String endDate) {		this.endDate = endDate;	}	@Override	public void clear() {		super.clear();	}}