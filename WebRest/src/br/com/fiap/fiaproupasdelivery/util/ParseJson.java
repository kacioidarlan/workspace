package br.com.fiap.fiaproupasdelivery.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import br.com.fiap.fiaproupasdelivery.entities.Cliente;
import br.com.fiap.fiaproupasdelivery.entities.Entrega;
import br.com.fiap.fiaproupasdelivery.entities.Entregador;
import br.com.fiap.fiaproupasdelivery.entities.Motivo;
import br.com.fiap.fiaproupasdelivery.entities.Produto;

public class ParseJson {

	public static List<Entrega> entregas(JSONArray json) {

		List<Entrega> entregas = new ArrayList<Entrega>();

		for (int i = 0; i < json.length(); i++) {

			JSONObject c;
			try {
				c = json.getJSONObject(i);
				Entrega entrega = new Entrega();

				if (!c.isNull(Nomes.COD))
					entrega.setCod(c.getLong(Nomes.COD));

				if (!c.isNull(Nomes.MOTIVO))
					entrega.setMotivo(c.getString(Nomes.MOTIVO));

				if (!c.isNull(Nomes.RECEPTOR))
					entrega.setReceptador(c.getString(Nomes.RECEPTOR));

				if (!c.isNull(Nomes.STATUS))
					entrega.setStatus(c.getString(Nomes.STATUS));

				if (!c.isNull(Nomes.DATA)) {
					String sData = c.getString(Nomes.DATA);
					entrega.setDataentrega(sData.toString());
				}

				if (!c.isNull(Nomes.CLIENTE)) {
					JSONObject jClient = ((JSONObject) json.get(i))
							.getJSONObject(Nomes.CLIENTE);
					Cliente cliente = ParseJson.parseCliente(jClient);
					entrega.setCliente(cliente);
				}

				if (!c.isNull(Nomes.ENTREGADOR)) {
					JSONObject jEntregador = c.getJSONObject(Nomes.ENTREGADOR);
					Entregador entregador = ParseJson
							.parseEntregador(jEntregador);
					entrega.setEntregador(entregador);
				}

				if (!c.isNull(Nomes.PRODUTO)) {
					JSONObject jProduto = c.getJSONObject(Nomes.PRODUTO);
					Produto produto = ParseJson.parseProduto(jProduto);
					entrega.setProduto(produto);
				}
				entregas.add(entrega);
			} catch (JSONException e) {
				e.printStackTrace();
			}

		}

		return entregas;
	}

	public static Cliente parseCliente(JSONObject json) {

		Cliente cliente = new Cliente();

		try {

			if (!json.isNull(Nomes.BAIRRO))
				cliente.setBairro(((JSONObject) json).getString(Nomes.BAIRRO));

			if (!json.isNull(Nomes.CIDADE))
				cliente.setCidade(((JSONObject) json).getString(Nomes.CIDADE));

			if (!json.isNull(Nomes.COD))
				cliente.setCod(((JSONObject) json).getLong(Nomes.COD));

			if (!json.isNull(Nomes.EMAIL))
				cliente.setEmail(((JSONObject) json).getString(Nomes.EMAIL));

			if (!json.isNull(Nomes.ENDERECO))
				cliente.setEndereco(((JSONObject) json)
						.getString(Nomes.ENDERECO));

			if (!json.isNull(Nomes.NOME))
				cliente.setNome(((JSONObject) json).getString(Nomes.NOME));

			if (!json.isNull(Nomes.TELEFONE))
				cliente.setTelefone(((JSONObject) json)
						.getString(Nomes.TELEFONE));

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cliente;
	}

	public static Entregador parseEntregador(JSONObject json) {

		Entregador entregador = new Entregador();
		try {
			if (!json.isNull(Nomes.COD))
				entregador.setCod(((JSONObject) json).getLong(Nomes.COD));

			if (!json.isNull(Nomes.NOME))
				entregador.setNome(((JSONObject) json).getString(Nomes.NOME));

			if (!json.isNull(Nomes.USERNAME))
				entregador.setUsername(((JSONObject) json)
						.getString(Nomes.USERNAME));

			if (!json.isNull(Nomes.PASSWORD))
				entregador.setPassword(((JSONObject) json)
						.getString(Nomes.PASSWORD));

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entregador;
	}

	public static Produto parseProduto(JSONObject json) {

		Produto produto = new Produto();
		try {

			if (!json.isNull(Nomes.COD))
				produto.setCod(((JSONObject) json).getLong(Nomes.COD));

			if (!json.isNull(Nomes.DESCRICAO))
				produto.setDescricao(((JSONObject) json)
						.getString(Nomes.DESCRICAO));

			if (!json.isNull(Nomes.PRECO))
				produto.setPreco(((JSONObject) json).getDouble(Nomes.PRECO));

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produto;
	}
	
	public static List<Motivo> parseMotivo(JSONArray json){
		
		List<Motivo> motivos = new ArrayList<Motivo>();
		
		for (int i = 0; i < json.length(); i++) {

			JSONObject c;
			try {
				c = json.getJSONObject(i);
				
				Motivo m = new Motivo();
				
				if (!c.isNull(Nomes.COD))
					m.setCod(c.getLong(Nomes.COD));
				
				if (!c.isNull(Nomes.DESCRICAO))
					m.setDescricao(c.getString(Nomes.DESCRICAO));
				
				motivos.add(m);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
		return motivos;
	}

}
