#!/bin/bash
    while read -r line; do
    if [[ $line == *"2880 512-byte logical blocks:"* ]]; then
        /home/root/install/newDrive.sh
    fi
done
