package mvc.model;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.CidadeDao;
import pojo.Cidade;

public class ListarCidade {
	
	public void executar(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			CidadeDao cdao = new CidadeDao();
			String cidades = "";
			
			for (Cidade c : cdao.listar()) {
				cidades += c.getNome() + "\n";
				
			}
			request.setAttribute("cidades", cidades);
			
			RequestDispatcher rd = request.getRequestDispatcher("listacidades.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
