# Support Vector Machine (SVM) is a relatively simple Supervised Machine Learning Algorithm used for classification and/or regression. 
# It is more preferred for classification but is sometimes very useful for regression as well. 
# Basically, SVM finds a hyper-plane that creates a boundary between the types of data. In 2-dimensional space, this hyper-plane is nothing but a line.
# In SVM, we plot each data item in the dataset in an N-dimensional space, where N is the number of features/attributes in the data.

#importing necessary libraries
import numpy as np
import pandas as pd
import matplotlib
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn import svm
#reading csv files
df=pd.read_csv('iris.csv')
df.head()
#printing unique species for information only
df.Species.unique()
from sklearn.model_selection import train_test_split
# get independent variable
df = sns.load_dataset('iris')
colx = ['petal_length','petal_width'] 
x = df.loc[:,colx] 
# retrieving petal length, petal width and species for defining dependent variable in col 
col = ['petal_length','petal_width','species']
data = df.loc[:,col]
data.head()
# get y as dependent variable in integer form
label_to_num = {'setosa' : 0,
                'versicolor' : 1,
                'virginica' : 2}

y = df.loc[:,col[2]].map(label_to_num) 
#independent variable
x
#dependent variable
y
# preform train_test_split
x_train,x_test,y_train,y_test = train_test_split(x,y,train_size = 0.8,random_state = 0) 
 # scale the x_train and x_test
from sklearn.preprocessing import StandardScaler    
sc = StandardScaler()
x_std_train = sc.fit_transform(x_train)
x_std_test = sc.fit_transform(x_test)
Cross_val_score is a function in the scikit-learn package which trains and tests a model over multiple folds of your dataset. This cross validation method gives you a better understanding of model performance over the whole dataset instead of just a single train/test split.

The process that cross_val_score uses is typical for cross validation and follows these steps:

The number of folds is defined, by default this is 5
The dataset is split up according to these folds, where each fold has a unique set of testing data
A model is trained and tested for each fold
Each fold returns a metric for it's test data
The mean and standard deviation of these metrics can then be calculated to provide a single metric for the process
# cross validation to get avg accuracy and std
from sklearn.model_selection import cross_val_score, cross_val_predict

score = cross_val_score(lModel,x_std_train,y_train,cv =10, scoring = 'accuracy' )
print("avg accuracy:\t{0:,.4f}".format(np.mean(score)))
print("avg std:\t{0:,.4f}".format(np.std(score)))
The common metrics provided by sklearn are passable as a string into this parameter, where some typical choices would be:

‘accuracy’
‘balanced_accuracy’
‘roc_auc’
‘f1’
‘neg_mean_absolute_error’
‘neg_root_mean_squared_error’
‘r2’
 # get prediction values for train data
y_pred = cross_val_predict(lModel,x_std_train,y_train,cv =3)


y_pred
Confusion Matrix
A much better way to evaluate the performance of a classifier is to look at the confusion matrix. 
The general idea is to count the number of times instances of class A are classified as class B.
Each row in a confusion matrix represents an actual class, while each column represents a predicted class
# get CM for train data
from sklearn.metrics import confusion_matrix, precision_score, recall_score, f1_score
confusion_matrix(y_train,y_pred )

sns.heatmap(confusion_matrix(y_train,y_pred),annot = True,cmap = 'Reds') # plot CM for train data
plt.scatter(x.values[:,0],x.values[:,1],c=y,s = 80, alpha = 1,edgecolors = 'g')
sns.set_style('whitegrid')
plt.scatter(x.values[:,0],x.values[:,1],c=y,s = 80, alpha = 1,edgecolors = 'g')
# instantiate model with kernel = 'linear'
lModel = svm.SVC(kernel = 'linear') 
lModel.fit(x_std_train,y_train) 
# cross validation to get avg accuracy and std
from sklearn.model_selection import train_test_split, cross_val_score, cross_val_predict

score = cross_val_score(lModel,x_std_train,y_train,cv =10, scoring = 'accuracy' )
print("avg accuracy:\t{0:,.4f}".format(np.mean(score)))
print("avg std:\t{0:,.4f}".format(np.std(score)))


