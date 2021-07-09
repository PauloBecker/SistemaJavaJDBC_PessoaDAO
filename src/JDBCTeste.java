import java.util.ArrayList;
import java.util.Scanner;

public class JDBCTeste {
	
	public static void main(String[] args){
		
		
		Pessoa pessoa = new Pessoa(15, "Naara" , "Salvador" , 27 , "Estudante");
		
		PessoaDAO dao = new PessoaDAOJDBC();
				
//		dao.inserir(pessoa);
		dao.atualizar(pessoa);
//		dao.remover(pessoa);
		
		System.out.println("iD | " + "Sobrenome | " + "Nome | " + "Idade | " + "Profissão | ");
		ArrayList<Pessoa>pessoas = dao.listar();
		for(Pessoa p: pessoas) {
			
			
			System.out.println(p.getId() + " | " + p.getUltimoNome() + " | " + p.getPrimeiroNome() + " | " + p.getIdade()+" | "+p.getProfissao());
		}
		//try {
			
			
			//Connection connection = DriverManager.getConnection(url,user,password);
			//Método statement usado para criar objetos na tabela
			//Statement statement = connection.createStatement();
			
			
			//### Usando preparedStatement ###
			
			
			
			//### Inserindo um dado na tabela ###
			//String sql = "insert into pessoa values (13, 'Brown' , 'James',71, 'Músico');";
			//statement.execute(sql);
			
			
			//### Atualizando um dado na tabela ###
			//String sql = "update pessoa set profissao='Jogador' where id=12;";
			//statement.executeUpdate(sql);
			
			//Deletando um dado na tabela
			//String sql = "delete from pessoa where id=13;";
			//statement.execute(sql);
			
			//### Usando select para consultas na tabela do jdbc
			/*ResultSet resultSet = null; //statement.executeQuery(sql);//usar o "executeQuery" para consultas
			
			if(statement.execute(sql)) {
				resultSet = statement.getResultSet();
			}
			for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) 
				
				System.out.print(resultSet.getMetaData().getColumnName(i)+ " | ");
				System.out.println();
			
			
			while(resultSet.next()) {
				
				for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {

					System.out.print(resultSet.getString(i) + " | ");
				}
				System.out.println();
				
			}*/
			
		/*} catch (SQLException e) {
			e.printStackTrace();
		}*/
	}
	

}
