import groovy.util.GroovyTestCase

class PairRandomizerTest extends GroovyTestCase {

    File developerNames

    void setUp() {
        developerNames = new File("src/test/resources/developerNames.txt")
    }

    void tearDown() {
        developerNames.delete() 
    }

    void testReadNameFileCanReturnListOfAllNames() {
        PairRandomizer pairRandomizer = new PairRandomizer()
        developerNames << 'Don\r\nDJ\r\nKyle'
        def expectedNames = ['Don', 'DJ', 'Kyle']
        def actualNames = []
        assertEquals(expectedNames, pairRandomizer.readNameFile(developerNames)) 
    }

    void testReorderNamesReturnsFourNamesInTwoLists() {
        PairRandomizer pairRandomizer = new PairRandomizer()
        def developerNames = ['Don', 'DJ', 'Kyle', 'Angelo']
        def actualOutput = pairRandomizer.pairDevelopers(developerNames)
        assertEquals(2, actualOutput.size())
    }

    void testReorderNamesReturnsTenNamesInFiveLists() {
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
