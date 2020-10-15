package bd;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import pojo.Cidade;

public class CidadeDao {
	
	public LinkedList<Cidade> listar() {
		Conexao con = new Conexao();
		LinkedList<Cidade> lista = new LinkedList<Cidade>();
		try {
			String sql = "SELECT * FROM cidade";
			Statement instrucao = con.getConexao().createStatement();
			ResultSet res = instrucao.executeQuery(sql);
			while(res.next()) {
				Cidade c = new Cidade();
				c.setNome(res.getString("nome"));
				c.setIdcidade(res.getInt("idcidade"));
				lista.add(c);
			}
			res.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.desconecta();
		
		return lista;
	}
}
