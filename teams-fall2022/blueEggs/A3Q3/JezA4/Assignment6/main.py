from unitTesting import UnitTesting as ut



ut.test_equal('ABC', 'ABC')

ut.test_num_equal((3*2)+4, 10)

a = 2
b = 4

ut.testAdd(a,b, 6)
ut.testSub(a,b, -2)
ut.testMul(a,b, 8)
ut.testDiv(a,b, 0.5)

try:
    ut.testAddFail(a,b,6)
except:
    print('For failed method test')


print('Success')