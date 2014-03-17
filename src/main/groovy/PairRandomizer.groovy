class EmptyListException extends Exception {}

class PairRandomizer {
    def returnPairs(List people) throws EmptyListException {
        if(people == null)
            throw new EmptyListException()

        Collections.shuffle(people)

        people.collate(2)
    }
}   
