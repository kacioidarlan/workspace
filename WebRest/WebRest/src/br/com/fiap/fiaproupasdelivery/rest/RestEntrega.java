package br.com.fiap.fiaproupasdelivery.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONArray;

import br.com.fiap.fiaproupasdelivery.controler.EntregaRN;
import br.com.fiap.fiaproupasdelivery.entities.Entrega;
import br.com.fiap.fiaproupasdelivery.util.ParseJson;


@Path("/entrega")
public class RestEntrega {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Entrega> buscaEntregas(@Context HttpHeaders headers){
		
		String token = headers.getRequestHeader("token").get(0).toString();
		
		if(RestEntregador.TEMPOTOKEN.containsKey(token)){
		EntregaRN entRN = new EntregaRN();
		
		List<Entrega> entregas = new ArrayList<Entrega>();
		entregas = entRN.buscarEntregas();
		return entregas;
		}else{
			return null;
		}
	}
	
//	@POST
//	@Path("/post")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response recebeEntrega(Entrega e, @Context HttpHeaders headers){
//		
//		String token = headers.getRequestHeader("token").get(0).toString();
//		
//		if(RestEntregador.TEMPOTOKEN.containsKey(token)){				
//		EntregaRN entRN = new EntregaRN();
//		entRN.salvar(e);
//		String result = "Track saved : " + e;
//		return Response.status(201).entity(result).build();
//		}else{
//			String result = "Track unsaved : " + e;
//			return Response.status(202).entity(result).build();
//		}
//	}
	
	@POST
	@Path("/postentregas")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response recebeEntregas(JSONArray json, @Context HttpHeaders headers){
		
		String token = headers.getRequestHeader("token").get(0).toString();
		
		if(RestEntregador.TEMPOTOKEN.containsKey(token)){
		List<Entrega> entrega = new ArrayList<Entrega>();
		
		entrega = ParseJson.entregas(json);
		for(int i=0;i< entrega.size();i++){
			EntregaRN entRN = new EntregaRN();
			entRN.alterar(entrega.get(i));
		}		
		String result = "Track unsaved : " + entrega;
		return Response.status(202).entity(result).build();
		}else{
			String result = "Track unsaved : ";
			return Response.status(202).entity(result).build();			
		}
	}
}
