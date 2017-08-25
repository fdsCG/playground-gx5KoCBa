package com.gg.ml;
import java.io.File;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

public class LinearRegressionDemo {

public static void process() throws Exception {
		// TODO Auto-generated method stubArffLoader loader = new ArffLoader();
		ArffLoader loader = new ArffLoader();
		loader.setFile(new File("linear-train.arff"));
		Instances trainingSet = loader.getDataSet();
		// this is the complexity, here we specify what are our classes,
		// into which we want to classify the data
		int classIdx = 1;

		ArffLoader loader2 = new ArffLoader();
		loader2.setFile(new File("linear-test.arff"));
		Instances testSet = loader2.getDataSet();

		trainingSet.setClassIndex(classIdx);
		testSet.setClassIndex(classIdx);

	
		Classifier classifier = new weka.classifiers.functions.LinearRegression();
		
		
		classifier.buildClassifier(trainingSet);

		Evaluation eval = new Evaluation(trainingSet);
		eval.evaluateModel(classifier, testSet);

		System.out.println(eval.toSummaryString());
		
		ArffLoader loader3 = new ArffLoader();
		loader3.setFile(new File("test-confused.arff"));
		Instances dataSet = loader3.getDataSet();
		Instance myHouse = dataSet.lastInstance();
		double price = classifier.classifyInstance(myHouse);
		System.out.println(classifier);
		System.out.println(price);
	
		

}}