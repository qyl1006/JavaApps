package cn.wolfcode.shop.web.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wolfcode.shop.domain.Product;
import cn.wolfcode.shop.service.IProductService;
import cn.wolfcode.shop.service.impl.ProductServiceImpl;
import cn.wolfcode.shop.util.StringUtil;

@WebServlet("/product")
public class ProductServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private IProductService productService;
	
	public void init() throws ServletException {
		productService = new ProductServiceImpl();
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String cmd = req.getParameter("cmd");
		if("delete".equals(cmd)){
			delete(req, resp);
		}else if("edit".equals(cmd)){
			edit(req, resp);
		}else if("saveOrUpdate".equals(cmd)){
			saveOrUpdate(req, resp);
		}else{
			list(req, resp);
		}
		
	}
	protected void list(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Product> listAll = productService.listAll();
		req.setAttribute("products", listAll);
		
		req.getRequestDispatcher("/WEB-INF/views/product/list.jsp").forward(req, resp);
		
	}
	protected void delete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		productService.delete(Long.valueOf(req.getParameter("id")));
		
		resp.sendRedirect("/product");
		
	}
	protected void edit(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		String sid = req.getParameter("id");
		if(StringUtil.hasLeng(sid)){
			Product product = productService.get(Long.valueOf(sid));
			req.setAttribute("p", product);
		}
		
		req.getRequestDispatcher("/WEB-INF/views/product/edit.jsp").forward(req, resp);
	}
	protected void saveOrUpdate(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String sid = req.getParameter("id");
		String productName = req.getParameter("productName");
		String dir_id = req.getParameter("dir_id");
		String salePrice = req.getParameter("salePrice");
		String supplier = req.getParameter("supplier");
		String brand = req.getParameter("brand");
		String cutoff = req.getParameter("cutoff");
		String costPrice = req.getParameter("costPrice");
		
		Product p = new Product();
		p.setProductName(productName);
		p.setDir_id(Long.valueOf(dir_id));
		p.setSupplier(supplier);
		p.setBrand(brand);
		
		if(StringUtil.hasLeng(salePrice)){
			p.setSalePrice(new BigDecimal(salePrice));
		}
		if(StringUtil.hasLeng(cutoff)){
			p.setCutoff(new BigDecimal(cutoff));
		}
		if(StringUtil.hasLeng(costPrice)){
			p.setCostPrice(new BigDecimal(costPrice));
		}
		
		if(StringUtil.hasLeng(sid)){
			p.setId(Long.valueOf(sid));
			productService.update(p);
		}else{
			productService.save(p);
		}
		
		resp.sendRedirect("/product");
	}
}
