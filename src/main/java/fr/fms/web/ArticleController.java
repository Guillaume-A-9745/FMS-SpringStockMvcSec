package fr.fms.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.fms.dao.ArticleRepository;

@Controller
public class ArticleController {
	@Autowired
	ArticleRepository articleRepository;
	
	@GetMapping("/index")
	public String index() {
		return "articles";	//qmétode qui retourne au dispaterServlet une vue
	}
}
