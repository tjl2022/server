package net.jeeshop.services.manage.oss.dao.impl;import java.util.List;import net.jeeshop.core.dao.BaseDao;import net.jeeshop.core.dao.page.PagerModel;import net.jeeshop.services.manage.oss.bean.Oss;import net.jeeshop.services.manage.oss.dao.OssDao;public class OssDaoImpl implements OssDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	@Override	public PagerModel selectPageList(Oss e) {		return dao.selectPageList("manage.oss.selectPageList", "manage.oss.selectPageCount",				e);	}	@Override	public List selectList(Oss e) {		return dao.selectList("manage.oss.selectList", e);	}	@Override	public Oss selectOne(Oss e) {		return (Oss) dao.selectOne("manage.oss.selectOne", e);	}	@Override	public int delete(Oss e) {		return dao.delete("manage.oss.delete", e);	}	@Override	public int update(Oss e) {		return dao.update("manage.oss.update", e);	}	public int deletes(String[] ids) {		Oss e = new Oss();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	@Override	public int insert(Oss e) {		return dao.insert("manage.oss.insert", e);	}	@Override	public int deleteById(int id) {		return dao.delete("manage.oss.deleteById", id);	}	@Override	public Oss selectById(String id) {		return (Oss) dao.selectOne("manage.oss.deleteById.selectById", id);	}}