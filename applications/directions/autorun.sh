#!/bin/sh
/home/root/install/it8951 -c -m 0 /dev/sdb 0 0 1872 1404

convert -background white -fill black -font /usr/share/fonts/ttf/LiberationMono-Bold.ttf -pointsize 64 label:"Park City Mall" -gravity Left -extent 1872x72 -depth 8 gray:- | /home/root/install/it8951 -d -m 4 /dev/sdb 0 20 1872 72

convert -background white -fill black -font /usr/share/fonts/ttf/LiberationMono-Bold.ttf -pointsize 64 label:"Left on Stoney Battery" -gravity Left -extent 1872x72 -depth 8 gray:- | /home/root/install/it8951 -d -m 4 /dev/sdb 0 90 1872 72

convert -background white -fill black -font /usr/share/fonts/ttf/LiberationMono-Bold.ttf -pointsize 64 label:"Right on Harrisburg Pike" -gravity Center -extent 1872x72 -depth 8 gray:- | /home/root/install/it8951 -d -m 4 /dev/sdb 0 180 1872 72

convert -background white -fill black -font /usr/share/fonts/ttf/LiberationMono-Bold.ttf -pointsize 64 label:"Left on Park City Dr" -gravity Center -extent 1872x72 -depth 8 gray:- | /home/root/install/it8951 -d -m 4 /dev/sdb 0 270 1872 72

convert -background white -fill black -font /usr/share/fonts/ttf/LiberationMono-Bold.ttf -pointsize 64 label:"Mall on Right" -gravity Center -extent 1872x72 -depth 8 gray:- | /home/root/install/it8951 -d -m 4 /dev/sdb 0 360 1872 72

