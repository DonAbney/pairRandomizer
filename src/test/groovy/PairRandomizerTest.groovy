import groovy.util.GroovyTestCase

class PairRandomizerTest extends GroovyTestCase {
    
    void testShouldTakeNameListOfTwoAndReturnPair() {
        def pairRandomizer = new PairRandomizer()
        def listOfNames = ['Don', 'DJ']
        def actualResult = pairRandomizer.returnPairs(listOfNames)
        assertEquals(1, actualResult.size())
        assertEquals(2,actualResult[0].size())
        assertTrue(actualResult[0].contains('Don'))
        assertTrue(actualResult[0].contains('DJ'))
    }

    void testShouldTakeNameListOfThreeAndReturnAPairAndASingle() {
        def pairRandomizer = new PairRandomizer()
        def listOfNames = ['Don', 'DJ', 'Boyko']
        def actualResult = pairRandomizer.returnPairs(listOfNames)

        assertEquals(2, actualResult.size())
        assertEquals(2, actualResult[0].size())
        assertEquals(1, actualResult[1].size())
    }

    void testShouldTakeAnEmptyListAndReturnEmptyList() {
        def pairRandomizer = new PairRandomizer()
        def listOfNames = []
        def actualResult = pairRandomizer.returnPairs(listOfNames)

        assertEquals(0, actualResult.size())

    }

    void testShouldTakeANullListAndReturnException() {
        def pairRandomizer = new PairRandomizer()
        shouldFail({pairRandomizer.returnPairs(null)})
    }

}
