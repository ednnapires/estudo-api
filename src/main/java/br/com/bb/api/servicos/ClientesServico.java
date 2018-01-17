package br.com.bb.api.servicos;
 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.bb.api.dao.ClientesDAO;
import br.com.bb.api.objetos.Clientes;
 
@Path("/clientes")
public class ClientesServico {
 
    // URI:
    // /contextPath/servletPath/c
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Clientes> getCliente_JSON() {
        List<Clientes> listClientes = ClientesDAO.getAllClientes();
        return listClientes;
    }
 
    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Clientes getEmployee(@PathParam("id") String id) {
        return ClientesDAO.getCliente(id);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST 
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Clientes addCliente(Clientes cliente) {
        return ClientesDAO.addCliente(cliente);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Clientes updateCliente(Clientes cliente) {
        return ClientesDAO.updateCliente(cliente);
    }
 
    @DELETE
    @Path("/{clienteid}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response deleteEmployee(@PathParam("clienteid") String clienteid) {
        ClientesDAO.deleteCliente(clienteid);
        Map<String, String> teste = new HashMap<>();
        teste.put("mensagem", "Cliente Deletado  " + clienteid);
        return Response.ok(teste).build();
    }
 
}