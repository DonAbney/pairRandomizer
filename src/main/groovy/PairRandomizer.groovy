class PairRandomizer {
   
    def PAIR_SIZE = 2

    public pairDevelopers(developerNames) {
        Collections.shuffle(developerNames)
        developerNames.collate(PAIR_SIZE)
    }
}
