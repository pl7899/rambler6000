
SUMMARY = "Python Imaging Library (Fork)"
HOMEPAGE = "https://python-pillow.org"
AUTHOR = "Alex Clark (PIL Fork Author) <aclark@python-pillow.org>"
LICENSE = "HPND"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc416d18f294943285560364be7cbec1"

SRC_URI = "https://files.pythonhosted.org/packages/bc/07/830784e061fb94d67649f3e438ff63cfb902dec6d48ac75aeaaac7c7c30e/Pillow-9.4.0.tar.gz"
SRC_URI[md5sum] = "ee6e9a6c729ed9e9a78ccd3f6e9d7143"
SRC_URI[sha256sum] = "a1c2d7780448eb93fbcc3789bf3916aa5720d942e37945f4056680317f1cd23e"

S = "${WORKDIR}/Pillow-9.4.0"

RDEPENDS_${PN} = ""

#inherit distutils
inherit setuptools3
