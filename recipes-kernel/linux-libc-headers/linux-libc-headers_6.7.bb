require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

SRCREV = "c66d9bed644a716d7b86b6affbb9c5db48675225"

SRC_URI = " \
	git://git@github.com/openaia/kernel.git;protocol=ssh;branch=6tops-for-next; \
"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI[sha256sum] = "7a574bbc20802ea76b52ca7faf07267f72045e861b18915c5272a98c27abf884"