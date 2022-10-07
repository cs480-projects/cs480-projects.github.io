import pandas as pd                                        # Import pandas library to Python

data = pd.DataFrame({"x1":["y", "x", "y", "x", "x", "y"],  # Construct a pandas DataFrame
                     "x2":range(16, 22),
                     "x3":range(1, 7),
                     "x4":["a", "b", "c", "d", "e", "f"],
                     "x5":range(30, 24, - 1)})
print(data)                                                # Print pandas DataFrame