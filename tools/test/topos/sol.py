#!/usr/bin/python2.7
import sys, solar
topo = solar.Solar(cips=sys.argv[1:])
topo.run()
