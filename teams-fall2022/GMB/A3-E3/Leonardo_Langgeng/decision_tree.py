#8:12 PM 9/17/2022#-------------------------------------------------------------------------
# AUTHOR: Leonardo Langgeng
# FILENAME: decision_tree.py
# SPECIFICATION: description of the program
# FOR: CS 4210- Assignment #18:12 PM 9/17/20228:12 PM 9/17/2022
# TIME SPENT: 4-5 hrs, half of it takes for installing and troubleshooting python and sklearn
#-----------------------------------------------------------*/

#IMPORTANT NOTE: DO NOT USE ANY ADVANCED PYTHON LIBRARY TO COMPLETE THIS CODE SUCH AS numpy OR pandas. You have to work here only with standard
# dictionaries, lists, and arrays

#importing some Python libraries
from sklearn import tree
import matplotlib.pyplot as plt
import csv

print('decision treeeee')

def decision_tree():
  print('dt def run')
  db = []
  X = []
  Y = []
  
  #reading the data in a csv file
  with open('contact_lens.csv', 'r') as csvfile:
    reader = csv.reader(csvfile)
    for i, row in enumerate(reader):
        if i > 0: #skipping the header
           db.append (row)
           print(row)
  
  print(db)
  print("-------------------")
  
  #transform the original categorical training features to numbers and add to the 4D array X. For instance Young = 1, Prepresbyopic = 2, Presbyopic = 3
  # so X = [[1, 1, 1, 1], [2, 2, 2, 2], ...]]
  #--> add your Python code here
  # X =
  
  age = []
  spectacle = []
  astigmatism = []
  tear = []
  recommended = []
  
  for data in db:
      print(data)
  
      current_data = []
      if data[0] == 'Young':
          current_data.append (0)
      elif data[0] == 'Presbyopic':
          current_data.append (1)
      elif data[0] == 'Prepresbyopic':
          current_data.append (2)
  
      if data[1] == 'Myope':
          current_data.append(0)
      elif data[1] == 'Hypermetrope':
          current_data.append(1)
  
      if data[2] == 'No':
          current_data.append(0)
      elif data[2] == 'Yes':
          current_data.append(1)
  
      if data[3] == 'Normal':
          current_data.append(0)
      elif data[3] == 'Reduced':
          current_data.append(1)
  
      if data[4] == 'No':
          recommended.append(0)
      elif data[4] == 'Yes':
          recommended.append(1)
  
      X.append(current_data)
  
  
  print("XXXXXX")
  print(X)
  
  #transform the original categorical training classes to numbers and add to the vector Y. For instance Yes = 1, No = 2, so Y = [1, 1, 2, 2, ...]
  #--> addd your Python code here
  # Y =
  
  Y = recommended
  
  print("YYYYYYYYYYYYYY")
  print(Y)
  
  ###
  
  #fitting the decision tree to the data
  clf = tree.DecisionTreeClassifier(criterion = 'entropy', )
  clf = clf.fit(X, Y)
  
  #plotting the decision tree
  tree.plot_tree(clf, feature_names=['Age', 'Spectacle', 'Astigmatism', 'Tear'], class_names=['Yes','No'], filled=True, rounded=True)
  #plt.show()
  print('savefig')
  plt.savefig('plot.png')
  return plt
