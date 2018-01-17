package br.com.bb.api.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.bb.api.objetos.Clientes;
 
public class ClientesDAO {
 
    private static final Map<String, Clientes> clientesMap = new HashMap<String, Clientes>();
 
    static {
        initEmps();
    }
    
    private static void initEmps() {
        Clientes cliente1 = new Clientes("E01", "Smith", "Asa Norte");
        Clientes cliente2 = new Clientes("E02", "Allen", "Asa Sul");
        Clientes cliente3 = new Clientes("E03", "Jones", "Guara");
 
        clientesMap.put(cliente1.getId(), cliente1);
        clientesMap.put(cliente2.getId(), cliente2);
        clientesMap.put(cliente3.getId(), cliente3);
    }
     
    public static Clientes getCliente(String clienteid) {
        return clientesMap.get(clienteid);
    }
 
    public static Clientes addCliente(Clientes cliente) {
        clientesMap.put(cliente.getId(), cliente);
        return cliente;
    }
 
    public static Clientes updateCliente(Clientes cliente) {
        clientesMap.put(cliente.getId(), cliente);
        return cliente;
    }
 
    public static void deleteCliente(String clienteid) {
        clientesMap.remove(clienteid);
    }
 
    public static List<Clientes> getAllClientes() {
        Collection<Clientes> c = clientesMap.values();
        List<Clientes> list = new ArrayList<Clientes>();
        list.addAll(c);
        return list;
    }
     
 
 
}