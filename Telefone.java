
import Connect.Conexao;

public class Telefone {
	private Conexao conexao;
	
	public Telefone(Conexao conexao) {
		this.conexao = conexao; 
	}
	
	public void add(String insert) {
			String aux = "";
		System.out.println("oi2");
		for(int i = 0; i < drop.length(); i++) {
			if(drop.charAt(i) != ';') aux += drop.charAt(i);
			if(i == (drop.length()-1) || drop.charAt(i) == ';') {
				System.out.println(aux);
				this.conexao.update(aux);
				aux = "";
			}
			//System.out.println(aux);
		}
		this.conexao.commit();
	}
	
	public void drop(String drop) {
		String aux = "";
		System.out.println("oi2");
		for(int i = 0; i < drop.length(); i++) {
			if(drop.charAt(i) != ';') aux += drop.charAt(i);
			if(i == (drop.length()-1) || drop.charAt(i) == ';') {
				System.out.println(aux);
				this.conexao.update(aux);
				aux = "";
			}
			//System.out.println(aux);
		}
		this.conexao.commit();
	}
	
}
