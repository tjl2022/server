package net.jeeshop.services.front.express.dao.impl;import java.util.List;import net.jeeshop.core.dao.BaseDao;import net.jeeshop.core.dao.page.PagerModel;import net.jeeshop.services.front.express.bean.Express;import net.jeeshop.services.front.express.dao.ExpressDao;public class ExpressDaoImpl implements ExpressDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	@Override	public PagerModel selectPageList(Express e) {		return dao.selectPageList("front.express.selectPageList",				"front.express.selectPageCount", e);	}	@Override	public List selectList(Express e) {		return dao.selectList("front.express.selectList", e);	}	@Override	public Express selectOne(Express e) {		return (Express) dao.selectOne("front.express.selectOne", e);	}	@Override	public int delete(Express e) {		return dao.delete("front.express.delete", e);	}	@Override	public int update(Express e) {		return dao.update("front.express.update", e);	}	public int deletes(String[] ids) {		Express e = new Express();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	@Override	public int insert(Express e) {		return dao.insert("front.express.insert", e);	}	@Override	public int deleteById(int id) {		return dao.delete("front.express.deleteById", id);	}	@Override	public Express selectById(String id) {		return (Express) dao.selectOne("front.express.selectById", id);	}}