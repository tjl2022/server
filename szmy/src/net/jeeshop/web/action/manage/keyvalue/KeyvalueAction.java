package net.jeeshop.web.action.manage.keyvalue;import net.jeeshop.core.BaseAction;import net.jeeshop.core.oscache.FrontCache;import net.jeeshop.services.manage.keyvalue.KeyvalueService;import net.jeeshop.services.manage.keyvalue.bean.Keyvalue;public class KeyvalueAction extends BaseAction<Keyvalue> {	private static final long serialVersionUID = 1L;	private KeyvalueService keyvalueService;	private FrontCache frontCache;	public FrontCache getFrontCache() {		return frontCache;	}	public void setFrontCache(FrontCache frontCache) {		this.frontCache = frontCache;	}	public KeyvalueService getKeyvalueService() {		return keyvalueService;	}	@Override	protected void selectListAfter() {		pager.setPagerUrl("keyvalue!selectList.action");	}	public void setKeyvalueService(KeyvalueService keyvalueService) {		this.keyvalueService = keyvalueService;	}	@Override	public Keyvalue getE() {		return this.e;	}	@Override	public void prepare() throws Exception {		if (this.e == null) {			this.e = new Keyvalue();		}		super.initPageSelect();	}	@Override	public void insertAfter(Keyvalue e) {		e.clear();	}	@Override	public String insert() throws Exception {		super.insert();//		KeyValueHelper.load(getPager().getList());		frontCache.loadKeyValue();//		return selectList();		return super.selectAllList;	}	@Override	public String update() throws Exception {		super.update();//		KeyValueHelper.load(getPager().getList());		frontCache.loadKeyValue();		return selectList();	}	}