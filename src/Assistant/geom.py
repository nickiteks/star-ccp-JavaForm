import sys

my_file = open(sys.argv[1], "w+")
my_file.write("file!")
my_file.close()
