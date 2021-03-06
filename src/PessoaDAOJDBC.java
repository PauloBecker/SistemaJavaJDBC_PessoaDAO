import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class PessoaDAOJDBC implements PessoaDAO{

		Scanner tc = new Scanner(System.in);
	
		private JDBCUtil banco;
		
		public PessoaDAOJDBC() {
			
			banco = new JDBCUtil();
		}
		
		
		public void atualizar(Pessoa pessoa) {
			
			String sql = "update pessoa set profissao='Jornalista' where id=15;";
			Statement statement;
			try {
				statement = banco.getConnetion().prepareStatement(sql);
				statement.executeUpdate(sql);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
			public void remover(Pessoa pessoa) {
			
			String sql = "delete from pessoa where id=14;";
			Statement statement;
			
			try {
				statement = banco.getConnetion().prepareStatement(sql);
				statement.execute(sql);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		public void inserir(Pessoa pessoa) {
		String sql = "insert into pessoa values (?,?,?,?,?);";
		PreparedStatement preparedStatement;
		
		try {
			preparedStatement = banco.getConnetion().prepareStatement(sql);
			
			preparedStatement.setInt(1, pessoa.getId());
			preparedStatement.setString(2, pessoa.getUltimoNome());
			preparedStatement.setString(3, pessoa.getPrimeiroNome());
			preparedStatement.setInt(4, pessoa.getIdade());
			preparedStatement.setString(5, pessoa.getProfissao());
			preparedStatement.execute();
			
		} catch (SQLException e) {

			e.printStackTrace();

		}
		
	}

		@Override
		public ArrayList<Pessoa> listar() {
			
			ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
			String sql = "select * from pessoa;";
			
			
			try {
				Statement statement = banco.getConnetion().createStatement();
				
				ResultSet resultSet = statement.executeQuery(sql);						
				
				while(resultSet.next()) {
					Pessoa pessoa = new Pessoa();
					
					pessoa.setId(resultSet.getInt(1));
					pessoa.setUltimoNome(resultSet.getString(2));
					pessoa.setPrimeiroNome(resultSet.getString(3));
					pessoa.setIdade(resultSet.getInt(4));
					pessoa.setProfissao(resultSet.getString(5));
					pessoas.add(pessoa);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
		}
			
		return pessoas;
	}
		
}
