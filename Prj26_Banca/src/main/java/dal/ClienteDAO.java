package dal;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAO {

	public static void main (String[] args){
		ClienteDAO cd =  new  ClienteDAO();
		for (Cliente c : cd.clienti) {
			System.out.println(c.getUsername());
			System.out.println(c.getPassword());
		}
	}
	private List<Cliente> clienti;

	{// blocco di inizializzazione
		clienti = new ArrayList<Cliente>();
		clienti.add(new Cliente("Simone", "Sudosi ", "SimoneSu"));
		clienti.add(new Cliente("Dora", "Koncz ", "DoraKo"));
		clienti.add(new Cliente("Daniele", "Sudosi ", "DanieleSu"));

	}

	public List<Cliente> getClienti() {
		return clienti;
	}

	public void addCliente(Cliente c) {
		clienti.add(c);
	}

	public void addCliente(String nome, String cognome, String username) {
		Cliente c = new Cliente(nome, cognome, username);
		clienti.add(c);
	}

	public Cliente getClienteById(int codice) {
		for (Cliente cliente : clienti) {
			if (cliente.getCodice() == codice) {
				return cliente;
			}
		}
		return null;

	}

}
