class EmptyListException extends Exception {}

class PairRandomizer {

    def returnPairs(list) {
        if(list == null) throw new EmptyListException()
        if(list.size() == 0) return list
        list.collate 2
    }
}   
