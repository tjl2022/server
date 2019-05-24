package net.jeeshop.services.front.account.dao;import net.jeeshop.core.DaoManager;import net.jeeshop.services.front.account.bean.Account;public interface AccountDao extends DaoManager<Account> {	/**	 * @param e	 * @return	 */	int selectCount(Account e);	void updatePasswordByAccount(Account acc);	void updateEmailByAccount(Account acc);	/**	 * 根据会员账号，查询会员积分	 * @param account	 * @return	 */	Account selectAccountScore(String account);	/**	 * 根据会员账号更新会员积分	 * @param acc	 */	void updateScore(Account acc);	void updateMoney(Account e);}