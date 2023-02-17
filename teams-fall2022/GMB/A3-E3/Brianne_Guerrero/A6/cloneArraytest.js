const cloneArray = require('./cloneArray')

test('testing if it clones array', () => {
  const array = [0,1,2]
  expect(cloneArray(array)).toEqual(array)
  
})
