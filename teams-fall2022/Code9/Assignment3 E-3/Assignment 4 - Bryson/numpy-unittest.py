from unittest import TestCase
import numpy as np

class TestPredict(TestCase):
    @staticmethod
    def test_succeeding():
        np.testing.assert_almost_equal(1, 0.9999999999999)

    @staticmethod
    def test_failing():
        np.testing.assert_equal([4,5], [4,6])