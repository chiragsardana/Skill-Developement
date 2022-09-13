import imp
from multiprocessing.sharedctypes import Value
from os import stat
from select import kevent
from mrjob.job import MRJob, MRStep


class MRMostCommonWord(MRJob):
    def steps(self):
        return [MRStep(mapper=self.word_count_creator, 
        combiner=self.sum_count,
        reducer = self.make_pairs_value_key),
        MRStep(reducer = self.max_frequency_pair)
        ]

    def word_count_creator(self, _, record):
        for word in record.split():
            yield word, 1
    
    def sum_count(self, key, record):
        yield key, sum(record)

    def make_pairs_value_key(self, key, record):
        yield None, (sum(record), key)

    def max_frequency_pair(self, _, record):
        yield max(record)
    

if __name__ == '__main__':
    MRMostCommonWord.run()