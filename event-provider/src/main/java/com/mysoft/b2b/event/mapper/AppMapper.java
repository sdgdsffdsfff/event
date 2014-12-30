/**
 * Copyright mysoft Limited (c) 2014. All rights reserved.
 * This software is proprietary to and embodies the confidential
 * technology of mysoft Limited. Possession, use, or copying
 * of this software and media is authorized only pursuant to a
 * valid written license from mysoft or an authorized sublicensor.
 */
package com.mysoft.b2b.event.mapper;

import java.util.List;

import com.mysoft.b2b.event.api.app.App;
import com.mysoft.b2b.event.api.app.AppCriteria;

/**
 * chengp: Change to the actual description of this class
 * @version   Revision History
 * <pre>
 * Author     Version       Date        Changes
 * chengp    1.0           2014年8月28日     Created
 *
 * </pre>
 * @since b2b 2.0.0
 */

public interface AppMapper {

	public void insert(App app) ;
	
    public void update(App app) ;
    
    public void delete(String appId) ;
    
    public App get(String appId);
    
    public List<App> getAppList(AppCriteria criteria) ;
    
    public int getAppCount(AppCriteria criteria);
}
