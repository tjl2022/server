package net.jeeshop.services.manage.orderdetail.impl;import java.util.List;import net.jeeshop.core.ServersManager;import net.jeeshop.services.manage.orderdetail.OrderdetailService;import net.jeeshop.services.manage.orderdetail.bean.Orderdetail;import net.jeeshop.services.manage.orderdetail.dao.OrderdetailDao;import net.jeeshop.web.action.manage.report.ReportInfo;public class OrderdetailServiceImpl extends ServersManager<Orderdetail>		implements OrderdetailService {	private OrderdetailDao orderdetailDao;	public void setOrderdetailDao(OrderdetailDao orderdetailDao) {		this.orderdetailDao = orderdetailDao;	}	@Override	public List<ReportInfo> reportProductSales(Orderdetail orderdetail) {		return orderdetailDao.reportProductSales(orderdetail);	}}