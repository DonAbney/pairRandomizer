import groovy.util.GroovyTestCase

class PairRandomizerTest extends GroovyTestCase {

    PairRandomizer pairRandomizer

    void setUp() {
        pairRandomizer = new PairRandomizer()
    }

    void testShouldTakeNameListOfTwoAndReturnPair() {
        def listOfNames = ['Don', 'DJ']
        def actualResult = pairRandomizer.returnPairs(listOfNames)
        assertEquals(1, actualResult.size())
        assertEquals(2,actualResult[0].size())
        assertTrue(actualResult[0].contains('Don'))
        assertTrue(actualResult[0].contains('DJ'))
    }

    void testShouldTakeNameListOfThreeAndReturnAPairAndASingle() {
        def listOfNames = ['Don', 'DJ', 'Boyko']
        def actualResult = pairRandomizer.returnPairs(listOfNames)

        assertEquals(2, actualResult.size())
        assertEquals(2, actualResult[0].size())
        assertEquals(1, actualResult[1].size())
    }

    void testShouldTakeAnEmptyListAndReturnEmptyList() {
        def listOfNames = []
        def actualResult = pairRandomizer.returnPairs(listOfNames)

        assertEquals(0, actualResult.size())

    }

    void testShouldTakeANullListAndReturnException() {
        shouldFail(EmptyListException){
            pairRandomizer.returnPairs(null)
        }
    }
    
    void testShouldReturnDifferentListsForTwoCallsWithSameList() {
        def listOfNames = ['Don', 'DJ', 'Phil', 'Boyko', 'Henry', 'Chad', 'Cory', 'Kate', 'John', 'James']
        def actualResultOne = pairRandomizer.returnPairs(listOfNames)
        def actualResultTwo = pairRandomizer.returnPairs(listOfNames)

        assert actualResultOne != actualResultTwo
    }
}
