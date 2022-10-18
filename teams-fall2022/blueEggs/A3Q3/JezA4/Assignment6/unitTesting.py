import numpy as np

class UnitTesting:
    def test_equal(str1, str2):
        np.testing.assert_string_equal(str1, str2)
    def test_num_equal(num1, num2):
        np.testing.assert_equal(num1, num2)
    

