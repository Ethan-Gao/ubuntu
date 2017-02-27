#!/bin/sh

# check root
if [ `whoami` != "root" ]
then
	echo "run as root or with sudo ..."
	exit
fi

# get rootfs and extract
wget http://cdimage.ubuntu.com/ubuntu-base/releases/16.04/release/ubuntu-base-16.04-core-armhf.tar.gz
mkdir AM335x
tar -xvf ubuntu-base-16.04-core-armhf.tar.gz -C AM335x
