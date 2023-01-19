#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "it8951 USB to screen application"
SECTION = "tools"
#DEPENDS += " libxaw libxrender libxft libxkbfile libxt libxv "

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

FILESEXTRAPATHS:prepend := "${THISDIR}:${THISDIR}/${PN}-${PV}:"

#SRCREV = "1.0"
#SRC_URI = "https://git.sr.ht/~martijnbraam/it8951"
#SRC_URI += " file://0001-added-makefile.patch "
#SRC_URI[sha256sum] = "bfecd247986043b63e35e05dddc39d8ad7238c304235bd148193cc436898fcee"

SRCREV = "b72269b30bc2b27e27b237477a7f6be77f46c6f9"
PV = "0.1+git${SRCPV}"
SRC_URI = "git://git.sr.ht/~martijnbraam/it8951;branch=master;"
SRC_URI += " file://0001-added-makefile.patch "

TARGET_CC_ARCH += "${LDFLAGS}"

S = "${WORKDIR}/git"

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

do_install() {
         install -d ${D}${bindir}
         install -m 0755 it8951 ${D}${bindir}
}


