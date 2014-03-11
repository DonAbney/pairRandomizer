import groovy.util.GroovyTestCase

class PairRandomizerTest extends GroovyTestCase {

    PairRandomizer pairRandomizer

    void setUp() {
        pairRandomizer = new PairRandomizer()
    }

    void testStub() {
        def actualResult = pairRandomizer.returnPairs()
        assertNull(actualResult)
    }
}
