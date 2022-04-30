package net.java.hms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.hms.model.Menu;
import net.java.hms.repository.MenuRepository;
import net.java.hms.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService
{
	@Autowired
	private MenuRepository menuRepository;
	
	@Override
	public List<Menu> getAllMenu() 
	{
		return menuRepository.findAll();
	
	}

	@Override
	public void saveMenu(Menu menu) {
		this.menuRepository.save(menu);
		
	}

	@Override
	public Menu getMenuById(long id) {
		{
			 Optional < Menu > optional = menuRepository.findById(id);
		        Menu menu = null;
		        if (optional.isPresent()) {
		           menu = optional.get();
		        } else {
		            throw new RuntimeException(" food Item not found for id :: " + id);
		        }
		        return menu;		
		}
	}
	
	@Override
    public void deleteMenuById(long id) {
        this.menuRepository.deleteById(id);
    }

}
