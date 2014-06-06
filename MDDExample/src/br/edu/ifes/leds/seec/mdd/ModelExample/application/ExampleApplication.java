package br.edu.ifes.leds.seec.mdd.ModelExample.application;

import java.io.IOException;

import br.edu.ifes.leds.seec.mdd.ModelExample.Attribute;
import br.edu.ifes.leds.seec.mdd.ModelExample.EType;
import br.edu.ifes.leds.seec.mdd.ModelExample.Entity;
import br.edu.ifes.leds.seec.mdd.ModelExample.Model;
import br.edu.ifes.leds.seec.mdd.ModelExample.ModelExampleFactory;
import br.edu.ifes.leds.seec.mdd.ModelExample.factory.Factory;
import br.edu.ifes.leds.seec.mdd.ModelExample.loader.Loader;
import br.edu.ifes.leds.seec.mdd.ModelExample.writer.Writer;


public class ExampleApplication {

	public static void main(String[] args) {
		
		 try {
			 
			createFile();
			
			System.out.println("Modelo Criado");
			
			System.out.println("Modelo Carregado");
			
			Model model = loadFile();
			
			System.out.println("Model's name:"+ model.getName());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static Model  loadFile() throws IOException
	{
		Loader loader = Factory.INSTANCE.getLoader();
		
		Model model = loader.load("model/instance/Modelox.me");
		
		return model;
	}
	
	private static void createFile() throws IOException
	{
		ModelExampleFactory modelExampleFactory = ModelExampleFactory.eINSTANCE;
		
		//Criando um modelo
		Model model = modelExampleFactory.createModel();
		
		model.setName("Modelo x");
		//Criando uma entidade
		Entity entity = modelExampleFactory.createEntity();
		
		entity.setName("Entidade Y");
		//Adicionando a entidade ao modelo
		model.getComposedof().add(entity);

		//Criando um atributo
		Attribute attribute = modelExampleFactory.createAttribute();
		attribute.setName("Atributo W");
		attribute.setType(EType.INTEGER);

		//Adicionando o atributo ao conceito
		entity.getHas().add(attribute);
		
		Writer writer = Factory.INSTANCE.getWriter();
		
		writer.writeXML("model/instance", "Modelox", model);
		
	}

}
