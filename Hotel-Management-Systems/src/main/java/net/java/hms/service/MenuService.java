package net.java.hms.service;

import java.util.List;

import net.java.hms.model.Menu;

public interface MenuService 
{
	
	List<Menu> getAllMenu();
	void saveMenu(Menu menu);
	Menu getMenuById(long id);
	void deleteMenuById(long id);
}
