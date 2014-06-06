package br.edu.ifes.leds.seec.mdd.ModelExample.writer;

import java.io.IOException;

import br.edu.ifes.leds.seec.mdd.ModelExample.Model;

public interface Writer {
	
	public void writeXML(String filePath, String documentName, Model umlModel) throws IOException;

}
