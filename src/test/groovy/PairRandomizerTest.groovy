class PairRandomizerTest {

    def pairRandomizer

    void setUp() {
        pairRandomizer = new PairRandomizer()
    }

    void testPairDevelopersReturnsFourNamesInTwoLists() {
        def developerNames = ['Don', 'DJ', 'Kyle', 'Angelo']
        def actualOutput = pairRandomizer.pairDevelopers(developerNames)
        assertEquals(2, actualOutput.size())
    }

    void testPairDevelopersReturnsTenNamesInFiveLists() {
        def developerNames = ['Don', 'DJ', 'Kyle', 'Angelo','Bob','Earl','Jeff','Jon','Jason','Kristen']
        def actualOutput = pairRandomizer.pairDevelopers(developerNames)
        assertEquals(5, actualOutput.size())
    }

    void testPairDevelopersReturnsDifferentPairsForTwoInvocations() {
        def developerNames = ['Don', 'DJ', 'Kyle', 'Angelo','Bob','Earl','Jeff','Jon','Jason','Kristen']
        def actualOutputOne = pairRandomizer.pairDevelopers(developerNames)
        def actualOutputTwo = pairRandomizer.pairDevelopers(developerNames)
        assert actualOutputOne != actualOutputTwo
    }
}
