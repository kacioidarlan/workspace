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

import br.com.fiap.fiaproupasdelivery.controler.MotivoRN;
import br.com.fiap.fiaproupasdelivery.entities.Motivo;
import br.com.fiap.fiaproupasdelivery.util.ParseJson;

@Path("/motivo")
public class RestMotivo {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Motivo> buscaMotivos(@Context HttpHeaders headers) {

		String token = headers.getRequestHeader("token").get(0).toString();

		if (RestEntregador.TEMPOTOKEN.containsKey(token)) {
			List<Motivo> motivos = new ArrayList<Motivo>();
			MotivoRN moRN = new MotivoRN();
			motivos = moRN.buscarMotivos();
			return motivos;
		} else {
			return null;
		}
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response recebeMotivo(JSONArray json, @Context HttpHeaders headers) {

		String token = headers.getRequestHeader("token").get(0).toString();

		if (RestEntregador.TEMPOTOKEN.containsKey(token)) {

			List<Motivo> motivos = new ArrayList<Motivo>();

			motivos = ParseJson.parseMotivo(json);

			if(json.length()  > 0){
			for (int i = 0; i < motivos.size(); i++) {
				MotivoRN motivoRN = new MotivoRN();
				
				motivoRN.salvar(motivos.get(i));
			}
			}

			String result = "Track saved : " + motivos;
			return Response.status(201).entity(result).build();
		} else {
			String result = "Track unsaved : ";
			return Response.status(202).entity(result).build();
		}
	}

}
