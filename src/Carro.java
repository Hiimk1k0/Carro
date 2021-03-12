
/**
 * A classe carro contem metodos para realizar funcionalidades basicas de um carro
 * 
 * <ul>
 * <li>getConsumo</li>
 * <li>getQuantidadeCombustivel</li>
 * <li>getCapacidadeDeposito</li>
 * <li>meterCombustivel</li>
 * <li>meterCombustivel</li>
 * <li>andar</li>
 * <li>parar</li>
 * <li>obterAutonomia</li>
 * </ul>
 * 
 * @author Hiimk1k0
 *
 */

public class Carro {
	
	static private final double consumo=5.5; // litros por 100 klm
	
	private double quantidadeCombustivel;
	private double capacidadeDeposito;
	
	// Construtor por defeito 
	public Carro() {
		super();
	
		quantidadeCombustivel = 0;
		capacidadeDeposito = 40.0;
	}
	
	// Acessores 

	/**
	 * Consumo
	 * 
	 * @return retorna o consumo
	 */
	
	public static double getConsumo() {
		return consumo;
	}

	/**
	 * Quantidade de combustivel
	 * 
	 * @return retorna a quantidade de Combustivel
	 */
	
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	/**
	 * Informa sobre a capacidade do deposito
	 * 
	 * @return retorna a capacidade do Deposito do carro
	 */
	
	public double getCapacidadeDeposito() {
		return capacidadeDeposito;
	}
	
	// Métodos 
	
	/**
	 * Testa o combustivel para ver se nao transborda
	 * 
	 * @param quantidade valor da quantidade metida no carro
	 * @return quantidade de litros metidos
	 */
	
	public double meterCombustivel( double quantidade) { 		
		
		// Devia testar se Transborda o depósito
		// Podia retornar os Litros Metidos 
		quantidadeCombustivel = quantidadeCombustivel + quantidade;
		
		return quantidade;
	}
	
	/**
	 * Atesta o deposito
	 * 
	 * @return retorna os litros Meter
	 */
	
	// atestar o depósito
	public double meterCombustivel() {
		
		double litrosMeter = capacidadeDeposito - quantidadeCombustivel;
		
		// ou quantidadeCombustivel = capacidadeDeposito;
		meterCombustivel(litrosMeter);
		
		return litrosMeter;
	}
	
	/**
	 * Faz o carro andar
	 * 
	 * @param distancia valor da distancia a percorrer
	 * @return true se o carro consegue percorrer a distancia e false se nao consegue
	 */
	
	// distancia em klm
	public boolean andar( double distancia ) {
		
		// Verificar se tem combustivel para a distancia que se pretende andar 
		if( distancia < obterAutonomia() ) {
			
			quantidadeCombustivel -= getConsumo() * (distancia / 100); 
			return true;
		}
		else {
			
			// Aqui ou simplesmente não percorre qualquer distancia 
			// ou anda até parar porque fica sem combustível 
			return false;
		}
			
			
	}
	
	/**
	 * Faz o carro parar
	 * 
	 * @return true para o carro parar
	 */
	
	public boolean parar() {
		
		// se estiver a andar pára 
		// falta a flag que indica se o carro está em andamento
		return true;
	}
	
	/**
	 * Informa da autonomia do carro
	 * 
	 * @return a autonimia do carro
	 */
	
	// kmCombustivel( )    
	public double obterAutonomia() {
		
		return ( quantidadeCombustivel / getConsumo() ) * 100;
		
	}

}
