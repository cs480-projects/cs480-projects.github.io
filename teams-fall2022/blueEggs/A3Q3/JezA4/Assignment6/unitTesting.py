import numpy as np
from myTest import myCalculator as mt

class UnitTesting:
    def test_equal(str1, str2):
        np.testing.assert_string_equal(str1, str2)
    def test_num_equal(num1, num2):
        np.testing.assert_equal(num1, num2)

    def testAdd(num1, num2, expected):
        np.testing.assert_equal(mt.addTwo(num1, num2), expected)

    def testSub(num1, num2, expected):
        np.testing.assert_equal(mt.subTwo(num1, num2), expected)

    def testMul(num1, num2, expected):
        np.testing.assert_equal(mt.multTwo(num1, num2), expected)
    
    def testDiv(num1, num2, expected):
        np.testing.assert_equal(mt.divTwo(num1, num2), expected)
    
    def testAddFail(num1, num2, expected):
        np.testing.assert_equal(mt.failAdd(num1,num2), expected)
    

