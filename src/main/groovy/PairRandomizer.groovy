class EmptyListException extends Exception {}

class PairRandomizer {

    def returnPairs(list) {
        switch (list?.size()) {
            case null:
                throw new EmptyListException()
            case 0:
                return list
            default:
                Collections.shuffle(list)
                return list.collate(2)
        }
    }
}   
