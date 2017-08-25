package com.gg.ml;
import java.io.File;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

public class LinearRegressionDemo {
	
	@Test
	public void test() throws Exception  {
		LinearRegression.process();
	}

}