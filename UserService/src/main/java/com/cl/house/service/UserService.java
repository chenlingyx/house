package com.cl.house.service;

import java.util.List;

import com.cl.house.model.User;

public interface UserService {

	/**
	 * @param id
	 * @return
	 */
	User getUserById(Long id);

	/**
	 * @param user
	 * @return
	 */
	List<User> getUserByQuery(User user);

	/**
	 * @param email
	 * @param passwd
	 * @return
	 */
	User auth(String email, String passwd);

	/**
	 * @param user
	 * @param enableUrl
	 */
	boolean addAccount(User user, String enableUrl);

	/**
	 * @param key
	 */
	boolean enable(String key);

	/**
	 * @param token
	 * @return
	 */
	User getLoginedUserByToken(String token);

	/**
	 * @param token
	 */
	void invalidate(String token);

	/**
	 * @param user
	 * @return
	 */
	User updateUser(User user);

	/**
	 * @param key
	 * @param password
	 * @return
	 */
	User reset(String key, String password);

	/**
	 * @param key
	 * @return
	 */
	String getResetKeyEmail(String key);

	/**
	 * @param email
	 * @param url
	 */
	void resetNotify(String email, String url);
	
	
	
}
