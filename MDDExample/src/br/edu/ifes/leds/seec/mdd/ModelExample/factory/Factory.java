package br.edu.ifes.leds.seec.mdd.ModelExample.factory;

import br.edu.ifes.leds.seec.mdd.ModelExample.loader.Loader;
import br.edu.ifes.leds.seec.mdd.ModelExample.loader.LoaderImpl;
import br.edu.ifes.leds.seec.mdd.ModelExample.writer.Writer;
import br.edu.ifes.leds.seec.mdd.ModelExample.writer.WriterImpl;

public enum Factory {
	
	INSTANCE;
	
	public Loader getLoader()
	{
		return new LoaderImpl();
	}

	public Writer getWriter()
	{
		return new WriterImpl();
	}

}
