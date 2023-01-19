SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://../LICENSE;md5=1ab252f869ddacc2b737c1b5041f3014"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("* Background recipe created by bitbake-layers *");
    bb.plain("* ----------                                  *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build

FILESEXTRAPATHS:prepend := "${THISDIR}/:"
FILES_${PN} += "/home/root"

SRC_URI += " file://pwl-custom.jpeg "

do_install(){
    install -d ${D}/home/root
    install -m 0755 ${WORKDIR}/pwl-custom.jpeg ${D}${base_prefix}/home/root
}
