#!/bin/bash
echo "new disk was inserted"
sleep 5s
mount /dev/sda /Floppy
sleep 5s
/Floppy/autorun.sh
