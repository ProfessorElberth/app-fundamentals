package br.com.jdbc.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jdbc.dao.UsuarioDao;
import br.com.jdbc.negocio.Usuario;

public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UsuarioController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("lista", UsuarioDao.obterLista());
		request.getRequestDispatcher("usuarioLista.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario(request.getParameter("email"), request.getParameter("senha"));
		
		UsuarioDao.incluir(usuario);
		
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}
}