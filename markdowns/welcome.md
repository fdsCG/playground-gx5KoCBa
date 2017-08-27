## Welcome To Machine Learning with Java! - Part 1

Most of the articles describe how to use machine learning algorithm in Python.In this article , we are going to discuss the machine learni ng alogithm with Java.

##  Machine Learning

Machine Learning is an application of Artificial Intelligence which provides the system the ability to learn automatically and also learn from the experience without being explicitly programmed.

## Supervised learning  

Supervised learning is the process of an algorithm learning from the training set (historical data). 
We will pass the training set to train the algorithm and testing set to test the algorithm. The algorith will be trained till it reaches the accuracy.Once the algorithm reaches the accuracy, it will be used to predict the output for the new input.

They are further grouped into regression and classification problems.
Classification : Output variable is a category like yes or no , disease or no disease
Regression : Output variable is a realo value like weight , price

few Examples of supervised learning algorithm:

Linear regression for regression problems.
Random forest for classification and regression problems.

## Unsupervised learning

Unsupervised learning is where you only have input data (X) and no corresponding output variables.There are no training sets to train the alogorithm in unsupervised learning.

Unsupervised learning problems can be further grouped into clustering and association problems.

Clustering : It is discovering the inherent grouping in data like grouping the customer by purchasing behaviour
Association :  To discover rules that describe large portions of your data, such as people that buy X also tend to buy Y.

Example :
k-means for clustering problems.

## Semi-Supervised Machine Learning

There are large amount of data in which only partial data is labelled and remaning are unlabelled are called Semi-Supervised Machine Learning.Many real world machine learning problems fall into this area. This is because it can be expensive or time-consuming to label data as it may require access to domain experts. Whereas unlabeled data is cheap and easy to collect and store.
This stands inbetween above two case.

A good example is a photo archive where only some of the images are labeled, (e.g. dog, cat, person) and the majority are unlabeled.

## Linear Regression 

In Linear Regression, the outcome (dependent variable) is continuous. It can have any one of an infinite number of possible values. In logistic regression, the outcome (dependent variable) has only a limited number of possible values. Logistic Regression is used when response variable is categorical in nature

# Hands-on Demo

@[Luke, how many stars are there in these galaxies?]({"stubs": ["src/main/java/com/gg/ml/LinearRegressionDemo.java"], "command": "com.gg.ml.LinearRegressionDemoTest#test"})

Check out the markdown file [`welcome.md`](https://github.com/TechDotIO/java-template/blob/master/markdowns/welcome.md) to see how this exercise is injected into the template.

## Training and Testing Set 

Your model needs to see as many images of cats as possible to understand which characteristics are those of the object in question - cats, and which ones are just background noise. To have a model that generalizes well, you need to ensure this works irrespective of background, color intensities, sizes, etc. You may need thousands to millions of such images to achieve decent feature extraction that lead to low classification accuracy. You don't need a million unique samples to test if your model has learnt the above and having a few samples of each type of cat should be enough of a test.


