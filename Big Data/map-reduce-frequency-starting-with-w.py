import imp
from os import stat
from mrjob.job import MRJob


class MRWordFrequencyCount(MRJob):
    def mapper(self, _,line):
        for word in line.split():
            if (word.startswith("H") or word.startswith("h")):
                yield word,1

    def reducer(self, key, values):
        yield key, sum(values)

if __name__ == '__main__':
    MRWordFrequencyCount.run()