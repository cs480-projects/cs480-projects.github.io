import unittest
 
class Rectangle:
    def __init__(self, width, height):
        self.width = width
        self.height = height
 
    def get_area(self):
        return self.width * self.height
 
    def set_width(self, width):
        self.width = width
 
    def set_height(self, height):
        self.height = height
 

class TestGetAreaRectangleWithSetUp(unittest.TestCase):
 
  @classmethod
  def setUpClass(self):
    #this method is only run once for the entire class rather than being run for each test which is done for setUp()
    self.rectangle = Rectangle(0, 0)
 
  def test_normal_case(self):
    self.rectangle.set_width(2)
    self.rectangle.set_height(3)
    self.assertEqual(self.rectangle.get_area(), 6, "incorrect area")
 
  def test_geq(self):
    """tests if value is greater than or equal to a particular target"""
    self.assertGreaterEqual(self.rectangle.get_area(), -1)
 
  def test_assert_raises(self): 
    """using assertRaises to detect if an expected error is raised when running a particular block of code"""
    with self.assertRaises(ZeroDivisionError):
      a = 1 / 0
 
if __name__ == '__main__':
    unittest.main()