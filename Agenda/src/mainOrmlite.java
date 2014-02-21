import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;


import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.misc.TransactionManager;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.SelectArg;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class mainOrmlite {

	// we are using the in-memory H2 database
		private final static String DATABASE_URL = "jdbc:h2:mem:atividade";
		private Dao<Atividade, Integer> atividadeDao;
		
	public static void main(String[] args) throws Exception {
		new mainOrmlite().doMain(args);
	}



	private void doMain(String[] args) throws Exception {
		ConnectionSource connectionSource = null;
		
		try {
			// create our data-source for the database
			connectionSource = new JdbcConnectionSource(DATABASE_URL);
			// setup our database and DAOs
			setupDatabase(connectionSource);
			// read and write some data
			readWriteData();

			System.out.println("\n\nIt seems to have worked\n\n");
		} finally {
			// destroy the data source which should close underlying connections
			if (connectionSource != null) {
				connectionSource.close();
			}
		}
	}
	
	
	
	private void setupDatabase(ConnectionSource connectionSource) throws Exception {

		atividadeDao = DaoManager.createDao(connectionSource, Atividade.class);

		// if you need to create the table
		TableUtils.createTable(connectionSource, Atividade.class);
	}
	
	/**
	 * Read and write some example data.
	 */
	private void readWriteData() throws Exception {
		// create an instance of Account
		String name = "Jim Coakley";
		Atividade atividade = new Atividade(new Date(), new Date(), "Minha Atividade", "Local");

		// persist the account object to the database
		atividadeDao.create(atividade);
		int id = atividade.getId();
		

		// assign a password
		atividade.setLocal("FIAP");
		// update the database after changing the object
		atividadeDao.update(atividade);
		//verifyDb(id, account);

		// query for all items in the database
		List<Atividade> atividades = atividadeDao.queryForAll();
		System.out.println(atividades);		

		// construct a query using the QueryBuilder
		QueryBuilder<Atividade, Integer> statementBuilder = atividadeDao.queryBuilder();
		// shouldn't find anything: name LIKE 'hello" does not match our account
		statementBuilder.where().like(Atividade.NOME_CAMPO_NOME, "My");
		atividades = atividadeDao.query(statementBuilder.prepare());
		System.out.println(atividades);

		// should find our account: name LIKE 'Jim%' should match our account
		statementBuilder.where().like(Atividade.NOME_CAMPO_NOME, name.substring(0, 3) + "%");
		atividades = atividadeDao.query(statementBuilder.prepare());
		System.out.println(atividades);
		
		// delete the account since we are done with it
		atividadeDao.delete(atividade);
		// we shouldn't find it now
		System.out.println(atividadeDao.queryForId(id));
	}

}
