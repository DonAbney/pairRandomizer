import PairRandomizer

def x = new PairRandomizer()
def list = x.returnPairs(['Ken', 'Cory', 'Dave', 'Boyko', 'Phil', 'Jimmy'])

list.each {
 println it
}

