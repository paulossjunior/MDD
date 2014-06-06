package br.edu.ifes.leds.seec.mdd.ModelExample.loader;

import java.io.IOException;

import br.edu.ifes.leds.seec.mdd.ModelExample.Model;

public interface Loader {

	public Model load(String modelPath) throws IOException;
}
