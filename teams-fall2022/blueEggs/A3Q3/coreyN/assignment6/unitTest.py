import unittest

from calculator import Calculator
from calculator import Calculator
import unittest

class CalculatorTest(unittest.TestCase):
    def test_add(self):
        result = Calculator.add(15, 20)
        self.assertEqual(result, 35)
    def test_add1(self):
        result = Calculator.add(16, 7)
        self.assertEqual(result, 23)
    def test_sub(self):
        result = Calculator.sub(122, 11)
        self.assertEqual(result, 111)
    def test_sub1(self):
        result = Calculator.sub(800, 645)
        self.assertEqual(result, 155)
    def test_mul(self):
        result = Calculator.mul(23, 3)
        self.assertEqual(result, 69)
    def test_mul1(self):
        result = Calculator.mul(12, 5)
        self.assertEqual(result, 60)
    def test_div(self):
        result = Calculator.div(42, 2)
        self.assertEqual(result, 21)
    def test_div1(self):
        result = Calculator.div(963, 3)
        self.assertEqual(result, 321)

if __name__ == '__main__':
    unittest.main()