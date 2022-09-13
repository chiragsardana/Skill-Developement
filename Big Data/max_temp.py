import imp
from os import stat
from mrjob.job import MRJob


class MRMaxTemp(MRJob):
    def mapper(self, _,line):
        tempByDate = line.split(',')
        month = tempByDate[0].split('-')[1]
        tempOfThatParticularDay = int(tempByDate[1])
        yield month,tempOfThatParticularDay

    def reducer(self, key, values):
        yield key, max(values)

if __name__ == '__main__':
    MRMaxTemp.run()