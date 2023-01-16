#!/bin/sh
/home/root/install/it8951 -c -m 0 /dev/sdb 0 0 1872 1404
convert -background white -fill black -font /usr/share/fonts/ttf/LiberationMono-Bold.ttf -pointsize 64 label:"VANAGAWESOME" -gravity Center -extent 1872x72 -depth 8 gray:- | /home/root/install/it8951 -d -m 4 /dev/sdb 0 400 1872 72
convert -background white -fill black -font /usr/share/fonts/ttf/LiberationMono-Bold.ttf -pointsize 64 label:"$(date)" -gravity Center -extent 1872x72 -depth 8 gray:- | /home/root/install/it8951 -d -m 4 /dev/sdb 0 666 1872 72

