package net.jeeshop.services.manage.spec.impl;import net.jeeshop.core.ServersManager;import net.jeeshop.services.manage.spec.SpecService;import net.jeeshop.services.manage.spec.bean.Spec;import net.jeeshop.services.manage.spec.dao.SpecDao;public class SpecServiceImpl extends ServersManager<Spec> implements		SpecService {	private SpecDao specDao;	public void setSpecDao(SpecDao specDao) {		this.specDao = specDao;	}	@Override	public void deleteById(String id) {		// TODO Auto-generated method stub		specDao.deleteById(Integer.valueOf(id));	}	@Override	public void updateStock(Spec spec) {		// TODO Auto-generated method stub		specDao.updateStock(spec);	}}