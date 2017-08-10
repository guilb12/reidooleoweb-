package br.com.reidooleo.factory;

public class EntityManagerFactorySingleton {

	public class EntityManagerFactorySingleton {

		//Atributo private e estático que será único
		private static EntityManagerFactory fabrica;

		//Construtor privado
		private EntityManagerFactorySingleton(){}

		//Método que retorna a única instancia de EntityManagerFactory
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
