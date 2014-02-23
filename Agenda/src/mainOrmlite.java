import java.util.Date;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.SelectArg;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class mainOrmlite {

	// we are using the in-memory H2 database
		//private final static String DATABASE_URL = "jdbc:h2:mem:atividade";
		private final static String DATABASE_URL = "jdbc:h2:agenda";
		private Dao<Atividade, Integer> atividadeDao;
		
	public static void main(String[] args) throws Exception {
		new mainOrmlite().doMain(args);
	}


	private void doMain(String[] args) throws Exception {
		ConnectionSource connectionSource = null;
		
		try {
			// cria a conexao
			connectionSource = new JdbcConnectionSource(DATABASE_URL);
			// cria a tabela e o Dao
			setupDatabase(connectionSource);
			// teste algumas funções no banco de dados
			readWriteData();

			System.out.println("\n\nFuncionou\n\n");
		} finally {
			// destroy the data source which should close underlying connections
			if (connectionSource != null) {
				connectionSource.close();
			}
		}
	}
		
	private void setupDatabase(ConnectionSource connectionSource) throws Exception {

		atividadeDao = DaoManager.createDao(connectionSource, Atividade.class);

		// cria a tabela se não existir
		TableUtils.createTableIfNotExists(connectionSource, Atividade.class);		
	}
	
	/**
	 * Read and write some example data.
	 */
	private void readWriteData() throws Exception {
		Atividade atividade = new Atividade(new Date(), new Date(), "Minha Atividade", "Local");		
		// inserindo uma Atividade
		atividadeDao.create(atividade);
		int id = atividade.getId();
		
		// alterando uma propriedade
		atividade.setLocal("FIAP");
		// executando update
		atividadeDao.update(atividade);

		Atividade atividade2 = new Atividade(new Date(), new Date(), "Minha Atividade 2", "Local 2");
		atividadeDao.create(atividade2);

		Atividade atividade3 = new Atividade(new Date(), new Date(), "Minha Atividade 3 ", "Local 3");
		atividadeDao.create(atividade3);

		Atividade atividade4 = new Atividade(new Date(), new Date(), "Minha Atividade 4", "Local 4");
		atividadeDao.create(atividade4);

		// Select em toda a tabela
		List<Atividade> atividades = atividadeDao.queryForAll();
		System.out.println(atividades);		

		// contruindo uma query com o QueryBuilder
		QueryBuilder<Atividade, Integer> statementBuilder = atividadeDao.queryBuilder();
		
		// teste para não retornar nada
		statementBuilder.where().like(Atividade.NOME_CAMPO_NOME, "My");
		atividades = atividadeDao.query(statementBuilder.prepare());
		System.out.println(atividades);

		// teste retornando atividades com nome like "Minha"
		statementBuilder.where().like(Atividade.NOME_CAMPO_NOME, "Minha" + "%");
		atividades = atividadeDao.query(statementBuilder.prepare());
		System.out.println(atividades);
		
		// deleta a atividade inserida
		atividadeDao.delete(atividade);
		
		// Não deve retornar mais a atividade exluída
		System.out.println(atividadeDao.queryForId(id));
		
		//selecionar atividades pela data
		//statementBuilder.where().between(Atividade.NOME_CAMPO_DATA_INICIO, new Date(2014,2,1), new Date(2014,2,28));
		//statementBuilder.where().ge(Atividade.NOME_CAMPO_DATA_INICIO, new Date(2014,2,1));
		SelectArg selectArg = new SelectArg();
		statementBuilder.where().ge(Atividade.NOME_CAMPO_DATA_INICIO, selectArg);
		selectArg.setValue( new Date(2013,2,1));
		atividades = atividadeDao.query( statementBuilder.prepare());
		System.out.println(atividades);
		
	}

}
