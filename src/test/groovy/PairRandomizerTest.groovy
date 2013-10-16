import groovy.util.GroovyTestCase

class PairRandomizerTest extends GroovyTestCase {

    void testPairDevelopersReturnsFourNamesInTwoLists() {
        PairRandomizer pairRandomizer = new PairRandomizer()
        def developerNames = ['Don', 'DJ', 'Kyle', 'Angelo']
        def actualOutput = pairRandomizer.pairDevelopers(developerNames)
        assertEquals(2, actualOutput.size())
    }

    void testPairDevelopersReturnsTenNamesInFiveLists() {
        PairRandomizer pairRandomizer = new PairRandomizer()
        def developerNames = ['Don', 'DJ', 'Kyle', 'Angelo','Bob','Earl','Jeff','Jon','Jason','Kristen']
        def actualOutput = pairRandomizer.pairDevelopers(developerNames)
        assertEquals(5, actualOutput.size())
    }

    void testPairDevelopersReturnsDifferentPairsForTwoInvocations() {
        PairRandomizer pairRandomizer = new PairRandomizer()
        def developerNames = ['Don', 'DJ', 'Kyle', 'Angelo','Bob','Earl','Jeff','Jon','Jason','Kristen']
        def actualOutputOne = pairRandomizer.pairDevelopers(developerNames)
        def actualOutputTwo = pairRandomizer.pairDevelopers(developerNames)
        assert actualOutputOne != actualOutputTwo
    }
}
