class PairRandomizer {
    
    public readNameFile(File developerNames) {
        developerNames.readLines()
    }

    public pairDevelopers(developerNames) {
        Collections.shuffle(developerNames)
        int pairSize  = 2
        developerNames.collate(pairSize)
    }
}
