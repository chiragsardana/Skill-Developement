import imp
from multiprocessing.sharedctypes import Value
from os import stat
from select import kevent
import sys
from mrjob.job import MRJob, MRStep


class MRMostCommonWord(MRJob):
    def steps(self):
        return [
            MRStep(
                mapper=self.word_count_creator, 
                reducer=self.sum_count
            ),
            MRStep(
                mapper = self.make_pairs_value_key, 
                reducer = self.max_frequency_pair
            ),
        ]

    def word_count_creator(self, _, record):
        for word in record.split():
            yield word, 1
    
    def sum_count(self, key, record):
        yield key, sum(record)

    # "is"    1
    # "you"   1
    # "Kanu"  1
    # "My"    1
    # "Name"  1
    # "SArdana"       2
    # "are"   1
    # "hello" 1
    # "how"   1
    # "Chirag"        1
    # "Hello" 3
    # "Boy"   3

    def make_pairs_value_key(self, key, record):
        yield None, (int(record), key)

    # null    [1, "how"]
    # null    [1, "Name"]
    # null    [2, "SArdana"]
    # null    [1, "are"]
    # null    [1, "hello"]
    # null    [1, "Kanu"]
    # null    [1, "My"]
    # null    [1, "Chirag"]
    # null    [3, "Hello"]
    # null    [3, "Boy"]
    # null    [1, "is"]
    # null    [1, "you"]

    def max_frequency_pair(self, key, record):
        yield max(record)

if __name__ == '__main__':
    MRMostCommonWord.run()