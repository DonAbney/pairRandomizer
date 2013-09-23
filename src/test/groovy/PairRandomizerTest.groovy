import groovy.util.GroovyTestCase

class PairRandomizerTest extends GroovyTestCase {

    File developerNames

    void setUp() {
        developerNames = new File("src/test/resources/developerNames.txt")
    }

    void tearDown() {
       developerNames.delete() 
    }

    void testReadListCanCountNames() {
        PairRandomizer pairRandomizer = new PairRandomizer()
        developerNames << 'Don\r\nDJ\r\nKyle'
        assertEquals(3, pairRandomizer.readList(developerNames))
    }   

}
