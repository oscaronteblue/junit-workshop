package com.bbva.mugp.lib.rn08.impl;

import java.util.logging.Logger;

import com.bbva.mugp.lib.rn08.utils.JdbcUtils;

public abstract class MUGPRN08Abstract {

	protected static final Logger LOGGER = Logger.getLogger(MUGPRN08Abstract.class.getName());
	
	protected JdbcUtils jdbcUtils;
	
	/**
	 * @param jdbcUtils the jdbcUtils to set
	 */
	public void setJdbcUtils(JdbcUtils jdbcUtils) {
		this.jdbcUtils = jdbcUtils;
	}
}
