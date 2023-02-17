import numpy as np

#2D array
a = (np.arange(8)*2).reshape(2,4)

#print array
print("The array\n",a)

#adding a constant to all the elemnets of array
b = a + 3

print("\nAfter adding a constant to all the elemnets of array\n",b)