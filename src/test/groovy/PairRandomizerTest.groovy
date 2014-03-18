import groovy.util.GroovyTestCase

class PairRandomizerTest extends GroovyTestCase {

    PairRandomizer pairRandomizer

    void setUp() {
        pairRandomizer = new PairRandomizer()
    }

    void testPairRandomizerMustTakeAList() {
        shouldFail(EmptyListException) {
            pairRandomizer.returnPairs(null)
        }
    }

    void testGivenAListPairRandomizerReturnsAList() {
        def actualResult = pairRandomizer.returnPairs([])
        assert actualResult instanceof List
    }

    void testGivenAListOfNamesPairRandomizerReturnsAListOfLists() {
        def actualResult = pairRandomizer.returnPairs(["Joe", "Bob"])
        assert actualResult[0] instanceof List
    }

    void testGivenAListOfFourPeopleItGivesATwoElements() {
        def actualResult = pairRandomizer.returnPairs(["Jim", "Gary", "Kevin", "Tyler"])
        assert actualResult.size == 2
    }

    void testTheSameListIsNotReturnedTwice() {
        def actualResult1 = pairRandomizer.returnPairs(["Jim", "Gary", "Kevin", "Tyler"])
        def actualResult2 = pairRandomizer.returnPairs(["Jim", "Gary", "Kevin", "Tyler"])
        assert actualResult1 != actualResult2
    }
}
