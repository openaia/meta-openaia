SECTION = "kernel"
DESCRIPTION = "Linux-6.7-rc1 Neu6B  Linux Next"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

require recipes-kernel/linux/linux-yocto.inc

inherit kernel

LINUX_BRANCH ?= "6tops-for-next"

SRC_URI = " \
	git://git@github.com/openaia/kernel.git;protocol=ssh;branch=${LINUX_BRANCH} \
"

SRCREV = "c66d9bed644a716d7b86b6affbb9c5db48675225"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

DEPENDS += "openssl-native util-linux-native"