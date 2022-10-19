import unittest
import calculator
class TestCalc(unittest.TestCase):
    def test_addition(self):
        self.assertEqual(calculator.addition(10, 10), 20)
        self.assertEqual(calculator.addition(-6, 6), 0)
        self.assertEqual(calculator.addition(-20,-10),-30)
    def test_subtraction(self):
        self.assertEqual(calculator.subtraction(420, 210), 210)
        self.assertEqual(calculator.subtraction(-6, 9),-15)
        self.assertEqual(calculator.subtraction(-6,-6), 0)
    def test_multiplication(self):
        self.assertEqual(calculator.multiplication(25, 4), 100)
        self.assertEqual(calculator.multiplication(-10, 1),-10)
        self.assertEqual(calculator.multiplication(-10,-10), 100)
    def test_division(self):
        self.assertEqual(calculator.division(69, 69), 1)
        self.assertEqual(calculator.division(-4, 4),-1)
        self.assertEqual(calculator.division(-10,-10), 1)
        self.assertEqual(calculator.division(8, 2), 4)
if __name__ == '__main__':
   unittest.main()