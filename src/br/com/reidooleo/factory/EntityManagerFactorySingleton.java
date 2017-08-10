package br.com.reidooleo.factory;

public class EntityManagerFactorySingleton {

	public class EntityManagerFactorySingleton {

		//Atributo private e est�tico que ser� �nico
		private static EntityManagerFactory fabrica;

		//Construtor privado
		private EntityManagerFactorySingleton(){}

		//M�todo que retorna a �nica instancia de EntityManagerFactory
		public static EntityManagerFactory getInstance(){
			if (fabrica == null){
				//Inicializa a fabrica
				fabrica = Persistence
					.createEntityManagerFactory("CLIENTE_ORACLE");
			}
			return fabrica;
		}

	} 
	
	
}
